package mail_sender;

import lombok.Getter;

import java.io.FileNotFoundException;
import java.util.HashMap;

@Getter
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public MailInfo(Client client, MailCode mailCode){
        this.client = client;
        this.mailCode = mailCode;
    }

    public String getMailText() throws FileNotFoundException {
        String text = mailCode.generateText();

        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());
        templates.put("%AGE%", String.valueOf(client.getAge()));
        templates.put("%SEX%", client.getSex().getGender());

        for (String key: templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }
        return text;
    }
}
