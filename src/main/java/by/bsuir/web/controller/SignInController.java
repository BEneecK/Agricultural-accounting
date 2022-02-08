package by.bsuir.web.controller;

import by.bsuir.web.entity.User;
import by.bsuir.web.entity.UserRole;
import by.bsuir.web.entity.repository.UserRepository;
import by.bsuir.web.entity.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class SignInController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRoleRepository userRoleRepository;

    @GetMapping("/sign-in")
    public String signInForm(Model model) {
        return "sign-in";
    }

    @PostMapping("/sign-in")
    public String signIn(@RequestParam String firstName, @RequestParam String lastName,
                         @RequestParam String email, @RequestParam String password, Model model) {
        UserRole role = userRoleRepository.findByRole("Пользователь");
        User user = new User(firstName, lastName, email, password, 5.0, false, role ,null);
        userRepository.save(user);
        return "redirect:/";
    }
}
