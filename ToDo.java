import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ToDo {
    public List<ToDoItem> todos = new ArrayList<ToDoItem>();

    public void addItem(String taskName) {
        ToDoItem task = new ToDoItem(taskName);
        todos.add(task);
    }

    public void removeItem(int position) {
        todos.remove(position - 1);
    }

    public void listItems() {
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).state) {
                System.out.println((i + 1) + ". [X] -> " + todos.get(i).name);
            } 
            else {
                System.out.println((i + 1) + ". [] -> " + todos.get(i).name);
            }
        }

    }

    public void markItem(int position) {
        todos.get(position-1).toggleDone();        
    }




    // public int length() {
    //     return todos.size();
    // }

}