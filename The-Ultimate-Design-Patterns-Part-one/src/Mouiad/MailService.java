package Mouiad;

public class MailService {
    public void sendEmail(){
    connect();
    authenticate();
    disconnect();
    }
    private void connect(){
        System.out.println("Connection...");
    }
    private void disconnect(){
        System.out.println("Disconnecting...");
    }
    private void authenticate(){
        System.out.println("Authentication...");
    }
}
