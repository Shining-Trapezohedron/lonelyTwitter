package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.R;

public class IntentReaderActivityTests extends
		ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public IntentReaderActivityTests(String name) {
		super(IntentReaderActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	public void testSendText(){
		String text = "Hello World";
		IntentReaderActivity activity = startwithText(text, IntentReaderActivity.NORMAL);
		assertEquals("Got the text", text, activity.getText());
	}
	public void testDoubleText(){
		String text = "Hello world!";
		IntentReaderActivity activity = startwithText(text, IntentReaderActivity.DOUBLE);
		assertEquals("double text?", text+text, activity.getText());
	}
	
	public void testDisplayText(){
		String text = "Hello";
		IntentReaderActivity activity = startwithText(text, IntentReaderActivity.NORMAL);
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("correct text?", text, view.getText());	
	}
	public void testReverseText(){
		String text = "Hello";
		IntentReaderActivity activity = startwithText(text, IntentReaderActivity.REVERSE);
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("Correct?", "olleH", view.getText());
	}
	public void testDefautText(){
		String empty = "";
		IntentReaderActivity activity = startwithText(empty, IntentReaderActivity.DEFAULT);
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("Correct?", "Default", view.getText());
	}
	
	private IntentReaderActivity startwithText(String text, int mode ){
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, mode);
		setActivityIntent(intent);
		return (IntentReaderActivity) getActivity();
	}

}
