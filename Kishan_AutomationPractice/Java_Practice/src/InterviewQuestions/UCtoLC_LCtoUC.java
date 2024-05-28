package InterviewQuestions;

public class UCtoLC_LCtoUC {

	public static void main(String[] args) {
		String str = "HELLO STRING, what are you doing here ";
		StringBuilder converted = new StringBuilder();
		
		for(char c: str.toCharArray())
		{
			if(Character.isLowerCase(c))
			{
				converted.append(Character.toUpperCase(c));
			}
			else if(Character.isUpperCase(c))
			{
				converted.append(Character.toLowerCase(c));
			}
			else {
				converted.append(c);
			}
		}
		System.out.println(converted.toString());

	}

}
