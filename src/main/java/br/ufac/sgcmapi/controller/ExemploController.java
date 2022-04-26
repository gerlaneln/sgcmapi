package br.ufac.sgcmapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExemploController {

    @RequestMapping("/")
    @ResponseBody
    public String exemplo(){
        return "Sprint Boot!";
    }

}
