public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3,2,2};
        int val = 3;

        for(int i : nums){
            System.out.print(i + "");
        }

        int k = removeElement(nums, val);
        System.out.println("");
        System.out.println(k);
        for(int i : nums){
            System.out.print(i + "");
        }
    }

    public static int removeElement(int[] nums, int val) {

        if(nums.length==0){
            return 0;
        }

        int instances = 0;


        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j]!=val) {
                i++;
                int k = nums[j];
                nums[j] = nums[i];
                nums[i] = k;
                }
            }

        if(nums[0]==val){
            for(int m = nums.length-1; m > 0; m--) {
                if (nums[m] != val) {
                    int k = nums[m];
                    nums[0] = k;
                    nums[m] = val;
                    break;
                }
            }
        }


        for(int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                instances++;
            }
        }


        return instances;

    }
}