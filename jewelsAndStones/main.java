import java.util.HashMap;

class Main {
  /*
    Given two strings, jewels and stones, how many of the "stones"
    are also "jewels"? Each char in String jewels is a separate jewel.
  */

  public static void main(String[] args) {
    String jewels1 = "aAc";
    String stones1 = "aAAbAaaCCcflkjwFFccAAAbbb";

    System.out.println(numJewelsInStones(jewels1, stones1));  
  }

  public static int numJewelsInStones(String jewels, String stones) {
    HashMap<Character, Integer> stoneCount = new HashMap<>();
    int jewelCount = 0;

    for(char stone : stones.toCharArray()) {
      stoneCount.put(stone, stoneCount.getOrDefault(stone, 0) + 1);
      System.out.println(stoneCount);
    }

    for(char jewel : jewels.toCharArray()) {
      jewelCount += stoneCount.getOrDefault(jewel, 0);
      System.out.println(jewelCount);
    }

    return jewelCount;
  }
}
