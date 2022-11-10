package generating.abstract_factory;

import generating.abstract_factory.api.IFactory;

public class Demo {

    public static void main(String[] args) {
        Application application = Demo.configureApplication();
        application.paint();
    }

    private static Application configureApplication() {
        Application application;
        IFactory factory;

        String osName = System.getProperty("os.name");
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else  {
            factory = new WindowsFactory();
        }
        application = new Application(factory);
        return application;
    }
}
