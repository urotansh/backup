
public class main9 {
	public static void introducedOneself(String name){			
		System.out.println("名前:"+name);
	}
	public static void introducedOneself(int age){
		System.out.println("年齢:"+age);
	}
	public static void introducedOneself(double tall){
		System.out.println("身長:"+tall);
	}
	public static void introducedOneself(char gender){
		System.out.println("性別:"+gender);
	}
	public static void main(String[] args){
		introducedOneself("田中");
		introducedOneself(20);
		introducedOneself(175.2);
		introducedOneself('男');
	}

}
