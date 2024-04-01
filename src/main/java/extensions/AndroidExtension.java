package extensions;

import com.codeborne.selenide.Configuration;
import com.google.inject.Guice;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import providers.AndroidWebDriverProvider;

import static java.lang.Character.getName;


public class AndroidExtension implements BeforeAllCallback {

    @Override
    public void beforeAll(ExtensionContext extensionContext)  {
        Configuration.browserSize= null;
        Configuration.remote=System.getProperty("remote.url");
        Configuration.browser= new AndroidWebDriverProvider().getClass().getName();


    }
}
