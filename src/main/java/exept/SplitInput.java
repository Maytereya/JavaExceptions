package exept;

public class SplitInput {
    String[] initialParse;
    public SplitInput() {
    }

    public String[] splitting(String input) throws InsufficientDataExeption {

        initialParse = input.split(" ");
        if (initialParse.length < 6 | initialParse.length > 6)
            throw new InsufficientDataExeption(initialParse.length);

        return initialParse;
    }
}
