package com.example.forqi.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.forqi.Util.EmojiFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReturnStringForQi {
    /**
     *
     *
     * */
    //接受前端传过来的数据并处理
    @RequestMapping(value = "/sendString")
    @ResponseBody
    public JSONObject returnResult(@RequestParam(name = "inputText") String inputText) {
        try {
            inputText = processInput(inputText);
            System.out.println(inputText);
            return JSONObject.parseObject(inputText);
        } catch (Exception e) {
            return JSONObject.parseObject("{'error':'出错啦，去向你的宝宝问罪！'}");
        }

    }

    /**
     * 处理字符串
     * 去除无用字符
     * @param inputText 原始字符
     * @return 处理好的字符
     * */
    public String processInput(String inputText) {
        //去除颜文字
        inputText = EmojiFilter.filterEmoji(inputText);
        //替换中文冒号为英文冒号
        inputText = inputText.replaceAll("：", ":");
        //去除中划线
        inputText = inputText.replaceAll("-", "");
        //去除无用文字
        inputText = inputText.replaceAll("坚定信念·噼里啪啦砰砰砰", "");
        inputText = inputText.replaceAll(" 【破】突破大单天花板!", "");
        inputText = inputText.replaceAll(" 【立】夯实银保日平台!", "");
        //提取支行信息
        inputText = inputText.replaceAll("捷报从【", "支行:");
        //去除无用文字
        inputText = inputText.replaceAll("】传来 ", "");
        //将万元转为阿拉伯数字
        if (inputText.contains("万元")) {
            inputText = inputText.replaceAll("万元", "0000");
        }
        //去除年
        if (inputText.contains("年")) {
            inputText = inputText.replaceAll("年", "");
        }
        //todo 按照换行符切割字符串，循环遍历，取冒号后边数据加入bean，转成json返回前端
        return inputText;
    }

    @RequestMapping(value = "/test")
    public ModelAndView test() {
        return new ModelAndView("index");
    }
}
