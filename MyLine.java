// File name: MyLine.java
// Written by: Omar Saleh
// Description: This class represents a line on a 2D plane and extends OneDimensionalShape.
//              It calculates the length of the line and provides details on how to draw it.
// Challenges: Handling the correct calculation of line length using coordinates and managing the absence of area or perimeter.
// Time Spent:  20 minutes

//            Revision History
// Date:         By:      Action:
// ---------------------------------------------------
/* 26/09/2024   (O.S.)   Created the class and added methods for calculating length and drawing the line.
 * 26/09/2024   (O.S.)   Added comments and documentation.
 */

public class MyLine extends OneDimensionalShape {
    
    private int x2, y2;

    // Constructor to initialize the line with starting and ending points, and color
    public MyLine(String color,int x, int y, int x2, int y2) {
        super(color, y, x); 
        this.x2 = x2;
        this.y2 = y2;
    }

    // Method to calculate the length of the line using the distance formula
    @Override
    public double calculateLength() {
        return Math.sqrt(Math.pow(x2 - getX(), 2) + Math.pow(y2 - getY(), 2));
    }

    // Lines do not have an area so this returns 0
    @Override
    public double calculateArea() {
        return 0; // No area for a line
    }

    // Lines do not have a perimeter  so this returns 0
    @Override
    public double calculatePerimeter() {
        return 0; // Perimeter is not applicable for a line
    }

    //Description of how to draw the line
    @Override
    public String howToDraw() {
        return "Draw a line from (" + getX() + ", " + getY() + ") to (" + x2 + ", " + y2 + ")";
    }

    // Returns the name 
    @Override
    public String getName() {
        return "Line";
    }

    //To String that overrides 1D
    @Override
    public String toString() {
        return "OneDimensionalShape: " + getName() + 
               " [dateCreated=" + getDatecreated() + 
               ", color=" + getColor() + 
               ", length=" + calculateLength() + "]";
    }

    // Getters and setters for x2 and y2
    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}