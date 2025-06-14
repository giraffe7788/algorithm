#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    
    int flag = n % 2 == 0 ? 0 : 1;
    int sum = 0;
    
    for(int i = 1; i <= n; i++){
        if(flag){
            if(i % 2 == 1) {
                sum += i;
            }
        } else {
            if(i % 2 == 0){
                sum += i * i;
            }
        }
    }
    
    return sum;
}