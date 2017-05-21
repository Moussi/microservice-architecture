package com.moussi.model;

import javax.persistence.*;

/**
 * Created by moussiaymen on 19/05/17.
 */

@Entity public class Player {

    @Id @GeneratedValue private long id;
    private String name;
    private long tshirtNumber;

    public static Player newInstance() {
        return new Player();
    }

    public Player id(long id) {
        this.setId(id);
        return this;
    }

    public Player name(String name) {
        this.setName(name);
        return this;
    }

    public Player tshirtNumber(long tshirtNumber) {
        this.setTshirtNumber(tshirtNumber);
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

    public long getTshirtNumber() {
        return tshirtNumber;
    }

    public void setTshirtNumber(long tshirtNumber) {
        this.tshirtNumber = tshirtNumber;
    }
}
