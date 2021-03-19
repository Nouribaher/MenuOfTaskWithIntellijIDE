/*
* FileInputMenuOftask is used to create a file and write data of the   task class  into it.
* This writer.close() method closes the file, Releases any system resources associated with the file and throws an IOException.
* This writer.write methods writes the specified byte to the file.
*@author   Nouri Baher
*@Softwear Intellij IDEA
*@version 2020.3
* @since  Mon, Feb 22, 2021 till Fri, Mar 19, 2021
*/

package TodoList;

import java.io.*;
import java.util.*;
import java.io.File;
import java.util.Scanner;
// Allow the user to save of the data task to the file
class FileInputMenuOftask {
    private String path = "src/TodoList/";
    private Object String;

    public void WriteAsData (ArrayList<Task> list){
        try {
            /*   * We suspect that this block of statement can throw
                 * exception so we handled it by placing these statements
                 * inside try and handled the exception in catch block
             */
            FileWriter fileWriter = new FileWriter(new File (path + "OutOfTheFile.txt"));
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for ( Task a : list){
                writer.write(a.toString()+"\n");
                writer.write("..................................................................................\n");
            }

            writer.close();
        }
        /*
         * @throws IOException  If an input or output
         *                      exception occurred
         */
        catch(IOException e) {
            System.out.println("Menu Of task doesn't found"+e);
        }

    }
    // Allow the user to read the data task from the file
    public ArrayList<Task> readASData(){
        ArrayList<Task> readerList = new ArrayList<>();
        try {
            File fileReader = new File (path+ "OutOfTheFile.txt");
            Scanner reader = new Scanner(fileReader);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

        }
        /*
         * @throws IOException  If an input or output
         *                      exception occurred
         */
        catch(IOException e) {
            System.out.println("Menu Of task error occurred." + e);
            e.printStackTrace();
        }
        return readerList;

    }
}

