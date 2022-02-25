import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class TestNGTestCase {
    @Test(priority = 1)
    void OpenBrowser(){
        System.out.println("User able to open browser");
    }

    @Test(priority = 2)
    void Login(){
        System.out.println("User able to Login");

    }
    @Test(priority =3)
    void CloseBrowser(){
        System.out.println("User able to closing browser");
    }
}
