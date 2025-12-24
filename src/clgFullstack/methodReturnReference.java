package clgFullstack;


class Mary{
	String name;	
}
class UseStudent{
	Mary dispStudent() {
		Mary s=new Mary();
		return s;
	}    
}
public class methodReturnReference {

	public static void main(String[] args) {
		UseStudent us= new UseStudent();
		Mary res=us.dispStudent();
		System.out.println(res);
	} 

}
