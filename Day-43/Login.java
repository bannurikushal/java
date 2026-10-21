package Opps;

public class Login {
    private String userName;
    private String password;

    Login(String userName, String password){
        if (password.length()>=8 && password.length()<=16){
            this.userName=userName;
            this.password=password;
        }else {
            System.out.println("The Password must contain 8 To 16 Letters");
        }
    }

    public Login() {

    }

    public void setUserName(String userName) {
        this.userName=userName;
    }
    public void setPassword(String password) {
        this.password=password;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return  this.password;
    }
    private  void sayHello(){
        System.out.println("Hello");
    }
    @Override
    public String toString(){
        return "Login{" + "Username=' " + userName + '/' +  ", password= ' " + password + '/' + '}';
    }
}
