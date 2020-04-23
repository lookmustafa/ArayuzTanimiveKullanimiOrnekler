
public class ComplexuserCheckService implements  IUserCheckService{

    @Override
    public boolean checkUser(User user) {
        if (user.getAge() > 18 && user.getName().startsWith("M")) {
            return true;
        }
        return false;
    }
    
}
