import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("你好");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("你可以告诉我你的名字吗？");
			   str = sc.next();
			   System.out.println(str+"你好！欢迎来到java世界");

	}

}
