package eric.yxs.test.controller;

import eric.yxs.test.domain.User;
import eric.yxs.test.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Jony on 2015/2/28.
 */
@RequestMapping("/user")
@Controller
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(@RequestParam("id") int id) {
        User user = new User();
        user.setId(id);
        return userService.getUser(user);
    }
}
