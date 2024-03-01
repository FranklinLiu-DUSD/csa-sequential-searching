/*
 * Activity 3.7.5
 */
public class SimpleSearch
{
  public static void main(String[] args)
  {
    int[] primeUnder50 = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
    
    int numToSearchFor = UserInput.getInt();
    
    for(int i = 0; i < primeUnder50.length; i++)
    {
      if (primeUnder50[i] == numToSearchFor)
      {
        System.out.print(numToSearchFor + " was found at index " + i);
      }
    }
    
  }
}