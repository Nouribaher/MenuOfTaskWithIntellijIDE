package TodoList;

        import java.io.*;
        import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        Task task1 = new Task("nour","1978-10-03","ITC","DONE");
        Task task2 = new Task("maher","2000-10-03","KQA","NO-TDONE");
        Task task3 = new Task("Ali","1979-10-03","IKEA","DONE");
        ArrayList<Task> taskArrayList = new ArrayList<>();
        taskArrayList.add(task1);
        taskArrayList.add(task2);
        taskArrayList.add(task3);
        System.out.println(">> Welcome to Todoly");
        System.out.println(">> You have X tasks todo and Y tasks are done!");
        MenuOfTodoList menu = new MenuOfTodoList(taskArrayList);
        menu.runMunu();

    }
}
