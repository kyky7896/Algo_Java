public class 콜라문제 {
  public int solution(int a, int b, int n) {
    int answer = 0;
    while (true){
      if( n < a ){
        break;
      }

      answer+=(n/a)*b;
      int remain = n % a; //남아있는 병
      n = (n / a) * b + remain;
    }
    
    return answer;
  }

  public static void main(String[] args) {
    
  }
}
