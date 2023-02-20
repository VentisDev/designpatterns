package StrategyPatterns;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage(new JPEG(), new BlackAndWhite());
        imageStorage.store("a'");
    }
}
