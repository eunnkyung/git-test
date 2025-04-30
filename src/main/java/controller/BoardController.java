package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
    @GetMapping("/list")
    public String login() {
        return "board/list";
    }
    @GetMapping("/write")
    public String signup() {
        return "board/write";
    }
    @GetMapping("/view")
    public String info() {
        return "board/view";
    }
}

