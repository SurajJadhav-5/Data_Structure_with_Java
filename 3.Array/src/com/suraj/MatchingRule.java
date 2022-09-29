package com.suraj;
//https://leetcode.com/problems/count-items-matching-a-rule/
//https://leetcode.com/problems/count-items-matching-a-rule/
public class MatchingRule {
    public static void main(String[] args){
        String[][] items = {
                {"phone","silver","pixel"},
                {"computer","silver","lenovo"},
                {"phone","silver","iphone"}
        };
        String ruleKey = "type";
        String ruleValue = "phone";

        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    static int countMatches(String[][] items, String ruleKey, String ruleValue){
        int count =0;
        for (int i= 0; i< items.length; i++){

            if(ruleKey == "type"){
                if(items[i][0]==ruleValue)
                    count ++;
            }
                else if(ruleKey == "color"){
                if(items[i][1]==ruleValue)
                    count ++;
            }
            else if(ruleKey == "name"){
                if(items[i][2]==ruleValue)
                    count ++;
            }

            }
        return count;

    }
}
