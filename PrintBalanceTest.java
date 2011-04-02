import java.text.NumberFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author henderea
 */
public class PrintBalanceTest
{

    public PrintBalanceTest()
    {
    }

    @Test
    public void testUseLocaleUS()
    {
        Locale currentLocale = new Locale("en", "US");
        String name = "Eric";
        Date today = new Date();
        String expResult = "Hello World\nPlease enter your name\nI am pleased to meet you "+name+"\nAs of : "+(DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, currentLocale)).format(today)+"\nYou owe the school "+(NumberFormat.getCurrencyInstance(currentLocale)).format(9876543.21)+"\nGood Bye\n";
        String result = PrintBalance.useLocale(currentLocale, name);
        assertEquals(expResult, result);      
    }

    @Test
    public void testUseLocaleFR()
    {
        Locale currentLocale = new Locale("fr", "FR");
        String name = "Eric";
        Date today = new Date();
        String expResult = "Bonjour tout le monde\nS'il vous plaît entrer votre nom\nJe suis heureux de vous rencontrer "+name+"\nComme des : "+(DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, currentLocale)).format(today)+"\nVous devez l'école "+(NumberFormat.getCurrencyInstance(currentLocale)).format(9876543.21)+"\nau revoir\n";
        String result = PrintBalance.useLocale(currentLocale, name);
        assertEquals(expResult, result);
    }

    @Test
    public void testUseLocaleGR()
    {
        Locale currentLocale = new Locale("de", "DE");
        String name = "Eric";
        Date today = new Date();
        String expResult = "Hallo Welt\nBitte geben Sie Ihren Namen\nIch freue mich, Sie kennen zu lernen "+name+"\nWie der : "+(DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, currentLocale)).format(today)+"\nDu schuldest der Schule "+(NumberFormat.getCurrencyInstance(currentLocale)).format(9876543.21)+"\nAuf Wiedersehen\n";
        String result = PrintBalance.useLocale(currentLocale, name);
        assertEquals(expResult, result);
    }

}