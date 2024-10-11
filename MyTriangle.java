// File name: MyTriangle.java
// Written by: Omar Saleh
// Description: This class represents a triangle on a 2D plane and extends TwoDimensionalShape.
//              It calculates the area and perimeter of the triangle using base-height and Heron's formula.
// Challenges: Correctly implementing two methods for area.
// Time Spent:  35 minutes

//            Revision History
// Date:         By:      Action:
// ---------------------------------------------------
/* 26/09/2024   (O.S.)   Created the class; added methods for calculating area and perimeter, and drawing the triangle.
 * 26/09/2024   (O.S.)   Added comments and documentation.
 */

public class MyTriangle extends TwoDimensionalShape {
	
	

	
	//Private Instance Variables that describe a triangle
    private double sideA;  
    private double sideB;  
    private double sideC;  
    private double base;  
    private double height; 

    // Constructor to initialize a triangle with its properties
    public MyTriangle(String color, int x, int y, boolean filled, double sideA, double sideB, double sideC, double base, double height) {
        super(color, x, y, filled); 
        this.sideA = sideA;         
        this.sideB = sideB;         
        this.sideC = sideC;         
        this.base = base;           
        this.height = height;       
    }

    // Method to calculate the area of the triangle using base and height or Heron's formula
    @Override
    public double calculateArea() {
        // First method: Calculate area using base and height
        double areaUsingBaseHeight = 0.5 * base * height;

        // Second method: Calculate area using Heron's formula
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        double areaUsingHeron = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

        // Return the maximum of both calculated areas (if both methods are valid)
        return Math.max(areaUsingBaseHeight, areaUsingHeron);
    }

    // Method to calculate the perimeter
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC; // Perimeter formula: a + b + c
    }

    // Length is not applicable  so returns 0
    @Override
    public double calculateLength() {
        return 0;
    }

    // Description of how to draw the triangle
    @Override
    public String howToDraw() {
        return "Draw a triangle with base " + base + " and height " + height + 
               " starting from (" + getX() + ", " + getY() + ").";
    }

    // Returns the name of the shape
    @Override
    public String getName() {
        return "Triangle";
    }

    //Setters and Getters for Sides  A,B,C  base and height
    
    
    public double getSideA() {
        return sideA;
    }

    
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    
    public double getSideB() {
        return sideB;
    }

  
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    
    public double getSideC() {
        return sideC;
    }

   
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

   
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    
    public void setHeight(double height) {
        this.height = height;
    }
}

