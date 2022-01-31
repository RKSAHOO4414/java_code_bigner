class Test
{
	char ch=65;
	char ch1='A';
	if(ch=ch1)
		System.out.println("true");
	else
		System.out.println("false");
	String text = "java is simple 1.8 jdk is latest";
	int digit=0, let=0, upper=0, lower=0, space=0;
	for (int i=0; i<text.length(); i++) 
	{
	 	char letter = text.charAt(i);
	 	if(Character.isDigit(letter))
	 		digit++;
	 	if(Character.isLetter(letter))
	 		let++;
	 	if(Character.isUpper(letter))
	 		upper++;
	 	if(Character.isLower(letter))
	 		lower++;
	 	if(Character.isWhiteSpace(letter))
	 		space++;
	}
	System.out.println(text);
	System.out.println("no. of letter is:" +let);
	System.out.println("no. of uppercase is:" +upper);
	System.out.println("no. of lowercase is:" +lower);
	System.out.println("no. of digit is:" +digit);
	System.out.println("no. of space is:" +space);
}