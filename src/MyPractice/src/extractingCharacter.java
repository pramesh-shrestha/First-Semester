public class extractingCharacter
{
  public static String disemvowel(String str) {
    String stri = "";
    for(int i = 1; i <= str.length(); i++){
      if(Character.toLowerCase(str.charAt(i)) == 'a' || Character.toLowerCase(str.charAt(i)) == 'e' ||
          Character.toLowerCase(str.charAt(i)) == 'i' || Character.toLowerCase(str.charAt(i)) == 'o' ||
          Character.toLowerCase(str.charAt(i)) == 'u'){
        continue;
      }
      else {
        stri += i;
      }
    }
    return stri;
  }
}
