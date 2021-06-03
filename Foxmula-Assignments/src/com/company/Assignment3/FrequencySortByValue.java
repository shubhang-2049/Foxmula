package com.company.Assignment3;

import java.util.*;

class SorterByValue implements Comparator<Integer>
{
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    public SorterByValue(HashMap<Integer, Integer> map){
        this.map.putAll(map);
    }
    @Override
    public int compare(Integer k1, Integer k2) {
        if(map.get(k1) >= map.get(k2)){
            return -1;
        }else{
            return 1;
        }
    }
}
//class Sorter {
//    public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
//        Comparator<K> valueComparator = new Comparator<K>() {
//                    public int compare(K k1, K k2) {
//                        int compare = map.get(k1).compareTo(map.get(k2));
//                        if (compare == 0)
//                            return 1;
//                        else
//                            return compare;
//                    }
//                };
//
//        Map<K, V> sortedByValues =
//                new TreeMap<K, V>(valueComparator);
//        sortedByValues.putAll(map);
//        return sortedByValues;
//    }
class FrequencySortByValue {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            int key=scanner.nextInt();
            if(map.containsKey(key)) map.put(key,map.get(key)+1);
            else map.put(key,1);
        }
        System.out.println(map);
        TreeMap<Integer, Integer> sortedMap = sortMapByValue(map);
        System.out.println(sortedMap);
    }

    public static TreeMap<Integer, Integer> sortMapByValue(HashMap<Integer, Integer> map){
        Comparator<Integer> comparator = new SorterByValue(map);
        TreeMap<Integer, Integer> result = new TreeMap<Integer, Integer>(comparator);
        result.putAll(map);
        return result;
    }
}

