package com.example.helloworldsd19202.buoi2;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/buoi2")
public class LoginController {
    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String showLogin(){
        return "buoi2/login";
    }
//    @GetMapping("/login")
//    public String showLogin2(){
//        return"buoi2/login";
//    }
//    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
//    public String login(HttpServletRequest request){
//        String user = request.getParameter("user");
//        String pass = request.getParameter("pass");
//        if(user.equals("123")&& pass.equals("abc")){
//            request.setAttribute("user",user);
//            request.setAttribute("pass",pass);
//            return "buoi2/info";
//        }
//        else{
//            request.setAttribute("error","Thong tin dang nhap sai");
//            return "buoi2/login";
//        }
//    }
//    @PostMapping("/login")
//    public String login(
//    @RequestParam("user") String us,
//    @RequestParam("pass") String pw,
//    Model model){
//        if(us.equals("123") && pw.equals("abc")){
//            model.addAttribute("user",us);
//            model.addAttribute("pass",pw);
//            return "buoi2/info";
//        }
//        else {
//            model.addAttribute("error","Thong tin sai");
//            return "buoi2/login";
//        }
//    }
    @PostMapping("/login")
    public String login(LoginRequest loginRequest, Model model){
        if(loginRequest.getUser().equals("123") && loginRequest.getPass().equals("abc")){
            model.addAttribute("user",loginRequest.getUser());
            model.addAttribute(("pass"),loginRequest.getPass());
            return "buoi2/info";
        }
        else{
            model.addAttribute("error","Thong tin dang nhap sai");
            return "buoi2/login";
        }
    }
}
