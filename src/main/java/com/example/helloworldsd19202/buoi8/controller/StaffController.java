package com.example.helloworldsd19202.buoi8.controller;

import com.example.helloworldsd19202.buoi8.model.Country;
import com.example.helloworldsd19202.buoi8.model.Staff;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/buoi8")
public class StaffController {
    @GetMapping("/staff")
    public String showForm(Model model){
        model.addAttribute("staff",new Staff());
        return "buoi8/hien-thi";
    }

    @PostMapping("/staff")
    public String saveForm(@Valid @ModelAttribute("staff") Staff staff, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "buoi8/hien-thi";
        }
        model.addAttribute("message","Dang nhap thanh cong");
        return "buoi8/hien-thi";
    }

    @ModelAttribute("positions")
    public Map<String, String> getPosition(){
        Map<String, String> positions = new HashMap<>();
        positions.put("gd","Giam doc");
        positions.put("tk","Thu ky");
        positions.put("lc","Lao cong");
        return positions;
    }

    @ModelAttribute("hobbies")
    public String[] getCheckboxes(){
        return new String[]{"An","Ngu","Nghi"};
    }

    @ModelAttribute("countries")
    public List<Country> getCuontries(){
        List<Country> countries = new ArrayList<>();
        countries.add(new Country(1,"Viet Nam"));
        countries.add(new Country(2,"My"));
        countries.add(new Country(3,"China"));
        return countries;
    }
}
