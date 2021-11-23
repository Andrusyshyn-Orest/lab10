package mail_types;

import org.reflections.Reflections;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Reflections reflections = new Reflections();
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(MailTypeID.class);
        System.out.println(annotated);
    }
}
