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


    @Test
     void addsTwoNumbers() {
        Assertions.assertEquals(2, 2, "1 + 1 should equal 2");
    }
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


