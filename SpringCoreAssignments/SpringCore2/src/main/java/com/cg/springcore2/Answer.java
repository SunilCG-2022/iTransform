package com.cg.springcore2;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class Answer {

	List answerList;
	Set answerSet;
	Map answerMap;
	
	
	 // a setter method to set List
	   public void setAnswerList(List addressList) {
	      this.answerList = addressList;
	   }
	   
	// prints and returns all the elements of the list.
	   public List getAnswerList() {
	      System.out.println("List Elements :"  + answerList);
	      return answerList;
	   }
	   
	   // a setter method to set Set
	   public void setAnswerSet(Set answerSet) {
	      this.answerSet = answerSet;
	   }
	   
	   // prints and returns all the elements of the Set.
	   public Set getAddressSet() {
	      System.out.println("Set Elements :"  + answerSet);
	      return answerSet;
	   }
	   
	   // a setter method to set Map
	   public void setAnswerMap(Map answerMap) {
	      this.answerMap = answerMap;
	   }
	   
	// prints and returns all the elements of the Map.
	   public Map getAnswerMap() {
	      System.out.println("Map Elements :"  + answerMap);
	      return answerMap;
	   }

	@Override
	public String toString() {
		return "Answer [answerList=" + answerList + ", answerSet=" + answerSet + ", answerMap=" + answerMap + "]";
	}
	   
	   
}
