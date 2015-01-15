package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;

public class Friends extends Reader {;
	private ArrayList<String> FriendList = new ArrayList<String>();
	
	public ArrayList<String> GetFriendlist() {
		return this.FriendList;
	}

	public void AddFriend(String Friend_Name){
		this.FriendList.add(Friend_Name);
		
	}
	public void RemoveFriend(String Friend_Name) throws IOException {
		if (Boolean = this.FriendList.contains(Friend_Name)); {
			this.Friendlist.remove(Friend_Name);
		}
		else {
			throw IOexception;
		}
}