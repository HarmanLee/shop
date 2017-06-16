package com.cloudtcc.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by as on 2017/6/14.
 */
@Controller
public class PageControler {
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }
    @RequestMapping("{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
