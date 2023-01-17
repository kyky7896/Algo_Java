
import java.util.Arrays;

public class 숫자 {
    public long[] solution(int x, int n){
      long[] answer = new long[n];
      for(int i=0;i<answer.length;i++){
        answer[i]=x;
        x+=2;
      }
  
      System.out.println(Arrays.toString(answer));
      return answer;
      
    }
  
    public static void main(String[] args) {
      숫자 a=new 숫자();
      a.solution(2,5);
    }
  
  }
  
//다른사람 풀이 보기
class Solution {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;

    }
}
