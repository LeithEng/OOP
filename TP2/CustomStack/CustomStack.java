import java.util.ArrayList;

public class CustomStack {
    int capacity;
    ArrayList <Integer> stack;

    CustomStack(int c)
    {capacity=c;
    this.stack=new ArrayList<>();}

    public void AddElement(int element) {
        if (stack.size() < capacity) {
            stack.add(0,element);

        }
        else {
            System.out.println("The stack is already full");
        }
    }

    public void RemoveElement()
    {if (stack.size()>0)
    {stack.remove(0);}
    else System.out.println("The stack is empty");}

    public int LastInStack()
    {return (stack.get(stack.size()-1));}

    public boolean StackIsEmpty() {
        return stack.size() == 0;
    }

    public boolean StackIsFull() {
        return stack.size() == capacity;
    }

    public static void main(String[] args) {
        CustomStack s=new CustomStack(4);
        s.AddElement(1);
        s.AddElement(2);
        s.AddElement(3);
        s.AddElement(4);
        s.RemoveElement();
        for (int i = 0; i < 3; i++) {
            int n=s.stack.get(i);
            System.out.println(n);

        }

    }






}
