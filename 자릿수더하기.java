class Solution {
  public int solution(int n) {
      int answer = 0;
      String numbers=String.valueOf(n);
      String[] number=numbers.split("");
      for(int i=0;i<number.length;i++){
        answer+=Integer.parseInt(number[i]);
      }
      return answer;
  }
}

public class 자릿수더하기{
  public static void main(String[] args) {
    Solution so=new Solution();
    so.solution(123);
  }
  
}