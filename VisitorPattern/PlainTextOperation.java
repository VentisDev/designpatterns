package VisitorPattern;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Plain Text Applied to Heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Plain Text Applied to Anchor");
    }
}
