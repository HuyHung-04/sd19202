package com.example.helloworldsd19202.buoi10.controller;

import com.example.helloworldsd19202.buoi10.model.CongTy;
import com.example.helloworldsd19202.buoi10.model.CongTyKhac;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/buoi10")
public class CongTy2Controller {
    @Autowired
    CongTy congTy;

    @Autowired
    CongTyKhac congTyKhac;

    @ResponseBody
    @GetMapping("/cong-ty2")
    public String getCongTy(){
        return congTy.getName();
    }

    @ResponseBody
    @GetMapping("/cong-thy-khac")
    public String getCongTyKhac(){
        return congTyKhac.getName();
    }
}
