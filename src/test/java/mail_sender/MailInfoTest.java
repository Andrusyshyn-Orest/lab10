package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    private Client client;
    private MailCode mailCode;
    private MailInfo mailInfo;

    @BeforeEach
    void setUp() {
        client = new Client("Orest", 18, Gender.MALE);
        mailCode = MailCode.DISCOUNT;
        mailInfo = new MailInfo(client, mailCode);
    }

    @Test
    void getMailText() throws FileNotFoundException {
        String text = mailCode.generateText();

        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());
        templates.put("%AGE%", String.valueOf(client.getAge()));
        templates.put("%SEX%", client.getSex().getGender());

        for (String key: templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }
        assertEquals(text, mailInfo.getMailText());
    }
}