import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

class test {
	// Returns extracted information from tweet JSONS from a given file
	public static tweetJSON regexMatcher(String s) {
		tweetJSON tweet = new tweetJSON();
		String tweetjson,user;
		boolean t = false;
		Pattern p_tweetJsons = Pattern.compile("\\{(.*?\"lang\": \".*?(?=\")\"\\})");
		Matcher m_tweetJsons = p_tweetJsons.matcher(s);
		Pattern p_hashtags = Pattern.compile("\"hashtags\": \\[(.*?(?=\\],))\\],");
		Matcher m_hashtags;
		Pattern p_content = Pattern.compile(", \"text\": \"(.*?(?=\", \"truncated\"))");
		Matcher m_content;
		Pattern p_user_info = Pattern.compile("\"user\": \\{(.*?\"translator_type\": \".*?(?=\")\")");
		Matcher m_user_info;
		Pattern p_name = Pattern.compile("\"name\": \"(.*?(?=\",))\",");
		Matcher m_name;
		Pattern p_screenname = Pattern.compile("\"screen_name\": \"(.*?(?=\", \"l))\",");
		Matcher m_screenname;
		Pattern p_location = Pattern.compile("\"location\": \"(.*?(?=\", \"d))\",");
		Matcher m_location;
		while(m_tweetJsons.find()) {
			tweetjson = m_tweetJsons.group(1);
			m_content = p_content.matcher(tweetjson);
			while(m_content.find()) tweet.content.add(m_content.group(1));
			m_hashtags = p_hashtags.matcher(tweetjson);
			while(m_hashtags.find()) tweet.hashtags.add(m_hashtags.group(1));
			m_user_info = p_user_info.matcher(tweetjson);
			while(m_user_info.find()) {
				user = m_user_info.group(1);
				m_name = p_name.matcher(user);
				while(m_name.find()) tweet.name.add(m_name.group(1));
				m_screenname = p_screenname.matcher(user);
				while(m_screenname.find()) tweet.screenname.add(m_screenname.group(1));
				m_location = p_location.matcher(user);
				while(m_location.find()) tweet.location.add(m_location.group(1));
			}
			t = true;
		}
		if (!t) System.out.println("Didn't find tweet text");
		return tweet;
	}
}
