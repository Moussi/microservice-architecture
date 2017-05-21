package com.moussi.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by moussiaymen on 19/05/17.
 */
@Entity
public class Team {

    @Id @GeneratedValue
    private long id;
    private String name;
    private String location;
    private String mascotte;
    @OneToMany(cascade = CascadeType.ALL) @JoinColumn(name = "teamId")
    private Set<Player> players = new HashSet<>();

    public static Team newInstance() {
         return new Team();
    }

    public Team id(long id) {
        this.setId(id);
        return this;
    }

    public Team name(String name) {
        this.setName(name);
        return this;
    }

    public Team mascotte(String mascotte) {
        this.setMascotte(mascotte);
        return this;
    }

    public Team location(String location) {
        this.setLocation(location);
        return this;
    }

    public Team players(Set<Player> players) {
        this.setPlayers(players);
        return this;
    }

    /**
     * Accessors
     */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascotte() {
        return mascotte;
    }

    public void setMascotte(String mascotte) {
        this.mascotte = mascotte;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
