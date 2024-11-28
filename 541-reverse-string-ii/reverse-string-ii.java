class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder modified = new StringBuilder();
        int length = s.length();
        for(int i=0; i<length; i+=2*k){
            String segment = s.substring(i, Math.min(i + 2 * k, length));
            StringBuilder reversePart = new StringBuilder(segment.substring(0, Math.min(k, segment.length())));
            reversePart.reverse();
            modified.append(reversePart);
            if(segment.length()>k){
                modified.append(segment.substring(k));
            }
        }
        return modified.toString();
    }
}