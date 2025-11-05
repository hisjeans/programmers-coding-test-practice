#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    int answer = ((float)num1/num2)*1000;
    return answer;
}

//다른 사람의 풀이 형변환 없이 가능 int answer=0; answer=1000*num1 / num2;
