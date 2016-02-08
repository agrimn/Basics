package Execute;

public class StringCalculations {

//	Input: A string equation that contains numbers, '+' and '*' 
//	Output: Result as int. 
//
//	For example: 
//	Input: 3*5+8 (as String) 
//	Output: 23 (as int)
	
	public static void StringCalculations(String inputString) {
		int sum = 0;
		String[] Pluses = inputString.split("+");
		for (String multString: Pluses)
		{
			String[] mults = multString.split("*");
		        int multAcc = 1;
			for (String num: mults)
		        {
				multAcc *= Integer.parseInt(num);
		        }
		        sum += multAcc;
		}
		System.out.println(sum);
	}
}
