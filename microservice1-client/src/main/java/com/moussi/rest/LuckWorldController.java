package com.moussi.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by moussiaymen on 18/05/17.
 */
@RestController
public class LuckWorldController {

    @Value("${lucky-word}")
private String luckyWord;

    @RequestMapping(value = "/lucky-word", method = RequestMethod.GET)
    public String teams(){
        return "Hello  " + luckyWord;
    }

}
