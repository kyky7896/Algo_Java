

class Solution {
    public int[] solution(long n) {
        
        String numbers=String.valueOf(n);
        String[] number=numbers.split("");
        String temp="";
        for(int i=0;i<number.length/2;i++){
            temp=number[i];
            number[i]=number[number.length-i-1];
            number[number.length-i-1]=temp;
        }
        int[] answer = new int[number.length]; //int배열 새로 만들기
            
        for(int i=0;i<number.length;i++){
            answer[i]=(Integer.parseInt(number[i]));
        }
        return answer;
        
    }
}