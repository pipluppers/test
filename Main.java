import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

class Main {

	public static void main(String args[]) throws FileNotFoundException, IOException{
		String filename = args[0];
		File f = new File(filename);
		BufferedReader br = new BufferedReader(new FileReader(f));
		String str4,st;
		str4 = "";
		while ((st = br.readLine()) != null) str4 += st;

		tweetJSON tweet = new tweetJSON();
	
		tweet = test.regexMatcher(str4);

		System.out.println("---");
		int x = 1;
		for (int i = 0; i < tweet.content.size(); ++i) {
			System.out.println(x + ") " + tweet.content.get(i));
			System.out.println("\tHashtags: " + tweet.hashtags.get(i));
			System.out.println("\tName: " + tweet.name.get(i));
			System.out.println("\tScreen Name: " + tweet.screenname.get(i));
			System.out.println("\tLocation " + tweet.location.get(i));	
			++x;
		}
	}
}
