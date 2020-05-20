import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=146 lang=java
 *
 * [146] LRU缓存机制
 * LRU （Least Recently Used）缓存机制
 * - 在缓存满的时候，删除缓存里最久未使用的数据，然后再放入新元素；
 * - 数据的访问时间很重要，访问时间距离现在最近，就最不容易被删除。
 * - 每次数据put和get的时候最近的访问时间需要更新
 */

// @lc code=start
class LRUCache {
    int capacity;
    LinkedHashMap<Integer, Integer> map;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>();
    }

    public int get(int key) {
        if(map.containsKey(key)){
            int val = map.get(key);
            map.remove(key);
            map.put(key, val);
            return val;
        }else{
            return -1;
        }
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.remove(key);
        } else if(map.size()==capacity){
            Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
            it.next();
            it.remove();
        }
        map.put(key, value);
    }
    // PriorityQueue + HashMap效率较低，8.71%， 100%
//     HashMap<Integer, Integer> map;
//     PriorityQueue<Helper> queue;
//     final int capacity;
//     int size = 0;
//     public LRUCache(int capacity) {
//         this.map = new HashMap<>();
//         this.queue = new PriorityQueue<Helper>();
//         this.capacity = capacity;
//     }
    
//     public int get(int key) {
//         if(map.containsKey(key)){
//             Iterator<Helper> it = queue.iterator();
//             while(it.hasNext()){
//                 Helper h = it.next();
//                 if(h.key == key){
//                     it.remove();
//                     break;
//                 }
//             }
//             queue.add(new Helper(key));
//             return map.get(key);
//         } else{
//             return -1;
//         }
//     }
    
//     public void put(int key, int value) {
//         if(map.containsKey(key)){
//             map.put(key, value);
//             Iterator<Helper> it = queue.iterator();
//             while(it.hasNext()){
//                 Helper h = it.next();
//                 if(h.key == key){
//                     it.remove();
//                     break;
//                 }
//             }
//             queue.add(new Helper(key));
//         } else{
//             if(size>=capacity){
//                 map.remove(queue.poll().key);
//                 size--;
//             }
//             map.put(key, value);
//             size++;
//             Helper h = new Helper(key);
//             queue.add(h);
//         }
//     }

// }

// class Helper implements Comparable<Helper>{
//     int key;
//     long time;

//     public Helper(int key){
//         this.key = key;
//         this.time = System.nanoTime();
//     }

//     @Override
//     public int compareTo(Helper o) {
//         return this.time-o.time<0?-1:(this.time-o.time==0?0:1);
//     }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

