package com.func.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.func.HRRN;
import com.pro.Process;

class HRRNTest {

	// 코어 1개, 프로세스 5개
	@Test
	void testDoScheduling() {
		Process[] test = new Process[15];
		Process[] obj = new Process[15];
		HRRN h = new HRRN(1);
		h.insertPcs(0, 3);
		h.insertPcs(1, 7);
		h.insertPcs(3, 2);
		h.insertPcs(5, 5);
		h.insertPcs(6, 3);
		test=h.doScheduling();
		obj[0]=new Process(0, 3, 3, 0, 3);
		obj[1]=new Process(1, 7, 10, 2, 9);
		obj[2]=new Process(3, 2, 12, 7, 9);
		obj[3]=new Process(6, 3, 15, 6, 9);
		obj[4]=new Process(5, 5, 20, 10, 15);
		for(int i=0;i<5;i++) {
			if(obj[i].equals(test[i])) {
				fail(obj[i].toString()+" Not Equal "+test[i].toString());
			}
		}
		assertTrue(true);
	}
	// 코어 2개, 프로세스 5개
		@Test
		void testDoScheduling2() {
			Process[] test = new Process[15];
			Process[] obj = new Process[15];
			HRRN h = new HRRN(2);
			h.insertPcs(0, 3);
			h.insertPcs(1, 7);
			h.insertPcs(3, 2);
			h.insertPcs(5, 5);
			h.insertPcs(6, 3);
			test=h.doScheduling();
			obj[0]=new Process(0, 3, 3, 0, 3);
			obj[1]=new Process(3, 2, 12, 7, 9);
			obj[2]=new Process(1, 7, 10, 2, 9);
			obj[3]=new Process(5, 5, 20, 10, 15);
			obj[4]=new Process(6, 3, 15, 6, 9);
			for(int i=0;i<5;i++) {
				if(obj[i].equals(test[i])) {
					fail(obj[i].toString()+" Not Equal "+test[i].toString());
				}
			}
			assertTrue(true);
		}
		
		@Test
		void testdoScheduling3() {
			Process[] test = new Process[15];
			Process[] obj = new Process[15];
			HRRN h = new HRRN(4);
			h.insertPcs(0, 4);
			h.insertPcs(0, 5);
			h.insertPcs(1, 5);
			h.insertPcs(1, 2);
			h.insertPcs(1, 4);
			h.insertPcs(2, 3);
			h.insertPcs(2, 5);
			h.insertPcs(3, 4);
			h.insertPcs(3, 2);
			h.insertPcs(4, 6);
			h.insertPcs(6, 3);
			h.insertPcs(7, 1);
			h.insertPcs(8, 6);
			h.insertPcs(9, 2);
			h.insertPcs(10, 3);
			test=h.doScheduling();
			
			obj[0]=new Process(1, 2, 3, 0, 2);
			obj[1]=new Process(0, 4, 4, 0, 4);
			obj[2]=new Process(0, 5, 5, 0, 5);
			obj[3]=new Process(1, 4, 5, 0, 4);
			obj[4]=new Process(2, 3, 7, 2, 5);
			obj[5]=new Process(1, 5, 8, 2, 7);
			obj[6]=new Process(3, 4, 9, 2, 6);
			obj[7]=new Process(3, 2, 9, 4, 6);
			obj[8]=new Process(7, 1, 9, 1, 2);
			obj[9]=new Process(2, 5, 10, 3, 8);
			obj[10]=new Process(6, 3, 12, 3, 6);
			obj[11]=new Process(9, 2, 12, 1, 3);
			obj[12]=new Process(4, 6, 15, 5, 11);
			obj[13]=new Process(8, 6, 15, 1, 7);
			obj[14]=new Process(10, 3, 15, 2, 5);
			
			for(int i=0;i<15;i++) {
				if(obj[i].equals(test[i])) {
					fail(obj[i].toString()+" Not Equal "+test[i].toString());
				}
			}
			assertTrue(true);
		}

}
