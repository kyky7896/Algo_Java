public class 하샤드수 {
  public boolean h_solution(int x) {
    String s=x+"";
    int plus=0;
    for(int i=0;i<s.length();i++){
      plus+=(s.charAt(i)-'0'); 
      //char를 int로 바꾸기 
      //1. char에서 -'0'
      //0~9는 48~57의 순서로 되어있어 '0'을 빼주면 아스키코드의 숫자값이 남음
      //2. Character.getNumbericValue(); 라이브러리 사용
      if( x % plus == 0 ){
        System.out.println(true);
        return true;
      }
    }
    System.out.println(false);
    return false;
  }

  public static void main(String[] args) {
    하샤드수 h=new 하샤드수();
    h.h_solution(10);
  }
}
