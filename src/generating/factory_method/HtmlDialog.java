package generating.factory_method;

import generating.factory_method.api.IButton;
import generating.factory_method.api.IDialog;

/**
 * Concrete creator
 */
public class HtmlDialog implements IDialog {

    @Override
    public IButton createButton() {
        return new HtmlButton();
    }
}
