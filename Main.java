/* Java program to sort a given binary array(array will only consist 0's and 1's) in linear times.
Linear time: An algorithm is said to take linear time, or O(n) time, if its time complexity is O(n). 
Example:
Input :
b_nums[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 }
Output:
After sorting: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
*/
import java.util.Arrays;
public class Main {
    public static int[] sorting_1_and_0(int[] nums){
        //Using two indexes to traverse Method.
        int frontPointer=0,rearPointer=nums.length -1;
        while(frontPointer<rearPointer){
            if(nums[frontPointer]==1){
                while(frontPointer < rearPointer){
                    if(nums[rearPointer]==0){
                        int temp = nums[frontPointer];
                        nums[frontPointer]=nums[rearPointer];
                        nums[rearPointer]=temp;
                        break;
                    }
                    rearPointer--;
                
                }
            }
            frontPointer++;
        }
        return nums;

    }
    public static void main(String[] args) {
        System.out.println("Compile by Shubham Singh Rawat");
        int b_nums[] ={0,1,1,0,1,1,0,1,0,0};
        int afterSort[]=sorting_1_and_0(b_nums);
        System.out.println(Arrays.toString(afterSort));
    }
}
