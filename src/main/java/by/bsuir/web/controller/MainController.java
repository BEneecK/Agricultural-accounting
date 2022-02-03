package by.bsuir.web.controller;


import by.bsuir.web.entity.User;
import by.bsuir.web.entity.UserRole;
import by.bsuir.web.entity.repository.UserRepository;
import by.bsuir.web.entity.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRoleRepository userRoleRepository;

    @GetMapping("/")
    public String homePage(Model model) {
        Iterable<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        Iterable<UserRole> roles = userRoleRepository.findAll();
        model.addAttribute("roles", roles);
        return "homePage";
    }

}
