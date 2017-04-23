package com.trie;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rachana Rao on 12/27/2016.
 */
public class TrieNode {

    Map<Character, TrieNode> childs;
    boolean isEndOfString;

    public TrieNode() {
        this.childs = new HashMap<>();
        this.isEndOfString = false;
    }

}
