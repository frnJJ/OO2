package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.List;
import java.util.*;

public class Usuario {
	
	
	private String screenName;
	private List<Post> tweets;
	
	
	public Usuario (String name) {
		
		this.screenName = name;
		this.tweets = new ArrayList<Post>();
		
	}
	
	public Tweet twitear (String text) {
		
		Tweet p = new Tweet(text);
		this.tweets.add(p);
		return p;
		
	}
	
	public reTweet reTwitear (Post origin) {
		
		reTweet r = new reTweet(origin);
		this.tweets.add(r);
		return r;
		
	}
	
	public void eliminarTweets () {
		
		this.tweets.clear();
		
	}
	
	
	public String getScreenName () {
		
		return this.screenName;
		
	}
	
	public List<Post> getTweet() {
		
		return this.tweets;
		
	}
	

}
