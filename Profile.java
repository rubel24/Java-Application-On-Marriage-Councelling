
package mainPackage;

public class Profile {
    private String userId;
    private String password;
    private String name;
    private String gender;
    private int age;
    private String address;
    private double height;
    private String complexion;
    private String education;
    private String religion;
    private String job;
    private int familyMember;
    public Profile(){

    }
    public Profile(String userId, String password, String name, String gender, int age, String address, double height,
                    String complexion, String education, String religion, String job, int familyMember) {
            this.userId = userId;
            this.password = password;
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.address = address;
            this.height = height;
            this.complexion = complexion;
            this.education = education;
            this.religion = religion;
            this.job = job;
            this.familyMember = familyMember;
    }
    public String getUserId() {
            return userId;
    }

    public void setUserId(String userId) {
            this.userId = userId;
    }

    public String getPassword() {
            return password;
    }

    public void setPassword(String password) {
            this.password = password;
    }

    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public String getGender() {
            return gender;
    }

    public void setGender(String gender) {
            this.gender = gender;
    }

    public int getAge() {
            return age;
    }

    public void setAge(int age) {
            this.age = age;
    }

    public String getAddress() {
            return address;
    }

    public void setAddress(String address) {
            this.address = address;
    }

    public double getHeight() {
            return height;
    }

    public void setHeight(double height) {
            this.height = height;
    }

    public String getComplexion() {
            return complexion;
    }

    public void setComplexion(String complexion) {
            this.complexion = complexion;
    }

    public String getEducation() {
            return education;
    }

    public void setEducation(String education) {
            this.education = education;
    }

    public String getReligion() {
            return religion;
    }

    public void setReligion(String religion) {
            this.religion = religion;
    }

    public String getJob() {
            return job;
    }

    public void setJob(String job) {
            this.job = job;
    }

    public int getFamilyMember() {
            return familyMember;
    }

    public void setFamilyMember(int familyMember) {
            this.familyMember = familyMember;
    }
        
}
