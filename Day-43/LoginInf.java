package Opps;

public class LoginInf {
    public static void main(String[] args) {

        Login login = new Login("rock", "12345678");

        System.out.println(login);

        login.setUserName("nick");
        login.setPassword("87654321");

        System.out.println(login.getUserName());
        System.out.println(login.getPassword());

        System.out.println(login);

        Login login1;
        // System.out.println(login1); // Error: variable not initialized
    }
}