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

    public class ComedyMovie extends Movie {

    // Constructor
    public ComedyMovie(String title, String studio, String leadActor, Double budget, Integer year) {
        super(title, studio, leadActor, budget, year);
    }

    @Override
    public void setBudget(Double budget) {
        this.budget = budget;
    }

    @Override
    public String getGenre() {
        return this.getClass().getName();
    }
}

