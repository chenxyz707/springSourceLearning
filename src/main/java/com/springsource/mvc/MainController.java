package com.springsource.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * controller 学习springMVC源码
 *
 * @author chenxyz
 * @version 1.0
 * @date 2017-10-16
 */
@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "result";
    }
}
