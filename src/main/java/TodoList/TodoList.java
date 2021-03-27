/*They ask you to do some operations like create a new task, remove a task, update a task,
 or edit the task and mark the task as done in the Todo list to help you  keep track of what they need to do in order.
 *@author  Nouri Baher
 *@Softwear Intellij IDEA
 *@version 2020.3
 * @since  Mon, Feb 22, 2021 till Fri, Mar 19, 2021
 */
package TodoList;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    ArrayList<Task> tasks = new ArrayList<>();

    public TodoList(ArrayList<Task> tasks) { this.tasks=tasks; }

    //Allow the user to show date of the task
    public void showDateOfTask () {
        for (Task show : tasks) {
            System.out.println("Title of task : "+ show.getTitle() +"***"+"Due Date Of Task :"+ show.getDueDate());
            System.out.println("................................................");
        }
    }
    //Allow the user to show project name of the task
    public void showProjectOfTask() {
        for (Task show : tasks) {
            System.out.println("Title of task : "+ show.getTitle() +"***"+"Name Of Project :"+ show.getProject());
            System.out.println("................................................");
        }
    }
    //Allow the user to upadte of the task
    public void updateOfTask (String name ) {
        for (Task task : tasks) {
            String title = task.getTitle();
            if(title.equals(name)){
                //Allow user to choose one of the tasks list
                System.out.println("( 1 ) Update of title of Task?");
                System.out.println("( 2 ) Update of Mar As Done of Task? " );
                System.out.println("( 3 ) Update Name of Project?");
                System.out.println("( 4 ) Update Status of Task?");
                Scanner choise = new Scanner(System.in);
                int number  = choise.nextInt();
                System.out.println("Valid input");
                switch(number)
                {  // code to be executed if
                   // expression is equal to number Of Menu
                    case 1:{
                        //Allow the user to enter the title of the task
                    System.out.println("Please Enter The Title Of Task ?");
                    Scanner sc = new Scanner(System.in);
                    String titleOF = sc.nextLine();
                    task.setTitle(titleOF);
                    break;
                    }
                    case 2:{
                        //Allow the user to enter the due date of the task
                        System.out.println("Please Enter The Mar As Done of Task ?");
                        Scanner sc = new Scanner(System.in);
                        String mark = sc.nextLine();
                        task.setDueDate(mark);
                        break;
                    }

                    case 3:{
                        //Allow the user to enter the project name of the task
                        System.out.println("Please Enter Name of Project ?");
                        Scanner sc = new Scanner(System.in);
                        String project = sc.nextLine();
                        task.setProject(project);
                        break;
                    }

                    case 4:{
                        //Allow the user to enter the mark as done of the task
                        System.out.println("Please Enter State of Project ?");
                        Scanner sc = new Scanner(System.in);
                        String state = sc.nextLine();
                        task.setMarkAsDone(state);
                        break;
                    }

                    default:{
                        System.out.println("Default ");
                        break;
                    }

                }               }
        }
    }
    //Allow the user to remove the task
    public void  RemoveOfTask(String name) {
        String nameOfTask="";
        for (Task task : tasks) {
            String title = task.getTitle();
            if(title.equals(name)){
                tasks.remove(task);
                nameOfTask = title;
            }
        }
        //for (Task show : tasks) {
        //System.out.println("Title of task : "+ show.getTitle() +"  ***************   "+"Name Of Project :"+ show.getProject()); }
        System.out.println("........................ Remove the Title Of Task = "+ nameOfTask +" is Done........................................");
    }
    //Allow the user to create the task
    public void createTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter task Title?");
        String title = scanner.nextLine();
        System.out.println("Please enter Project name?");
        String project = scanner.nextLine();
        System.out.println("Please enter due date?");
        System.out.println("Please enter your date in the format dd/MM/yyyy");
        String  date = scanner.nextLine();
        System.out.println("Please enter the Mark As Done?");
        String markAsDone = scanner.nextLine();
        Task task = new Task();
        task.setTitle(title);
        task.setDueDate(date);
        task.setProject(project);
        task.setMarkAsDone(markAsDone);
        tasks.add(task);
        System.out.println("Task added successfully.");
    }
    //Allow the user to save the task to the file input menue of task
    public void saveOfTask() {
        FileInputMenuOftask menuOfTask = new FileInputMenuOftask();
        menuOfTask.WriteAsData(tasks);
        menuOfTask.readASData();
        System.out.println(".............................");
        System.out.println(tasks.toString());
    }


}



