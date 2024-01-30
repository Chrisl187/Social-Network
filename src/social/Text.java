package social;

import java.util.ArrayList;

public class Text extends Submission{

	private String text;

	

	public Text(String author, long timestamp, int likes, ArrayList<String> comments, String text) {
		super(author, timestamp, likes, comments);
		this.text = text;
	}

	

}
