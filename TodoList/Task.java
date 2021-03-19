 /*The TodoList program implements an application that simply displays  the task structure.
 * to alow  to help the user  make the constructor of the task and chosse what you need to do.
 *@author  Nouri Baher
 *@Softwear Intellij IDEA
 *@version 2020.3
 * @since  Mon, Feb 22, 2021 till Fri, Mar 19, 2021
 */


package TodoList;

public class Task {
    private String title;
    private String dueDate;
    private String project;
    private String status;

    public Task(String var1, String var2, String var3, String var4) {
        this.title = var1;
        this.dueDate = var2;
        this.project = var3;
        this.status = var4;
    }

    public void setDueDate(String var1) {
        this.dueDate = var1;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public void setTitle(String var1) {
        this.title = var1;
    }

    public String getTitle() {
        return this.title;
    }

    public void setMarkAsDone(String var1) {
        this.status = var1;
    }

    public String markAsDone() {
        return this.status;
    }

    public void setProject(String var1) {
        this.project = var1;
    }

    public String getProject() {
        return this.project;
    }

    public Task() {
    }
    /*
    Using of  toString() method to get string representation of an object. Whenever we try to print
    the Object reference then internally toString() method is invoked.
     */
    public String toString() {
        return "Task Title = " + this.title + " , Project = " + this.project + " , DueDate = " + this.dueDate + ", MarkAsDone = " + this.status;
    }
}
