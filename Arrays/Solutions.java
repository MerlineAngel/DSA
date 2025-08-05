//maximum minimum in an array
class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        Arrays.sort(arr);
        int maximum=arr[arr.length-1],minimum=arr[0];
        
        return new Pair<>(minimum,maximum);
    }
}
