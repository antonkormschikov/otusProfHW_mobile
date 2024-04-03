import com.google.inject.Inject;
import components.ChatWindowComponent;
import extensions.AndroidExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.MainPage;

@ExtendWith(AndroidExtension.class)
public class MainWidgetTest {
    @Inject
    private MainPage mainPage;

    @Inject
    private ChatWindowComponent chatWindowComponent;


    //public void navigationMainPageWidget(){    }
    @Test
    public void firstTest(){
        mainPage.open()
                .clickNextButton()
                .clickChatButton();
        chatWindowComponent.getComponentEntity().click();
    }

    //59-14

}
