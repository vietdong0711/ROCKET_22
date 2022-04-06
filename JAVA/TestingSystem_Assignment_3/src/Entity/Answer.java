package Entity;

public class Answer {
	public int answerID;
	public String content;
	public Question question;
	public boolean iscorrect;
	public int getAnswerID() {
		return answerID;
	}
	public void setAnswerID(int answerID) {
		this.answerID = answerID;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public boolean isIscorrect() {
		return iscorrect;
	}
	public void setIscorrect(boolean iscorrect) {
		this.iscorrect = iscorrect;
	}
	
	
}	
