package StrategyPatterns;

public class HighContrast implements Filter{
    @Override
    public void filter(String fileName) {
        System.out.println("Filtering using High Contrast");
    }
}
