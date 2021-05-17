import java.util.List;

public class Stack {
    public List<Integer> stackList = new ArrayList<>();

    public Stack() {
        stackList = new ArrayList<>();
    }

    public List<Integer> getStackList() {
        return stackList;
    }

    public void push(int toBeAdded) {
        getStackList().add(toBeAdded);
    }

    public void pop() {
        //check for edge cases first
        if (getStackList().size() != 0) {
            int indexToBeRemoved = getStackList().size() - 1;
            getStackList().remove(indexToBeRemoved);
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
}
    
