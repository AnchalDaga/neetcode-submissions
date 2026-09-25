class LRUCache {
    private final int capacity;
    private final Map<Integer,Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity,0.75f, true);
    }
    
    public int get(int key) {
        return this.cache.getOrDefault(key,-1);
        

        
    }
    
    public void put(int key, int value) {
        if(!this.cache.containsKey(key) && this.cache.size()>= this.capacity){
            
            int lrukey = this.cache.keySet().iterator().next();
            this.cache.remove(lrukey);

        }
        this.cache.put(key,value);
        
    }
}
