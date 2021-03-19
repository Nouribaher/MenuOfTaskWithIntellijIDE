/*The TodoList program implements an application that simply displays "Menue of the Task !"
* to alow  to help the user keep track the TODO list and chosse what you need to do.
*@author  Nouri Baher
*@Softwear Intellij IDEA
*@version 2020.3
* @since  Mon, Feb 22, 2021 till Fri, Mar 19, 2021
*/

package TodoList;

        import java.io.*;
        import java.util.ArrayList;

public class Main {
        /* Create and add three Arrays type String of tasks according to the task structure
           and call the "runMenue" method from the Class "Menu".*/

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
