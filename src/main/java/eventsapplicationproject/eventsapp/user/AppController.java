package eventsapplicationproject.eventsapp.user;

import eventsapplicationproject.eventsapp.event.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class AppController {
    @Autowired
    private UserRepository repo;
    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }
    @GetMapping("/register")
    public String showSignUpForm(Model model){
        model.addAttribute("user", new User());
        return "signup_form";
    }
    @PostMapping("/process_register")
    public String procesRegistration(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        repo.save(user);
        return "register_success";
    }


    

    
}
