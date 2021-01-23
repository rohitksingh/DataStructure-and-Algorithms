package LinkedList;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args){

        StackTest test = new StackTest();
        String value = test.traverse(new LinkedListTest().getList());
        System.out.println(value);

    }



    public String traverse(LinkedList head){

        if(head==null)
            return "head->Null";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Head->");
        head = head.getNext();

        while(head!=null){
            stringBuilder.append(head.getData()).append("->");
            head = head.getNext();
        }

        stringBuilder.append("Null");

        return stringBuilder.toString();

    }


    public String postFix(String exp){

        char[] expCharArray = exp.toCharArray();
        Stack<Character> stack = new Stack();
        StringBuilder stringBuilder = new StringBuilder();

        for(char element:expCharArray){

            if(operator(element) || element=='('){
                stack.push(element);
            }else if(closedParan(element)){
                while (stack.isEmpty() || stack.peek()!='('){
                    stringBuilder.append(stack.pop());
                    stack.pop();
                }
            }else{
                stringBuilder.append(element);
            }

        }

        while (!stack.isEmpty()){
            char c = stack.pop();
            if(operator(c)){
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();

    }

    public boolean operator(char c){
        return (c=='+' || c== '-' || c=='*' || c=='/');
    }

    public boolean closedParan(char c){
        return (c==')');
    }



}
