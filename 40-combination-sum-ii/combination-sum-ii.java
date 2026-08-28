class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        gen(0, target, candidates, curr, ans);

        return ans;
    }

    void gen(int st, int targ, int[] can,
             List<Integer> curr, List<List<Integer>> ans) {

        if (targ == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (targ < 0) {
            return;
        }

        for (int i = st; i < can.length; i++) {

            // Skip duplicate combinations
            if (i > st && can[i] == can[i - 1]) {
                continue;
            }

            // choose
            curr.add(can[i]);

            // explore
            gen(i + 1, targ - can[i], can, curr, ans);

            // undo choice = backtrack
            curr.remove(curr.size() - 1);
        }
    }
}