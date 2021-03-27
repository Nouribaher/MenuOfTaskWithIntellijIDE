/* The unit Testing of the TodoList compiles an app that simply updates "Menue of the Task !"
This will allow the user to track compiler errors for TODO list classes and mothds
to start solving problems according to error combinations (syntax errors and runtime errors).
*@author  Nouri Baher
*@Softwear Intellij IDEA
*@version 2020.3
*author name-text:org.junit.jupiter:junit-jupiter:5.4.2
* @since  Mon, Feb 22, 2021 till Fri, Mar 19, 2021
 */
package TodoList;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import java.io.InputStream;

public class MainOfTodoListTest {

    MainOfTodoListTest(){

    }

    /*
    Junit Assert is a method useful in determining Pass or Fail status of a test case, where the assert methods are provided
    by the class org.junit.Assert which extends java.lang.Object class.
     */
    @Test
     void addsTwoNumbers() {
        Assertions.assertEquals(2, 2, "1 + 1 should equal 2");
    }
    /*
     @Test Assertions.assertEquals method  provides a detailed summary of the Task test execution. This is helpful in tracking
    the quality of the pipeline, as well as for troubleshooting failures.
     */
    @Test
    void tasktest(){
        Task task1 = new Task("nour","1978-10-03","ITC","DONE");
        Task task2 = new Task("maher","2000-10-03","KQA","NO-TDONE");
        ArrayList<Task> taskArrayList = new ArrayList<>();
        taskArrayList.add(task1);
        taskArrayList.add(task2);
        Task actualTask = taskArrayList.get(1);
        System.out.println(actualTask);
        Assertions.assertEquals(actualTask,task2,"The test of task is fail");
    }
    /*
    @Test Assertions.assertEquals method  provides a detailed summary of the uppdate of task execution. This is helpful in tracking
    the quality of the pipeline, as well as for troubleshooting failures.
    */
    @Test
    void uppdateoftask(){
        Task task1 = new Task("nour","1978-10-03","ITC","DONE");
        Task task2 = new Task("maher","2000-10-03","KQA","NO-TDONE");
        ArrayList<Task> taskArrayList = new ArrayList<>();
        taskArrayList.add(task1);
        taskArrayList.add(task2);
        String titleOFTask = "Kwabena";
        task1.setTitle(titleOFTask);
        Task actualTask = taskArrayList.get(0);
        System.out.println(actualTask);
        Assertions.assertEquals(actualTask,task1,"The test of task is fail");
    }
    /*
    @Test Assertions.assertEquals method  provides a detailed summary of the remove the task execution. This is helpful in tracking
    the quality of the pipeline, as well as for troubleshooting failures.
     */
    @Test
    void removeTask() {
        Task task1 = new Task("nour","1978-10-03","ITC","DONE");
        Task task2 = new Task("maher","2000-10-03","KQA","NO-TDONE");
        ArrayList<Task> taskArrayList = new ArrayList<>();
        taskArrayList.add(task1);
        taskArrayList.add(task2);
        String name="nour";
        TodoList todolist = new TodoList(taskArrayList);
        todolist.RemoveOfTask(name);
        Task actualTask = taskArrayList.get(0);
        Assertions.assertEquals(actualTask,task2,"The test of task is fail");
    }

    /*How to switch System.in? please go the git rip and Please read
    issue # 1 and add some comments that will help us develop the code*/
    private void provideInput(String data) {
        ByteArrayInputStream testIn;
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }
        @Test
         public void cerateTasktest(){
            Task task1 = new Task("nour","1978-10-03","ITC","DONE");
            String task2 = "nour"+System.lineSeparator() +"ITC"+System.lineSeparator() +"1978-10-03"+System.lineSeparator() +"DONE";
            ArrayList<Task> taskArrayList = new ArrayList<>();
            taskArrayList.add(task1);
            provideInput(task2);
            TodoList testlist = new TodoList(taskArrayList);
            testlist.createTask();
            Assertions.assertEquals(taskArrayList.get(0).getTitle(),taskArrayList.get(1).getTitle(),"The Title of task is fail");
            Assertions.assertEquals(taskArrayList.get(0).getProject(),taskArrayList.get(1).getProject(),"The project name  of task is fail");
            Assertions.assertEquals(taskArrayList.get(0).getDueDate(),taskArrayList.get(1).getDueDate(),"The Due Date of task is fail");
            Assertions.assertEquals(taskArrayList.get(0).markAsDone(),taskArrayList.get(1).markAsDone(),"The Mark As Done of task is fail");
        }

    }


