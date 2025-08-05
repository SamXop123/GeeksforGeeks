// User function Template for Java
class Solution {
    public static ArrayList<ArrayList<Integer>> evenOdd(ArrayList<Integer> list) {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        
        for (Integer num : list) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(evenList);
        result.add(oddList);
        
        return result;
    }
}