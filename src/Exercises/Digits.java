package Exercises;

import Utils.Display;
import Utils.Limit;

public class Digits extends Display {

    private int input;

    public Digits(Display display) {
        setInput(display);
    }

    public String getDigits() {

      int total = 0;

      String num;

            if(setRange(input)) {
                printText("Debe ingresar un numero que tenga menos de 4 digitos");
            } else {
                num = String.valueOf(Integer.toString(input));

                char[] digits = num.toCharArray();

                for (int i = 0; i < digits.length; i++) {

                    num = String.valueOf(Integer.toString(input).charAt(i));

                    printText("D" + i + "=" + digits[i]);

                    total += Integer.parseInt(num);
                }
            }
        return "El total es: " + total;
    }
    private void setInput(Display display) {
        input = display.getInt("Ingrese el numero uno: ", new Limit(0, 100000));
    }

    private boolean setRange(int input) {

        return Integer.toString(input).length() >4;

    }
}
