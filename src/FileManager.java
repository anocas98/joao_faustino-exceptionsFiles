import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {

    public boolean login() {
        return true;

    }

    public boolean logout() {
        return false;
    }

    public String getFile() throws IOException {
        String path = File.getName();
        String line = "";
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader(path));

            while (true) {
                if (line != null) {
                    System.out.println(line);

                } else
                    break;
                line = buffRead.readLine();
            }
            buffRead.close();

        } catch (FileNotFoundException e) {
            throw e;

        } catch (IOException e) {
            throw e;
        }
        return line;
    }

    public String createFile() throws IOException {

        String path = File.getName2();
        String line = "";
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader(path));

            while (true) {
                if (line != null) {
                    System.out.println(line);

                } else
                    break;
                line = buffRead.readLine();
            }
            buffRead.close();

        } catch (FileNotFoundException e) {
            throw e;

        } catch (IOException e) {
            throw e;
        }

        return line;
    }
}



