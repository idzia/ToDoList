import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ToDoInit {
    public static void main(String[] args) {

        ToDo lista = new ToDo();
        int choose = 0;
       
        // ToDo lista_zakupowa = new ToDo();
        // ToDo lista_na_wyjazd = new ToDo();
        // ToDo lista_fajnych_kolegow = new ToDo();

        // lista_zakupowa.addItem("ciastko");

        // lista_fajnych_kolegow.addItem("Marek");

        while (choose != 5) {

            System.out.println("Co chcesz zrobić?");
            String[] menu = new String[] { "Pokaż", "Dodaj", "Usuń", "Zrobione", "Zakończ" };
            for (int i = 0; i < menu.length; i++) {
                System.out.println("[" + (i + 1) + "] -> " + menu[i]);
            }
            
            try {
                choose = ToDoInit.chooseFromMenu();
                ToDoInit.handleMenu(choose, lista);
                
            } catch (InputMismatchException e) {
                System.out.println("buuuuuu");System.out.println("buuuuuu");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: ArrayIndexOutOfBoundsException");
            }
           
        }
        
    }

    public static int chooseFromMenu () {
        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();
        return choose;
    }

    public static void handleMenu(int choose, ToDo lista) {
        // System.out.println(lista.todos.size());
        switch (choose) {
        case 1:
        
            lista.listItems();

            break;
        case 2:
            System.out.println("Wpisz nowe zadanie do wykonania: ");
            Scanner inputItem = new Scanner(System.in);
            String newItem = inputItem.nextLine();
            lista.addItem(newItem);
            lista.listItems();
            break;
        case 3:
            System.out.println("Które zadanie chcesz usunąć?: ");
            Scanner inputRemove = new Scanner(System.in);
            int removePosition = inputRemove.nextInt();
            lista.removeItem(removePosition);
            lista.listItems();
            break;
        case 4:
            System.out.println("Które zadanie oznaczyć jako wykonane?: ");
            Scanner inputMark = new Scanner(System.in);
            int markPosition = inputMark.nextInt();
            lista.markItem(markPosition);
            lista.listItems();
            break;
        case 5:
            
            break;
        default:
            System.out.println("Nie ma takiej opcji");
            break;
        }

    }
}
