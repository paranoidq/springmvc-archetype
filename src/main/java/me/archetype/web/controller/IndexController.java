package me.archetype.web.controller;

import me.archetype.security.authenticate.AuthenticateService;
import me.archetype.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author paranoidq
 * @since 1.0.0
 */
@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private AuthenticateService authenticateService;

    @RequestMapping(path = {"/", "", "/index"})
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("loginUser", authenticateService);
        return "index";
    }
}

