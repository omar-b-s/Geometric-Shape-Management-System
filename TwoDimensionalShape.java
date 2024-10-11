// File name: TwoDimensionalShape.java
// Written by: Omar Saleh
// Description: This abstract class represents two-dimensional shapes, such as circles, squares, 
//              rectangles, and triangles. It provides methods for calculating area, perimeter, 
//              and managing the filled status of shapes.
// Challenges: None

// Time Spent: 20 minutes

//            Revision History
// Date:         By:      Action:
// ---------------------------------------------------
/* 26/09/2024   (O.S.)   Created the abstract class; added methods for calculating area, 
 *                       perimeter, and managing filled status.
 * 26/09/2024   (O.S.)   Added comments and documentation.
 */



public abstract class TwoDimensionalShape extends MyShape {
	
	
	
	

    private boolean isitfilled; // Indicates if the shape is filled

    // Constructor initializes color, coordinates, and filled status for the 2D shapes
    public TwoDimensionalShape(String color, int x, int y, boolean filled) {
        super(color, x, y);
        this.isitfilled = filled;
    }

    // Returns true if the shape is filled, false otherwise
    public boolean isFilled() {
        return isitfilled;
    }

    // Sets the filled status of the shape
    public void setFilled(boolean filled) {
        this.isitfilled = filled;
    }

    // Abstract methods for area, perimeter, getting name, and drawing
    
    
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public abstract String howToDraw();

    public abstract String getName();

    // Returns a string representation of the shape info
    public String toString() {
        return "TwoDimensionalShape: " + getName() +
               " [dateCreated=" + getDatecreated() +
               ", color=" + getColor() +
               ", filled=" + isFilled() +
               ", area=" + calculateArea() +
               ", perimeter=" + calculatePerimeter() + "]";
    }
}
