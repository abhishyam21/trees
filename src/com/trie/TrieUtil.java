package com.trie;

import java.util.Map;

/**
 * Created by Rachana Rao on 12/28/2016.
 */
public class TrieUtil {

    private TrieNode root;

    public TrieUtil(){
        root = new TrieNode();
    }

    public void insert(String string) {
        Map<Character, TrieNode> trieNodeMap = this.root.childs;
        int i = 0;
        for (; i < string.length(); i++) {
            Character c = string.charAt(i);
            //Need to insert the element
           TrieNode trieNode = trieNodeMap.computeIfAbsent(c, k -> new TrieNode());
           trieNodeMap = trieNode.childs;
            if(string.length()-1 == i)
                trieNode.isEndOfString = true;
        }
    }

    public boolean search(String string) {
        Map<Character, TrieNode> childNode = this.root.childs;
        TrieNode trieNode = null;
        for (int j = 0; j < string.length(); j++) {
            Character c = string.charAt(j);
            trieNode = childNode.get(c);
            if(trieNode == null) return false;
            childNode = trieNode.childs;
        }
        return trieNode.isEndOfString;
    }

    public TrieNode getRoot() {
        return root;
    }

}
