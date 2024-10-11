// File name: ShapeCollection.java
// Written by: Omar Saleh
// Description: This class manages a collection of MyShape objects. It provides methods for adding, removing, 
//              and retrieving shapes, as well as calculating total area and perimeter, finding the shape with 
//              the largest area, and sorting shapes by their area.
// Challenges: None
// Time Spent: About 40 minutes

//            Revision History
// Date:         By:      Action:
// ---------------------------------------------------
/* 26/09/2024   (O.S.)   Created the class; added methods for managing the shape collection, including calculations 
 *                       and sorting.
 * 26/09/2024   (O.S.)   Added comments and documentation.
 */



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShapeCollection {

    private List<MyShape> shapes; // Attribute to store the array of shapes

    // Constructor to initialize the shape collection
    public ShapeCollection() {
        this.shapes = new ArrayList<>();     }

    // Method to add a shape to the collection
    public void addShape(MyShape shape) {
        shapes.add(shape);
    }

    // Method to remove a shape from the collection
    public void removeShape(MyShape shape) {
        shapes.remove(shape);
    }

    // Method to retrieve a shape by index
    public MyShape getShape(int index) {
        if (index >= 0 && index < shapes.size()) {
            return shapes.get(index);
        }
        return null; // Return null if the index is out of bounds
    }

    // Method to return the collection of shapes
    public List<MyShape> getAllShapes() {
        return shapes;
    }

    // Method to list all shapes by invoking their toString method
    public void listShapes() {
        for (MyShape shape : shapes) {
            System.out.println(shape.toString());
        }
    }

    // Method to invoke the howToDraw method of each shape in the collection
    public void drawShapes() {
        for (MyShape shape : shapes) {
            System.out.println(shape.howToDraw());
        }
    }

    // Method to calculate the total area of all shapes in the collection
    public double getTotalArea() {
        double totalArea = 0;
        for (MyShape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    // Method to calculate the total perimeter of all shapes in the collection
    public double getTotalPerimeter() {
        double totalPerimeter = 0;
        for (MyShape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }
        return totalPerimeter;
    }

    // Method to get the shape with the largest area
    public MyShape getMaxShape() {
        if (shapes.isEmpty()) {
            return null; // Return null if the collection is empty
        }
        return Collections.max(shapes, Comparator.comparingDouble(MyShape::calculateArea));
    }

    // Method to sort shapes based on their area
    public void sortShapes() {
        shapes.sort(Comparator.comparingDouble(MyShape::calculateArea));
    }
}

