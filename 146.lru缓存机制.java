import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.TreeMap;

/*
 * @lc app=leetcode.cn id=146 lang=java
 *
 * [146] LRU缓存机制
 */

// @lc code=start
class LRUCache {
    int[] arr;
    final int capacity;
    int size =0;
    HashMap<Integer,Integer> index = new HashMap();
    TreeMap<Integer, Integer> count = new TreeMap<>((o1, o2)->o1.intValue()-o2.intValue());
    Deque<Integer> availabe = new ArrayDeque<>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        for(int i = 0; i<capacity; i++){
            availabe.add(i);
        }
        
    }
    
    public int get(int key) {
        if(index.containsKey(key)){

        } else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(!availabe.isEmpty()){

        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

