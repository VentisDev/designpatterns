package StrategyPatterns;

public class BlackAndWhite implements Filter{
    @Override
    public void filter(String fileName) {
        System.out.println("Filtering using B&W");
    }
}
