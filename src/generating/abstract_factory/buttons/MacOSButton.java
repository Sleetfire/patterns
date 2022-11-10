package generating.abstract_factory.buttons;

import generating.abstract_factory.buttons.api.IButton;

public class MacOSButton implements IButton {
    @Override
    public void paint() {
        System.out.println("Mac OS button");
    }
}
