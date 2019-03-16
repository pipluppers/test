import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class test {
	public static void regexMatcher(String s) {
		Pattern p_content = Pattern.compile(", \"text\": \"(.*?(?=\", \"truncated\"))");
		Matcher m_content = p_content.matcher(s);
		boolean t = false;
		while(m_content.find()) {
			System.out.println("Tweet text: " + m_content.group(1));
			t = true;
		}
		if (!t) System.out.println("Didn't find tweet text");
	}
}
