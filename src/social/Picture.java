package social;

public class Picture {

	private String filename;
	private String title;

	public Picture(String filename, String title) {
		super();
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
