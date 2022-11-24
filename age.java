//외계행성의 나이
public class age{
  public static void main(String[] args) {
    Solution so = new Solution();
    int age=0;
    so.solution(age);
  }
}

class Solution {
  public String solution(int age) {
      String answer = "";
      String s=String.valueOf(age);
      String[] arr = s.split("");

      for(int i=0;i<arr.length;i++){
        answer+=(char)(Integer.parseInt(arr[i]+97));
      }

      return answer;
  } 
}