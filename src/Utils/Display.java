package Utils;

import java.util.Scanner;

public class Display {
    private Scanner scanner;

    public Display() {
        scanner = new Scanner(System.in);
    }

    public void printTitleMessage(String title) {
        System.out.println("--------------------------------------------");
        System.out.println(title);
        System.out.println("---------------------------------------------");
    }

    public void printText(String text) {
        System.out.println(text);
    }

    public int getInt(String msg, Limit limit) {
        int res = 0;


        while (true) {
            printTitleMessage(msg);
            try {
                res = scanner.nextInt();
                if(limit.isRange(res)) {
                    return res;
                }
                printText("Ingrese un valor en el rango: "+ limit.toString());

            } catch (Exception e) {
                printTitleMessage("Ingrese un numero");
            }
        }
    }


}
