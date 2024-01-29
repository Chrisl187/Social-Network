package social;

import java.util.ArrayList;

public abstract class Submission {

	private String author;
	private long timestamp;
	private int likes;
	private ArrayList<String> comments;

	public Submission(String author, long timestamp, int likes, ArrayList<String> comments) {
		this.author = author;
		this.timestamp = timestamp;
		this.likes = likes;
		this.comments = comments;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public ArrayList<String> getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments.add(comments);
	}
}
