package permissions;

public enum PermissionType {
    ADMIN, MANAGER;

    public static boolean checkPermission(User user, Action action) {
        Class<?> cls = action.getClass();
        return user.getPermissionType() == cls.getAnnotation(Permission.class).type();
    }
}
