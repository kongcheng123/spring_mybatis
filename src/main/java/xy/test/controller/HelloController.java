package xy.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xy on 2017-08-21 22:21
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mv =new ModelAndView();
        mv.addObject("spring", "spring mvc");
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping("/hello1")
    public @ResponseBody String test() {
        return "hello, world! This com from spring!";
    }
}