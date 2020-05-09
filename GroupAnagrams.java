//Given an array of strings, group anagrams together.

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unchecked")

class GroupAnagrams {

    public static void main(String[] args) {
      GroupAnagrams myInstance = new GroupAnagrams();
      String[] stringlist = {"eat", "tea", "tan", "ate", "nat", "bat"};
      myInstance.groupAnagrams(stringlist);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
      if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }

        for (Map.Entry entry : ans.entrySet()) {
          System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        return new ArrayList(ans.values());
    }
}
