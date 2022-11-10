package generating.abstract_factory.api;

import generating.abstract_factory.buttons.api.IButton;
import generating.abstract_factory.checkboxes.api.ICheckbox;

public interface IFactory {

    IButton createButton();

    ICheckbox createCheckbox();

}
