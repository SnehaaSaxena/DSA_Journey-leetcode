class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(int i:map.keySet()){
        //     if(map.get(i)==1)
        //      return i;
        // }
        // return -1;

        // MORE OPTIMIZED (XOR)
        int res=0;
        for(int num:nums){
            res^=num;
        }
        return res;
        //Property 1: Same Numbers XOR to Zero (a^a=0) like 5 in binary: 101, 101 XOR 101 result:  000 = 0
        //Property 2: XOR with Zero Returns the Original Number(a^0=a) like 5 in binary: 101, 101 XOR 000 =0
        //Property 3: Commutative Property (Order Doesn't Matter like a ^ b = b ^ a) 
        //Property 4: Associative Property (Grouping Doesn't Matter) (5 ^ 3) ^ 2 ,  5 ^ (3 ^ 2)
        // 0 ^ 2 ^ 1 ^ 2 ^ 3 ^ 1
        // = 0 ^ (2 ^ 2) ^ (1 ^ 1) ^ 3    ← Commutative & Associative
        // = 0 ^ 0 ^ 0 ^ 3                ← Same numbers = 0 (Numbers appearing twice cancel out becomes 0)
        // = 3                            ← Number with 0 = itself
    }
}