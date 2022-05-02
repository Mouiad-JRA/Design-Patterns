package Mouiad.strategy;

public class ChatClient {
    public void send(String fileName , Encrypt encryption){
        encryption.encrypt(fileName);
    }
}
