
public class main11 {
	public static void main(String[] args){
		email("無題","aaa@yahoo.co.jp","こんにちは");
		email("abc@yahoo.co.jp","こんばんは");
	}
	public static void email(String title,String address,String text){
		System.out.println(address+"に、以下のメールを送信しました。");
		System.out.println("件名;"+title);
		System.out.println("本文:"+text);	
	}
	
	public static void email(String address,String text){
		System.out.println(address+"に、以下のメールを送信しました。");
		System.out.println("件名:無題");
		System.out.println("本文"+text);
	}

}
