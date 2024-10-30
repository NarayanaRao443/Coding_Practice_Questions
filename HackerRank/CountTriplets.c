#include<stdio.h>
int main(){
	int N;
	scanf("%d",&N);
	int ar[N];
	int Index[10];
	int i,j,count=0;
	for(i=0;i<N;i++)
		scanf("%d",&ar[i]);
	for(i=0;i<N;i++)	
		 Index[ar[i]]=1;
		
	for(i=0;i<N-1;i++){
		for(j=i+1;j<N;j++){
			if(Index[ar[i]+ar[j]]==1){
				count++;
			}
		}
	}
	printf("%d",count);
	return 0;
}
