package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantTweetModel extends LonelyTweetModel {

	public ImportantTweetModel(String text, Date timestamp) {
		super(text, timestamp);
	}

	public ImportantTweetModel(String text) {
		super(text);
	}
	
	public String getText() {
		return "Important! " + super.getText();
	}

	@Override
	public Date getTimestamp() {
		return timestamp;
	}
	//Any extensions need their own instance check
	//Added this
	@Override
	public boolean equals(Object other) {
		return super.equals(other) && (other instanceof ImportantTweetModel);
	}

}
