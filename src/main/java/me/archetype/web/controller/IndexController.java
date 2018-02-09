package me.archetype.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author paranoidq
 * @since 1.0.0
 */
@Controller
public class IndexController {

    @RequestMapping(path = {"/", "", "/index"})
    public String index() {
        return "index";
    }
}

