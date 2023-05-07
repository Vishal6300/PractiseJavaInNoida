package ques4;

public class Main {
	
	public static void getDetails(College obj) {
		double average=(obj.getAverageTurnover()*0.23);
		
		System.out.println( "College [collegeName=" + obj.getCollegeName() + ", collegeId=" + obj.getCollegeId() + ", placementRank=" + obj.getPlacementRank()
				+ ", AverageTurnover=" + obj.getAverageTurnover() + " +AverageIncome=" + average +"]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		College college1= new College("cvRaman",101,1,5000000);
		College college2= new College("NMIET",102,4,2500000);
		College college3= new College("GITA",103,3,4000000);
		
		getDetails(college3);
	}

}
