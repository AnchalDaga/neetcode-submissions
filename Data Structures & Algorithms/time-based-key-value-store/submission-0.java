class TimeMap {
    Map<String, TreeMap<Integer,String>> map;

    public TimeMap() {
        map = new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> inside = map.getOrDefault(key, new TreeMap<Integer,String>() );
        inside.put(timestamp,value);
        map.put(key,inside);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        TreeMap<Integer,String> inside = map.get(key);
        Map.Entry<Integer,String> entry = inside.floorEntry(timestamp);
        return entry == null ? "": entry.getValue();
    }
}
