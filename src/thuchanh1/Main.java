package thuchanh1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Trình giải phương trình tuyến tính ");
        System.out.println(" Đưa ra một phương trình 'a * x + b = 0', vui lòng nhập hằng số ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        if(a !=0){
            double solution  = -b /a ;
            System.out.printf("Giải pháp là  %f", solution);
        }
        else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }

    }
}