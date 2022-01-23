package inheritancePackage;

import java.util.Scanner;

class Person{
	
	private String name;
	private String dateOfBirth;
	private String gender;
	private String mobileNumber;
	private String bloodGroup;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth=dateOfBirth;
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber=mobileNumber;
	}
	
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup=bloodGroup;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public String getBloodGroup() {
		return bloodGroup;
	}
	
}

class Donor extends Person{

	private String bloodBankName;
	private String donorType;
	private String donationDate;
	
	public void setBloodBankName(String bloodBankName) {
		this.bloodBankName=bloodBankName;
	}
	
	public void setDonorType(String donorType) {
		this.donorType=donorType;
	}
	
	public void setDonationDate(String donationDate) {
		this.donationDate=donationDate;
	}
	
	public String getBloodBankName() {
		return bloodBankName;
	}
	
	public String getDonorType() {
		return donorType;
	}
	
	public String getDonationDate() {
		return donationDate;
	}
	
	public void displayDonationDetails( ) {
		System.out.println("Donation Details : ");
		System.out.println("Name : "+getName());
		System.out.println("Date Of Birth : "+getDateOfBirth());
		System.out.println("Gender : "+getGender());
		System.out.println("Mobile Number : "+getMobileNumber());
		System.out.println("Blood Group : "+getBloodGroup());
		System.out.println("Blood Bank Name : "+getBloodBankName());
		System.out.println("Donor Type : "+getDonorType());
		System.out.println("Donation Date : "+getDonationDate());
	}
	
}
public class inheritanceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Donor d=new Donor();
        System.out.println("Enter the name : ");
        String name=sc.nextLine();
        d.setName(name);
        
        System.out.println("Enter Date of Birth :");
        String dateOfBirth=sc.nextLine();
        d.setDateOfBirth(dateOfBirth);
        
        System.out.println("Enter Gender :");
        String gender=sc.nextLine();
        d.setGender(gender);
        
        System.out.println("Enter Mobile Number :");
        String mobileNumber=sc.nextLine();
        d.setMobileNumber(mobileNumber);
        
        System.out.println("Enter Blood Group :");
        String bloodGroup=sc.nextLine();
        d.setBloodGroup(bloodGroup);
        
        System.out.println("Enter Blood Bank Name :");
        String bloodBankName=sc.nextLine();
        d.setBloodBankName(bloodBankName);
        
        System.out.println("Enter Donor Type :");
        String donorType=sc.nextLine();
        d.setDonorType(donorType);
        
        System.out.println("Enter Donation Date :");
        String donationDate=sc.nextLine();
        d.setDonationDate(donationDate);
        
        d.displayDonationDetails();
        
	}

}
