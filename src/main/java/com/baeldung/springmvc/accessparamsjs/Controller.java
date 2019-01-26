package com.baeldung.springmvc.accessparamsjs;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Controller {

    @RequestMapping("/index")
    public ModelAndView index(Map<String, Object> model) throws JsonProcessingException {
        final String[] words = new String[] { "word1", "word2" };
        ObjectMapper mapper = new ObjectMapper();
        model.put("name", mapper.writeValueAsString(words));
        return new ModelAndView("/index");
    }

}
