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

/* 다른사람의 풀이

        int mother = num1 * num2; 분모
        int son1 = num1 * denum2; 첫 번째 분자
        int son2 = num2 * denum1; 두 번째 분자
        int totalSon = son1 + son2; 첫 번째 분자, 두 번째 분자의 합
        for(int i = mother; i >= 1; i--){ 내림차순으로 큰 수부터 공약수 찾기
            if(totalSon % i == 0 && mother % i == 0){
                totalSon /= i; 즉시 나누기
                mother /= i;
            }
        }
        int[] answer = {totalSon, mother};
        return answer;

*/