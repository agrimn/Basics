package Execute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGrouping {

	   public static void check() {
		      // String to be scanned to find the pattern.
		      String line = "This order was placed for QT3000! OK?";
		      
		      /* This pattern is going to divide the above string into three groups
		      The Greedy quantifier .* will try to match as many elements it can before taking in atleast one digit,
		      Hence we get a result "This order was placed for QT300" for the first group,
		      The second group will be just the one digit which is 0
		      The third group will be the rest of the remaining string "! OK?"
		      */
		      String pattern = "(.*)(\\d+)(.*)";

		      // Create a Pattern object
		      Pattern r = Pattern.compile(pattern);

		      // Now create matcher object.
		      Matcher m = r.matcher(line);
		      
		      if (m.find( )) {
		         System.out.println("Found value: " + m.group(0) );
		         System.out.println("Found value: " + m.group(1) );
		         System.out.println("Found value: " + m.group(2) );
		         System.out.println("Found value: " + m.group(3) );
		      } else {
		         System.out.println("NO MATCH");
		      }
	   }
	}
