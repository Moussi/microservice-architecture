package com.moussi.rest;

import com.moussi.dao.TeamDao;
import com.moussi.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by moussiaymen on 18/05/17.
 */
@RestController
@RequestMapping(value = "/team")
public class TeamController {

    @Autowired private TeamDao teamDao;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Team teams(@PathVariable String name){
        return teamDao.findByName(name);
    }

}
