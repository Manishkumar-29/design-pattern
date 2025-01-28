package creationalPatterns.abstractFactory;

public class WindowsOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering windows OS button");
    }
}
