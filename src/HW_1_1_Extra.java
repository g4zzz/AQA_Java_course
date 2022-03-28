import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class HW_1_1_Extra {
    public static void main(String[] args) {
        File var_file = new File("Extra#1.txt");

        if (var_file.exists()) {
            try (BufferedReader var_buffer = new BufferedReader(new InputStreamReader(new FileInputStream(var_file)))) {
                String line = null;
                while ((line = var_buffer.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("file doesn't exist");
        }
    }


}
