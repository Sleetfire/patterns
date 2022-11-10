package generating.abstract_factory.checkboxes;

import generating.abstract_factory.checkboxes.api.ICheckbox;

public class WindowsCheckbox implements ICheckbox {
    @Override
    public void paint() {
        System.out.println("Windows checkbox");
    }
}
