package creationalPatterns.abstractFactory;

public class MacOSButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering MAC OS Button");
    }
}
