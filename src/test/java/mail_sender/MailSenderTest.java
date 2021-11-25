package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class MailSenderTest {
    private Client client;
    private MailCode mailCode;
    private MailInfo mailInfo;
    private MailSender mailSender;

    @BeforeEach
    void setUp() {
        client = new Client("Orest", 18, Gender.MALE);
        mailCode = MailCode.DISCOUNT;
        mailInfo = new MailInfo(client, mailCode);
        mailSender = new MailSender();
    }

    @Test
    void sendMail() throws FileNotFoundException {
        assertEquals(mailInfo.getMailText(), mailSender.sendMail(mailInfo));
    }
}