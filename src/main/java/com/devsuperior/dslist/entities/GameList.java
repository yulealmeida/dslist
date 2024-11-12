package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_name_list")
public class GameList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public GameList(){
    }

    public GameList (Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId () {
        return id;
    }

    public GameList setId (Long id) {
        this.id = id;
        return this;
    }

    public String getName () {
        return name;
    }

    public GameList setName (String name) {
        this.name = name;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GameList other = (GameList) obj;
        return Objects.equals(id, other.id);
    }
}