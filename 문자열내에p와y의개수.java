public class 문자열내에p와y의개수 {
  public static void main(String[] args) {
    
  }

  boolean solution(String s) {
    int p_length=0;
    int y_length=0;
    s=s.toLowerCase();
    p_length=s.length()-s.replace("p","").length();
    y_length=s.length()-s.replace("y","").length();
    if (p_length==y_length){
      return true;
    }
    return false;
}
  
}
