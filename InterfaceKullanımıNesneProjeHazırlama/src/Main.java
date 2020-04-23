
public class Main {
    public static void main(String[] args) {
           
        /*SignUpManager signupManager = new SignUpManager(new ComplexuserCheckService());
        signupManager.signup(new User(1, "Mustafa", 21)); */
        
        
         SignUpManager signupManager = new SignUpManager(new ageUserCheckService());
        signupManager.signup(new User(1, "Mustafa", 18)); 
    }
}
