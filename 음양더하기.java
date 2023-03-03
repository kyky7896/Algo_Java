import java.util.Arrays;

public class 음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        
        for(int i=0;i<signs.length;i++){
            if(signs[i]==true){
                absolutes[i]=absolutes[i]*1;
            }else{
            absolutes[i]=absolutes[i]*-1;
            }
        }
        int answer=Arrays.stream(absolutes).sum();
        System.out.println(answer);
        return answer;
    }
}
