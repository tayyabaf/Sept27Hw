package ch12b_optionalexersize;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//make new maps from methods
        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeupGrades = TestResults.getMakeUpGrades();
//new hashmap to store final grades
        Map<String, Integer> finalGrades = new HashMap<>();

//for loop to iterate through makeupGrades map
        for(Map.Entry<String, Integer> entry : makeupGrades.entrySet() ){
//make Integer variables to store the scores of original & makeup scores
            Integer originalScore = originalGrades.get(entry.getKey());
            Integer makeupScore = makeupGrades.get(entry.getKey());

/*check if original score is less than makeup score. if so, set makeup
 score as value of finalGrades map. otherwise, keep original score and
 set that as the value of finalGrades map*/
            if(originalScore<makeupScore){
                finalGrades.put(entry.getKey(), makeupScore);
            }else{
                finalGrades.put(entry.getKey(), originalScore);
            }
        }

//print out the finalGrades map
        System.out.println(finalGrades);
    }
}
