package io.java.spring.controller.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	
	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("1", "Java", "corejava"),
			new Topic("2", "Selenium", "automation"),
			new Topic("3", "Java", "Springboot"),
			new Topic("4", "Mangodb", "information storage")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	
	public Topic getSelectedTopic(String id) {
	

			return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	
	}


	public void addtopic(Topic topic) {
		topics.add(topic);
		
	}


	public void updatetopic(String id, Topic requestbody) {
		for (int i = 0; i < topics.size(); i++) {
			Topic  t =  topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, requestbody);
				return;
			}
		}
	}


	public void deletetopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
		
	}

}
























