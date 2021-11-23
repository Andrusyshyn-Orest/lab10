package mail_sender;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("templates/happy_birthday.txt"),
    DISCOUNT("templates/discount.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() throws FileNotFoundException {
        String text = "";
        File file = new File(this.filename);
        Scanner scanFile = new Scanner(file);
        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            text = text.concat(line);
            text = text.concat("\n");
        }
        return text;
    }
}
