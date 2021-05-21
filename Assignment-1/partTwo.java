import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/*
pseudocode for minimum calculation taken from Stackoverflow post(https://stackoverflow.com/questions/685060/design-a-stack-such-that-getminimum-should-be-o1)

 */
public class Stack{
    public List<Integer> stackList = new ArrayList<>();
    public List<Integer> listOfAllMinimums;
    public Stack() {
        stackList = new ArrayList<>();
        listOfAllMinimums = new ArrayList<>();
    }

    public List<Integer> getStackList() {
        return stackList;
    }

    public void push(Integer toBeAdded) {
        getStackList().add(toBeAdded);
        if(toBeAdded < listOfAllMinimums.get(listOfAllMinimums.size()-1)){
            listOfAllMinimums.add(toBeAdded);
        }
        else{
            listOfAllMinimums.add(listOfAllMinimums.size() -1);
        }
    }

    public void pop() {
        //check for edge cases first
        if (getStackList().size() != 0) {
            int indexToBeRemoved = getStackList().size() - 1;
            getStackList().remove(indexToBeRemoved);
            listOfAllMinimums.remove(indexToBeRemoved);
        }


    }

    public int top() {
        int indexAtTop = getStackList().size() - 1;
        return getStackList().get(indexAtTop);
    }

    public boolean isEmpty() {
        if (getStackList().size() == 0) {
            return true;
        }
        return false;

    }

    public int size() {
        return getStackList().size();

    }
    public int min(){
        int minimum = listOfAllMinimums.get(listOfAllMinimums.size() -1);
        return minimum;
    }
}

