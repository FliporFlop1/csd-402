
/*
 * Author: Jadon Argo
 * Course: CSD 402 - Java for Programmers
 * Assignment: Module 7 - UseFans
 * Date: October 25, 2026
 *
 * Purpose:
 * This program creates a collection of Fan objects
 * and displays their information using methods
 * without calling the toString() method.
 */

import java.util.ArrayList;
import java.util.Collection;

public class UseFans {

    // Display the attributes of a single Fan.
    public static void displayFan(Fan fan) {
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

    // Display all Fans in a collection.
    public static void displayFans(Collection<Fan> fans) {
        int number = 1;

        for (Fan fan : fans) {
            System.out.println();
            System.out.println("Fan " + number);
            System.out.println("--------------------");
            displayFan(fan);
            number++;
        }
    }

    public static void main(String[] args) {

        // Create a collection of Fan objects.
        Collection<Fan> fans = new ArrayList<>();

        // Create four Fan instances.
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 10.0, "black");
        Fan fan3 = new Fan(Fan.MEDIUM, true, 8.0, "blue");
        Fan fan4 = new Fan(Fan.SLOW, false, 12.0, "red");

        // Add each Fan to the collection.
        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);
        fans.add(fan4);

        System.out.println("Module 7 - Fan Collection Test");
        System.out.println("==============================");

        // Display all Fan objects.
        displayFans(fans);

        // Test setter methods by updating Fan 1.
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setColor("green");

        System.out.println();
        System.out.println("Updated Fan 1");
        System.out.println("--------------------");

        // Display a single Fan.
        displayFan(fan1);

        System.out.println();
        System.out.println("End of Fan Collection Test");
    }
}
