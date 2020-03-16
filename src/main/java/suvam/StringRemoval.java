package suvam;

/**
 * Given two string arguments s1, s2
 * return a string removing s2 from s1 ignoreCase
 * return "N/A" if s2 is not found in s1
 *
 * eg. s1 = "HelloWorld", s2 = "World" => "Hello"
 *  s1 = "JustDoIt", s2 = "do" => "JustIt"
 *  s1 = "DoesntContain", s2 = "this" => "N/A"
 */

public class StringRemoval {

//  Scanner scanner = new Scanner(System.in);
//
//  System.out.println("Enter the string:");
//  String strOne = scanner.nextLine();
//
//  System.out.println("Enter the string to be removed:");
//  String strTwo = scanner.nextLine();

  public String remove(String strOne, String strTwo) {

    int ret = indexReturn(strOne, strTwo);

    int startIndex = ret;
    int lastIndex = ret + strTwo.length();

    int secondIndex = ret + strTwo.length();

    String finder = strOne.substring(startIndex, lastIndex);

    String finalString;

    if (finder.equalsIgnoreCase(strTwo))
    {
      finalString = strOne.substring(0, startIndex) + strOne.substring(secondIndex, strOne.length());
      return finalString;
    }
    else
      {
      return "No Match Found";
    }
  }

  public int indexReturn(String strOne, String strTwo)
  {
      int index = 0;

      for (int i = 0; i < strOne.length() - 1; i++) {
        for (int j = 0; j < strTwo.length(); j++) {
          if (Character.toUpperCase(strOne.charAt(j)) == Character.toUpperCase(strTwo.charAt(i))) {
            index = i;
            break;
          }
        }
      }
      return index;
    }

  }






