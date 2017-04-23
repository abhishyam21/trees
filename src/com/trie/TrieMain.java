package com.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by Rachana Rao on 12/28/2016.
 */
public class TrieMain {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("zebra","dog","duck","dove");
        TrieUtil trieNode = new TrieUtil();
        strings.forEach(trieNode::insert);

        System.out.println("caba-->"+ trieNode.search("caba"));
        ArrayList<String> result = new ArrayList<>();
        strings.forEach(node ->{
            Map<Character, TrieNode> root = trieNode.getRoot().childs;
            int i=0;
            StringBuilder prefix = new StringBuilder();
            Character c= node.charAt(i);
                while (root.containsKey(c) && root.entrySet().size()>1){
                    prefix.append(c);
                    root = root.get(c).childs;
                    i++;
                    if(i< node.length())
                    c= node.charAt(i);
                }
                result.add(prefix.toString());
        }
        );

        result.forEach(System.out::println);
    }
}
