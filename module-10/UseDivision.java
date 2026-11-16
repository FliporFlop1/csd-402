
public class UseDivision {

    public static void main(String[] args) {

        // Create two international divisions
        InternationalDivision international1 =
            new InternationalDivision(
                "European Operations", 1001, "Germany", "German");

        InternationalDivision international2 =
            new InternationalDivision(
                "Asian Operations", 1002, "Japan", "Japanese");

        // Create two domestic divisions
        DomesticDivision domestic1 =
            new DomesticDivision(
                "West Coast Operations", 2001, "Washington");

        DomesticDivision domestic2 =
            new DomesticDivision(
                "East Coast Operations", 2002, "New York");

        // Display information for all four divisions
        System.out.println("MODULE 10 - COMPANY DIVISIONS");
        System.out.println("==============================");

        international1.display();
        international2.display();
        domestic1.display();
        domestic2.display();
    }
}
