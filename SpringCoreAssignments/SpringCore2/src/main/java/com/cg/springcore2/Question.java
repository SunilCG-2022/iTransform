package com.cg.springcore2;

import java.util.Collection;

public class Question {

	private int questionId;
	private String question;
	private Collection<?> answer;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int questionId, String question, Collection<?> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Collection<?> getAnswer() {
		return answer;
	}
	public void setAnswer(Collection<?> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}
	
	
}
