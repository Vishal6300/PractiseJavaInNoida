package ques4;

public class College {
	private String collegeName;
	private int collegeId, placementRank;
	private long AverageTurnover;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public int getPlacementRank() {
		return placementRank;
	}
	public void setPlacementRank(int placementRank) {
		this.placementRank = placementRank;
	}
	public long getAverageTurnover() {
		return AverageTurnover;
	}
	public void setAverageTurnover(long averageTurnover) {
		AverageTurnover = averageTurnover;
	}
	
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collegeId=" + collegeId + ", placementRank=" + placementRank
				+ ", AverageTurnover=" + AverageTurnover + "]";
	}
	
	public College(String collegeName, int collegeId, int placementRank, long averageTurnover) {
		super();
		this.collegeName = collegeName;
		this.collegeId = collegeId;
		this.placementRank = placementRank;
		AverageTurnover = averageTurnover;
		
	}
	
	
}
