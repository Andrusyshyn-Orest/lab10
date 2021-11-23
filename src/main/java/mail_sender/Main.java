package mail_sender;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Client orest = new Client("Orest", 18, Gender.MALE);
        Client motria = new Client("Motria", 40, Gender.FEMALE);

        MailInfo mailInfoOrest = new MailInfo(orest, MailCode.HAPPY_BIRTHDAY);
        MailInfo mailInfoMotria = new MailInfo(motria, MailCode.DISCOUNT);

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(mailInfoOrest);
        mailBox.addMailInfo(mailInfoMotria);
        mailBox.sendAll();
    }
}
