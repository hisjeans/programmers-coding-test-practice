class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        //배열 초기화
        int den=denom1*denom2; //통분
        int num=numer1*denom2+numer2*denom1;
        int gcd=1;
        for(int i=1;i<=den&&i<=num;i++){
            if(den%i==0&&num%i==0)
                gcd=i;
            //반복문 작은 수~큰 수 진행되어 루프 마지막 최대공약수 저장
            //기약분수 만들기 위해 최대공약수 이용해야 
        }
        den=den/gcd;
        num=num/gcd;
        answer[0]=num;
        answer[1]=den;
        return answer;
    }
}