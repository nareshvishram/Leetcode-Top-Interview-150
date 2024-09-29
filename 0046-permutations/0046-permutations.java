class Solution {
    List<List<Integer>> res;

    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        bt(nums, new ArrayList<>());
        return res;
    }

    private void bt(int[] nums, List<Integer> tmp) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (tmp.contains(nums[i]))
                continue;
            tmp.add(nums[i]);
            bt(nums, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}