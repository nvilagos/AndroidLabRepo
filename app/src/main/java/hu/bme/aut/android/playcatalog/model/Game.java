package hu.bme.aut.android.playcatalog.model;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private long uid;

    private String name;

    private List<Play> plays = new ArrayList<>();

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Play> getPlays() {
        return plays;
    }

    public void setPlays(List<Play> plays) {
        this.plays = plays;
    }
}
