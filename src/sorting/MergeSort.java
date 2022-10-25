package sorting;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos deseja: ");
		int elemento = sc.nextInt();
		
		int [] a =  new int[elemento];
		
		System.out.println("Entre com os elementos: ");
		for(int i = 0; i<elemento; i++) {
			a[i] = sc.nextInt();
		}
		
		mergeSort(a,0,a.length-1);
		for(int x:a) {
			System.out.println(x);
		}
		
	

	}

	private static void mergeSort(int[] a, int i, int j) {
		if(i<j) {
			int mid = (i+j)/2;
			mergeSort(a, i, mid);
			mergeSort(a, mid+1, j);
			merge(a,i, mid, j);
			
		}
		
	}

	private static void merge(int[] a, int low, int mid, int high) {
		int i = low;
		int [] b = new int[a.length];
		int j = mid+1;
		int k = low;
		while(i<=mid && j<=high) {
			if(a[i]<a[j]) {
				b[k] = a[i];
				i++;
				k++;
			}else {
				b[k] = a[j];
				j++;
				k++;
			}
		}
		while(i<=mid) {
			b[k]= a[i];
			i++;
			k++;
		}
		while(j<=high) {
			b[k] = a[j];
			j++;
			k++;
		}
		for(i=low; i<=high; i++) {
			a[i] = b[i];
		}
	}


}
