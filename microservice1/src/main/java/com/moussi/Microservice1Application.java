package com.moussi;

import com.moussi.dao.TeamDao;
import com.moussi.model.Player;
import com.moussi.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Microservice1Application extends SpringBootServletInitializer {

    @Autowired private TeamDao teamDao;

    public static void main(String[] args) {
        SpringApplication.run(Microservice1Application.class, args);
    }

    @Override protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Microservice1Application.class);
    }

    @PostConstruct public void init() {
        Set<Player> players = new HashSet<>();
        players.add(Player.newInstance().name("Aymen").tshirtNumber(10));
        players.add(Player.newInstance().name("Malek").tshirtNumber(7));

        Team
            caTeam =
            Team.newInstance().location("Tunis").name("CA").mascotte("Montality")
                .players(players);
        teamDao.save(caTeam);
    }
}
