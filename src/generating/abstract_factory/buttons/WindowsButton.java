package generating.abstract_factory.buttons;

import generating.abstract_factory.buttons.api.IButton;

public class WindowsButton implements IButton {
    @Override
    public void paint() {
        System.out.println("Windows button");
    }
}
