package dsgeneral.interviewcake;

public class ReverseWords {

	public static void reverseCharacters(char[] message) {
		int leftIndex = 0;
		int rightIndex = message.length - 1;
		
		while(leftIndex < rightIndex) {
			char temp = message[leftIndex];
			message[leftIndex] = message[rightIndex];
			message[rightIndex] = temp;
			leftIndex++;
			rightIndex--;
		}
	}
	
	public static void main(String[] args) {
		char[] message = {'a','b','c','d','e','f','g','h'};
		
	}
}
