import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FileManager fileManager = new FileManager();
        try {

            System.out.println("1- Login \n 2- Logout");
            Scanner sc = new Scanner(System.in);

            if (sc.nextInt() == 1)
                fileManager.login();
            else {
                fileManager.logout();
            }

            System.out.println(fileManager.createFile());
            System.out.println(fileManager.getFile());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

