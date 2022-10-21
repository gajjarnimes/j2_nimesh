package java2_nimesh;
import java.util.Scanner;

public class Programme_14 {
    // Calculating area and perimeter of rectangle
    public static void areaAndPerimeterOfRectangle(int  height, int width) {
        int  perimeter = 2 * (height + width);
        int area =(height*width);
    }
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        double height = scanner.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        double width = scanner.nextInt();
        areaAndPerimeterOfRectangle((int) height, (int) width);
        // closing the scanner object
        scanner.close();
    }

}


