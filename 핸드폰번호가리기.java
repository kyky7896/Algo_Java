public class 핸드폰번호가리기 {
  public String solution(String phone_number) {
    String answer="";
    for(int i=0;i<phone_number.length();i++){
      if(i < phone_number.length()-4){
        answer+=phone_number.charAt(i);
      }else{
        answer+="*";
      }
    }
    System.out.println(answer);
    return answer;
  }

  public static void main(String[] args) {
    핸드폰번호가리기 an=new 핸드폰번호가리기();
    an.solution("01033334444");
  };

}
