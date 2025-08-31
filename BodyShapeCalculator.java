import java.util.Scanner;

public class BodyShapeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter your shoulder measurement (in inches):");
        double shoulders = scanner.nextDouble();

        System.out.println("Enter your bust measurement (in inches):");
        double bust = scanner.nextDouble();

        System.out.println("Enter your waist measurement (in inches):");
        double waist = scanner.nextDouble();

        System.out.println("Enter your hip measurement (in inches):");
        double hips = scanner.nextDouble();

        
        String bodyShape = calculateBodyShape(shoulders, bust, waist, hips);
        System.out.println("Your body shape is: " + bodyShape);

        scanner.close();
    }

    public static String calculateBodyShape(double shoulders, double bust, double waist, double hips) {
        double shoulderBustAvg = (shoulders + bust) / 2;

  
        if (Math.abs(shoulders - hips) < 2.0 && waist < bust * 0.75) {
            return "Hourglass";
        }
       
        else if (hips > shoulderBustAvg + 2) {
            return "Pear (Triangle)";
        }
       
        else if (shoulders > hips + 2) {
            return "Inverted Triangle";
        }
        
        else if (Math.abs(shoulders - hips) < 3 && Math.abs(bust - hips) < 3 && waist > bust * 0.75) {
            return "Rectangle";
        }
       
        else if (waist >= bust && waist >= hips) {
            return "Apple";
        }
        else {
            return "Undefined Body Shape";
        }
    }
}
