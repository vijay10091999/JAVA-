package com.java8;

public class Computer12 {



		String cBrand;
		int cid;
		int cprice;

		Computer12(String cBrand, int cid, int cprice) {
			this.cBrand = cBrand;
			this.cid = cid;
			this.cprice = cprice;
		}

		public Computer12(String cBrand, int cprice) {
			// TODO Auto-generated constructor stub
			this.cBrand = cBrand;
			
			this.cprice = cprice;
		}

		public String getcBrand() {
			return cBrand;
		}

		public void setcBrand(String cBrand) {
			this.cBrand = cBrand;
		}

		public Integer getCid() { // For compare method
			return cid;
		}

		public Integer setCid(int cid) {
			return this.cid = cid;
		}

		public int getCprice() {
			return cprice;
		}

		public void setCprice(int cprice) {
			this.cprice = cprice;
		}	
	}


	

