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
	
	public void showByUser(String user) {
		ArrayList<Submission> submissions = new ArrayList<>();
		for (Submission s: messages) {
			if(s.getAuthor()==user) {
				submissions.add(s);
			}
		}
	}

}
