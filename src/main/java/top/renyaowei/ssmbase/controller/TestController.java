package top.renyaowei.ssmbase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.renyaowei.ssmbase.entity.Hello;

/**
 * Created by Mr_Shadow on 2017/10/14.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test() {
        //返回值 将去 WEB-INF/views目录下找同名test.jsp文件
        return "test";

    }

    @RequestMapping("/getJson")
    @ResponseBody
    public Hello getJson() {
        Hello hello = new Hello();
        hello.setAge(19);
        hello.setName("任耀威");
        hello.setSex("男");
        return hello;
    }


}
