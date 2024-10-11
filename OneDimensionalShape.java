// File name: OneDimensionalShape.java

// Written by: Omar Saleh

// Description: 
//               Abstract class representing one-dimensional shapes, such as lines.
//               Provides a structure for calculating length and managing shape properties.
//              
// Challenges: 
//            None
//
// Time Spent: 15 minutes

// Revision History:
// Date:         		By:         Action:
// ---------------------------------------------------
// 26/09/2024    (O.S.)       Created the abstract class
// 26/09/2024    (O.S.)       Added comments and documentation


public abstract class OneDimensionalShape extends MyShape {

    // Constructor initializes color and coordinates for the one-dimensional shape
    public OneDimensionalShape(String color, int x, int y) {
        super(color, x, y);
    }

    // Returns a string representation of the shapes info
    public String toString() {
        return "OneDimensionalShape: " + getName() + super.toString() +
               ", length=" + calculateLength();
    }

    // Abstract method to calculate the length of the 1D
    public abstract double calculateLength();
}
