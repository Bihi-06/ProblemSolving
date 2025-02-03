public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap to store groups of anagrams
        // Key: A string representation of character frequency
        // Value: List of words that are anagrams
        Map<String, List<String>> res = new HashMap<>();

        // Iterate through each word in the input array
        for (String s : strs) {
            // Create an array to store the frequency of each character (a-z)
            int[] count = new int[26];

            // Count occurrences of each character in the current word
            for (char c : s.toCharArray()) {
                count[c - 'a']++; // Convert character to an index (0-25) and increment count
            }

            // Convert the frequency array into a unique string key
            // Example: "tea", "eat", "ate" will have the same key
            String key = Arrays.toString(count);

            // If the key is not already in the map, initialize a new list
            res.putIfAbsent(key, new ArrayList<>());

            // Add the current word to the corresponding anagram group
            res.get(key).add(s);
        }

        // Return the grouped anagrams as a list of lists
        return new ArrayList<>(res.values());
    }
}
