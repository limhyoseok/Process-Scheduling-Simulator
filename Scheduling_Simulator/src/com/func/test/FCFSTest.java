package com.func.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.func.FCFS;
import com.pro.Process;
class FCFSTest {
	// 코어 1개,프로세스4개 
	@Test
	void testdoScheduling() {
		Process[] test = new Process[15];
		Process[] obj = new Process[15];
		FCFS f = new FCFS(1);
		f.insertPcs(0, 2);
		f.insertPcs(0, 2);
		f.insertPcs(1, 4);
		f.insertPcs(2, 3);
		test=f.doScheduling();
		
		obj[0]=new Process(0, 2, 2, 0, 2);
		obj[1]=new Process(0, 2, 4, 2, 4);
		obj[2]=new Process(1, 4, 8, 3, 7);
		obj[3]=new Process(2, 3, 11, 6, 9);
		for(int i=0;i<4;i++) {
			if(obj[i].equals(test[i])) {
				fail(obj[i].toString()+" Not Equal "+test[i].toString());
			}
				
		}
		assertTrue(true);
	}
	// 코어 2개,프로세스5개 
		@Test
		void testdoScheduling2() {
			Process[] test = new Process[15];
			Process[] obj = new Process[15];
			FCFS f = new FCFS(1);
			f.insertPcs(0, 3);
			f.insertPcs(0, 2);
			f.insertPcs(1, 4);
			f.insertPcs(2, 3);
			f.insertPcs(6, 3);
			test=f.doScheduling();
			
			obj[0]=new Process(1, 2, 2, 0, 2);
			obj[1]=new Process(0, 3, 3, 0, 3);
			obj[2]=new Process(2, 3, 6, 1, 4);
			obj[3]=new Process(1, 4, 6, 1, 5);
			obj[3]=new Process(6, 3, 9, 0, 3);
			for(int i=0;i<4;i++) {
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
			FCFS f = new FCFS(4);
			f.insertPcs(0, 4);
			f.insertPcs(0, 5);
			f.insertPcs(1, 5);
			f.insertPcs(1, 2);
			f.insertPcs(1, 4);
			f.insertPcs(2, 3);
			f.insertPcs(2, 5);
			f.insertPcs(3, 4);
			f.insertPcs(3, 2);
			f.insertPcs(4, 6);
			f.insertPcs(6, 3);
			f.insertPcs(7, 1);
			f.insertPcs(8, 6);
			f.insertPcs(9, 2);
			f.insertPcs(10, 3);
			test=f.doScheduling();
			
			obj[0]=new Process(1, 2, 3, 0, 2);
			obj[1]=new Process(0, 4, 4, 0, 4);
			obj[2]=new Process(0, 5, 5, 0, 5);
			obj[3]=new Process(1, 5, 6, 0, 5);
			obj[4]=new Process(1, 4, 7, 2, 6);
			obj[5]=new Process(2, 3, 7, 2, 5);
			obj[6]=new Process(3, 2, 9, 4, 6);
			obj[7]=new Process(2, 5, 10, 3, 8);
			obj[8]=new Process(3, 4, 10, 3, 7);
			obj[9]=new Process(7, 1, 11, 3, 4);
			obj[10]=new Process(6, 3, 12, 3, 6);
			obj[11]=new Process(4, 6, 13, 3, 9);
			obj[12]=new Process(9, 2, 13, 2, 4);
			obj[13]=new Process(10, 3, 15, 2, 5);
			obj[14]=new Process(8, 6, 16, 2, 8);
			
			for(int i=0;i<15;i++) {
				if(obj[i].equals(test[i])) {
					fail(obj[i].toString()+" Not Equal "+test[i].toString());
				}
			}
			assertTrue(true);
		}
}