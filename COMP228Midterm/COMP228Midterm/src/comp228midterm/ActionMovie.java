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
import javax.swing.JOptionPane;
public class ActionMovie extends Movie{

    // Constructor
    public ActionMovie(String title, String studio, String leadActor, Double budget, Integer year) {
        super(title, studio, leadActor, budget, year);

        setBudget(this.getBudget());
        // Informs User of Changes
        JOptionPane.showMessageDialog(null, "Budget Increased by 10%\nNew Budget: $" + String.format("%.2f%n",this.getBudget()));
    }

    // Sets the budget of the movie
    @Override
    public void setBudget(Double budget) {
        // Increase budget by 10%
        this.budget += (this.budget * 0.10);
    }

    // Returns the Genre Name
    @Override
    public String getGenre() {
        return this.getClass().getName();
    }
}
