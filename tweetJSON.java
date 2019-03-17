import java.io.*;
import java.util.*;

class tweetJSON {
	List<String> content;
	List<String> location;
	List<String> hashtags;
	List<String> name;
	List<String> screenname;
	
	public tweetJSON() {
		content = new ArrayList<String>();
		location = new ArrayList<String>();
		hashtags = new ArrayList<String>();
		name = new ArrayList<String>();
		screenname = new ArrayList<String>();
	}
}
