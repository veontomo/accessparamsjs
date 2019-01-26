package com.baeldung.springmvc.accessparamsjs;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.baeldung.springmvc.accessparamsjs.model.Item;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Controller {

    @RequestMapping("/index")
    public ModelAndView index(Map<String, Object> model) throws JsonProcessingException {
        final String[] words = new String[] { "word1", "word2" };
        ObjectMapper mapper = new ObjectMapper();
        final String array =mapper.writeValueAsString(words); 
        model.put("array", array);
        System.out.println("array:" + array);
        model.put("item", mapper.writeValueAsString(new Item("key", "value")));
        model.put("number", 1111);
        model.put("message", "this is a string");
        return new ModelAndView("/index");
    }

}
