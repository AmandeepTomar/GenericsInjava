package collectionsframeworks.maps;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LruCacheImplementation {


    public static void main(String[] args) {
        LruCacheImplementation impl = new LruCacheImplementation();
        impl.lruCacheImplementation();
    }

    private void lruCacheImplementation() {
        LruCache<String,String> lruCache = new LruCache<>(4);
        lruCache.put("A","a");
        lruCache.put("B","a");
        lruCache.put("C","a");
        lruCache.put("D","a");

        System.out.println(lruCache);
        lruCache.get("A");
        System.out.println(lruCache.recentlyUsedKeys);
        lruCache.get("B");
        System.out.println(lruCache.recentlyUsedKeys);
        lruCache.put("E","e");
        System.out.println(lruCache.recentlyUsedKeys);

    }


    class LruCache<K,V> extends  LinkedHashMap<K, V> {
        private final int capacity;
        private final List<K> recentlyUsedKeys;

        public LruCache(int capacity) {
            super(capacity, 0.75f, true);  // Use access order
            this.capacity = capacity;
            this.recentlyUsedKeys = new LinkedList<>();
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            // Override to control the removal of the least recently used item
            return size() > capacity;
        }

        @Override
        public V put(K key, V value) {
            V existingValue = super.put(key, value);
            if (existingValue == null) {
                recentlyUsedKeys.add(key);
            }
            return existingValue;
        }

        @Override
        public V get(Object key) {
            V value = super.get(key);
            if (value != null) {
                recentlyUsedKeys.remove(key);
                recentlyUsedKeys.add((K) key);
            }
            return value;
        }
    }
}
