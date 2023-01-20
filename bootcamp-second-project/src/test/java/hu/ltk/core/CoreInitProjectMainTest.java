package hu.ltk.core;

import hu.ltk.jakabgabor.init.InitProject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoreInitProjectMainTest {

    private InitProject initProject = new InitProject();

    @Test
    void customerBuyOneItem() {
       assertEquals("bootcamp", initProject.whoAmI());
    }
}
