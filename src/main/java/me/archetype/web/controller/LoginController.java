//package me.archetype.web.controller;
//
//import me.archetype.domain.User;
//import me.archetype.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @author paranoidq
// * @since 1.0.0
// */
//
//@Controller
//public class LoginController {
//
//    @Autowired
//    private UserService userService;
//
//    @RequestMapping("/login")
//
//    public String loginPage() {
//        return "login";
//    }
//
//
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public void doLogin(@RequestParam("username") String username,
//                          @RequestParam("password") String password,
//                          HttpServletResponse response) throws IOException {
//        User user = userService.getUser(username);
//        if (user == null) {
//            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
//            response.getOutputStream().write("用户不存在".getBytes());
//            response.flushBuffer();
//        } else if (!user.getPassword().equals(password)) {
//            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
//            response.getOutputStream().write("密码错误".getBytes());
//            response.flushBuffer();
//        } else {
//            response.sendRedirect("/");
//        }
//    }
//}
