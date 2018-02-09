package me.archetype.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author paranoidq
 * @since 1.0.0
 */

@Controller
public class LoginController {


    @RequestMapping("/admin/login")
    public String loginPage() {
        return "login";
    }
}
