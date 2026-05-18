class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> m = new HashMap<>();

         for(String s : strs){
            char[] cArray = s.toCharArray();
            Arrays.sort(cArray);

            String st = new String(cArray);
            m.putIfAbsent(st, new ArrayList<>());
            m.get(st).add(s);

         }
         return new ArrayList<>(m.values());
    }
}
