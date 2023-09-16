package Flyaway.Project1;

public class Pageobjectforflyaway {
public String LoginButton() {
	String LoginPage="//a[@href='login']";
	return LoginPage;
}
public String EnterUserID() {
	String Email="//input[@name=\"email_id\"]";
	return Email;
}
public String EnterPassword() {
	String Password="//input[@name='pwd']";
	return Password;
}
public String Clickloginbutton() {
	String Click="//button";
	return Click;
}
public String ClickHomePage() {
	String Home="//a[@href=\"home\"]";
	return Home;
}
public String FromDropdown() {
	String From="//select[@name=\"source\"]";
	return From;
}
public String ToDropdown() {
	String To="//select[@name=\"destination\"]";
	return To;
}
public String SubmitDropDown() {
	String Submit="//button";
	return Submit;
}
public String BookFlight() {
	String Book="//a[@href=\"bookflight?id=3\"]";
	return Book;
}
public String BookFlight1() {
	String Book="//a[@href=\"bookflight?id=5\"]";
	return Book;
}
public String CompleteBooking() {
	String Complete="//a[@href=\"completepurchase\"]";
	return Complete;
}
public String BookingConfirmation() {
	String Confirmation="//h3";
	return Confirmation;
}
public String Editpage() {
	String Editpage="//a[@href='editprofile']";
	return Editpage;
}
public String EditPassword() {
	String EditPass="//input[@name=\"pwd\"]";
	return EditPass;
}
public String EditConfirmPassword() {
	String EditConPass="//input[@name=\"pwd2\"]";
	return EditConPass;
}
public String EditName() {
	String Editname="//input[@name=\"name\"]";
	return Editname;
}
public String EditAddress() {
	String Editadd="//input[@name=\"address\"]";
	return Editadd;
}
public String EditCity() {
	String Editcity="//input[@name=\"city\"]";
	return Editcity;
}
public String UpdatePage() {
	String Update="//button";
	return Update;
}
public String BookingsPage() {
	String Bookings="//a[@href=\"memberbookings\"]";
	return Bookings;
}
public String TotalBookings() {
	String Total="//h3";
	return Total;
}
public String LogoutPage() {
	String Logout="//a[@href=\"logout\"]";
	return Logout;
}
}
