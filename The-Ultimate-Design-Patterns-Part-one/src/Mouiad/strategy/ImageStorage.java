package Mouiad.strategy;

import java.util.Objects;

public class ImageStorage {

    public void  store(String fileName , Compressor compressor, Filter filter){
        compressor.compressor(fileName);
        filter.apply(fileName);
    }
}
