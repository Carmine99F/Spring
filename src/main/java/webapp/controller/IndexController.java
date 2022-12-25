package webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String getWelcome(Model model){
        model.addAttribute("intestazione","benvenuto el sito alphashop");
        model.addAttribute("saluti","selezion ai prodotti");
        return "/test.jsp";
    }

    @RequestMapping(value = "/")
    public String getWelcome2(Model model){
        model.addAttribute("intestazione","benvenuto el sito alphashop");
        model.addAttribute("saluti","selezion ai prodotti");
        return "/test.jsp";
    }

}
