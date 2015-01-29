package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;
import java.util.Date;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetList;
import android.test.ActivityInstrumentationTestCase2;

public class TweetListTests extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public TweetListTests() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	public void testTweetList(){
		TweetList tweetlist = new TweetList();
		ArrayList<LonelyTweetModel> tweets = tweetlist.getTweets();
		assertNotNull("Tweet List not initialised",tweetlist.getTweets());
	}
	public void testCounts(){
		TweetList tweetList = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("Hello");
		tweetList.addTweet(tweet);
		assertEquals("This should be one",1,tweetList.getCount());
	}
	//not able to hande tweets of different type
	//Wrote many test cases
	public void testequals(){
		NormalTweetModel normaltweet = new NormalTweetModel("I am a normal tweet", new Date(123));
		NormalTweetModel normaltweet2 = new NormalTweetModel("I am a normal1 tweet", new Date(123));
		ImportantTweetModel importanttweet = new ImportantTweetModel("I am an important tweet1", new Date(321));
		ImportantTweetModel importanttweet2 = new ImportantTweetModel("I am a normal tweet", new Date(123)); //fake normal tweet
		//dont use lonely tweet it is abstract!!
		assertEquals("This should be true",false,normaltweet.equals(normaltweet2));
		assertEquals("This should be false",false,normaltweet.equals(importanttweet));
		assertEquals("This should be true",false,importanttweet2.equals(normaltweet2));
		assertEquals("This should be true",false,importanttweet.equals(importanttweet2));
		
		NormalTweetModel normaltweettolist = new NormalTweetModel("I am a normal tweet", new Date(123));
		NormalTweetModel normaltweettolist2 = new NormalTweetModel("I am a normal t1weet", new Date(123));
		
		TweetList tweetlistnew = new TweetList();
		tweetlistnew.addTweet(normaltweettolist);
		tweetlistnew.addTweet(normaltweettolist2);
	}

}
