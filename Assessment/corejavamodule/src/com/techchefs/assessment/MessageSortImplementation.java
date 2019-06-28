package com.techchefs.assessment;

/**
 * @author Santosh
 * 22)	WAP to sort the message based on the date and time.
 * 
 */
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import lombok.extern.java.Log;

@Log
public class MessageSortImplementation {

	public static void main(String[] args) {
		
		Message m1 = new Message("Hi Boss", LocalDateTime.of(2019, 6, 27, 12, 10, 23), 9876787654L); 
		Message m2 = new Message("Give back my money", LocalDateTime.of(2019, 6, 23, 22, 10, 23), 9876787654L);
		Message m3 = new Message("Lets go to chamundi", LocalDateTime.of(2019, 6, 25, 19, 10, 23), 9876787654L);
		Message m4 = new Message("Did you watch the match", LocalDateTime.of(2019, 6, 28, 11, 10, 23), 9876787654L);
		
		List<Message> messageList = new LinkedList<>();
		messageList.add(m1);
		messageList.add(m2);
		messageList.add(m3);
		messageList.add(m4);
		
		MessageByDateTime comparator = new MessageByDateTime();
		
		Collections.sort(messageList, comparator);
		
		for (Message message : messageList) {
			log.info(message.toString());
		}

	}

}
