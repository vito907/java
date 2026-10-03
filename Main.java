package list;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		// 添加数据
		list.add("姓名");
		list.add("学号");
		list.add("张三");
		// 遍历(法1)
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		// 遍历(法2)
		System.out.println();
		for (String s : list) {

			System.out.print(s);
		}
		System.out.println();
		list.add(1, "光大");
		list.remove(0);
		for (String s : list) {
			System.out.println(s);
		}

	}

}
