import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[]myIntegerOfArray={1,2,3,4,5,6};

        Stack<Integer> myStack=new Stack<>();
        for (int i=0;i<myIntegerOfArray.length;i++){
            myStack.push(myIntegerOfArray[i]);
        }

        System.out.println("Trước khi đảo ngược mảng: ");
        System.out.println(Arrays.toString(new Stack[]{myStack}));


//        for (int i=0;i<myIntegerOfArray.length;i++){          //Xoa phan tu trong stack
//            myStack.pop();
//        }

        Collections.reverse(myStack);
        System.out.println("Sau khi đảo ngược mảng: ");
        System.out.println(Arrays.toString(new Stack[]{myStack}));
    }
}
