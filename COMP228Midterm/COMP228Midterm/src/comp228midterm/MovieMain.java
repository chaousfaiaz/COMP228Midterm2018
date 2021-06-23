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
public class MovieMain {
    public static void main (String [] args){
        Integer selection ;
        selection = Integer.parseInt(JOptionPane.showInputDialog("What type of Movie? \n1. Action Movie\n2. ComedyMovie"));
        if (selection == 1) {
            // Create Instance variable of type ActionMovie with User Inputs
            Movie newMovie = new ActionMovie(JOptionPane.showInputDialog("Title of the Movie: "), JOptionPane.showInputDialog("Studio Name: "), JOptionPane.showInputDialog("Lead Actor's Name: "), Double.parseDouble(JOptionPane.showInputDialog("Movie Budget: ")), Integer.parseInt(JOptionPane.showInputDialog("Year of Release: ")));

            // Displays the Movie Information
            JOptionPane.showMessageDialog(null,newMovie.toString() + "\nGenre: "+newMovie.getGenre(), "Movie Information", JOptionPane.INFORMATION_MESSAGE);
        } else if (selection == 2) {
            // Create Instance variable of type ComedyMovie with User Inputs
            Movie newMovie = new ComedyMovie(JOptionPane.showInputDialog("Title of the Movie: "), JOptionPane.showInputDialog("Studio Name: "), JOptionPane.showInputDialog("Lead Actor's Name: "), Double.parseDouble(JOptionPane.showInputDialog("Movie Budget: ")), Integer.parseInt(JOptionPane.showInputDialog("Year of Release: ")));

            // Displays the Movie Information
            JOptionPane.showMessageDialog(null,newMovie.toString() + "\nGenre: "+newMovie.getGenre(), "Movie Information", JOptionPane.INFORMATION_MESSAGE);
        }


    }
}
}
