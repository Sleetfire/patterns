package generating.abstract_factory;

import generating.abstract_factory.api.IFactory;
import generating.abstract_factory.buttons.MacOSButton;
import generating.abstract_factory.buttons.api.IButton;
import generating.abstract_factory.checkboxes.MacOSCheckbox;
import generating.abstract_factory.checkboxes.api.ICheckbox;

public class MacOSFactory implements IFactory {

    @Override
    public IButton createButton() {
        return new MacOSButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
