public class 두정수사이합 {
    public long solution(int a, int b) {
        long answer = 0;
        int c=0;
        if(a>b){
            c=b;
            b=a;
            a=c;
        }
        for(int i=a;i<b+1;i++){
            answer+=i;
        }
        
        return answer;
    }
  
}

//다른사람 풀이 for문안에 삼항식을 넣음 
class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) 
          answer += i;

      return answer;
  }
}
