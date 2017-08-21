package xy.test.controller;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xy on 2017-08-21 22:19
 */
@Controller
@RequestMapping(path="/user")
public class UserController {

    @RequestMapping(path="/index")
    public String index(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "/login/login";
    }

    @RequestMapping(path="/mainPage")
    public String main(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "/welcome";
    }

}