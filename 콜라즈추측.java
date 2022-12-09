public class 콜라즈추측 {
  public int solution(int num) {
    int cnt=0;
    if(num==1){
        return 0;
    }
    
    while(num!=1){
        if(num % 2 == 0){ //짝수일때
            num = num / 2 ;
        }else if(num % 2 == 1){ //홀수일때
            num = (num * 3) + 1;
        } 
        cnt+=1;
        
        if(cnt==500){
            return -1;
        }
    }
    return cnt;
  }
}
