public class 정수제곱근판별 {
    
  public long solution(long n) {
    long answer = 0;
    if (Math.sqrt(n)%1==0){
        System.out.println((long)(Math.pow(Math.sqrt(n)+1,2)));
        return (long)(Math.pow(Math.sqrt(n)+1,2));
    }else{
        return -1;
    }
  }

  public static void main(String[] args) {
    정수제곱근판별 jung=new 정수제곱근판별();
    jung.solution(144);
  }
  
}