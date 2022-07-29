public class UserManager {
    private User user;

    public UserManager(User user){
    this.user=user;

    }

    public void add(){
        this.user.add();
    }
    public void update(){
        this.user.update();
    }
}
