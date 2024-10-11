// File name: MyShape.java

// Written by: Omar Saleh

// Description: 
//               Abstract class representing a general shape with common properties and methods.
//               It serves as a base class for specific shape classes, defining shared behavior.
//              
// Challenges: 
//              Ensuring all  calculation methods across different shapes.
//             
//
// Time Spent: 30 Minutes 

// Revision History:
// Date:         		By:         Action:
// ---------------------------------------------------
// 26/09/2024    (O.S.)       Created the abstract class and finished it
// 26/09/2024    (O.S.)       Added comments and documentation



import java.util.Date;





public abstract class MyShape implements Colorable, Comparable<MyShape> {

	// Private Variables
    private String color;
    private int x, y; 
    private Date datecreated; 

    // Constructor initializes color, coordinates, and creation date
    public MyShape(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.datecreated = new Date(); // Initializes datecreated to the current date and time
    }

    // Compares the area of this shape with another shape
    public int compareTo(MyShape o) {
        return Double.compare(this.calculateArea(), o.calculateArea());
    }

    // Returns the shape with the larger area between two shapes
    public static MyShape max(MyShape o1, MyShape o2) {
        return o1.compareTo(o2) >= 0 ? o1 : o2;
    }

    // Checks if two shapes have the same area
    public boolean equals(Object obj) {
        if (obj instanceof MyShape) {
            MyShape other = (MyShape) obj;
            return Double.compare(this.calculateArea(), other.calculateArea()) == 0;
        }
        return false;
    }

    // Returns a string representation of the shape including its creation date and color
    public String toString() {
        return "dateCreated=" + datecreated + ", color=" + color;
    }

    // Getters and Setters
    
    public String getColor() {
        return color;
    }

   
    public void setColor(String color) {
        this.color = color;
    }

   
    public int getX() {
        return x;
    }

    
    public void setX(int x) {
        this.x = x;
    }

   
    public int getY() {
        return y;
    }

    
    public void setY(int y) {
        this.y = y;
    }

    
    public Date getDatecreated() {
        return datecreated;
    }

   
    public void setDate(Date datecreated) {
        this.datecreated = datecreated;
    }

    
    // Abstract Methods 
    
    abstract double calculateArea();

    
    abstract double calculatePerimeter();

    abstract double calculateLength();

    abstract String howToDraw();

    abstract String getName();
}
