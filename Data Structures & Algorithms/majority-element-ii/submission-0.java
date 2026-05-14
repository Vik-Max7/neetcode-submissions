class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length; 
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0) + 1);
        }

        System.out.println(hm);

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() > n/3){
                list.add(entry.getKey());
            }    
        }

        return list;
    }
}