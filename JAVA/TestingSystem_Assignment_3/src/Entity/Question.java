package Entity;

import java.util.Date;

public class Question {
	public int questionID;
	public String content;
	public CategoryQuestion category;
	public TypeQuestion type;
	public Account creator;
	public Date createDate;
	public Exam[] exams;
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public CategoryQuestion getCategory() {
		return category;
	}
	public void setCategory(CategoryQuestion category) {
		this.category = category;
	}
	public TypeQuestion getType() {
		return type;
	}
	public void setType(TypeQuestion type) {
		this.type = type;
	}
	public Account getCreator() {
		return creator;
	}
	public void setCreator(Account creator) {
		this.creator = creator;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Exam[] getExams() {
		return exams;
	}
	public void setExams(Exam[] exams) {
		this.exams = exams;
	}
	
	
}
