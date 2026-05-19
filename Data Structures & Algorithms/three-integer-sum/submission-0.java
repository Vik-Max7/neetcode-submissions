class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //HashMap<Integer,Integer> hm = new HashMap<>();
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<nums.length-1; i++){
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int j=i+1; j<nums.length; j++){
                int val = 0 - nums[i] - nums[j];
                if(hm.containsKey(val)){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(val);

                    Collections.sort(list);
                    set.add(list);
                }
                else{
                    hm.put(nums[j],j);
                }
            }
            
        }

        return new ArrayList(set);
    }
}
