/*
 * 	TAREFA DE PROGRAMAÇÃO
 *
 * 	AUTOR: Lázaro José Rodrigues Júnior
 * 	TURMA: ENGCOMP07
 *	
 *	Utilizando um algoritmo quicksort para ordenar o vetor:
 *
 *	A = [9 , 10 , -1, 3, 6, 2, 1, -3, 1, 0, -2, 15, 8, -7, 0]
 *
 */

#include <iostream>
using namespace std;

int partition(int A[], int p, int r){
	int x = A[r];
	int i = p-1;
	for(int j=p; j<=r-1; j++){
		if(A[j]<=x){
			i = i+1;
			swap(A[i], A[j]);

		}
	}
	swap(A[i+1], A[r]);
	return i+1;
}

void quicksort(int A[], int p, int r){
	int q=0;
	if(p<r){
		q = partition(A, p, r);
		quicksort(A, p, q-1);
		quicksort(A, q+1, r);
	}
}


int main(){

	int A[15] = {9 , 10 , -1, 3, 6, 2, 1, -3, 1, 0, -2, 15, 8, -7, 0};
	int p=0;
	int r=14;

	cout << "Vetor desordenado:" << endl;

	for(int i=0;i<15;i++){
		cout << "POS[" << i << "] = " << A[i] << endl;
	}

	quicksort(A, p, r);

	cout << "Vetor ordenado:" << endl;

	for(int i=0;i<15;i++){
		cout << "POS[" << i << "] = " << A[i] << endl;
	}

	return 0;
}

