package testVirus;

public class ResistantVirus extends Virus{
	String drug;

	public ResistantVirus(String name, int population, String drug) {
		super(name, population);
		this.drug = drug;
	}

	public String getDrug() {
		return drug;
	}
	
	
}
