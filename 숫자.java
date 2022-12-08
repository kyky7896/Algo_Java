import java.util.ArrayList;
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
  

