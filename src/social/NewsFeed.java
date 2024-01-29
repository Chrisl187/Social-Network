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

}
