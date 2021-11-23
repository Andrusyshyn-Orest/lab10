package mail_sender;

import lombok.Getter;

@Getter
public class Client {
    private int id;
    private String name;
    private int age;
    private Gender sex;

    public Client(String name, int age, Gender sex){
        this.id = IdGenerator.generateId();
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    private static class IdGenerator {
        static int id = 0;
        public static int generateId(){
            return id++;
        }
    }
}
