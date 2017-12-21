/**
 * 
 */

/**
 * @author internousdev
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Person taro=new Person();
taro.name="山田太郎";
taro.age=20;
System.out.println(taro.name);
System.out.println(taro.age);

Person saburo=new Person("saburo");
System.out.println(saburo.name);
System.out.println(saburo.age);

Person nashi=new Person(25);
System.out.println(nashi.name);
System.out.println(nashi.age);

Person hanako=new Person(17,"hanako");
System.out.println(hanako.name);
System.out.println(hanako.age);
	}
}
