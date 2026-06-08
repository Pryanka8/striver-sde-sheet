// Subsets 2 : Given an integer array nums that may contain duplicates, return all possible subsets (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.
class DayFive {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(nums);
        // Have or not have 
        subsetArr(nums , temp , 0 , ans);
        return ans;
    }

    private void subsetArr(int[] nums ,List<Integer>temp , int ind ,List<List<Integer>> ans){
      ans.add(new ArrayList(temp));
      for(int i = ind ; i < nums.length ; i++){
            if(i != ind && nums[i]==nums[i-1])continue;
            temp.add(nums[i]);
            subsetArr(nums, temp , i+1 , ans);
            temp.remove(temp.size()-1);
        }
    }
}