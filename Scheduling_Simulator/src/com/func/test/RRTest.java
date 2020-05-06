package com.func.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.func.RR;
import com.pro.Process;
class RRTest {

	//코어 1개, 프로세스 5개, quantum 2 
	@Test
	void testDoScheduling() {
		
		Process[] test = new Process[15];
		Process[] obj = new Process[15];
		RR r =new RR(1,2);
		r.insertPcs(0, 3);
		r.insertPcs(1, 7);
		r.insertPcs(3, 2);
		r.insertPcs(5, 5);
		r.insertPcs(6, 3);
		test=r.doScheduling();
		
		obj[0]=new Process(0, 3, 5, 2, 5);
		obj[1]=new Process(3, 2, 7, 2, 4);
		obj[2]=new Process(6, 3, 18, 9, 12);
		obj[3]=new Process(1, 7, 19, 11, 18);
		obj[4]=new Process(5, 5, 20, 10, 15);
		for(int i=0;i<5;i++) {
			if(obj[i].equals(test[i])) {
				fail(obj[i].toString()+" Not Equal "+test[i].toString());
			}
				
		}
		assertTrue(true);
	}
	//코어 1개, 프로세스 5개, quantum 3 
		@Test
		void testDoScheduling2() {
			
			Process[] test = new Process[15];
			Process[] obj = new Process[15];
			RR r =new RR(1,3);
			r.insertPcs(0, 3);
			r.insertPcs(1, 7);
			r.insertPcs(3, 2);
			r.insertPcs(5, 5);
			r.insertPcs(6, 3);
			test=r.doScheduling();
			
			obj[0]=new Process(0, 3, 3, 0, 3);
			obj[1]=new Process(3, 2, 8, 3, 5);
			obj[2]=new Process(6, 3, 14, 5, 8);
			obj[3]=new Process(5, 5, 19, 9, 14);
			obj[4]=new Process(6, 3, 20, 5, 8);
			for(int i=0;i<5;i++) {
				if(obj[i].equals(test[i])) {
					fail(obj[i].toString()+" Not Equal "+test[i].toString());
				}
					
			}
			assertTrue(true);
		}
		
		@Test
		void testDoScheduling3() {
			Process[] test = new Process[15];
			Process[] obj = new Process[15];
			RR r = new RR(4,4);
			r.insertPcs(0, 4);
			r.insertPcs(0, 5);
			r.insertPcs(1, 5);
			r.insertPcs(1, 2);
			r.insertPcs(1, 4);
			r.insertPcs(2, 3);
			r.insertPcs(2, 5);
			r.insertPcs(3, 4);
			r.insertPcs(3, 2);
			r.insertPcs(4, 6);
			r.insertPcs(6, 3);
			r.insertPcs(7, 1);
			r.insertPcs(8, 6);
			r.insertPcs(9, 2);
			r.insertPcs(10, 3);
			test=r.doScheduling();
			
			obj[0]=new Process(1, 2, 3, 0, 2);
			obj[1]=new Process(0, 4, 4, 0, 4);
			obj[2]=new Process(1, 4, 7, 2, 6);
			obj[3]=new Process(2, 3, 7, 2, 5);
			obj[4]=new Process(0, 5, 9, 4, 9);
			obj[5]=new Process(3, 4, 9, 2, 6);
			obj[6]=new Process(3, 2, 9, 4, 6);
			obj[7]=new Process(1, 5, 10, 4, 9);
			obj[8]=new Process(7, 1, 10, 2, 3);
			obj[9]=new Process(2, 5, 11, 4, 9);
			obj[10]=new Process(6, 3, 12, 3, 6);
			obj[11]=new Process(9, 2, 13, 2, 4);
			obj[12]=new Process(4, 6, 14, 4, 10);
			obj[13]=new Process(10, 3, 14, 1, 4);
			obj[14]=new Process(8, 6, 16, 2, 8);
			
			for(int i=0;i<15;i++) {
				if(obj[i].equals(test[i])) {
					fail(obj[i].toString()+" Not Equal "+test[i].toString());
				}
			}
			assertTrue(true);
		}

}
