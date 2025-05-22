package com.li.leetcode;

import java.util.*;

public class hot100_49字母异位词 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null)return null;
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String str:strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key=new String(charArray);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
}
