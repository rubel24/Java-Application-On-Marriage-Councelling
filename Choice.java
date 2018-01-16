
package mainPackage;

public class Choice {
    private int ageCh;
    private String addressCh;
    private double heightCh;
    private String complexionCh;
    private String educationCh;
    private String jobCh;
    private int familyMemberCh;
        
        public Choice(){
            
        }
        public Choice(int ageCh, String addressCh, double heightCh,String complexionChCh,String educationCh,String jobCh,int familyMemberCh){
            this.ageCh = ageCh;
            this.addressCh = addressCh;
            this.heightCh = heightCh;
            this.complexionCh =complexionChCh;
            this.educationCh = educationCh;
            this.jobCh = jobCh;
            this.familyMemberCh = familyMemberCh;
        }
        public int getAgeCh() {
		return ageCh;
	}

	public void setAgeCh(int age_ch) {
		this.ageCh = age_ch;
	}

	public String getAddress_ch() {
		return addressCh;
	}

	public void setAddressCh(String address_ch) {
		this.addressCh = address_ch;
	}

	public double getHeightCh() {
		return heightCh;
	}

	public void setHeightCh(float height_ch) {
		this.heightCh = height_ch;
	}

	public String getcomplexionCh() {
		return complexionCh;
	}

	public void setComplexionCh(String scrColor_ch) {
		this.complexionCh = scrColor_ch;
	}

	public String getEducationCh() {
		return educationCh;
	}

	public void setEducationCh(String education_ch) {
		this.educationCh = education_ch;
	}

	public String getJobCh() {
		return jobCh;
	}

	public void setJobCh(String job_ch) {
		this.jobCh = job_ch;
	}

	public int getFamilyMemberCh() {
		return familyMemberCh;
	}

	public void setFamilyMemberCh(int familyMember_ch) {
		this.familyMemberCh = familyMember_ch;
	}
}
