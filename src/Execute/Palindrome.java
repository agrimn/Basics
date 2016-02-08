package Execute;

public class Palindrome {

	//Check if Palindrome
	public static boolean isPalindrome(String str){
        if (str == null){
            return true;
        }
        for (int head = 0 , tail = str.length() -1 ; head < tail; head++, tail--)
        {
        	//We Do this to eliminate whitespaces so that"ra ppar" and "rap par" are palindromes as well
            while(!Character.isLetterOrDigit(str.charAt(head)) && head < tail){
                head++;
            }
            while(!Character.isLetterOrDigit(str.charAt(tail)) && head < tail){
                tail--;
            }
            if (Character.toLowerCase(str.charAt(tail)) != 	Character.toLowerCase(str.charAt(head))){
                return false;
            }
        }
        return true;
        
    }
}
