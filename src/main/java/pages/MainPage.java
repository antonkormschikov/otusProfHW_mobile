package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.sun.tools.javac.Main;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.support.ui.Select;

import java.security.PublicKey;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends AbsBasePage<MainPage> {

    private SelenideElement nextButton = $("[text='$s']");

    public MainPage clickNextButton(){
        nextButton.should(Condition.visible).click();
        return this;
    }

    //public ChatPage clickChatButton(){        ${"[text='chat']"}.    }

    //public MainPage next

}
