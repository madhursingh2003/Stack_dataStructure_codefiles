package Stack_dataStructure;
import java.util.Stack;

public class StockSpanProblem {
    public static int[] fun(int []stock){
//        stack stored the index of previous highs
        Stack<Integer> idxPrevHighs=new Stack<>();
        idxPrevHighs.push(0);
        int [] span=new int[stock.length];
        span[0]=1;
        for(int i=1;i<span.length;i++){
            while (!idxPrevHighs.isEmpty() && stock[idxPrevHighs.peek()]<=stock[i]){
                idxPrevHighs.pop();
            }
            if(idxPrevHighs.isEmpty()){
                span[i]=i+1;
            }
            else {
                span[i]=i-idxPrevHighs.peek();
            }
//           you always need to push the current index onto the stack so that it can be used for subsequent span calculations.
            idxPrevHighs.push(i);
        }
//        span array is returned only after spans for all the stocks is calculated ( i crosses it's limit)
        return span;
    }
    public static void main(String[] args) {
        int []stock={10,20,30,40,50};
        int [] span=fun(stock);
        for(int i=0;i<stock.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}
