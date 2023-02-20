package StrategyPatterns;

import java.util.ArrayList;
import java.util.List;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    List<ImageStorage> images = new ArrayList<>();

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        compressor.compress(fileName);
        filter.filter(fileName);
        images.add(new ImageStorage(compressor,filter));
    }
}
