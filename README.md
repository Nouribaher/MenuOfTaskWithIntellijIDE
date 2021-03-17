# TodoList Project
This application simulation a a To-do list application to help you keep track the TODO list and chosse what you need to do.
## UML-Class-Diagram
UML (Unified Modeling Language) means that it is a way of representing the structure of Todo lists that includes classes, objects, packages, and the relationships between those elements.
![Example1](https://github.com/Nouribaher/TodoList/blob/main/TodoList-UML-Diagram.png)


## Getting Started
This application can be run directly via TodoList or via generated jar file.

### Run with TodoList
In the first step, we should have to  know the path of files and start the application with the  Test's Run command.
```bash
 test run 
```
#### Test.Java 
This class is part of the TodoList app. As there are some lists that help the user to choose one of the tasks, 
and then the data will be sent to other classs and recorded in the class file to be saved, updated and reviewed at any time.
## Usage
```JAVA
import mport java.io.IOException;
import java.util.ArrayList;
        Task task = new Task("Nouri","1978-10-03","ITC","Maher");
        ArrayList<Task> taskArrayList = new ArrayList<>();
        taskArrayList.add(task);
        fileHandler.WriteAsData(taskArrayList);
        fileHandler.readASData();
```
![Example2](https://github.com/Nouribaher/TodoList/blob/main/Screenshot1.png)

