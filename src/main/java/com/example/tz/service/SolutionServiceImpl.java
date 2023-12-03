package com.example.tz.service;

import org.springframework.stereotype.Service;

import java.util.*;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;

@Service
public class SolutionServiceImpl implements SolutionService{

    @Override
    public String solve(String input) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character num : input.toCharArray()) map.put(num, map.getOrDefault(num, 0) + 1);

        List<Character>[] buckets = new List[input.toCharArray().length + 1];

        for(Character c: map.keySet()){
            int frequency = map.get(c);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(c);
        }

        StringBuilder ans = new StringBuilder();
        for (int i=input.toCharArray().length; i>=0;i--){
            if (buckets[i] == null){
                continue;
            }
            for (Character c: buckets[i]){
                ans.append(c).append(":").append(i).append(" \n");
            }
        }
        return ans.toString();
    }

}
