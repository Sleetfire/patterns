package generating.factory_method;

import generating.factory_method.api.IButton;

public class HtmlButton implements IButton {

    @Override
    public void render() {
        System.out.println("<button>Html button</button>");
        this.onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says \"Hello world wide web!\"");
    }
}
