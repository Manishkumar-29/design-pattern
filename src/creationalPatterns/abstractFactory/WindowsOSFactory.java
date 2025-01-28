package creationalPatterns.abstractFactory;

public class WindowsOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsOSCheckBox();
    }
}
