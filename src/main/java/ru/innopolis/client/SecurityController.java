package ru.innopolis.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Security Controller
 */
@Controller
public class SecurityController {

    /**
     *  страница аутентификации
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    /**
     * отказано в доступе - ошибка 403
     * @return
     */
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String logout() {
        return "403";
    }

}
