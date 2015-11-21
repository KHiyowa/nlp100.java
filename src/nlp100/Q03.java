package nlp100;

import java.util.*;

public class Q03 {

	public static void main(String[] args) {
		String str = "Now I need a drink, alcoholic of course, after the heavy lectures involving quantum mechanics.";
		str = str.replace(",", "").replace(".", "");
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++ ) {
			System.out.print(split[i].length());
		}
	}

}
