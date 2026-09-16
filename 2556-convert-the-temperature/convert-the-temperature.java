class Solution {
    public double[] convertTemperature(double celsius) {
        double faher = 32.00;
        double kelv =273.15;
        double arr[] = new double[2];
        arr[0] =kelv+celsius;
        arr[1] = (celsius*1.80)+faher;
        return arr;
    }
}