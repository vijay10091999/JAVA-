package com.programs;




public class Tesla{
	public int checkNum(int num) {
		try {
			if(num>0 && num ,5) {
				throw new Exception();
			}else {
				return 1;
			}
		} catch (Exception e) {
			return 2;
			
			// TODO: handle exception
		}
		finally {
			return 3;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int value = new Tesla().checkNum(1);
System.out.println(value);
	}

}
