package mail_sender;

import java.io.FileNotFoundException;

public class MailSender {
    public static String sendMail(MailInfo mailInfo) throws FileNotFoundException {
        String text = mailInfo.getMailText();
        System.out.println(text);
        return text;
    }
}
