class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String str: strs) {
            result.append(str.length()).append("#").append(str);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i<str.length()) {
            int j = i;
            // find the delimantor #
            while (str.charAt(j) != '#') j++;
            // extract the length of string
            int length = Integer.parseInt(str.substring(i,j));
            // move to the first char in the string
            i = j + 1;
            result.add(str.substring(i,length+i));
            i += length;
        }
        return result;
    }
}
