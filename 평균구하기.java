class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        answer=(sum/arr.length);
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
      Solution s=new Solution();
      int[] arr={1,2,3,4};
      s.solution(arr);
    }
}

