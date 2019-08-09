package com.nguyenanhtu.controller;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
  
@Controller  
public class HelloController {  
      
    @RequestMapping(value="/")  
    public String home() {  
    	System.out.println("mapping at /");
        return "home";  
    }  
      
    @RequestMapping(value="/admin")  
    public String privateHome() {  
        return "privatePage";  
    }  
}  