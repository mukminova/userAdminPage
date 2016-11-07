package ru.innopolis.client;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Контроллер страницы пользователя
 */
@Controller
public class UserController {
    /**
     * страница пользователя
     * @return
     */
    @Secured({"ROLE_USER"})
    @RequestMapping("/userPage")
    public String userPage() {
        return "userPage";
    }
}
