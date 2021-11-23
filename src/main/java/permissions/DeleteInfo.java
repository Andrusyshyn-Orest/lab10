package permissions;

@Permission(type = PermissionType.ADMIN)
public class DeleteInfo extends Action {
    @Override
    public void perform(User user, String data) {
        super.perform(user, data);
    }
}
