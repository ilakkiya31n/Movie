package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="moviedetails")
public class Movie {
    @Id
    private  int TicketId;
    @Column(name="Moviename")
    private  String MovieName;
    @Column(name="Language")
    private  String Language;
    @Column(name = "Moviedetails")
    private  String Moviedetails;
    @Column(name="Location")
    private  String Location;
  public Movie() {
  }
  public Movie(int ticketId, String movieName, String language, String moviedetails, String location,
          String bookingticket) {
      TicketId = ticketId;
      MovieName = movieName;
      Language = language;
      Moviedetails = moviedetails;
      Location = location;
  }
  public int getTicketId() {
      return TicketId;
  }
  public void setTicketId(int ticketId) {
      TicketId = ticketId;
  }
  public String getMovieName() {
      return MovieName;
  }
  public void setMovieName(String movieName) {
      MovieName = movieName;
  }
  public String getLanguage() {
      return Language;
  }
  public void setLanguage(String language) {
      Language = language;
  }
  public String getMoviedetails() {
      return Moviedetails;
  }
  public void setMoviedetails(String moviedetails) {
      Moviedetails = moviedetails;
  }
  public String getLocation() {
      return Location;
  }
  public void setLocation(String location) {
      Location = location;
  }

}
