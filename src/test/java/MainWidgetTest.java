import com.google.inject.Inject;
import extensions.AndroidExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.MainPage;

@ExtendWith(AndroidExtension.class)
public class MainWidgetTest {
    @Inject
    private MainPage mainPage;


    //public void navigationMainPageWidget(){    }
    @Test
    public void firstTest(){
        mainPage.open();
    }

}
