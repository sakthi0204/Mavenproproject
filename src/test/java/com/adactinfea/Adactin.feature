Feature: Hotel Booking In Adactin Application

@ad1
Scenario Outline: login page
Given user Launch "https://adactinhotelapp.com/index.php" The Application
When user Enter "<Username>" In Username Field
And user Enter "<Password>" In Password Field
Then user Click On The Login Button And It Navigates To The Search Hotel

Examples:
		|Username|Password|
		|abc|123|
		|Sakthi0204|Sakthi@0204|
		|Sakthi0204|V2T6W8|

@ad2
Scenario: Search Hotel
When user Select The Hotel "Sydney" Location 
And user Select The Hotel "Hotel Sunshine" 
And user Select The Room "Super Deluxe" Type
And user Select The "2" Number Of Room
And user Select CheckIn "17/11/2021" Date 
And user Select CheckOut "22/11/2021" Date
And user Select The Adults "2" Per Room 
And user Select The Children "2" Per Room 
Then user Click On Search Button And It Navigate To The Select Hotel

@ad3
Scenario: Select Hotel 
When user Click Radio Button
And user Click On Continue Button And It Navigate to Book Hotel

@ad4
Scenario: Book Hotel 
When user Enter "Sakthi" In First Name Field
And user Enter "Prakash" In Last Name Field
And user Enter "4,martin road ,sydney" In Address Field 
And user Enter "0123456789012345" In Credit Card No Field
And user Select The Credit Card "MAST" Type 
And user Select The Expiry "4" Month And "2022" Year
And user "123" In Cvv Number Field 
Then user Click On The Book Now Button And It Navigate To Booking Confirmation 

@ad5
Scenario: Booking Confirmation
Then user Click On The Logout And Successfully Logged Out 






