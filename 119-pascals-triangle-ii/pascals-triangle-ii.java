


class Solution {
    public List<Integer> getRow(int rowIndex) {
        return ncr(rowIndex + 1);
    }

    public List<Integer> ncr(int row) {
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        long ans = 1;

        for (int i = 1; i < row; i++) {
            ans = ans * (row - i);
            ans = ans / i;
            temp.add((int) ans);
        }

        return temp;
    }
}
