import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatFile {
    public void create() {

        File file = new File("/Users/fox/Desktop/Skillfactory/receipt.txt");

        FileWriter fileWriter = null;
        String str = "Помидор;4;30.00\n" +
                "Колбаса;1;80.00\n" +
                "Хлеб;1;50.00";

        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(str);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}