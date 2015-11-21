package nlp100;

import java.util.HashMap;

public class Q04 {

	public static void main(String[] args) {
		String str = "Hi He Lied Because Boron Could Not Oxidize Fluorine. New Nations Might Also Sign Peace Security Clause. Arthur King Can.";
		str = str.replace(".", "");
		String[] split = str.split(" ");

		for(int i : new int[] {1, 5, 6, 7, 8, 9, 15, 16, 19}) {
			split[i-1] = split[i-1].substring(0, 1);
		}
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i = 0; i < split.length; i++) {
			if (split[i].length() != 1) {
				map.put(i, split[i].substring(0, 2));
			} else {
				map.put(i, split[i]);
			}
		}
		
		for(int i = 0; i < map.size(); i++) {
			System.out.print(i+1 + ": ");
			System.out.println(map.get(i));
		}
		
	}

}
