// File name: Colorable.java

// Written by: Omar Saleh

// Description: 
//               Interface to define color-related methods for shapes.
//               It allows implementing classes to set and retrieve colors.
//              
// Challenges: 
//              None
//
// Time Spent: 5 minutes

// Revision History:
// Date:         		By:         Action:
// ---------------------------------------------------
// 26/09/2024    Omar Saleh    Created the interface
// 26/09/2024    Omar Saleh    Added comments and documentation

// Interface to define color-related methods for shapes
public interface Colorable {

    // Method to set the color of the shape
    void setColor(String color);

    // Method to get the current color of the shape
    String getColor();
}
