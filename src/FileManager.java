import java.io.*;

public class FileManager {
    public static String isLogged = "not Logged";

    public boolean login() {
        isLogged = "Logged";
        return true;

    }

    public boolean logout() {
        isLogged = "not Logged";
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

        String path = File.getName();
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));

        String line = isLogged;

        buffWrite.append(line + "\n");
        buffWrite.close();

        return line;
    }
}



