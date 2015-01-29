package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetList {
	private ArrayList<LonelyTweetModel> tweetList;
	private int count;
	private Exception IllegalArgumentException;
	
	public TweetList(){
		tweetList= new ArrayList<LonelyTweetModel>();
		count = 0;
	}
	
	public ArrayList<LonelyTweetModel> getTweets(){
		return tweetList;
	}
	public int getCount(){
		return count;
	}
	//Throw exception on duplicate tweet
	public void addTweet(LonelyTweetModel tweet) throws IllegalArgumentException{
		for (int i = 0;i < tweetList.size();i++){
			if (tweet.equals(tweetList.get(i))) {
				throw new IllegalArgumentException();

			}
		}

		tweetList.add(tweet);
		count++;
	}

}
