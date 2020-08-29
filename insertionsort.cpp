/*
 * 	AUTOR: Lázaro José Rodrigues Júnior
 * 	TURMA: ENGCOMP07
 *
 * 	===COMPLEXIDADE DE TEMPO===
 * 	O(n^2) = pior caso
 * 	O(n)   = melhor caso
 * 	O(n^2) = caso médio
 *
 * 	===COMPLEXIDADE DE ESPAÇO===
 * 	O(1)
 *	
 *	Utilizando um algoritmo insertion sort para ordenar o vetor:
 *
 *	A = [9 , 10 , -1, 3, 6, 2, 1, -3, 1, 0, -2, 15, 8, -7, 0]
 *
 */

#include <iostream>
using namespace std;

void insertionSort(int A[], int l){
	int key;
	int i;
	for(int j=1;j<=l;j++){
		i = j;
		while(i>0 && (A[i] < A[i-1])){
			swap(A[i], A[i-1]);
			i--;
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

	insertionSort(A, l);

	cout << "Vetor ordenado:" << endl;

	for(int i=0;i<15;i++){
		cout << "[" << A[i] << "]";
	}
	cout << endl;

	return 0;
}
