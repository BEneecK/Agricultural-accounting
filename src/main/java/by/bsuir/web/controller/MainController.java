package by.bsuir.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("title", "baldezh");
        return "homePage";
    }

}
