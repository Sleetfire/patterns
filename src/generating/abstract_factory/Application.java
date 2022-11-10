package generating.abstract_factory;

import generating.abstract_factory.api.IFactory;
import generating.abstract_factory.buttons.api.IButton;
import generating.abstract_factory.checkboxes.api.ICheckbox;

public class Application {
    private final IButton button;
    private final ICheckbox checkbox;

    public Application(IFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        this.button.paint();
        this.checkbox.paint();
    }
}
