/*
 * @lc app=leetcode.cn id=706 lang=java
 *
 * [706] 设计哈希映射
 */

// @lc code=start
class MyHashMap {
    int[] arr;
    boolean[] isVisited;
    /** Initialize your data structure here. */
    public MyHashMap() {
        arr = new int[1000001];
        isVisited = new boolean[1000001];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        arr[key] =value;
        isVisited[key] = true;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(!isVisited[key]){
            return -1;
        } else{
            return arr[key];
        }
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        isVisited[key] = false;
    }
}

// class MyEntry<K,V>{
//     K key;
//     V value;
//     MyEntry(K key, V value){
//         this.key = key;
//         this.value = value;
//     }
// }

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
// @lc code=end

