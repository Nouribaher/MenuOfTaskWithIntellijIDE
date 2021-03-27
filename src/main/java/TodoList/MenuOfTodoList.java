/*TodoList implements an application that simply helps the user to perform the update, remove, create
the menu of the task and choose what they want to do.
 *@author  Nouri Baher
 *@Softwear Intellij IDEA
 *@version 2020.3
 * @since  Mon, Feb 22, 2021 till Fri, Mar 19, 2021
 */

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
            //Allow user to choose one of the tasks list
            System.out.println("Pick any option :");
            System.out.println("( 1 ) Show Task list(by date or project" );
            System.out.println("( 2 ) Add New Task" );
            System.out.println("( 3 ) Edit Task (Update,Mark as done ,Remove" );
            System.out.println("( 4 ) Save Task  " );
            System.out.println("( 5 ) Quit of TodoList App ");
            try {
                /* We suspect that this block of statement can throw
                 * exception so we handled it by placing these statements
                 * inside try and handled the exception in catch block
                 */
                Scanner scan = new Scanner(System.in);
                int numberOfMenu  = scan.nextInt();
                counter = numberOfMenu;
                System.out.println("Valid input");

                switch(numberOfMenu)
                {
                    // code to be executed if
                    // expression is equal to number Of Menu
                    case 1:{
                        //Allow the user to show the Name of Project and the Date of the task
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
                        // Allow user to create the task
                        TodoList cerat = new TodoList(taskArrayList);
                        cerat.createTask();
                        break;
                    }
                    case 3:{
                        System.out.println("( 1 ) Update of Task ");
                        System.out.println("( 2 ) Remove Task " );
                        Scanner choise = new Scanner(System.in);
                        int number  = choise.nextInt();
                        System.out.println("Valid input");

                        // switch statement to check which user chooses to do in the branch of the task list
                        switch(number)
                        {
                            case 1:{
                                // Allow user to update the selected task
                                TodoList update = new TodoList(taskArrayList);
                                System.out.println("Please Enter The Title Of Task ?");
                                Scanner title = new Scanner(System.in);
                                String name = title.nextLine();
                                update.updateOfTask(name);
                                break; // Terminates the loop immediately, and the control of
                                      // the program moves to the next statement following the loop.
                            }

                            case 2:{
                                // Allow user to remove the task
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
                        // Allow user to save the task to the File Input Menu of the task
                        TodoList save = new TodoList(taskArrayList);
                        save.saveOfTask();
                        break;
                    }
                    case 5:   {
                        // Allow user to exit from the application
                        System.out.println("close the TodoList App! ");
                        break;
                    }
                    default:
                        System.out.println("Default ");
                }
                // explain your error handling choice if it's not obvious
            } catch(NumberFormatException e) {
                System.out.println("input is not an int value");
            }
            if (counter == 5){
                break;
            }else counter ++;
        }
    }

}

