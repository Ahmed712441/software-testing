import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ForceTest {
	
	class ForcesGrouped{
		int fx[],fy[],fz[];
		ForcesGrouped(int size){
			fx = new int[size];fy = new int[size];fz = new int[size];
		}
	}
	
	
	ForcesGrouped parse_string(int num,String s) {
		String[] splitted = s.split("\n");
		String[] force_vector ;
		ForcesGrouped f = new ForcesGrouped(num);
		for(int i=0;i<num;i++) {
			force_vector = splitted[i].split(" ");
			f.fx[i] = Integer.parseInt(force_vector[0]);
			f.fy[i] = Integer.parseInt(force_vector[1]);
			f.fz[i] = Integer.parseInt(force_vector[2]);
		}
		return f;
	}
	
	@Test
	void test1() {
		// checking for fx,fz > 0 and fy = 0 
		int num_forces = 3;
		String s = "4 1 7\n"
				+ "-2 4 -1\n"
				+ "1 -5 -3";
		ForcesGrouped f = parse_string(num_forces , s);
		assertTrue(Force.equilibrium(f.fx, f.fy, f.fz)== false);
	}
	@Test
	void test2() {
		// checking for fx,fy,fz = 0 
		int num_forces = 3;
		String s = "3 -1 7\n"
				+ "-5 2 -4\n"
				+ "2 -1 -3";
		ForcesGrouped f = parse_string(num_forces , s);
		assertTrue(Force.equilibrium(f.fx, f.fy, f.fz)== true);
	}
	
	@Test
	void test3() {
		// checking for fx,fz < 0 and fy = 0 
		int num_forces = 3;
		String s = "-4 1 -7\n"
				+ "2 4 1\n"
				+ "1 -5 3";
		ForcesGrouped f = parse_string(num_forces , s);
		assertTrue(Force.equilibrium(f.fx, f.fy, f.fz)== false);
	}
	
	@Test
	void test4() {
		// checking for fx,fz,fy < 0  
		int num_forces = 3;
		String s = "-4 1 -7\n"
				+ "-2 -4 1\n"
				+ "1 -5 3";
		ForcesGrouped f = parse_string(num_forces , s);
		assertTrue(Force.equilibrium(f.fx, f.fy, f.fz)== false);
	}
	
	
	@Test
	void test5() {
		// checking for fx,fz = 0 and fy < 0 
		int num_forces = 3;
		String s = "-4 1 -7\n"
				  + "2 -4 1\n"
				  + "2 -5 6";
		ForcesGrouped f = parse_string(num_forces , s);
		assertTrue(Force.equilibrium(f.fx, f.fy, f.fz)== false);
	}
	
	
	@Test
	void test6() {
		// checking for all zeros 
		int num_forces = 3;
		String s = "0 0 0\n"
				  + "0 0 0\n"
				  + "0 0 0";
		ForcesGrouped f = parse_string(num_forces , s);
		assertTrue(Force.equilibrium(f.fx, f.fy, f.fz)== true);
	}
	
	
	@Test
	void test7() {
		// checking for all having 1 force only 
		int num_forces = 1;
		String s = "1 20 -11\n";
		ForcesGrouped f = parse_string(num_forces , s);
		assertTrue(Force.equilibrium(f.fx, f.fy, f.fz)== false);
	}
	
	
	@Test
	void test8() {
		// checking for large number of forces 
		int num_forces = 37;
		String s = "-64 -79 26\n"
				+ "-22 59 93\n"
				+ "-5 39 -12\n"
				+ "77 -9 76\n"
				+ "55 -86 57\n"
				+ "83 100 -97\n"
				+ "-70 94 84\n"
				+ "-14 46 -94\n"
				+ "26 72 35\n"
				+ "14 78 -62\n"
				+ "17 82 92\n"
				+ "-57 11 91\n"
				+ "23 15 92\n"
				+ "-80 -1 1\n"
				+ "12 39 18\n"
				+ "-23 -99 -75\n"
				+ "-34 50 19\n"
				+ "-39 84 -7\n"
				+ "45 -30 -39\n"
				+ "-60 49 37\n"
				+ "45 -16 -72\n"
				+ "33 -51 -56\n"
				+ "-48 28 5\n"
				+ "97 91 88\n"
				+ "45 -82 -11\n"
				+ "-21 -15 -90\n"
				+ "-53 73 -26\n"
				+ "-74 85 -90\n"
				+ "-40 23 38\n"
				+ "100 -13 49\n"
				+ "32 -100 -100\n"
				+ "0 -100 -70\n"
				+ "0 -100 0\n"
				+ "0 -100 0\n"
				+ "0 -100 0\n"
				+ "0 -100 0\n"
				+ "0 -37 0";
		ForcesGrouped f = parse_string(num_forces , s);
		assertTrue(Force.equilibrium(f.fx, f.fy, f.fz)== true);
	}
}
