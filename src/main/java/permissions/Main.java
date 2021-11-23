package permissions;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setPermissionType(PermissionType.ADMIN);
        DeleteInfo deleteInfo = new DeleteInfo();
        deleteInfo.perform(user, "something");
    }
}
