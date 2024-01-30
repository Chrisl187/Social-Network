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
		for (Submission s: messages) {
			if(s.getAuthor()==user) {
				submissions.add(s);
			}
		}
		return submissions;
	}
	
	public ArrayList<Submission> picturePerUser(String user) {
		ArrayList<Submission> submissions = new ArrayList<>();
		for (Submission s: messages) {
			if(s.getAuthor()==user) {
				if(s.getClass().toString() == "social.Text") {
					submissions.add(s);
				}
			}
		}
		return submissions;
	}

	@Override
	public void printAllSubmission() {
		
	}
	
	
	public void printUserSubmission(String user) {
		ArrayList<Submission> list = new ArrayList<>();
		list = submissionPerUser(user);
		
		
	}
	
	
	public void deleteSubmission(int pos) {
		
	}
	

}
