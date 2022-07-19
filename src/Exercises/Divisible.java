package Exercises;

import Utils.Display;
import Utils.Limit;

public class Divisible extends Display {

    private int input1, input2;
    public Divisible(Display display) {
        setInput(display);
    }

    public String getDivisible() {
        if (input1%input2 ==0) {
            return "Es divisible";
        } else {
            return "No es divisible";
        }
    }

    private void setInput(Display display) {
        input1 = display.getInt("Ingrese el numero uno: ", new Limit(0, 100));
        input2 = display.getInt("Ingrese el numero dos: ", new Limit(0, 100));
    }



}
