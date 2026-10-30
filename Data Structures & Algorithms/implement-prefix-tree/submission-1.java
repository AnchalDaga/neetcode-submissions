class TrieNode{

    TrieNode trieNode[];
    boolean wordend;
    TrieNode(){
        trieNode = new TrieNode[26];
        wordend = false;
    }
    boolean containsChar(char ch){
        if (trieNode[ch-'a']!= null){
            return true;
        }
        return false;

    }
    void add(char ch){
        trieNode[ch - 'a'] = new TrieNode();
    }

    TrieNode getChar(char ch){
        return trieNode[ch-'a'];
    }
    void markEng(){
        wordend = true;
    }
    boolean isWord(){
        return wordend;
    }    
}


class PrefixTree {
    TrieNode root;

    public PrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode temp = root;
        for(char ch:word.toCharArray()){
            if(!temp.containsChar(ch)){
                temp.add(ch);
            }
            temp = temp.getChar(ch);
        }
        temp.wordend = true;
    }

    public boolean search(String word) {
        TrieNode temp = root;
        for(char ch:word.toCharArray()){
            if(!temp.containsChar(ch)){
                return false;
            }
            temp = temp.getChar(ch);
        }
        return temp.isWord();

    }

    public boolean startsWith(String prefix) {
        TrieNode temp = root;
        for(char ch:prefix.toCharArray()){
            if(!temp.containsChar(ch)){
                return false;
            }
            temp = temp.getChar(ch);
        }
        
        if(temp != null) return true;

        return false;
    }
}
