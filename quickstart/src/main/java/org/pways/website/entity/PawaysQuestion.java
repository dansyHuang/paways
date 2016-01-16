package org.pways.website.entity;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "paways_question")
public class PawaysQuestion extends BaseEntity{
	private static final long serialVersionUID = 5316189370889363526L;
	private String title;
	private String grade;
	private String kemu;
	private String content;
	private String contentUrl;
	private String authorId;
	private String answerId;
	private String answerUrl;
	private BigDecimal contentPrice;
	private String status;
	private long expireTime;
	public long getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(long expireTime) {
		this.expireTime = expireTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getContentPrice() {
		return contentPrice;
	}

	public void setContentPrice(BigDecimal contentPrice) {
		this.contentPrice = contentPrice;
	}

	public String getAnswerUrl() {
		return answerUrl;
	}

	public void setAnswerUrl(String answerUrl) {
		this.answerUrl = answerUrl;
	}

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
