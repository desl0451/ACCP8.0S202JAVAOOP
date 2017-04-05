package Chapter06.Question05;

public class Student {
	private String name;
	private Integer score;

	public String getName() {
		return name;
	}

	public Student(String name, Integer score) {
		super();
		this.name = name;
		this.score = score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
}
