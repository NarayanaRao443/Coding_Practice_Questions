#include<stdio.h>

// prototype of the functions
int GetNumOfCharacters(char str[50]);
void OutputWithoutWhiteSpace(char str[50]);



// body of the number of characters function 
int GetNumOfCharacters(char str[50])
	{
		int count=0,i;
		// counts the number of characters in the given string and stores it in count variable
		for(i=0;str[i]!='\0';i++){
		count++;
	}
	return count; // returns the count value and stores it into the res variable.
}

// body of the without white space function

void OutputWithoutWhiteSpace(char str[50]){
	int i,sp=0;
	
	// checks the each character of string for white space and tab
	for(i=0;str[i]!='\0';i++){
		str[i]=str[i+sp];
		
		if(str[i]==' ' || str[i] == '\t'){
			sp++;
			i--;
		}	
	}
}



// main function
int main(){
	
	char str[50]; // declaring the string
	int res;   // stores the number of characters
	
	// takes the user input from the user
	printf("Enter a sentence or phrase:");
	gets(str);
	
	printf("You entered:");
	puts(str);
		
	// calling the function of number of characters
	res = GetNumOfCharacters(str);
	
	printf("Number of characters: %d\n",res); // prints the return value of length of the string
	
	
	printf("string with no whitespace: ");
	
	// calling the function of white spaces
	OutputWithoutWhiteSpace(str);
	printf("%s",str);

	return 0;
}

