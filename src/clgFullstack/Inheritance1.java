package clgFullstack;


class Players{
	String name;
	int age;
	String man_of_match;
	int best_score;
	String country;
	String team;	
}
class Cricket extends Players{
	int centuries;
	int half_centuries;
	
	public Cricket(String name,int age,String man_of_match,int best_score,String country,String team,int centuries,int half_centuries) {
		this.centuries=centuries;
		this.half_centuries=half_centuries;
		this.name=name;
		this.age=age;
		this.man_of_match=man_of_match;
		this.best_score=best_score;
		this.country =country;
		this.team=team;
	}
	public String getName() {
		return name;
	}
	public int getage() {
		return age;
	}
	public String getManOfMatch() {
		return man_of_match;
	}
	public int getScore() {
		return best_score;
	}
	public String getCoutry() {
		return country;
	}
	public String getTeam() {
		return team;
	}
	public int getCenturies() {
		return centuries;
	}
	public int getHalf_Centuries() {
		return half_centuries;
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		Cricket c= new Cricket("abc",25,"def",250,"india","rcb",100,50);
		System.out.println(c.getName());
		System.out.println(c.getage());
		System.out.println(c.getManOfMatch());
		System.out.println(c.getScore());
		System.out.println(c.getCoutry());
		System.out.println(c.getTeam());
		System.out.println(c.getCenturies());
		System.out.println(c.getHalf_Centuries());
		
	}

}
