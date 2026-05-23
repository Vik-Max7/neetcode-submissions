class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        if(nums.length < 4){
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        //Set<List<Integer>> lists = new HashSet<>();
        List<List<Integer>> lists = new ArrayList<>();
        for(int i = 0; i < nums.length - 3; i++){
            if(i > 0 && nums[i] == nums[i-1])continue;
            for(int j=i+1; j < nums.length - 2; j++){
                if(j > i + 1 && nums[j] == nums[j-1])continue;
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
                        while (l < r && nums[l] == nums[l - 1]) l++;
                        while (l < r && nums[r] == nums[r + 1]) r--;
                    }
                }
            }
        }

        return lists;
    }
}