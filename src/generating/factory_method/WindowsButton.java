package generating.factory_method;

import generating.factory_method.api.IButton;

public class WindowsButton implements IButton {

    @Override
    public void render() {
        System.out.println("Windows button");
        this.onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Windows button says \"Hello windows!\"");
    }
}
