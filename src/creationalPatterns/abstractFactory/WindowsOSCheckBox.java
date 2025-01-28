package creationalPatterns.abstractFactory;

public class WindowsOSCheckBox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Render Windows OS checkbox");
    }
}
