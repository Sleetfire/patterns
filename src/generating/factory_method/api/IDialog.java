package generating.factory_method.api;

/**
 * Creator interface
 */
public interface IDialog {

    default void renderWindow() {
        IButton button = createButton();
        button.render();
    }

    IButton createButton();

}
