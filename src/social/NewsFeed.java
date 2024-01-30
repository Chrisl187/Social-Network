package social;

import java.util.ArrayList;

public class NewsFeed {

	private ArrayList<Submission> messages;

	public NewsFeed(Submission message) {
		super();
		addSubmission(message);
	}

	private void addSubmission(Submission message) {
		messages.add(message);
	}

	private ArrayList<Submission> submissionPerUser(String user) {
		ArrayList<Submission> submissions = new ArrayList<>();
		for (Submission s : messages) {
			if (s.getAuthor() == user) {
				submissions.add(s);
			}
		}
		return submissions;
	}

	public ArrayList<Submission> picturePerUser(String user) {
		ArrayList<Submission> submissions = new ArrayList<>();
		for (Submission s : messages) {
			if (s.getAuthor() == user) {
				if (s.getClass().toString() == "social.Text") {
					submissions.add(s);
				}
			}
		}
		return submissions;
	}

	public void printAllSubmissions() {
		for (Submission s : messages) {
			if (s.getClass().toString() == "social.Text") {
				System.out.println("Author: " + s.getAuthor() + "\nTimestamp: " + s.getTimestamp() + "\n Text: "
						+ ((Text) s).getText() + "\nLikes: " + s.getLikes() + "\nComments: " + s.getComments() + "\n");
			} else {
				System.out.println("Author: " + s.getAuthor() + "\nTimestamp: " + s.getTimestamp() + "\n Title: "
						+ ((Picture) s).getTitle() + "\n Picture: " + ((Picture) s).getFilename() + "\nLikes: "
						+ s.getLikes() + "\nComments: " + s.getComments() + "\n");
			}
		}
	}

	public void printUserSubmission(String user) {
		ArrayList<Submission> list = new ArrayList<>();
		list = submissionPerUser(user);
		for (Submission s : list) {
			if (s.getClass().toString() == "social.Text") {
				System.out.println("Author: " + s.getAuthor() + "\nTimestamp: " + s.getTimestamp() + "\n Text: "
						+ ((Text) s).getText() + "\nLikes: " + s.getLikes() + "\nComments: " + s.getComments() + "\n");
			} else {
				System.out.println("Author: " + s.getAuthor() + "\nTimestamp: " + s.getTimestamp() + "\n Title: "
						+ ((Picture) s).getTitle() + "\n Picture: " + ((Picture) s).getFilename() + "\nLikes: "
						+ s.getLikes() + "\nComments: " + s.getComments() + "\n");
			}
		}
	}

	public void deleteSubmission(int pos) {
		messages.remove(pos);
	}

}
