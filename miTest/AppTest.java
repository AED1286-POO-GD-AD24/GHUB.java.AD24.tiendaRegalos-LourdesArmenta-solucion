package miTest;

import miPrincipal.*;
import ui.Menu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test 
    public void testMenuInitialization() {
        Menu menu = new Menu();
        assertNotNull(menu, "El menú debe inicializarse correctamente");
    }
}