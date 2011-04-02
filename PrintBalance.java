import java.util.*;
import java.text.*;


/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2010.
 */
public class PrintBalance{

    /**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static String useLocale(Locale currentLocale, String name)
	{
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
        String rval = "";
		Date today = new Date();
		
		//Greeting
        //("Hello World");
		rval += messages.getString("greeting")+"\n";

		//Get User's Name
		//("Please enter your name");
        rval += messages.getString("prompt")+"\n";
		//("I am pleased to meet you " + name);
        rval += messages.getString("meet")+" "+name+"\n";
		
		//print today's date, balance and bid goodbye
		//("As of : "+ today.toString());
        rval += messages.getString("asof")+" "+(DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, currentLocale)).format(today)+"\n";
		//("You owe the school $9876543.21");
        rval += messages.getString("owe")+" "+(NumberFormat.getCurrencyInstance(currentLocale)).format(9876543.21)+"\n";
		//("Good Bye");
        rval += messages.getString("bye")+"\n";
        return rval;
	}
}



