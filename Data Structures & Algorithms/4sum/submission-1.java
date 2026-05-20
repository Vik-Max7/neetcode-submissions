class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        if(nums.length < 4){
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        Set<List<Integer>> lists = new HashSet<>();
        for(int i = 0; i < nums.length - 3; i++){
            for(int j=i+1; j < nums.length - 2; j++){
                int l = j+1;
                int r = nums.length - 1;
                long minTar = (long)target - nums[i] - nums[j];
                while(l < r){
                    long sum = (long)nums[l] + nums[r];
                    if(sum < minTar){
                        l++;
                    }
                    else if(sum > minTar){
                        r--;
                    }
                    else{
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        lists.add(list);
                        l++;
                        r--;
                    }
                }
            }
        }

        return new ArrayList(lists);
    }
}