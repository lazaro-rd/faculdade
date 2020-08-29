/*
 * 	AUTOR: Lázaro José Rodrigues Júnior
 * 	TURMA: ENGCOMP07
 *	
 *	Utilizando um algoritmo bubble sort para ordenar o vetor:
 *
 *	A = [9 , 10 , -1, 3, 6, 2, 1, -3, 1, 0, -2, 15, 8, -7, 0]
 *
 */

#include <iostream>
using namespace std;

void bubbleSort(int A[], int l){
	int i, j;
	for(i=0; i<l-1; i++){
		for(j=0; j<l-i-1; j++){
			if(A[j] > A[j+1]){
				swap(A[j], A[j+1]);
			}
		}
	}	
}

int main(){

	int A[15] = {9 , 10 , -1, 3, 6, 2, 1, -3, 1, 0, -2, 15, 8, -7, 0};
	int l = sizeof(A)/sizeof(A[0]);

	cout << "Vetor desordenado:" << endl;

	for(int i=0;i<15;i++){
		cout << "[" << A[i] << "]";
	}
	cout << endl;

	bubbleSort(A, l);

	cout << "Vetor ordenado:" << endl;

	for(int i=0;i<15;i++){
		cout << "[" << A[i] << "]";
	}
	cout << endl;

	return 0;
}
