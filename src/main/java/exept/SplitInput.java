package exept;

public class SplitInput {
    public SplitInput() {
    }

    public String[] splitting(String input) throws InsufficientDataExeption {

        String[] initialParse = input.split(" ");
        if (initialParse.length < 6 | initialParse.length > 6)
            throw new InsufficientDataExeption(initialParse.length);

        return initialParse;
    }
}
