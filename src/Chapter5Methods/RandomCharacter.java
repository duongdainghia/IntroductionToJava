package Chapter5Methods;

public class RandomCharacter {
	/** Generate a random character between ch1 and ch2 */
	public static char getRandomCharacter(char ch1, char ch2)
	{
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	public static char getRandomLowerCaseLetter()
	/** Generate a random lowercase letter */
	{
		return getRandomCharacter('a', 'z');
	}
	public static char getRandomUpperCaseLetter()
	/** Generate a random uppercase letter */
	{
		return getRandomCharacter('A', 'Z');
	}
	public static char getRandomDigitCharacter()
	/** Generate a random digit character */
	{
		return getRandomCharacter('0', '9');
	}
	 public static char getRandomCharacter()
	/** Generate a random character */
	{
		 return getRandomCharacter('\u0000', '\uFFFF');
	}
}
