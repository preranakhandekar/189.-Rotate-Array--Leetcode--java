class Solution {
    void rotate(int[] num,int li,int hi){
        while(li<hi){
        int temp=num[li];
        num[li]=num[hi];
        num[hi]=temp;
        hi--;
        li++;
        }
    }
    public void rotate(int[] nums, int k) {
       int n=nums.length;
        k=k%n;
        rotate(nums,0,n-k-1);
        rotate(nums,n-k,n-1);
        rotate(nums,0,n-1);
    }
}
