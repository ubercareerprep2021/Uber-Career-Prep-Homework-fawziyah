public class permutations{
    public static boolean isStringPermutation(String first, String second){
        if(first.length() != second.length()){
            return false;
        }
        else{
            int pointerForFirst = 0;
            int pointerForSecond = 0;

            while(pointerForFirst < first.length()){
                if(first.charAt(pointerForFirst) == second.charAt(pointerForSecond)){
                    pointerForFirst++;
                    pointerForSecond = 0;
                }
                else if(first.charAt(pointerForFirst)!= second.charAt(pointerForSecond)){
                    pointerForSecond++;
                }
                else if(first.charAt(pointerForFirst)!= second.charAt(pointerForSecond) && pointerForSecond == second.length() + 1){
                    return false;
                }

            }
        }
        return true;

        //that takes two Strings as parameters and returns a Boolean denoting whether the first string is a permutation of the second string.
        /*
        questions i have:
        do repeats count? if i have 123 and 1332, will it return true?
        if they are the same, can they still be a permutation of each other?
        input: string 1, string 2
        action:
        if they are not the same length, return false
          asdf fsda
             x    x
        put pointer on 0 of string1, and 0 of string 2
        while there's still chars to go through in string1:
          if pointers == each other, increment pointer for string 1, and reset pointer for string 2
          else increment pointer for string 2
          if pointers != each other AND we're on the last item in string 2, return false


         */
    }


/*
isStringPermutation(...)
Implement the function isStringPermutation() that takes two Strings as parameters and returns a Boolean denoting whether the first string is a permutation of the second string.
Go-Lang    func isStringPermutation(s1 string, s2 string) bool {}
Swift        func isStringPermutation(s1: String, s2: String) -> Bool {}
Python 3    def isStringPermutation(s1: str, s2: str) -> bool:
Java        public boolean isStringPermutation(String s1, String s2) {}
Below are some examples:
isStringPermutation(s1: “asdf”, s2: “fsda”) == true
isStringPermutation(s1: “asdf”, s2: “fsa”) == false
isStringPermutation(s1: “asdf”, s2: “fsax”) == false
pairsThatEqualSum(...)
Implement the function pairsThatEqualSum() that takes an array of integers and a target integer and returns an array of pairs (i.e., an array of tuples) where each pair contains two numbers from the input array and the sum of each pair equals the target integer. (Order of the output does not matter).
Go-Lang    func pairsThatEqualSum(inputArray []int, targetSum int) []int{}
Swift        func pairsThatEqualSum(inputArray: Array<Int>, targetSum: Int) -> Array<(Int, Int)> {}
Python 3    def pairsThatEqualSum(inputArray: list, targetSum: int) -> list:
Java        public List<List<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum) {}
Below are some examples:
pairsThatEqualSum(inputArray: [1, 2, 3, 4, 5], targetSum: 5) == [(1, 4), (2, 3)]
pairsThatEqualSum(inputArray: [1, 2, 3, 4, 5], targetSum: 1) == []
pairsThatEqualSum(inputArray: [1, 2, 3, 4, 5], targetSum: 7) == [(2, 5), (3, 4)]

 */
}
