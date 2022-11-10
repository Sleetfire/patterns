package generating.abstract_factory;

import generating.abstract_factory.api.IFactory;
import generating.abstract_factory.buttons.WindowsButton;
import generating.abstract_factory.buttons.api.IButton;
import generating.abstract_factory.checkboxes.WindowsCheckbox;
import generating.abstract_factory.checkboxes.api.ICheckbox;

public class WindowsFactory implements IFactory {

    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
