package Exc_18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exc_18
{
    public static void main(String[] args)
    {
        Map<String,String> map = new HashMap<>();
        map.put("Martin","123");
        map.put("Shit","234");
        map.put("Erik","789");
        map.put("Troels","123");
        map.put("Tino","2345");
        map.put("Mick Mick","234");
        System.out.println(map);
        System.out.println(reverse(map));
    }

    public static Map<String,Set<String>> reverse(Map<String,String> map)
    {
        Map<String,Set<String>> reverseMap = new HashMap<>();
        /*
        //Løber mappet igennem og gemmer valuen i en string
        //Kunne også sagtens være direkte på keys via keysettet.
        for(Map.Entry<String,String> e: map.entrySet())
        {
            String value = e.getValue();
            Set<String> keys = new HashSet<>();
            //Løber hele mappet igennem og smider alle keys
            //ind i et set, hvis valuen matcher den givne
            for(String s: map.keySet())
            {
                if(map.get(s).equals(value))
                {
                    keys.add(s);
                }
            }
            //Tilføjer entryet med det gemte set og valuen
            //som nu bliver keyen, til mappet
            reverseMap.put(value,keys);
        }
        return reverseMap;
        */
        for(Map.Entry<String,String> e: map.entrySet())
        {
            if(reverseMap.containsKey(e.getValue()))
            {
                Set<String> set1 = reverseMap.get(e.getValue());
                set1.add(e.getKey());
                reverseMap.put(e.getValue(),set1);
            } else
            {
                Set<String> set2 = new HashSet<>();
                set2.add(e.getKey());
                reverseMap.put(e.getValue(),set2);
            }
        }
        return reverseMap;
    }

}
