public class ToDoItem {
    public String name;
    boolean state;

    public ToDoItem (String taskName){
        this.name = taskName;
        this.state = false;
    }

    public void toggleDone (){
        this.state = !this.state;
    }


}