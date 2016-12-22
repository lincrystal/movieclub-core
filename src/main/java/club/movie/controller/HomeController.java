package club.movie.controller;
/**
 * Created by zhang.junlin on 2016/12/21 0021.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping (value = "/home", method = RequestMethod.POST)
    public String homePage(){
        return "home";
    }
}
