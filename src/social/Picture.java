package social;

import java.util.ArrayList;

public class Picture extends Submission {

	private String filename;
	private String title;

	public Picture(String author, long timestamp, int likes, ArrayList<String> comments, String filename,
			String title) {
		super(author, timestamp, likes, comments);
		this.filename = filename;
		this.title = title;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
