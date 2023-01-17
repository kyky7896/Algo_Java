import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
  public int[] solution(int[] arr, int divisor) {
      int count=0;
      int num=0;
      for(int i=0;i<arr.length;i++){
          if( arr[i] % divisor == 0 ){
              count+=1;
          }
      }
      
      if(count == 0){
          int[] answer = {-1};
          return answer;
      }
      
      int[] answer=new int[count];
      
      for(int i=0;i<arr.length;i++){
          if(arr[i] % divisor == 0){
              answer[num]+=arr[i];
              num++;
          }
      }
      
      Arrays.sort(answer);
      return answer;
  }
  
}
