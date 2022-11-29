public class 문자열을정수로바꾸기{
  public int solution(String s) {
    int answer = 0;
      if (s.charAt(0) == '-'){
        s=s.substring(1,(s.length()-1));
        answer=-1*Integer.parseInt(s);
        return answer;
      }
    return Integer.parseInt(s);
  }
}

//Integer.parseInt가 부호도 바꿔줄수 있구나를 생각한.... 
class 다른사람정답 {
  public class StrToInt {
    public int getStrToInt(String str) {
      return Integer.parseInt(str);
    }
  }
}