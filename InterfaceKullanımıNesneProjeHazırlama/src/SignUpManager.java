
public class SignUpManager  {
    
     private IUserCheckService users;

    public SignUpManager(IUserCheckService users) {
        this.users = users;
    }
      
    public void signup(User user){
        
        if (users.checkUser(user)) {
         System.out.println("Kayıt oldunuz : " + user.getName());
        }
        else{
            System.out.println("Kayıt olamazsınız 18 yaşından küçüksünüz...");
        }        
    }   
}
