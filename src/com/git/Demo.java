package com.git;

public class Demo {

	public static void sayFuckYou(){
		System.out.println("ܳ ni ma!");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrayInt= {3,1,2,4,65,7,89,0,100};
		sortArray(arrayInt);
		for(int i:arrayInt){
			System.out.print(i +"---");
		}
	}
	
	public static void sayHelloWord(){
		System.out.println("���첨�� ��ã�");
	}

	
	/***
	 * ð������
	 * @param arrayInt
	 */
	public static void sortArray(int[] arrayInt){
		
		int temp;
		for(int i=0;i<arrayInt.length;i++){
			for(int j=0;j<arrayInt.length-1;j++){
				if(arrayInt[i]<arrayInt[j]){
					temp=arrayInt[i];
					arrayInt[i]=arrayInt[j];
					arrayInt[j]=temp;
				}
			}
		}
	}
}
