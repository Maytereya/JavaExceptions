package exept;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
    ParsingToFile parsingToFile = new ParsingToFile();
    SplitInput splitInput = new SplitInput();

    public WritingToFile() {
    }

    public void writeTo(String fileName, String inputAll) {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {

            fileWriter.write(parsingToFile.parsing(splitInput.splitting(inputAll)));
        } catch (
                IOException | InsufficientDataExeption | TelephoneNumberException e) {
            e.getStackTrace();
        }
    }
}
