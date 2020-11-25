import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        FileManager fileManager = new FileManager();
        try {
            System.out.println(fileManager.getFile());
            System.out.println(fileManager.createFile());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

