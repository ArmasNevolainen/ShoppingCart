import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Locale;
import java.util.ResourceBundle;

public class ShoppingCartTest {

    @Test
    void testEnglishLocale() {
        Locale locale = new Locale("en", "US");
        ResourceBundle messages = ResourceBundle.getBundle("message", locale);
        assertEquals("Enter the number of items to purchase:", messages.getString("items"));
    }

    @Test
    void testFinnishLocale() {
        Locale locale = new Locale("fi", "FI");
        ResourceBundle messages = ResourceBundle.getBundle("message", locale);
        assertEquals("Syötä ostettavien tuotteiden määrä:", messages.getString("items"));
    }

    @Test
    void testSwedishLocale() {
        Locale locale = new Locale("sv", "SE");
        ResourceBundle messages = ResourceBundle.getBundle("message", locale);
        assertEquals("Ange antalet varor att köpa:", messages.getString("items"));
    }

    @Test
    void testJapaneseLocale() {
        Locale locale = new Locale("ja", "JP");
        ResourceBundle messages = ResourceBundle.getBundle("message", locale);
        assertEquals("「購入する商品の数を入力してください:」", messages.getString("items"));

    }
}
