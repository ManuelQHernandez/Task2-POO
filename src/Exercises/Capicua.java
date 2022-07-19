package Exercises;

import Utils.Display;
import Utils.Limit;

public class Capicua extends Display {

    private int input;

    public Capicua(Display display) {
        setInput(display);
    }

    private void setInput(Display display) {
        input = display.getInt("Ingrese un numero: ", new Limit(0, 100000));
    }

    public String getCapicua() {
        int aux, reverse=0, num;
        aux = input;
        while (aux!=0) {
            num = aux % 10;
            reverse = reverse * 10 + num;
            aux = aux / 10;
        }
        return  ((input == reverse) ? "Exercises.Capicua":"No es Exercises.Capicua") ;
    }

}
