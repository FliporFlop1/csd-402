
/*
 * Author: Jadon Argo
 * Course: CSD 402 - Java for Programmers
 * Assignment: Module 6 - Fan Class
 * Date: October 18, 2026
 *
 * Purpose:
 * This program demonstrates object-oriented programming
 * by creating a Fan class with constructors, constants,
 * private fields, getters, setters, and a toString method.
 */

public class Fan {

    // Fan speed constants.
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fan attributes.
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor sets default values.
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6.0;
        color = "white";
    }

    // Constructor that accepts values for all fields.
    public Fan(int speed, boolean on, double radius, String color) {
        setSpeed(speed);
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter for speed.
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;
        }
    }

    // Getter and setter for on/off state.
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter and setter for radius.
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter and setter for color.
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Return a description of the fan.
    @Override
    public String toString() {
        return "Fan State:" +
               "\nSpeed: " + speed +
               "\nOn: " + on +
               "\nRadius: " + radius +
               "\nColor: " + color;
    }

    // Test the Fan class.
    public static void main(String[] args) {

        // Fan 1 uses the default constructor.
        Fan fan1 = new Fan();

        // Fan 2 uses the argument constructor.
        Fan fan2 = new Fan(FAST, true, 10.0, "black");

        System.out.println("Fan 1 - Default Constructor");
        System.out.println("---------------------------");
        System.out.println(fan1);

        System.out.println();

        System.out.println("Fan 2 - Argument Constructor");
        System.out.println("----------------------------");
        System.out.println(fan2);

        // Demonstrate setter methods.
        fan1.setSpeed(MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8.0);
        fan1.setColor("blue");

        System.out.println();

        System.out.println("Fan 1 - After Using Setters");
        System.out.println("---------------------------");
        System.out.println(fan1);

        // Demonstrate getter methods.
        System.out.println();
        System.out.println("Fan 2 - Getter Method Test");
        System.out.println("--------------------------");
        System.out.println("Speed: " + fan2.getSpeed());
        System.out.println("On: " + fan2.isOn());
        System.out.println("Radius: " + fan2.getRadius());
        System.out.println("Color: " + fan2.getColor());
    }
}
