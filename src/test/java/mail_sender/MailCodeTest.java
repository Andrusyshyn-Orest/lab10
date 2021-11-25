package mail_sender;


import java.io.File;
import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class MailCodeTest {
    private MailCode mailCodeBirthday;
    private MailCode mailCodeDiscount;

    private Map<MailCode, String> Cases;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        mailCodeBirthday = MailCode.HAPPY_BIRTHDAY;
        mailCodeDiscount = MailCode.DISCOUNT;
        String birthdayFile = mailCodeBirthday.getFilename();
        String discountFile = mailCodeDiscount.getFilename();
        Cases = new HashMap<>();
        Cases.put(mailCodeBirthday, birthdayFile);
        Cases.put(mailCodeDiscount, discountFile);
    }

    @org.junit.jupiter.api.Test
    void generateText() throws FileNotFoundException {

        for (MailCode mailCode: Cases.keySet()) {
            String text = "";
            String filename = Cases.get(mailCode);
            File file = new File(filename);
            Scanner scanFile = new Scanner(file);
            while (scanFile.hasNextLine()) {
                String line = scanFile.nextLine();
                text = text.concat(line);
                text = text.concat("\n");
            }
            assertEquals(text, mailCode.generateText());
        }

    }
}