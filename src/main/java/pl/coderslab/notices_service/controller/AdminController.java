package pl.coderslab.notices_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/")
    public String showAdminOptions() {

        return "admin/adminBasicView";
    }
}
