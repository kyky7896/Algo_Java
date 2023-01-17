import java.util.Arrays;

public class 정수내림차순으로배치 {
  public long solution(long n){
    long answer=0;
    
    String[] str=String.valueOf(n).split(""); //String으로 바꾸기
    Arrays.sort(str); // 내림차순 정렬
    StringBuilder sb=new StringBuilder();
    for(String alist: str){
      sb.append(alist);
    } //Stringbuilder에 list를 추가

    return Long.parseLong(sb.reverse().toString());
  }
}
