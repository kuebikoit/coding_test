package suvam;

/**
 * Given string "str" remove duplicate characters ignoring case
 * eg. str = "abbccca" => "abc"
 * str = "HeLloOo" => "HeLo"
 * str = "Batmaan" => "Batmn"
 * str = "riverside" => "rivesd"
 *
 * Bonus points
 * Look hint in imports
 */
public class RemoveDuplicateCharacters {

//  public static String remove(String str) {
//    return null;
//  }

  public static void main(String[] args) {
    String str = "abbccca";
//    char temp[] = str.toCharArray();
//    Arrays.sort(temp);

for (int i = 0; i < str.length(); i++)
{
  for (int j =i+1; j<str.length(); j++)
  {
    if (str.charAt(i) == str.charAt(j))
    {
//      charRemove(str,j);
    }
  }
}


  }



}


