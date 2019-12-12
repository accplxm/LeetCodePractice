//给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。 
//
// 示例: 
//
// 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
//输出:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//] 
//
// 说明： 
//
// 
// 所有输入均为小写字母。 
// 不考虑答案输出的顺序。 
// 
// Related Topics 哈希表 字符串

package leetcode.editor.cn;

import java.util.*;

//java:字母异位词分组
public class P49GroupAnagrams {
    public static void main(String[] args) {
        Solution solution = new P49GroupAnagrams().new Solution();
        //TO TEST
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solution.groupAnagrams(str).toString());
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * @param strs:字符
         * @return
         */
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>(10);
            char[] ch;
            String tmpStr;
            for (String str : strs) {
                ch = str.toCharArray();
                Arrays.sort(ch);
                tmpStr = Arrays.toString(ch);
                if (map.containsKey(tmpStr)) {
                    map.get(tmpStr).add(str);
                } else {
                    List<String> list = new ArrayList<>();
                    list.add(str);
                    map.put(tmpStr, list);
                }
            }
            List<List<String>> list = new ArrayList<>();
            for (List value : map.values()) {
                list.add(value);
            }
            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}