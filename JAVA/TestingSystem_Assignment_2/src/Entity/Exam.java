package Entity;

import java.util.Date;

public class Exam {
	public int examID;
	public String code;
	public String title;
	public CategoryQuestion category;
	public int duration;
	public Account creator;
	public Date createDate;
	public Question[] questions;
	public int getExamID() {
		return examID;
	}
	public void setExamID(int examID) {
		this.examID = examID;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public CategoryQuestion getCategory() {
		return category;
	}
	public void setCategory(CategoryQuestion category) {
		this.category = category;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
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
	public Question[] getQuestions() {
		return questions;
	}
	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}
	
	
}
