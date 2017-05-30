/**
 * 
 */

/**
 * @author shemesha
 *
 */
public class StringProblem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Question1.unique("word"));
		System.out.println(Question1.unique("shemesha"));

	}

}
class Question1
{
	//This question asks - Implement an algorithm to determine if a string has all unique characters.
	//What if you cannot use any data structures	
	public static boolean unique(String word)
	{
		for(int x=0; x<word.length(); x++)
		{
			for(int y=x+1; y<word.length(); y++)
			{
				if(word.charAt(x)==word.charAt(y))
					return false;
			}
		}
		return true;
	}


}


