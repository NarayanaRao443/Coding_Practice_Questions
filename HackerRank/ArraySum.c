#include<stdio.h>
int main(){
	int T;
	scanf("%d",&T);
	while(T--){
		long int N,S;
		long int flag=0, start=0, sum=0;
		scanf("%d %d",&N,&S);
		long int ar[N];
		int i;
		
		for(i=0;i<N;i++)
			scanf("%d",&ar[i]);
		for(i=0;i<N;i++){
			sum = sum+ar[i];
			
			while(sum > S){
				sum = sum - ar[start];
				start++;
			}
			if(sum == S){
				printf("%d %d ",start+1,i+1);
				flag=1;
				break;
			}
		}
		if(flag==0){
			printf(-1);
		}
	}
	return 0;
}
