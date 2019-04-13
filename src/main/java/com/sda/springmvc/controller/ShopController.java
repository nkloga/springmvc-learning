package com.sda.springmvc.controller;

import com.sda.springmvc.model.Shop;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@Controller
@RequestMapping("/shop")
public class ShopController {

    // /electronics/ - will accept get method
    @RequestMapping(value = "/electronics",method = RequestMethod.GET)
    public String shopReturn(Model model, HttpServletRequest request) {
        Shop euronics = new Shop();
        euronics.setName("Euronics");
        euronics.setAddress("2435234234");
        model.addAttribute("shopName",euronics);
        String cookies = Arrays.toString(request.getCookies());
        model.addAttribute("cookie",cookies);
        return "shop";
    }

    // /electronics/ - default method, will accept everything except Get
    @RequestMapping(value = "/electronics")
    public String shopReturn2(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
        Shop euronics = new Shop();
        euronics.setName("Euronics");
        euronics.setAddress("2435234234");
        response.getWriter().println("efdsfsdf");
        model.addAttribute("shopName",euronics);
        String cookies = Arrays.toString(request.getCookies());
        model.addAttribute("cookie",cookies);
        return "shop";
    }

    @RequestMapping("/food")
    public String shopReturnSecond(Model model) {
        Shop rimi = new Shop();
        rimi.setName("Rimi");
        rimi.setAddress("2435234234");
        model.addAttribute("shopName",rimi);
        return "shop-two";
    }

//    @RequestMapping(value="/processForm", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    // two ways, one is with @ModelAttribute
    // another is to pass model as I did before
//    @RequestMapping(value="/confirm")
//    public String newMethod(Model model, @ModelAttribute("shop") Shop shop){
//    public String newMethod(Shop shop){
//        model.addAttribute("shop", shop);
     //   System.out.println("name: " + shop.getName() + " address: " + shop.getName());
//        return "confirm";
//    }
// better option

    @RequestMapping(value="/confirm")
    public String newMethod(Model model, @ModelAttribute("shop") Shop shop){
        //model.addAttribute("shop", shop);
        return "confirm";
    }
}
