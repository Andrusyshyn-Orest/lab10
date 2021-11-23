package mail_sender;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos;

    public MailBox(){
        this.infos = new ArrayList<>();
    }

    public void addMailInfo(MailInfo mailInfo){
        this.infos.add(mailInfo);
    }

    public void sendAll() throws FileNotFoundException {
        for (MailInfo mailInfo: this.infos) {
            MailSender.sendMail(mailInfo);
        }
    }
}
