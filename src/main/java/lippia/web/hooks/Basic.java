package lippia.web.hooks;

import com.crowdar.core.actions.WebActionManager;
import  com.crowdar.driver.DriverManager;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import lippia.web.listeners.DriverValidatorListener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Basic {

    WebActionManager driver = new WebActionManager();
    @Before(order = 0)

    public void beforeScenario(Scenario scenario) {
        DriverManager.getDriverInstance().register(new DriverValidatorListener());
    }


    @After
    public void afterScenario(){
        DriverManager.dismissCurrentDriver();
    }

//    @After
//    public void tearDown(Scenario scenario){
//        if (scenario.isFailed()){
//            scenario.write("Scenario fallando, referirse a la imagen adjunta");
//            final byte[] screenshot = ((TakesScreenshot) driver)
//                    .getScreenshotAs(OutputType.BYTES);
//            scenario.embed(screenshot,"image/png");
//        }
 //   }
}

