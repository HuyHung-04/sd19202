package com.example.helloworldsd19202.buoi4.controller;

import com.example.helloworldsd19202.buoi4.model.SinhVien;
import com.example.helloworldsd19202.buoi4.service.SinhVienService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/buoi4")
public class SinhVienController {
    SinhVienService sinhVienService = new SinhVienService();
    @GetMapping("/hien-thi")
    public String hienThi(Model model){
        model.addAttribute("danhSach",sinhVienService.getAll());
        return "buoi4/hien-thi";
    }
    @GetMapping("/view-add")
    public String viewAdd(){
        return "buoi4/view-add";
    }
    @PostMapping("/add")
    public String add(SinhVien sinhVien){
        sinhVienService.add(sinhVien);
        return "redirect:/buoi4/hien-thi";

    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") String id){
        sinhVienService.delete(id);
        return "redirect:/buoi4/hien-thi";
    }
//    @GetMapping("/view-update")
//    public String viewUpdate(@RequestParam("id") String id, Model model){
//        model.addAttribute("sv",sinhVienService.findById(id));
//        return "buoi4/view-update";
//    }
    @GetMapping("/view-update/{id}")
    public String viewUpdate(@PathVariable("id") String id, Model model){
        model.addAttribute("sv",sinhVienService.findById(id));
        return "buoi4/view-update";
    }
    @PostMapping("/update")
    public String update(SinhVien sinhVien){
        sinhVienService.update(sinhVien);
        return "redirect:/buoi4/hien-thi";
    }
    @GetMapping("/search")
    public String search(@RequestParam("id") String id, Model model){
        model.addAttribute("danhSach",sinhVienService.searchId(id));
        return "buoi4/hien-thi";
    }
}
