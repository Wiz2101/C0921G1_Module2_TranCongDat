package bai11_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien;

import case_study.models.Person;

import java.util.Map;
import java.util.TreeMap;

public class CountOccurrences {
    public static void main(String[] args) {
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        String string = "CodeGym Da Nang";
        for (int i = 0; i < string.length(); i++) {
            if (treeMap.get(string.charAt(i)) == null){
                treeMap.put(Character.toLowerCase(string.charAt(i)),1);
            } else {
                treeMap.replace(string.charAt(i), treeMap.get(string.charAt(i)) + 1);
            }
        }
        for (Map.Entry<Character,Integer> entry : treeMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

//          Ví dụ về cách duyệt MAP
//        Map<Integer, String> map = new TreeMap<>();
//        map.put(1,"a");
//        map.put(2,"b");
//        map.put(3,"c");
//
//        for (Map.Entry<Integer,String> entry:map.entrySet()){
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
//
//        for (Integer key:map.keySet()){
//            System.out.println(key + " - " + map.get(key));
//        }
    }
}
