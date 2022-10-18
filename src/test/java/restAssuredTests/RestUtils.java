package restAssuredTests;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {

	
	public static String getName() {
		
		String generatedString=RandomStringUtils.randomAlphanumeric(0);
		return("pratish"+generatedString);
	}
    public static String getSalary() {
		
		String generatedString=RandomStringUtils.randomAlphanumeric(0);
		return("one lack fifty thousand"+generatedString);
    }
	public static String getAge() {
			String generatedString=RandomStringUtils.randomAlphanumeric(0);
			return("thirty"+generatedString);
		}
	}

