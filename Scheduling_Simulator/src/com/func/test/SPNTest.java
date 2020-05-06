package com.func.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.func.SPN;
import com.pro.Process;

class SPNTest {

	@Test
	void testDoScheduling() {
		Process[] test = new Process[15];
		Process[] obj = new Process[15];
		SPN s = new SPN(1);
		s.insertPcs(0, 3);
		s.insertPcs(1, 7);
		s.insertPcs(3, 2);
		s.insertPcs(5, 5);
		s.insertPcs(6, 3);
		test=s.doScheduling();
		obj[0]=new Process(0, 3, 3, 0, 3);
		obj[1]=new Process(3, 2, 5, 0, 2);
		obj[2]=new Process(5, 5, 10, 0, 5);
		obj[3]=new Process(6, 3, 13, 4, 7);
		obj[4]=new Process(1, 7, 10, 2, 9);
		for(int i=0;i<5;i++) {
			if(obj[i].equals(test[i])) {
				fail(obj[i].toString()+" Not Equal "+test[i].toString());
			}
		}
		assertTrue(true);
	}
	
	@Test
	void testdoScheduling2() {
		Process[] test = new Process[15];
		Process[] obj = new Process[15];
		SPN s = new SPN(4);
		s.insertPcs(0, 4);
		s.insertPcs(0, 5);
		s.insertPcs(1, 5);
		s.insertPcs(1, 2);
		s.insertPcs(1, 4);
		s.insertPcs(2, 3);
		s.insertPcs(2, 5);
		s.insertPcs(3, 4);
		s.insertPcs(3, 2);
		s.insertPcs(4, 6);
		s.insertPcs(6, 3);
		s.insertPcs(7, 1);
		s.insertPcs(8, 6);
		s.insertPcs(9, 2);
		s.insertPcs(10, 3);
		test=s.doScheduling();
		
		obj[0]=new Process(1, 2, 3, 0, 2);
		obj[1]=new Process(0, 4, 4, 0, 4);
		obj[2]=new Process(0, 5, 5, 0, 5);
		obj[3]=new Process(1, 4, 5, 0, 4);
		obj[4]=new Process(3, 2, 5, 0, 2);
		obj[5]=new Process(2, 3, 7, 2, 5);
		obj[6]=new Process(7, 1, 8, 0, 1);
		obj[7]=new Process(3, 4, 9, 2, 6);
		obj[8]=new Process(1, 5, 10, 4, 9);
		obj[9]=new Process(2, 5, 10, 3, 8);
		obj[10]=new Process(6, 3, 11, 2, 5);
		obj[11]=new Process(9, 2, 11, 0, 2);
		obj[12]=new Process(10, 3, 13, 0, 3);
		obj[13]=new Process(4, 6, 16, 6, 12);
		obj[14]=new Process(8, 6, 17, 3, 9);
		
		for(int i=0;i<15;i++) {
			if(obj[i].equals(test[i])) {
				fail(obj[i].toString()+" Not Equal "+test[i].toString());
			}
		}
		assertTrue(true);
	}

	
	
}
