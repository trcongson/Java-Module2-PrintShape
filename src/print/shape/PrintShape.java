package print.shape;

import java.util.Scanner;

public class PrintShape {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Vẽ hình chữ nhật.");
            System.out.println("2. Vẽ hình tam giác vuông đáy ở trên.");
            System.out.println("3. Vẽ hình tam giác vuông đáy ở dưới.");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();


            switch (choice) {
                case 1:
                    String str = "";
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 1; j <= 4; j++) {
                            str += "*";
                        }
                        str += "\n";
                    }
                    System.out.println(str);
                    break;
                case 2:
                    str = "";
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            str += "*";
                        }
                        str += "\n";
                    }
                    System.out.println(str);
                    break;
                case 3:
                    str = "";
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            str += "*";
                        }
                        str += "*\n";
                    }
                    System.out.println(str);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
