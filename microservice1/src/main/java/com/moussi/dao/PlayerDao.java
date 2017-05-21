package com.moussi.dao;

import com.moussi.model.Player;
import com.moussi.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by moussiaymen on 19/05/17.
 */
@RestResource(path = "players" , rel = "players")
public interface PlayerDao extends CrudRepository<Player, Long> {

    List<Player> findAll();

    Player findByName(String name);

}
