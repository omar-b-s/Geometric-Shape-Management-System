// File name: ShapeManager.java
// Written by: Omar Saleh
// Description: This class provides a user interface to interact with the ShapeCollection, allowing users to add, view, 
//              and manage various geometric shapes. It includes methods for calculating total area and perimeter, 
//              finding the largest shape, and sorting shapes by area.
//
// Challenges: Handling user input validation, especially ensuring correct data types and preventing invalid entries.
// Time Spent: 2 hour

//            Revision History
// Date:         By:      Action:
// ---------------------------------------------------
/* 26/09/2024   (O.S.)   Created the class; added methods for shape management, input validation, and calculations.
 * 26/09/2024   (O.S.)   Added comments and documentation.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShapeManager {

    private ShapeCollection shapeCollection; // Manages the shapes
    private Scanner scanner; // Scanner for user input

    // List of colors
    private final List<String> validColors = Arrays.asList(
            "Red", "Blue", "Green", "Yellow", "Black", "White", "Orange", "Purple", "Pink", "Brown", "Gray"
    );

    // Constructor to initialize the ShapeManager with a new ShapeCollection and Scanner
    public ShapeManager() {
        shapeCollection = new ShapeCollection();
        scanner = new Scanner(System.in);
    }

    // Method to display the menu of options for the user
    public void displayMenu() {
        System.out.println("\nShape Management System");
        System.out.println("1. Add Shape");
        System.out.println("2. View Shapes");
        System.out.println("3. Draw Shapes");
        System.out.println("4. Calculate Total Area");
        System.out.println("5. Calculate Total Perimeter");
        System.out.println("6. Find Largest Shape");
        System.out.println("7. Sort Shapes by Area");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to add a new shape based on user input
    public void addShape() {
        int choice;
        do {
            System.out.println("\nSelect Shape to Add:");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Rectangle");
            System.out.println("4. Triangle");
            System.out.print("Enter your choice: ");
            choice = getIntInput();

            switch (choice) {
                case 1:
                    addCircle();
                    break;
                case 2:
                    addSquare();
                    break;
                case 3:
                    addRectangle();
                    break;
                case 4:
                    addTriangle();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 4.");
                    break;
            }
        } while (choice < 1 || choice > 4);
    }

    //  Method to add a Circle with input validation
    private void addCircle() {
        String color = selectColor();
        int x = getIntInput("Enter x coordinate: ");
        int y = getIntInput("Enter y coordinate: ");
        boolean filled = getBooleanInput("Is the circle filled (true/false): ");
        double radius = getNonNegativeDoubleInput("Enter radius: ");
        shapeCollection.addShape(new MyCircle(color, x, y, filled, radius));
        System.out.println("Circle added successfully.");
    }

    //  Method to add a Square with input validation
    private void addSquare() {
        String color = selectColor();
        int x = getIntInput("Enter x coordinate: ");
        int y = getIntInput("Enter y coordinate: ");
        boolean filled = getBooleanInput("Is the square filled (true/false): ");
        double sideLength = getNonNegativeDoubleInput("Enter side length: ");
        shapeCollection.addShape(new MySquare(color, x, y, filled, sideLength));
        System.out.println("Square added successfully.");
    }

    //  Method to add a Rectangle with input validation
    private void addRectangle() {
        String color = selectColor();
        int x = getIntInput("Enter x coordinate: ");
        int y = getIntInput("Enter y coordinate: ");
        boolean filled = getBooleanInput("Is the rectangle filled (true/false): ");
        double width = getNonNegativeDoubleInput("Enter width: ");
        double height = getNonNegativeDoubleInput("Enter height: ");
        shapeCollection.addShape(new MyRectangle(color, x, y, filled, width, height));
        System.out.println("Rectangle added successfully.");
    }

    // Method to add a Triangle with input validation
    private void addTriangle() {
        String color = selectColor();
        int x = getIntInput("Enter x coordinate: ");
        int y = getIntInput("Enter y coordinate: ");
        boolean filled = getBooleanInput("Is the triangle filled (true/false): ");
        double sideA = getNonNegativeDoubleInput("Enter side A length: ");
        double sideB = getNonNegativeDoubleInput("Enter side B length: ");
        double sideC = getNonNegativeDoubleInput("Enter side C length: ");
        double base = getNonNegativeDoubleInput("Enter base: ");
        double height = getNonNegativeDoubleInput("Enter height: ");
        shapeCollection.addShape(new MyTriangle(color, x, y, filled, sideA, sideB, sideC, base, height));
        System.out.println("Triangle added successfully.");
    }

    // Method to display a list of colors and select one by number
    private String selectColor() {
        while (true) {
            System.out.println("Select a color:");
            for (int i = 0; i < validColors.size(); i++) {
                System.out.println((i + 1) + ". " + validColors.get(i));
            }
            System.out.print("Enter the number of your choice: ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice > 0 && choice <= validColors.size()) {
                    return validColors.get(choice - 1);
                } else {
                    System.out.println("Invalid choice. Please select a number between 1 and " + validColors.size() + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    // Method to retrieve integer input with validation
    private int getIntInput(String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    // Method to retrieve integer input without a message
    private int getIntInput() {
        return getIntInput(""); // Use the existing method to keep code DRY (Don't Repeat Yourself)
    }

    // Method to retrieve double input with validation for non-negative values
    private double getNonNegativeDoubleInput(String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                if (value >= 0) {
                    return value;
                } else {
                    System.out.println("Invalid input. Please enter a non-negative number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    // Method to retrieve boolean input with validation
    private boolean getBooleanInput(String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextBoolean()) {
                return scanner.nextBoolean();
            } else {
                System.out.println("Invalid input. Please enter true or false.");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    // Method to display all shapes in the collection
    public void viewShapes() {
        System.out.println("\nViewing All Shapes:");
        shapeCollection.listShapes();
    }

    // Method to display drawing instructions for all shapes
    public void drawShapes() {
        System.out.println("\nDrawing All Shapes:");
        shapeCollection.drawShapes();
    }

    // Method to calculate and display the total area of all shapes
    public void calculateTotalArea() {
        double totalArea = shapeCollection.getTotalArea();
        if (totalArea < 0) totalArea = 0; // Prevent negative area output
        System.out.println("\nTotal Area of All Shapes: " + totalArea);
    }

    // Method to calculate and display the total perimeter of all shapes
    public void calculateTotalPerimeter() {
        double totalPerimeter = shapeCollection.getTotalPerimeter();
        if (totalPerimeter < 0) totalPerimeter = 0; // Prevent negative perimeter output
        System.out.println("\nTotal Perimeter of All Shapes: " + totalPerimeter);
    }

    // Method to find and display the shape with the largest area
    public void findLargestShape() {
        MyShape largestShape = shapeCollection.getMaxShape();
        if (largestShape != null) {
            System.out.println("\nLargest Shape: " + largestShape);
        } else {
            System.out.println("No shapes available.");
        }
    }

    // Method to sort shapes by their area and display them
    public void sortShapes() {
        shapeCollection.sortShapes();
        System.out.println("\nShapes sorted by area:");
        shapeCollection.listShapes();
    }

    // Main loop to run the shape manager
    public void run() {
        int choice;
        do {
            displayMenu();
            choice = getIntInput();
            switch (choice) {
                case 1:
                    addShape();
                    break;
                case 2:
                    viewShapes();
                    break;
                case 3:
                    drawShapes();
                    break;
                case 4:
                    calculateTotalArea();
                    break;
                case 5:
                    calculateTotalPerimeter();
                    break;
                case 6:
                    findLargestShape();
                    break;
                case 7:
                    sortShapes();
                    break;
                case 8:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 8.");
                    break;
            }
        } while (choice != 8);
    }

    // Main method to start the ShapeManager
    public static void main(String[] args) {
        ShapeManager manager = new ShapeManager();
        manager.run();
    }
}

