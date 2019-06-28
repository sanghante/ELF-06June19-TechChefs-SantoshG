package com.techchefs.assessment;

import java.time.LocalDateTime;
import java.util.Comparator;

public class Message {
	
	private String text;
	private LocalDateTime receivedDateTime;
	private long from;
	
	public Message(String text, LocalDateTime receivedDateTime, long from) {
		super();
		this.text = text;
		this.receivedDateTime = receivedDateTime;
		this.from = from;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public LocalDateTime getReceivedDateTime() {
		return receivedDateTime;
	}
	public void setReceivedDateTime(LocalDateTime receivedDateTime) {
		this.receivedDateTime = receivedDateTime;
	}
	
	public long getFrom() {
		return from;
	}
	public void setFrom(long from) {
		this.from = from;
	}
	@Override
	public String toString() {
		return "Message [text=" + text + ", receivedDateTime=" + receivedDateTime + ", from=" + from + "]";
	}
	
}

class MessageByDateTime implements Comparator<Message> {

	@Override
	public int compare(Message o1, Message o2) {
		return o1.getReceivedDateTime().compareTo(o2.getReceivedDateTime());
	}
	
}
