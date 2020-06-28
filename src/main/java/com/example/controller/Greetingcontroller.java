package com.example.controller;

import com.example.pojo.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @BelongsProject: java_study_github
 * @BelongsPackage: com.example.controller
 * @Author: LiZhaoShuai
 * @CreateTime: 2020/06/28 18:28
 * @Description: 控制类
 */

/**
 * @RestController: 该注释将类标记为控制器，其中每个方法均返回域对象而不是视图。这是同时包含@Controller和的简写@ResponseBody。
 */
@RestController
public class Greetingcontroller {

    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong COUNTER = new AtomicLong();

    /**
     * @GetMapping:注释可以确保HTTP GET请求到/greeting被映射到greeting()方法。
     * @RequestParam:将查询字符串参数的值绑定name到方法的name参数中greeting()。
     *  如果name请求中没有该参数defaultValue，SpringBoot则使用of 。
     * @param name
     * @return
     */
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "SpringBoot")String name){
        return new Greeting(COUNTER.incrementAndGet(),String.format(TEMPLATE,name));
    }
}
