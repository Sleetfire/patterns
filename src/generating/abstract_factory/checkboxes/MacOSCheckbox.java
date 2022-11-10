package generating.abstract_factory.checkboxes;

import generating.abstract_factory.checkboxes.api.ICheckbox;

public class MacOSCheckbox implements ICheckbox {
    @Override
    public void paint() {
        System.out.println("Mac OS checkbox");
    }
}
