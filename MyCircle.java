// File name: MyCircle.java
// Written by: Omar Saleh
// Description: This class represents a circle on a 2D plane and extends TwoDimensionalShape.
//              It calculates the area and perimeter (circumference) of the circle and provides details on how to draw it.
// Challenges: None
// Time Spent: 25 minutes

//            Revision History
// Date:         By:      Action:
// ---------------------------------------------------
/* 26/09/2024   (O.S.)   Created the class; added methods for calculating area and perimeter, and drawing the circle.
 * 26/09/2024   (O.S.)   Added comments and documentation.
 */


public class MyCircle extends TwoDimensionalShape {
	
	

    private double radius; // Attribute to store the radius of the circle

    // Constructor to initialize a circle with its properties
    public MyCircle(String color, int x, int y, boolean filled, double radius) {
        super(color, x, y, filled); 
        this.radius = radius; 
    }

    // Method to calculate the area of the circle
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate the perimeter (circumference) of the circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; //
    }

    // Description of how to draw the circle
    @Override
    public String howToDraw() {
        return "Draw a circle with center at (" + getX() + ", " + getY() + ") and radius " + radius;
    }

    // Returns the name of the shape
    @Override
    public String getName() {
        return "Circle";
    }

    // Length is not applicable for circles, so returns 0
    @Override
    public double calculateLength() {
        return 0;
    }

    // Getter and Setters for radius 
    
    
    public double getRadius() {
        return radius;
    }

   
    public void setRadius(double radius) {
        this.radius = radius;
}
}