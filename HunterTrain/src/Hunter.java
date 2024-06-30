import java.util.List;
import java.util.ArrayList;


public class Hunter {
	private String name;
	private List<Integer> record;
	private int score;
	
	public Hunter(String name) {
		this.name = name;
		this.score = 0;
		this.record = new ArrayList<>(); 
	}

	public String getName() {
		return name;
	}

	public List<Integer> getRecord() {
		return record;
	}

	public int getScore() {
		return score;
	}
	
	public void addpoints(int point) {
		this.score += point;
        this.record.add(point);
	}
	
}
