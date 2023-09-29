public class GetShortestWord {
    //code the method getShortestWord that accepts two words and returns the shortest one
	public static String getShortestWord(String string1, String string2) {
		if (string1.length() > string2.length()) {
			return string2;
		} else {
			return string1;
		}
	}
}