import java.io.*;

public class FileManager {
    public static String isLogged = "not Logged";

    public File file;

    public FileManager(File file) {
        this.file = file;
    }

    public boolean login() {
        isLogged = "Logged";
        return true;

    }

    public boolean logout() {
        isLogged = "not Logged";
        return false;
    }

    public String getFile(int ex) throws Exception {
        String path = file.getName();
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

        if (ex == 0)
            throw new NotEnoughSpaceException("Nao tem espaço");

        if( ex == 1)
            throw new NotEnoughPermissionException("Nao tem permissao");

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Ficheiro nao encontrado");

        } catch (Exception e) {
            throw e;
        }
        return line;
    }

    public String createFile() throws IOException {

        String path = file.getName();
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));

        String line = isLogged;

        buffWrite.append(line + "\n");
        buffWrite.close();

        return line;
    }
}



