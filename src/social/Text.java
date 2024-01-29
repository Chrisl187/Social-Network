package social;

import java.util.ArrayList;

public class Text {
	
	private ArrayList<String> text;

	public Text(String text) {
		writeText(text);
	}	
	
	private void writeText(String s) {
		for(int i = 0; i < s.length();i++) {
			text.add(s.substring(i, i+1));
		}
	}
}
