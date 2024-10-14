package com.example.helloworldsd19202.buoi11.controller;

import com.example.helloworldsd19202.buoi11.entity.DanhMuc;
import com.example.helloworldsd19202.buoi11.service.DanhMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/buoi11")
public class DanhMucController {
    @Autowired
    DanhMucService danhMucService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model){
        model.addAttribute("danhSach",danhMucService.getAll());
        return "buoi11/hien-thi";
    }

    @PostMapping("/add")
    public String add(DanhMuc danhMuc){
        danhMucService.them(danhMuc);
        return "redirect:/buoi11/hien-thi";
    }

    @GetMapping("/view-update/{id}")
    public String viewUpdate(@PathVariable("id") int id, Model model){
        model.addAttribute("dm",danhMucService.findById(id));
        return "buoi11/view-update";
    }

    @PostMapping("/update")
    public String update(DanhMuc danhMuc){
        danhMucService.sua(danhMuc);
        return "redirect:/buoi11/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") int id, Model model){
        model.addAttribute("dm",danhMucService.findById(id));
        return "buoi11/detail";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id){
        danhMucService.xoa(id);
        return "redirect:/buoi11/hien-thi";
    }
}
