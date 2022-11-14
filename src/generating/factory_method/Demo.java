package generating.factory_method;

import generating.factory_method.api.IDialog;

import java.util.Locale;

public class Demo {
    public static void main(String[] args) {

        IDialog dialog;
        String systemName = System.getProperty("os.name".toLowerCase(Locale.ROOT));
        if (systemName.contains("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }

        dialog.renderWindow();
    }
}
