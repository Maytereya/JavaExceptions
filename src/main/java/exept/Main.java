package exept;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new Notifier();
        Scanner scanner = new Scanner(System.in);
        WritingToFile writingToFile = new WritingToFile();
        notifier.notifyOnStart();

        String inputAll;
        String filePath = "data.txt";

        try {
            inputAll = scanner.nextLine();
        } catch (InputMismatchException e) {
            throw new RuntimeException("Ничего не введено");
        }

        writingToFile.writeTo(filePath, inputAll);
        notifier.notifyOnFinish();

    }

}