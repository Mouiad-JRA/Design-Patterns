package Mouiad.strategy;

public class JepgCompresser implements Compressor {
    @Override
    public void compressor(String fileName) {
        System.out.println("compressor using JPG");
    }
}
