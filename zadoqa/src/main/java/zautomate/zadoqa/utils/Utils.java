package zautomate.zadoqa.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Common utils
 * @author Babu
 *
 */
public class Utils {

	public static String getCurrentTime()  {
		SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
		Date localDate = new Date();
		return localSimpleDateFormat.format(localDate);
	}
}

