package TodoList;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuOfTodoList {

    ArrayList<Task> taskArrayList;
    public MenuOfTodoList (ArrayList<Task> taskArrayList){
        this.taskArrayList=taskArrayList;
    }

    public void runMunu(){
        int counter=0;
        while(counter <= 5)  {
            System.out.println("Pick any option :");
            System.out.println("( 1 ) Show Task list(by date or project" );
            System.out.println("( 2 ) Add New Task" );
            System.out.println("( 3 ) Edit Task (Update,Mark as done ,Remove" );
            System.out.println("( 4 ) Save Task  " );
            System.out.println("( 5 ) Quit of TodoList App ");
            try {
                Scanner scan = new Scanner(System.in);
                int numberOfMenu  = scan.nextInt();
                counter = numberOfMenu;
                System.out.println("Valid input");
                switch(numberOfMenu)
                {
                    case 1:{
                        System.out.println("( 1 ) Show Due Date Of Task ");
                        System.out.println("( 2 ) Show Name of project");
                        Scanner show = new Scanner(System.in);
                        int list  = show.nextInt();
                        if (list == 1){
                            TodoList showDate = new TodoList(taskArrayList);
                            showDate.showDateOfTask();
                        }else {
                            TodoList showProject= new TodoList(taskArrayList);
                            showProject.showProjectOfTask(); }
                        break;
                    }
                    case 2:{
                        TodoList cerat = new TodoList(taskArrayList);
                       // cerat.createTask();
                        break;
                    }
                    case 3:{
                        System.out.println("( 1 ) Update of Task ");
                        System.out.println("( 2 ) Mark as done of Task");
                        System.out.println("( 3 ) Remove Task " );
                        Scanner choise = new Scanner(System.in);
                        int number  = choise.nextInt();
                        System.out.println("Valid input");
                        switch(number)
                        {
                            case 1:{
                                TodoList update = new TodoList(taskArrayList);
                                System.out.println("Please Enter The Title Of Task ?");
                                Scanner title = new Scanner(System.in);
                                String name = title.nextLine();
                                update.updateOfTask(name);
                                break;
                            }
                            case 2:{
                                //TodoList cerat = new TodoList(taskArrayList);
                                //cerat.createTask();
                              //  break;
                            }
                            case 3:{
                                TodoList remove = new TodoList(taskArrayList);
                                System.out.println("Please Enter The Title Of Task ?");
                                Scanner title = new Scanner(System.in);
                                String name = title.nextLine();
                                remove.RemoveOfTask(name);
                                break;
                            }
                            default:{
                                System.out.println("Default ");
                                break;
                            }
                        }
                    }
                    case 4:   {
                        TodoList save = new TodoList(taskArrayList);
                        save.saveOfTask();
                        break;
                    }
                    case 5:   {
                        System.out.println("close the TodoList App! ");
                        break;
                    }
                    default:
                        System.out.println("Default ");
                }
            } catch(NumberFormatException e) {
                System.out.println("input is not an int value");
            }
            if (counter == 5){
                break;
            }else counter ++;
        }
    }

}

