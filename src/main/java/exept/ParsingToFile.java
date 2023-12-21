package exept;

public class ParsingToFile {

    private String data = "";
    private String sex = "";
    private String phone = "";
    private String name = "";

    public ParsingToFile() {
    }

    public String parsing(String[] iniParse) throws TelephoneNumberException {

        for (String s : iniParse) {
            if (s.contains("."))
                data = s;
            if (s.contains("m") | s.contains("f"))
                sex = s;
            if (Character.isDigit(s.charAt(0)) && !s.contains("."))
                phone = s.trim();
            if (Character.isAlphabetic(s.charAt(0)) && !s.equals(sex))
                name = name + s + " ";
            name = name.trim();
        }

        long phoneL;
        try {
            phoneL = Long.parseLong(phone.trim());
        } catch (NumberFormatException nfe) {
            throw new TelephoneNumberException();
        }

        // Запись намеренно сделал с одним пробелом (так указано в тексте задачи).
        return name + data + " " + phoneL + sex + "\n";
    }
}
