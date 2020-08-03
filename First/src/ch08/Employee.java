package ch08;

public class Employee {
	 public String name;
	 public String grade;
	 public void Empliyee(String name) {
		 this.name = name;
	 }
}
public class Engineer extends Employee {
	private String skillset;
	public String getSkillSet() {
		return skillset;
	}
	public void setSkillSet(String skillset) {
	this.skillset = skillset;
}
}