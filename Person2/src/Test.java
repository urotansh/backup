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

Person jiro=new Person();
jiro.name="JIRO";
jiro.age=30;
System.out.println(jiro.name);
System.out.println(jiro.age);

Person hanako=new Person();
hanako.name="鈴木花子";
hanako.age=16;
System.out.println(hanako.name);
System.out.println(hanako.age);

Person jirou=new Person();
jirou.name="木村次郎";
jirou.age=18;
jirou.phoneNumber="090-0000-0000";
jirou.addres="東京都台東区";
System.out.println(jirou.name);
System.out.println(jirou.age);
System.out.println(jirou.addres);
System.out.println(jirou.phoneNumber);

taro.talk();
taro.walk();
taro.run();

Robot aibo=new Robot();
aibo.name="aibo";
aibo.talk();
aibo.walk();
aibo.run();

 }
}
