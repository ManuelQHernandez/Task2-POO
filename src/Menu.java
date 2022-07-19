import Exercises.Capicua;
import Exercises.Digits;
import Exercises.Divisible;
import Utils.Display;
import Utils.Limit;

public class Menu {

    private Display display;

    private final int NUMBER_OPTION = 5;
    private final int FIRST_OPTION = 1;

    public static void main(String[] args) {
        new Menu().play();
    }

    public Menu() {
        display = new Display();
    }

    public void play() {
        int option = 0;

        String msg = "Ingrese la opcion: ";
        Limit limit = new Limit(FIRST_OPTION, NUMBER_OPTION);

        do {
            printMenu();

            option = display.getInt(msg, limit);

            getOption(option);

        }while (option != NUMBER_OPTION);
    }


    private void getOption(int option){
        switch (option) {
            case 1:
                Divisible div = new Divisible(display);
                display.printTitleMessage("Los numeros son divisibles: " + div.getDivisible());
                break;
            case 2:
               Digits dig = new Digits(display);
               display.printTitleMessage(dig.getDigits());
                break;
            case 3:
                Capicua cp = new Capicua(display);
                display.printTitleMessage("Resultado: " + cp.getCapicua());
                break;

            default:
                display.printTitleMessage("Gracias! por participar");
                break;
        }
    }

    private void printMenu() {
        display.printText("1) Exercises.Divisible: ");
        display.printText("2) Exercises.Digits: ");
        display.printText("3) Exercises.Capicua: ");
        display.printText("4) Salir");
    }
}
