package com.moussi.dao;

import com.moussi.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by moussiaymen on 19/05/17.
 */
@RestResource(path = "teams", rel = "teams")
public interface TeamDao extends CrudRepository<Team, Long> {

    List<Team> findAll();

    Team findByName(String name);

}
