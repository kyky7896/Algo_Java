public class 나머지가1이되는수 {
    public int solution(int n) {
        for(int i=1;i<n;i++){
            if(n % i == 1) return i;
        }
        return -1;
    }
}
