import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Amount extends IOException {
    public double getReceipt() {
        FileInputStream fil = null;
        String str = null;
        double count1 = 0;
        try {
            try {
                fil = new FileInputStream("/Users/fox/Desktop/Skillfactory/receipt.txt");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            Scanner scanner = new Scanner(fil);
            while (scanner.hasNext()) {
                str = scanner.next();
                String[] parts = str.split(";");
                String name = parts[0];
                int count = Integer.parseInt(parts[1]);
                double price = Double.parseDouble(parts[2]);
                System.out.println(count1 = count * price);

            }
            scanner.close();


        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }


        return count1;
    }
}