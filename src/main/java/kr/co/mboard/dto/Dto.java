package kr.co.mboard.dto;

public class Dto {
	private String id;
	private String name;
	private String title;
	private String content;
	private String writeday;
	
	// 생성자(매개변수없는 생성자, 매개변수 있는 생성자)
	public Dto() {

	}
	
	public Dto(String id, String name, String title, String content, String writeday) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.content = content;
		this.writeday = writeday;
	}

	// setter, getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriteday() {
		return writeday;
	}

	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}
		
}
