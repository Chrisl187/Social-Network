package social;

import java.util.ArrayList;

public class Text extends Submission{

	private ArrayList<String> text;

	

	public Text(String author, long timestamp, int likes, ArrayList<String> comments, ArrayList<String> text) {
		super(author, timestamp, likes, comments);
		this.text = text;
	}

	private void writeText(String s) {
		for (int i = 0; i < s.length(); i++) {
			text.add(s.substring(i, i + 1));
		}
	}

}
