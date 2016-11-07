package ru.innopolis.client;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Контроллер страницы администратора
 */
@Controller
public class AdminController {
    /**
     * страница администратора
     * @return
     */
    @Secured({"ROLE_ADMIN"})
    @RequestMapping("/adminPage")
    public String adminPage() {
        return "adminPage";
    }
}
