import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double height, width, area = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
        area = 0.5 * height * width;
        System.out.println("Area of Right Angle Triangle" + " = " + area);
        sc.close();
    }
}
