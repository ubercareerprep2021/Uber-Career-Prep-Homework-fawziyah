package com.uberCareerPrepFawziyah;
/*
@Author: Fawziyah Alebiosu
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class partOne {
    public static boolean isStringPermutation(String first, String second){
        //permutation means no addition or deletion basically
        HashMap<Character,Integer> frequencyTracker = new HashMap<>();
        boolean isPermutation = false;

        if(first.length() != second.length()){
            return isPermutation;
        }
        else{
            addItemsToTracker(frequencyTracker, first);
            //check for addition by seeing if any items exist in second that ARE not in hashmap
            for(int i = 0; i <second.length(); i++){
                Character current = second.charAt(i);
                if(frequencyTracker.containsKey(current)){
                    //checking for addition
                    frequencyTracker.put(current, frequencyTracker.get(current) -1);
                    if(frequencyTracker.get(current) == 0){
                        frequencyTracker.remove(current);
                    }
                }
                else{
                    return isPermutation;
                }
            }
            //checking for deletion
            if(frequencyTracker.size()!= 0){
                return isPermutation;
            }
        }
        isPermutation = true;
        return isPermutation;
    }

    public  static void addItemsToTracker(HashMap<Character, Integer> frequencyTracker, String first) {
        for(int i = 0; i < first.length(); i++){
            Character current = first.charAt(i);
            if(frequencyTracker.containsKey(current)){
                frequencyTracker.put(current, (frequencyTracker.get(current)+1));
            }
            else{
                frequencyTracker.put(first.charAt(i), 1);
            }
        }
    }
    public static List<List<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        for(int firstPointer = 0; firstPointer <inputArray.size(); firstPointer++){
            int secondPointer = firstPointer +1;
            while(secondPointer != inputArray.size()){
                int potentialSum = inputArray.get(firstPointer) + inputArray.get(secondPointer);
                if(potentialSum == targetSum){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(inputArray.get(firstPointer));
                    temp.add(inputArray.get(secondPointer));
                    result.add(temp);
                }
                secondPointer++;
            }
        }
        return result;
            }




    public static void main(String[] args) {
        List<Integer> input = new ArrayList<Integer>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);

        System.out.println(pairsThatEqualSum(input,5));
        System.out.println(pairsThatEqualSum(input,1));
        System.out.println(pairsThatEqualSum(input,7));


        assert true: isStringPermutation("asdf", "fsda");
       assert false: isStringPermutation("asdf", "fsa");
       assert false: isStringPermutation("asdf", "fsax");

    }
}
