import java.util.Arrays;

class Main {
  /*
    Given an int[] input, how many numbers in the array are less than
    the current number? ie, for input[i] how many other input[n] are
    less than input[i]?
  */

  public static void main(String[] args){
    int[] input = new int[]{8,1,2,2,3};
    System.out.println(Arrays.toString(findNumsSmallerThanCurrent(input)));
  }

  public static int[] findNumsSmallerThanCurrent(int[] nums){
    int[] result = new int[nums.length];
    int[] count = new int[101];
    
    // TODO: what?  
    for(int num : nums) {
      count[num]++;
    }

    for(int i = 1; i < count.length; i++){
      count[i] += count[i-1];
    }
  
    for(int j = 0; j < nums.length; j++){
      result[j] = (nums[j] == 0) ? 0 : count[nums[j] - 1];
    }
    
    return result;
  }
}
