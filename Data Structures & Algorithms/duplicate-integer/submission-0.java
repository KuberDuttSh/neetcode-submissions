class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i,j,n=nums.length;
        int[] arr = nums;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}