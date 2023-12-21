package exept;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InsufficientDataExeption, IOException, TelephoneNumberException {
        Notifier notifier = new Notifier();
        Scanner scanner = new Scanner(System.in);
        SplitInput splitInput = new SplitInput();
        ParsingToFile parsingToFile = new ParsingToFile();
        notifier.notifyUser();

        String inputAll;
        String filePath = "data.txt";

        try {
            inputAll = scanner.nextLine();
        } catch (InputMismatchException e) {
            throw new RuntimeException("Ничего не введено");
        }

        try (FileWriter fileWriter = new FileWriter(filePath, true)) {

            fileWriter.write(parsingToFile.parsing(splitInput.splitting(inputAll)));
        } catch (IOException e) {
            e.getStackTrace();
        }

    }

}