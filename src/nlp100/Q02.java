package nlp100;

public class Q02 {

	public static void main(String[] args) {
		String str1 = "パトカー";
		String str2 = "タクシー";
		
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < str1.length(); i++) {
			result.append(str1.charAt(i));
			result.append(str2.charAt(i));
		}
		System.out.println(result);
	}

}
