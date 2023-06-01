import java.io.Serializable;

public class Result implements Serializable{
	String name;
	int score;

	Result(){

	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setScore(int score) {
		this.score = score;
	}

	int getScore() {
		return score;
	}
}
