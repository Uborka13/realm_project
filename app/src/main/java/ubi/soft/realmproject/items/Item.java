package ubi.soft.realmproject.items;

import java.util.Date;
import java.util.UUID;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Item extends RealmObject {

    @PrimaryKey
    @Required
    private String id;
    @Required
    private String name;
    @Required
    private int rating;
    @Required
    private Date insDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getInsDate() {
        return insDate;
    }

    public void setInsDate(Date insDate) {
        this.insDate = insDate;
    }

    public Item() {
        this.id = UUID.randomUUID().toString();
        this.name = "";
        this.rating = 1;
        this.insDate = new Date();
    }
}
