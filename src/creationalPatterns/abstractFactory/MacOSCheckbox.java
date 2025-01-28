package creationalPatterns.abstractFactory;

public class MacOSCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Render Mac OS checkbox");
    }
}
