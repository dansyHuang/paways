

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "fch_question")
public class PawaysQuestion {
	private String title;
	private String grade;
	private String kemu;
	private String content;
	private String contentUrl;
	private String authorId;
	private String answerId;
	
	public PawaysQuestion() {
		super();
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setKemu(String kemu) {
		this.kemu = kemu;
	}

	public String getKemu() {
		return kemu;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public String getContentUrl() {
		return contentUrl;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}

	public String getAnswerId() {
		return answerId;
	}

}
