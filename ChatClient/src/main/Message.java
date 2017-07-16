package main;

public class Message {
	private String text;
	private String author;
	private long unixTimeStamp;
	public Message(String text, String author, long unixTimeStamp) {
		this.text = text;
		this.author = author;
		this.unixTimeStamp = unixTimeStamp;
	}
	public String getText() {
		return text;
	}
	public String getAuthor() {
		return author;
	}
	public long getUnixTimeStamp() {
		return unixTimeStamp;
	}
	public String toString() {
		return "From: " + author + "\n" + "Sent at: " + unixTimeStamp + "\n" + "Message: " + text;
	}
}
