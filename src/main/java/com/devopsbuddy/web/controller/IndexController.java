package com.devopsbuddy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Akinwale on 2016-10-10.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String home()
    {
        return "index";

    }
}
