package TodoList;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    ArrayList<Task> tasks = new ArrayList<>();

    public TodoList(ArrayList<Task> tasks) { this.tasks=tasks; }

    public void showDateOfTask () {
        for (Task show : tasks) {
            System.out.println("Title of task : "+ show.getTitle() +"***"+"Due Date Of Task :"+ show.getDueDate());
            System.out.println("................................................");
        }
    }

    public void showProjectOfTask() {
        for (Task show : tasks) {
            System.out.println("Title of task : "+ show.getTitle() +"***"+"Name Of Project :"+ show.getProject());
            System.out.println("................................................");
        }
    }

    public void updateOfTask (String name ) {
        for (Task task : tasks) {
            String title = task.getTitle();
            if(title.equals(name)){
                System.out.println("( 1 ) Update of title of Task?");
                System.out.println("( 2 ) Update of Mar As Done of Task? " );
                System.out.println("( 3 ) Update Name of Project?");
                System.out.println("( 4 ) Update Status of Task?");
                Scanner choise = new Scanner(System.in);
                int number  = choise.nextInt();
                System.out.println("Valid input");
                switch(number)
                {  case 1:{
                    System.out.println("Please Enter The Title Of Task ?");
                    Scanner sc = new Scanner(System.in);
                    String titleOF = sc.nextLine();
                    task.setTitle(titleOF);
                    break;
                }
                    case 2:{
                        System.out.println("Please Enter The Mar As Done of Task ?");
                        Scanner sc = new Scanner(System.in);
                        String mark = sc.nextLine();
                        task.setDueDate(mark);
                        break;
                    }

                    case 3:{
                        System.out.println("Please Enter Name of Project ?");
                        Scanner sc = new Scanner(System.in);
                        String project = sc.nextLine();
                        task.setProject(project);
                        break;
                    }

                    case 4:{
                        System.out.println("Please Enter State of Project ?");
                        Scanner sc = new Scanner(System.in);
                        String state = sc.nextLine();
                        task.setProject(state);
                        break;
                    }

                    default:{
                        System.out.println("Default ");
                        break;
                    }

                }               }
        }
    }

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
    public void saveOfTask() {
        FileInputMenuOftask menuOfTask = new FileInputMenuOftask();
        menuOfTask.WriteAsData(tasks);
        menuOfTask.readASData();
        System.out.println(".............................");
        System.out.println(tasks.toString());
    }


}



