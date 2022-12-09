public class 두정수사이합 {
    public long solution(int a, int b) {
        long answer = 0;
        int c=0;
        if(a>b){
            c=b;
            b=a;
            a=c;
        }
        for(int i=a;i<b+1;i++){
            answer+=i;
        }
        
        return answer;
    }
  
}
