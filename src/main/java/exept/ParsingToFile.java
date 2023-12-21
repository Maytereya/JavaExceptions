package exept;

public class ParsingToFile {

    String inputAll;
    private String data = "";
    private String sex = "";
    private String phone = "";
    private int phoneInt = 0;
    private String name = "";

    public ParsingToFile() {
    }

    public String parsing(String[] iniParse) throws TelephoneNumberException {

        for (int i = 0; i < iniParse.length; i++) {
            if (iniParse[i].contains("."))
                data = iniParse[i];
            if (iniParse[i].contains("m") | iniParse[i].contains("f"))
                sex = iniParse[i];
            if (Character.isDigit(iniParse[i].charAt(0)) && !iniParse[i].contains("."))
                phone = iniParse[i].trim();
            if (Character.isAlphabetic(iniParse[i].charAt(0)) && !iniParse[i].equals(sex))
                name = name + iniParse[i] + " ";
            name = name.trim();

//            try {
//                phoneInt = Integer.parseInt(phone);
//            } catch (NumberFormatException e) {
//                throw new TelephoneNumberException();
//            }

        }
        // Запись намеренно сделал с одним пробелом (так указано в тексте задачи).
        return name + data + " " + phone + sex + "\n";
    }
}
