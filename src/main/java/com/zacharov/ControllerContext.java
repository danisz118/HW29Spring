package com.zacharov;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class ControllerContext {
    @GetMapping
    public String main(Map<String, Object> model) {
        return "main";
    }
    @GetMapping("/title")
    public String title(
            @RequestParam(name = "title", required = false, defaultValue = "Title") String title,
            @RequestParam(name = "text", required = false, defaultValue = "text") String text,
            Map<String, Object> model
    ) {

        model.put("title", title);
        model.put("text", text);
        return "title";
    }

    @PostMapping
    public @ResponseBody
    String test(Map<String, Object> model) {
        return "test post";
    }

}
