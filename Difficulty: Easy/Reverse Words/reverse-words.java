class Solution {
    public String reverseWords(String s) {

        String[] parts = s.split("\\.");
        List<String> words = new ArrayList<>();
        
        for (String part : parts) {
            if (!part.isEmpty()) {
                words.add(part);
            }
        }
        
        Collections.reverse(words);
        
        return String.join(".", words);
    }
}