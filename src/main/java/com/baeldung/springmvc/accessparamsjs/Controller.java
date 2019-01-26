package com.baeldung.springmvc.accessparamsjs;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {
    
    @RequestMapping("/index")
    public ModelAndView index(Map<String, Object> model) {
        final String[] words = new String[] {"word1", "word2"};
        model.put("message", words);
        return new ModelAndView("index");
    }
}
