package Opps;

public class Login {
    private String userName;
    private String password;

    Login(){
        if (password.length()>=8 && password.length()<=16){
            this.userName=userName;
            this.password=password;
        }else {
            System.out.println("The Password must contain 8 To 16 Letters");
        }
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getUserName(){
        return userName;
    }
    public String(){
        return password;
    }
    @Override
    public String toString(){
        return
    }
}
