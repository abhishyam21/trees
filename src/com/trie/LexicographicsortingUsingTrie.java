package com.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by Rachana Rao on 4/23/2017.
 */
public class LexicographicsortingUsingTrie {
    public static void main(String[] args) {
        String dict[] =
                {
                        "lexicographic", "sorting", "of", "a", "set", "of", "keys", "can",
                        "be", "accomplished", "with", "a", "simple", "trie", "based",
                        "algorithm", "we", "insert", "all", "keys", "in", "a", "trie",
                        "output", "all", "keys", "in", "the", "trie", "by", "means", "of",
                        "preorder", "traversal", "which", "results", "in", "output", "that",
                        "is", "in", "lexicographically", "increasing", "order", "preorder",
                        "traversal", "is", "a", "kind", "of", "depth", "first", "traversal"
                };
        List<String> a = new ArrayList<>(Arrays.asList(dict));
        LexicographicsortingUsingTrie trie = new LexicographicsortingUsingTrie();
        trie.lexicographicOrder(a);
    }

    /**
     * Trie based sorting of the given strings.
     * Here we will do the pre-order traversal of the trie.
     *
     * @param a
     */
    private void lexicographicOrder(List<String> a) {
        TrieUtil trieUtil = new TrieUtil();
        //insert each node into string
        a.forEach(trieUtil::insert);
        StringBuilder sb = new StringBuilder();
        preOrderTraversal(trieUtil.getRoot(), sb);
    }

    /**
     * This is the method to traverse the string in pro order
     *
     * @param root
     * @param sb
     */
    private void preOrderTraversal(TrieNode root, StringBuilder sb) {
        //return if the trie is empty
        if (root == null) return;
        //if the node is end of the string, then print it
        if (root.isEndOfString) {
            System.out.println(sb.toString());
        }
        Map<Character, TrieNode> childs = root.childs;
        //loop for every children
        for (Map.Entry<Character, TrieNode> entity : childs.entrySet()) {
            sb.append(entity.getKey());//append the character
            preOrderTraversal(entity.getValue(), sb);
            sb.deleteCharAt(sb.length() - 1);//remove the last character
        }
    }
}
