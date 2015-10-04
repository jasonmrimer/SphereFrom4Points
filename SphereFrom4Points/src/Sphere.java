import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class Sphere {//sClass
	public static void main(String[] args) {//sMain
	//INPUT COORDINATES	
		//Open input function
		//Welcome Message
		UIManager.put("OptionPane.background",new ColorUIResource(0,70,150));
		UIManager.put("Panel.background",new ColorUIResource(0,70,150));
		JOptionPane.showMessageDialog(null,
				"Welcome! Did you know that a sphere can be defined by 4 distinct points on a three dimensional plane?"+
				"\nRemember, no three points may be colinear and all points may no be coplanar."+
				"\nLet's begin by entering four sets of coordinates.",
				"Four Points to a Sphere",
				JOptionPane.INFORMATION_MESSAGE);
		System.out.println();
		//First Set of point Input dialog
		UIManager.put("OptionPane.background",new ColorUIResource(150,0,0));
		UIManager.put("Panel.background",new ColorUIResource(150,0,0));
		String x1s = JOptionPane.showInputDialog(null, 
				"Enter first set of coordinates (x1, y1, z1): \nx1: ",
				"First Coodinates", JOptionPane.QUESTION_MESSAGE);
		String y1s = JOptionPane.showInputDialog(null, 
				"Enter first set of coordinates (x1, y1, z1): \nx1: " + x1s + "\ny1: ",
				"First Coodinates", JOptionPane.QUESTION_MESSAGE);
		String z1s = JOptionPane.showInputDialog(null, 
				"Enter first set of coordinates (x1, y1, z1): \nx1: " + x1s + "\ny1: " + y1s + "\nz1: ",
				"First Coodinates", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"First set of coordinates: (" + x1s + "," + y1s + "," + z1s + ").",
				"First Coordinates",
				JOptionPane.INFORMATION_MESSAGE);
		double x1 = Double.parseDouble(x1s);
		double y1 = Double.parseDouble(y1s);
		double z1 = Double.parseDouble(z1s);
		//Second Set of point Input dialog
		UIManager.put("OptionPane.background",new ColorUIResource(0,150,0));
		UIManager.put("Panel.background",new ColorUIResource(0,150,0));
		String x2s = JOptionPane.showInputDialog(null, 
				"Enter second set of coordinates (x2, y2, z2): \nx2: ",
				"Second Coodinates", JOptionPane.QUESTION_MESSAGE);
		String y2s = JOptionPane.showInputDialog(null, 
				"Enter second set of coordinates (x2, y2, z2): \nx2: " + x2s + "\ny2: ",
				"Second Coodinates", JOptionPane.QUESTION_MESSAGE);
		String z2s = JOptionPane.showInputDialog(null, 
				"Enter second set of coordinates (x2, y2, z2): \nx2: " + x2s + "\ny2: " + y2s + "\nz2: ",
				"Second Coodinates", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"Second set of coordinates: (" + x2s + "," + y2s + "," + z2s + ").",
				"Second Coordinates",
				JOptionPane.INFORMATION_MESSAGE);
		double x2 = Double.parseDouble(x2s);
		double y2 = Double.parseDouble(y2s);
		double z2 = Double.parseDouble(z2s);
		//third Set of point Input dialog
		UIManager.put("OptionPane.background",new ColorUIResource(180,25,10));
		UIManager.put("Panel.background",new ColorUIResource(180,25,10));
		String x3s = JOptionPane.showInputDialog(null, 
				"Enter third set of coordinates (x3, y3, z3): \nx3: ",
				"Third Coodinates", JOptionPane.QUESTION_MESSAGE);
		String y3s = JOptionPane.showInputDialog(null, 
				"Enter third set of coordinates (x3, y3, z3): \nx3: " + x3s + "\ny3: ",
				"Third Coodinates", JOptionPane.QUESTION_MESSAGE);
		String z3s = JOptionPane.showInputDialog(null, 
				"Enter third set of coordinates (x3, y3, z3): \nx3: " + x3s + "\ny3: " + y3s + "\nz3: ",
				"Third Coodinates", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"Third set of coordinates: (" + x3s + "," + y3s + "," + z3s + ").",
				"Third Coordinates",
				JOptionPane.INFORMATION_MESSAGE);
		double x3 = Double.parseDouble(x3s);
		double y3 = Double.parseDouble(y3s);
		double z3 = Double.parseDouble(z3s);
		//Fourth Set of point Input dialog
		UIManager.put("OptionPane.background",new ColorUIResource(0,150,150));
		UIManager.put("Panel.background",new ColorUIResource(0,150,150));
		String x4s = JOptionPane.showInputDialog(null, 
				"Enter fourth set of coordinates (x4, y4, z4): \nx4: ",
				"Fourth Coodinates", JOptionPane.QUESTION_MESSAGE);
		String y4s = JOptionPane.showInputDialog(null, 
				"Enter fourth set of coordinates (x4, y4, z4): \nx4: " + x4s + "\ny4: ",
				"Fourth Coodinates", JOptionPane.QUESTION_MESSAGE);
		String z4s = JOptionPane.showInputDialog(null, 
				"Enter fourth set of coordinates (x4, y4, z4): \nx4: " + x4s + "\ny4: " + y4s + "\nz4: ",
				"Fourth Coodinates", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,
				"Fourth set of coordinates: (" + x4s + "," + y4s + "," + z4s + ")."+
				"\nClick 'OK' to see the results of the four coordinates",
				"Fourth Coordinates",
				JOptionPane.INFORMATION_MESSAGE);
		
		double x4 = Double.parseDouble(x4s);
		double y4 = Double.parseDouble(y4s);
		double z4 = Double.parseDouble(z4s);

	//CREATE MATRIX
		double [][]matrix=new double [5][5];
		//First row
		matrix[0][0]=0;
		matrix[0][1]=0;
		matrix[0][2]=0;
		matrix[0][3]=0;
		matrix[0][4]=1;
		//Second row
		matrix[1][0]=x1*x1+y1*y1+z1*z1;
		matrix[1][1]=x1;
		matrix[1][2]=y1;
		matrix[1][3]=z1;
		matrix[1][4]=1;
		//third Row
		matrix[2][0]=y3*x2+y2*y2+z2*z2;
		matrix[2][1]=x2;
		matrix[2][2]=y2;
		matrix[2][3]=z2;
		matrix[2][4]=1;
		//Fourth Row
		matrix[3][0]=x3*x3+y3*y3+z3*z3;
		matrix[3][1]=x3;
		matrix[3][2]=y3;
		matrix[3][3]=z3;
		matrix[3][4]=1;
		//Fifth Row
		matrix[4][0]=x4*x4+y4*y4+z4*z4;
		matrix[4][1]=x4;
		matrix[4][2]=y4;
		matrix[4][3]=z4;
		matrix[4][4]=1;
		
		System.out.print(matrix);
		//BREAK MATRIX INTO MINORS
		//Breakdown into new matrixM11
		double matrixM11[][]= new double [4][4];
		for (int j=0;j<4;j++)
		{//sColumncount1
			for (int i=0;i<4;i++)
			{//sRowCount1
				matrixM11[i][j]=matrix[i+1][j+1];
			}//sRowCount1
		}//sColumncount1
		//Breakdown into new matrixM12
		double matrixM12[][]= new double [4][4];
		for (int j=0;j<1;j++)
		{//sColumncount2
				for (int i=0;i<4;i++)
					{//sRowCount2
					matrixM12[i][j]=matrix[i+1][j];
					}//eRowCount2
		}//eColumncount2
		for (int j=2;j<5;j++)
		{//sColumncount3
				for (int i=0;i<4;i++)
				{//sRowCount1
				matrixM12[i][j-1]=matrix[i+1][j];
				}//eRowCount3
		}//eColumncount3
		//Breakdown into new matrixM13
		double matrixM13[][]= new double [4][4];
		for (int j=0;j<2;j++)
		{//sColumncount4
				for (int i=0;i<4;i++)
					{//sRowCount4
					matrixM13[i][j]=matrix[i+1][j];
					}//eRowCount4
		}//eColumncount4
		for (int j=3;j<5;j++)
		{//sColumncount5
				for (int i=0;i<4;i++)
				{//sRowCount5
				matrixM13[i][j-1]=matrix[i+1][j];
				}//eRowCount5
		}//eColumncount5
		//Breakdown into new matrixM14
		double matrixM14[][]= new double [4][4];
		for (int j=0;j<3;j++)
		{//sColumncount6
				for (int i=0;i<4;i++)
					{//sRowCount6
					matrixM14[i][j]=matrix[i+1][j];
					}//eRowCount6
		}//eColumncount6
		for (int j=4;j<5;j++)
		{//sColumncount7
				for (int i=0;i<4;i++)
				{//sRowCount7
				matrixM14[i][j-1]=matrix[i+1][j];
				}//eRowCount7
		}//eColumncount7
		//Breakdown into new matrixM15
		double matrixM15[][]= new double [4][4];
		for (int j=0;j<4;j++)
		{//sColumncount8
			for (int i=0;i<4;i++)
				{//sRowCount8
				matrixM15[i][j]=matrix[i+1][j];
				}//eRowCount8
		}//eColumncount8
		
		//DETERMINANTS
		//Determinant of M11
		//Determinants of M11's minors 
		double m11m11 = 0, m11m12 = 0, m11m13 = 0, m11m14 = 0;
		m11m11 = 
				matrixM11[1][1]*matrixM11[2][2]*matrixM11[3][3]+
				matrixM11[1][2]*matrixM11[2][3]*matrixM11[3][1]+
				matrixM11[1][3]*matrixM11[2][1]*matrixM11[3][2]-
				matrixM11[1][3]*matrixM11[2][2]*matrixM11[3][1]-
				matrixM11[1][1]*matrixM11[2][3]*matrixM11[3][2]-
				matrixM11[1][2]*matrixM11[2][1]*matrixM11[3][3];
		m11m12 = 
				matrixM11[1][0]*matrixM11[2][2]*matrixM11[3][3]+
				matrixM11[1][2]*matrixM11[2][3]*matrixM11[3][0]+
				matrixM11[1][3]*matrixM11[2][0]*matrixM11[3][2]-
				matrixM11[1][3]*matrixM11[2][2]*matrixM11[3][0]-
				matrixM11[1][0]*matrixM11[2][3]*matrixM11[3][2]-
				matrixM11[1][2]*matrixM11[2][0]*matrixM11[3][3];
		m11m13 = 
				matrixM11[1][0]*matrixM11[2][1]*matrixM11[3][3]+
				matrixM11[1][1]*matrixM11[2][3]*matrixM11[3][0]+
				matrixM11[1][3]*matrixM11[2][0]*matrixM11[3][1]-
				matrixM11[1][3]*matrixM11[2][1]*matrixM11[3][0]-
				matrixM11[1][0]*matrixM11[2][3]*matrixM11[3][1]-
				matrixM11[1][1]*matrixM11[2][0]*matrixM11[3][3];
		m11m14 = 
				matrixM11[1][0]*matrixM11[2][1]*matrixM11[3][2]+
				matrixM11[1][1]*matrixM11[2][2]*matrixM11[3][0]+
				matrixM11[1][2]*matrixM11[2][0]*matrixM11[3][1]-
				matrixM11[1][2]*matrixM11[2][1]*matrixM11[3][0]-
				matrixM11[1][0]*matrixM11[2][2]*matrixM11[3][1]-
				matrixM11[1][1]*matrixM11[2][0]*matrixM11[3][2];
		//Determinant of M11
		double determinantM11 =
				matrixM11[0][0]*m11m11-
				matrixM11[0][1]*m11m12+
				matrixM11[0][2]*m11m13-
				matrixM11[0][3]*m11m14;
		//Determinant of M12
		//Determinants of M12's minors 
		double m12m11 = 0, m12m12 = 0, m12m13 = 0, m12m14 = 0;
		m12m11 = 
				matrixM12[1][1]*matrixM12[2][2]*matrixM12[3][3]+
				matrixM12[1][2]*matrixM12[2][3]*matrixM12[3][1]+
				matrixM12[1][3]*matrixM12[2][1]*matrixM12[3][2]-
				matrixM12[1][3]*matrixM12[2][2]*matrixM12[3][1]-
				matrixM12[1][1]*matrixM12[2][3]*matrixM12[3][2]-
				matrixM12[1][2]*matrixM12[2][1]*matrixM12[3][3];
		m12m12 = 
				matrixM12[1][0]*matrixM12[2][2]*matrixM12[3][3]+
				matrixM12[1][2]*matrixM12[2][3]*matrixM12[3][0]+
				matrixM12[1][3]*matrixM12[2][0]*matrixM12[3][2]-
				matrixM12[1][3]*matrixM12[2][2]*matrixM12[3][0]-
				matrixM12[1][0]*matrixM12[2][3]*matrixM12[3][2]-
				matrixM12[1][2]*matrixM12[2][0]*matrixM12[3][3];
		m12m13 = 
				matrixM12[1][0]*matrixM12[2][1]*matrixM12[3][3]+
				matrixM12[1][1]*matrixM12[2][3]*matrixM12[3][0]+
				matrixM12[1][3]*matrixM12[2][0]*matrixM12[3][1]-
				matrixM12[1][3]*matrixM12[2][1]*matrixM12[3][0]-
				matrixM12[1][0]*matrixM12[2][3]*matrixM12[3][1]-
				matrixM12[1][1]*matrixM12[2][0]*matrixM12[3][3];
		m12m14 = 
				matrixM12[1][0]*matrixM12[2][1]*matrixM12[3][2]+
				matrixM12[1][1]*matrixM12[2][2]*matrixM12[3][0]+
				matrixM12[1][2]*matrixM12[2][0]*matrixM12[3][1]-
				matrixM12[1][2]*matrixM12[2][1]*matrixM12[3][0]-
				matrixM12[1][0]*matrixM12[2][2]*matrixM12[3][1]-
				matrixM12[1][1]*matrixM12[2][0]*matrixM12[3][2];
		//Determinant of M12
		double determinantM12 =
				matrixM12[0][0]*m12m11-
				matrixM12[0][1]*m12m12+
				matrixM12[0][2]*m12m13-
				matrixM12[0][3]*m12m14;
		//Determinant of M13
		//Determinants of M13's minors 
		double m13m11 = 0, m13m12 = 0, m13m13 = 0, m13m14 = 0;
		m13m11 = 
				matrixM13[1][1]*matrixM13[2][2]*matrixM13[3][3]+
				matrixM13[1][2]*matrixM13[2][3]*matrixM13[3][1]+
				matrixM13[1][3]*matrixM13[2][1]*matrixM13[3][2]-
				matrixM13[1][3]*matrixM13[2][2]*matrixM13[3][1]-
				matrixM13[1][1]*matrixM13[2][3]*matrixM13[3][2]-
				matrixM13[1][2]*matrixM13[2][1]*matrixM13[3][3];
		m13m12 = 
				matrixM13[1][0]*matrixM13[2][2]*matrixM13[3][3]+
				matrixM13[1][2]*matrixM13[2][3]*matrixM13[3][0]+
				matrixM13[1][3]*matrixM13[2][0]*matrixM13[3][2]-
				matrixM13[1][3]*matrixM13[2][2]*matrixM13[3][0]-
				matrixM13[1][0]*matrixM13[2][3]*matrixM13[3][2]-
				matrixM13[1][2]*matrixM13[2][0]*matrixM13[3][3];
		m13m13 = 
				matrixM13[1][0]*matrixM13[2][1]*matrixM13[3][3]+
				matrixM13[1][1]*matrixM13[2][3]*matrixM13[3][0]+
				matrixM13[1][3]*matrixM13[2][0]*matrixM13[3][1]-
				matrixM13[1][3]*matrixM13[2][1]*matrixM13[3][0]-
				matrixM13[1][0]*matrixM13[2][3]*matrixM13[3][1]-
				matrixM13[1][1]*matrixM13[2][0]*matrixM13[3][3];
		m13m14 = 
				matrixM13[1][0]*matrixM13[2][1]*matrixM13[3][2]+
				matrixM13[1][1]*matrixM13[2][2]*matrixM13[3][0]+
				matrixM13[1][2]*matrixM13[2][0]*matrixM13[3][1]-
				matrixM13[1][2]*matrixM13[2][1]*matrixM13[3][0]-
				matrixM13[1][0]*matrixM13[2][2]*matrixM13[3][1]-
				matrixM13[1][1]*matrixM13[2][0]*matrixM13[3][2];
		//Determinant of M13
		double determinantM13 =
				matrixM13[0][0]*m13m11-
				matrixM13[0][1]*m13m12+
				matrixM13[0][2]*m13m13-
				matrixM13[0][3]*m13m14;
		//Determinant of M14
		//Determinants of M14's minors 
		double m14m11 = 0, m14m12 = 0, m14m13 = 0, m14m14 = 0;
		m14m11 = 
				matrixM14[1][1]*matrixM14[2][2]*matrixM14[3][3]+
				matrixM14[1][2]*matrixM14[2][3]*matrixM14[3][1]+
				matrixM14[1][3]*matrixM14[2][1]*matrixM14[3][2]-
				matrixM14[1][3]*matrixM14[2][2]*matrixM14[3][1]-
				matrixM14[1][1]*matrixM14[2][3]*matrixM14[3][2]-
				matrixM14[1][2]*matrixM14[2][1]*matrixM14[3][3];
		m14m12 = 
				matrixM14[1][0]*matrixM14[2][2]*matrixM14[3][3]+
				matrixM14[1][2]*matrixM14[2][3]*matrixM14[3][0]+
				matrixM14[1][3]*matrixM14[2][0]*matrixM14[3][2]-
				matrixM14[1][3]*matrixM14[2][2]*matrixM14[3][0]-
				matrixM14[1][0]*matrixM14[2][3]*matrixM14[3][2]-
				matrixM14[1][2]*matrixM14[2][0]*matrixM14[3][3];
		m14m13 = 
				matrixM14[1][0]*matrixM14[2][1]*matrixM14[3][3]+
				matrixM14[1][1]*matrixM14[2][3]*matrixM14[3][0]+
				matrixM14[1][3]*matrixM14[2][0]*matrixM14[3][1]-
				matrixM14[1][3]*matrixM14[2][1]*matrixM14[3][0]-
				matrixM14[1][0]*matrixM14[2][3]*matrixM14[3][1]-
				matrixM14[1][1]*matrixM14[2][0]*matrixM14[3][3];
		m14m14 = 
				matrixM14[1][0]*matrixM14[2][1]*matrixM14[3][2]+
				matrixM14[1][1]*matrixM14[2][2]*matrixM14[3][0]+
				matrixM14[1][2]*matrixM14[2][0]*matrixM14[3][1]-
				matrixM14[1][2]*matrixM14[2][1]*matrixM14[3][0]-
				matrixM14[1][0]*matrixM14[2][2]*matrixM14[3][1]-
				matrixM14[1][1]*matrixM14[2][0]*matrixM14[3][2];
	//Determinant of M14
		double determinantM14 =
				matrixM14[0][0]*m14m11-
				matrixM14[0][1]*m14m12+
				matrixM14[0][2]*m14m13-
				matrixM14[0][3]*m14m14;
		//Determinant of M15
		//Determinants of M15's minors 
		double m15m11 = 0, m15m12 = 0, m15m13 = 0, m15m14 = 0;
		m15m11 = 
				matrixM15[1][1]*matrixM15[2][2]*matrixM15[3][3]+
				matrixM15[1][2]*matrixM15[2][3]*matrixM15[3][1]+
				matrixM15[1][3]*matrixM15[2][1]*matrixM15[3][2]-
				matrixM15[1][3]*matrixM15[2][2]*matrixM15[3][1]-
				matrixM15[1][1]*matrixM15[2][3]*matrixM15[3][2]-
				matrixM15[1][2]*matrixM15[2][1]*matrixM15[3][3];
		m15m12 = 
				matrixM15[1][0]*matrixM15[2][2]*matrixM15[3][3]+
				matrixM15[1][2]*matrixM15[2][3]*matrixM15[3][0]+
				matrixM15[1][3]*matrixM15[2][0]*matrixM15[3][2]-
				matrixM15[1][3]*matrixM15[2][2]*matrixM15[3][0]-
				matrixM15[1][0]*matrixM15[2][3]*matrixM15[3][2]-
				matrixM15[1][2]*matrixM15[2][0]*matrixM15[3][3];
		m15m13 = 
				matrixM15[1][0]*matrixM15[2][1]*matrixM15[3][3]+
				matrixM15[1][1]*matrixM15[2][3]*matrixM15[3][0]+
				matrixM15[1][3]*matrixM15[2][0]*matrixM15[3][1]-
				matrixM15[1][3]*matrixM15[2][1]*matrixM15[3][0]-
				matrixM15[1][0]*matrixM15[2][3]*matrixM15[3][1]-
				matrixM15[1][1]*matrixM15[2][0]*matrixM15[3][3];
		m15m14 = 
				matrixM15[1][0]*matrixM15[2][1]*matrixM15[3][2]+
				matrixM15[1][1]*matrixM15[2][2]*matrixM15[3][0]+
				matrixM15[1][2]*matrixM15[2][0]*matrixM15[3][1]-
				matrixM15[1][2]*matrixM15[2][1]*matrixM15[3][0]-
				matrixM15[1][0]*matrixM15[2][2]*matrixM15[3][1]-
				matrixM15[1][1]*matrixM15[2][0]*matrixM15[3][2];
	//Determinant of M12
		double determinantM15 =
				matrixM15[0][0]*m15m11-
				matrixM15[0][1]*m15m12+
				matrixM15[0][2]*m15m13-
				matrixM15[0][3]*m15m14;
		
	//CENTER OF SPHERE
		double x = 0.5*determinantM12/determinantM11;
		double y = -0.5*determinantM13/determinantM11;
		double z = 0.5*determinantM14/determinantM11;
	
	//RADIUS OF SPHERE
	double radius = Math.sqrt((x*x)+(y*y)+(z*z)-(determinantM15/determinantM11));
	
	//VOLUME OF SPHERE
	double volume = 4*3.1415*radius*radius*radius/3;
	
	//SURFACE AREA OF SPHERE
	double area = 4*3.1415*radius*radius;
	
	//Print Results
	UIManager.put("OptionPane.background",new ColorUIResource(150,150,250));
	UIManager.put("Panel.background",new ColorUIResource(150,150,250));
	JOptionPane.showMessageDialog(null,
			"The center of the sphere is: (" + x + "," + y + "," + z + ")." +
			"\nThe radius of the sphere is: " + radius + "." +
			"\nThe surface area of the sphere is: "+ area + "." +
			"\nThe volume of the sphere is: " + volume + ".",
			"Four Points to a Sphere",
			JOptionPane.INFORMATION_MESSAGE);
	}//eClass
}//eMain
