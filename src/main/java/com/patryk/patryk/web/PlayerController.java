package com.patryk.patryk.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import com.patryk.patryk.service.PlayerService;

@Controller
public class PlayerController {

   /* private final PlayerService service;

    public PlayerController(PlayerService service) {
        this.service = service;
    }

    @GetMapping("")
    public String display(Model model){
        model.addAttribute("players",service.findAll());
        return "playersPage";
    }
    @GetMapping("top-secret")
    public String secret(Model model) {
        model.addAttribute("players", service.findAll());
        model.addAttribute("message", "Hello secret player World!");

        return "playersPage";
    }
    */

}
