import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main {
	public static void main(String args[]) throws FileNotFoundException, IOException{
		String filename = args[0];
		File f = new File(filename);
		BufferedReader br = new BufferedReader(new FileReader(f));
		String str4,st;
		str4 = "";
		while ((st = br.readLine()) != null) str4 += st;
		test.regexMatcher(str4);
		//return;
/*
		String str1 = ", \"text\": \"Hello Bob, I must say you are exquisite\", \"truncated\": \"idk\"";
		String str2 = ", \"text\": \"I hate you boy\", \"truncated\": \"Idk whate to read\"";
		String str3 = str1 + str2;
		test.regexMatcher(str3);
*/
	}
}
