import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreatFile creatFile = new CreatFile();
        creatFile.create();
        Amount amount = new Amount();
        System.out.println( amount.getReceipt());

    }
}