// File name: MyRectangle.java
// Written by: Omar Saleh
// Description: This class represents a rectangle on a 2D plane and extends TwoDimensionalShape.
//              It calculates the area and perimeter of the rectangle and provides details on how to draw it.
// Challenges: None
// Time Spent: About 25 minutes

//            Revision History
// Date:         By:      Action:
// ---------------------------------------------------
/* 26/09/2024   (O.S.)   Created the class; added methods for calculating area and perimeter, and drawing the rectangle.
 * 26/09/2024   (O.S.)   Added comments and documentation.
 */

public class MyRectangle extends TwoDimensionalShape {
	
	
	
	// Attribute to store the width and height
    private double width;  
    private double height; 
    
    // Constructor to initialize a rectangle with its properties
    public MyRectangle(String color, int x, int y, boolean filled, double width, double height) {
        super(color, x, y, filled); 
        this.width = width;   
        this.height = height;       
    }

    // Method to calculate the area 
    
    
    @Override
    public double calculateArea() {
        return width * height; // Area formula: width * height
    }

    // Method to calculate the perimeter 
    
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height); // Perimeter formula: 2 * (width + height)
    }

    // Length is not applicable  so returns 0
    @Override
    public double calculateLength() {
        return 0;
    }

    // Description of how to draw the rectangle
    @Override
    public String howToDraw() {
        return "Draw a rectangle with width " + width + " and height " + height + 
               " starting from (" + getX() + ", " + getY() + ").";
    }

    // Returns the name of the shape
    @Override
    public String getName() {
        return "Rectangle";
    }

    // Setters and Getters for width and height 
    
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
