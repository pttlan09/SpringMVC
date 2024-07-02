package javaBeans;

import java.io.Serializable;

public class EmailInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String subject;
	private String email;
	private String content;

	public EmailInfo(String subject, String email, String content) {
	super();
	this.subject = subject;
	this.email = email;
	this.content = content;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
