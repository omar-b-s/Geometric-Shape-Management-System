// File name: MySquare.java
// Written by: Omar Saleh
// Description: This class represents a square on a 2D plane and extends TwoDimensionalShape.
//              It calculates the area and perimeter of the square and provides details on how to draw it.
// Challenges: None
// Time Spent: 20 minutes

//            Revision History
// Date:         By:      Action:
// ---------------------------------------------------
/* 26/09/2024   (O.S.)   Created the class; added methods for calculating area and perimeter, and drawing the square.
 * 26/09/2024   (O.S.)   Added comments and documentation.
 */
 


public class MySquare extends TwoDimensionalShape {

    private double sideLength; // Attribute to store the length of the square's sides

    // Constructor to initialize a square with its properties
    public MySquare(String color, int x, int y, boolean filled, double sideLength) {
        super(color, x, y, filled); 
        this.sideLength = sideLength;
    }

    // Method to calculate the area 
    @Override
    public double calculateArea() {
        return Math.pow(sideLength, 2); // Area formula: sideLength^2
    }

    // Method to calculate the perimeter 
    @Override
    public double calculatePerimeter() {
        return 4 * sideLength; // Perimeter formula: 4 * sideLength
    }

    // Length is not applicable  so returns 0
    @Override
    public double calculateLength() {
        return 0;
    }

    // Description of how to draw the square
    @Override
    public String howToDraw() {
        return "Draw a square with side length " + sideLength + " starting from (" + getX() + ", " + getY() + ").";
    }

    // Returns the name of the shape
    @Override
    public String getName() {
        return "Square";
    }

    // Getters and Setters  for sidelength 
    
    
    public double getSideLength() {
        return sideLength;
    }

    
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}
