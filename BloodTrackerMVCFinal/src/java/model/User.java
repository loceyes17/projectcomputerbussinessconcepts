package model;

import java.io.Serializable;

/**
 *
 * @author John Phillips
 */
public class User implements Serializable {

    private int id;
    private String videogame;
    private int price;
    private String date;
    private String time;
    private String notes;

    public User() {
        id = 0;
        videogame = "none@test.com";
        price = 0;
        date = "1970-01-01";
        time = "00:01 AM";
        notes = "none";
    }

    public User(int id, String email, int bloodSugar, String date, String time, String notes) {
        this.id = id;
        this.videogame = email;
        this.price = bloodSugar;
        this.date = date;
        this.time = time;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return videogame;
    }

    public void setEmail(String email) {
        this.videogame = email;
    }

    public int getBloodSugar() {
        return price;
    }

    public void setBloodSugar(int bloodSugar) {
        this.price = bloodSugar;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String inHTMLRowFormat() {
        return "<tr><td>" + id + "</td>"
                + "<td>" + videogame + "</td>"
                + "<td>" + price + "</td>"
                + "<td>" + date + "</td>"
                + "<td>" + time + "</td>"
                + "<td>" + notes + "</td></tr>\n";
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email=" + videogame + ", bloodSugar="
                + price + ", date=" + date + ", time=" + time
                + ", notes=" + notes + '}';
    }
}
