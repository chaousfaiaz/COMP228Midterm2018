/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp228midterm;

/**
 *
 * @author faiaz
 */
public abstract class Movie {
    // Variable Declaration
    private String title;
    private String studio;
    private String leadActor;
    public Double budget;
    private Integer year;

    // Constructor
    public Movie (String title, String studio, String leadActor, Double budget,Integer year){

        // Variable Initialization
        this.title = title;
        this.studio = studio;
        this.leadActor = leadActor;
        this.budget = budget;
        this.year = year;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getStudio() { return studio; }
    public void setStudio(String studio) { this.studio = studio; }
    public String getLeadActor() { return leadActor; }
    public void setLeadActor(String leadActor) { this.leadActor = leadActor; }
    public Double getBudget() { return budget; }
    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }

    // Abstract getters/setters
    public abstract void setBudget(Double budget);
    public abstract String getGenre ();

    @Override
    public String toString() {
        return "Title: " + this.getTitle() + "\nStudio: " + this.getStudio() +"\nLead Actor: " + this.getLeadActor()
                + "\nMovie Budget: $" + String.format("%.2f%n",this.getBudget()) + "Year: " + this.getYear();
    }
}
