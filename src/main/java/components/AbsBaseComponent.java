package components;

import annotation.Component;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbsBaseComponent<T> {
   /* {
        getComponentEntity().shouldBe(Condition.visible);
    }

    private By locatorAnalyzer(String value){
        Pattern pattern = Pattern.compile("(\\W+):(\\w+)");
        Matcher matcher = pattern.matcher(value);
        if (matcher.find()){
            switch (matcher.group(1)){
                case "id":
                    return By.id(matcher.group(2));
            }
        }
    }
    public SelenideElement getComponentEntity(){
        Class clazz = this.getClass();
        if (clazz.isAnnotationPresent(Component.class)){
            Component component = (Component) clazz.getAnnotation(Component.class);
            //By by = locatorAnalyzer(component.valueOf());


        }
        return null;
    }*/
}
