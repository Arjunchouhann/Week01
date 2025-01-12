//Create PenDistributer Class to distribution of pen among students
public class PenDistributer {
	public static void main(String[]args){
		//Create a variable pens to indicate quantity of pens
		int pens = 14;
		//Create a variable students to indicate quantity of students
		int students = 3;
		//Create a variable penPerStudent to calculate quantity of pens for each students
		int penPerStudent = pens / students ;
		//Create a variable remainingPens to find quantity of pens left 
		int remainingPens = pens % students ;
		//print details of Pen per students and remaining pen quantity
		System.out.println("The Pen Per Students " + penPerStudent + " and the remaining pen not distributed is " + remainingPens );
	}
}