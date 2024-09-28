class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0)
            return res;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] + a[1] - b[0] - b[1]);
        for (int n1 : nums1)
            pq.add(new int[] { n1, nums2[0], 0 });
        while (k-- > 0 && !pq.isEmpty()) {
            int[] current = pq.poll();
            int n1=current[0],n2=current[1],idx=current[2];
            res.add(new ArrayList<>(Arrays.asList(n1, n2)));
            if (idx == nums2.length-1)
                continue;
            pq.add(new int[] { n1, nums2[idx + 1], idx + 1 });
        }
        return res;
    }
}