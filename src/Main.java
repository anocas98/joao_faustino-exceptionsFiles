import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("test.txt");
        File file2 = new File("test5.txt");

        FileManager fileManager = new FileManager(file);
        try {


                fileManager.login();



            System.out.println(fileManager.createFile());

            fileManager.file = file2;
            fileManager.logout();
         //   fileManager.createFile();
            System.out.println(fileManager.getFile(8));


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

