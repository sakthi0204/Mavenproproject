$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactinfea/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@ad1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch \"https://adactinhotelapp.com/index.php\" The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;login-page;;1"
    },
    {
      "cells": [
        "abc",
        "123"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;login-page;;2"
    },
    {
      "cells": [
        "Sakthi0204",
        "Sakthi@0204"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;login-page;;3"
    },
    {
      "cells": [
        "Sakthi0204",
        "V2T6W8"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;login-page;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11340100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@ad1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch \"https://adactinhotelapp.com/index.php\" The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter \"abc\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter \"123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://adactinhotelapp.com/index.php",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Launch_The_Application(String)"
});
formatter.result({
  "duration": 3385651100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Username_Field(String)"
});
formatter.result({
  "duration": 5262077501,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Password_Field(String)"
});
formatter.result({
  "duration": 1394386500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel()"
});
formatter.result({
  "duration": 2590325900,
  "status": "passed"
});
formatter.after({
  "duration": 341999,
  "status": "passed"
});
formatter.before({
  "duration": 436900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@ad1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch \"https://adactinhotelapp.com/index.php\" The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter \"Sakthi0204\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter \"Sakthi@0204\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://adactinhotelapp.com/index.php",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Launch_The_Application(String)"
});
formatter.result({
  "duration": 547761499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sakthi0204",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Username_Field(String)"
});
formatter.result({
  "duration": 2335459901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sakthi@0204",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Password_Field(String)"
});
formatter.result({
  "duration": 1356275999,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel()"
});
formatter.result({
  "duration": 1336986201,
  "status": "passed"
});
formatter.after({
  "duration": 272800,
  "status": "passed"
});
formatter.before({
  "duration": 280499,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "login page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@ad1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch \"https://adactinhotelapp.com/index.php\" The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter \"Sakthi0204\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter \"V2T6W8\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://adactinhotelapp.com/index.php",
      "offset": 13
    }
  ],
  "location": "Step_Definition.user_Launch_The_Application(String)"
});
formatter.result({
  "duration": 1196142700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sakthi0204",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Username_Field(String)"
});
formatter.result({
  "duration": 2332017900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "V2T6W8",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Password_Field(String)"
});
formatter.result({
  "duration": 1243648899,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel()"
});
formatter.result({
  "duration": 2299713600,
  "status": "passed"
});
formatter.after({
  "duration": 163701,
  "status": "passed"
});
formatter.before({
  "duration": 193100,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@ad2"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user Select The Hotel \"Sydney\" Location",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Select The Hotel \"Hotel Sunshine\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The Room \"Super Deluxe\" Type",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The \"2\" Number Of Room",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select CheckIn \"17/11/2021\" Date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select CheckOut \"22/11/2021\" Date",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select The Adults \"2\" Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select The Children \"2\" Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Click On Search Button And It Navigate To The Select Hotel",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 23
    }
  ],
  "location": "Step_Definition.user_Select_The_Hotel_Location(String)"
});
formatter.result({
  "duration": 1155039700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Sunshine",
      "offset": 23
    }
  ],
  "location": "Step_Definition.user_Select_The_Hotel(String)"
});
formatter.result({
  "duration": 334606100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Super Deluxe",
      "offset": 22
    }
  ],
  "location": "Step_Definition.user_Select_The_Room_Type(String)"
});
formatter.result({
  "duration": 306300699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_Number_Of_Room(String)"
});
formatter.result({
  "duration": 294514400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "17/11/2021",
      "offset": 21
    }
  ],
  "location": "Step_Definition.user_Select_CheckIn_Date(String)"
});
formatter.result({
  "duration": 222799000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "22/11/2021",
      "offset": 22
    }
  ],
  "location": "Step_Definition.user_Select_CheckOut_Date(String)"
});
formatter.result({
  "duration": 435155200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 24
    }
  ],
  "location": "Step_Definition.user_Select_The_Adults_Per_Room(String)"
});
formatter.result({
  "duration": 288059600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 26
    }
  ],
  "location": "Step_Definition.user_Select_The_Children_Per_Room(String)"
});
formatter.result({
  "duration": 376271901,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Search_Button_And_It_Navigate_To_The_Select_Hotel()"
});
formatter.result({
  "duration": 1500700600,
  "status": "passed"
});
formatter.after({
  "duration": 532000,
  "status": "passed"
});
formatter.before({
  "duration": 903100,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Select Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;select-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@ad3"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user Click Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user Click On Continue Button And It Navigate to Book Hotel",
  "keyword": "And "
});
formatter.match({
  "location": "Step_Definition.user_Click_Radio_Button()"
});
formatter.result({
  "duration": 58000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Continue_Button_And_It_Navigate_to_Book_Hotel()"
});
formatter.result({
  "duration": 1413325700,
  "status": "passed"
});
formatter.after({
  "duration": 224000,
  "status": "passed"
});
formatter.before({
  "duration": 224500,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Book Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@ad4"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user Enter \"Sakthi\" In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Enter \"Prakash\" In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter \"4,martin road ,sydney\" In Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter \"0123456789012345\" In Credit Card No Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Select The Credit Card \"MAST\" Type",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Select The Expiry \"4\" Month And \"2022\" Year",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user \"123\" In Cvv Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Click On The Book Now Button And It Navigate To Booking Confirmation",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sakthi",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_First_Name_Field(String)"
});
formatter.result({
  "duration": 1129102400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prakash",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Last_Name_Field(String)"
});
formatter.result({
  "duration": 275233100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4,martin road ,sydney",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Address_Field(String)"
});
formatter.result({
  "duration": 271694801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0123456789012345",
      "offset": 12
    }
  ],
  "location": "Step_Definition.user_Enter_In_Credit_Card_No_Field(String)"
});
formatter.result({
  "duration": 328091400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MAST",
      "offset": 29
    }
  ],
  "location": "Step_Definition.user_Select_The_Credit_Card_Type(String)"
});
formatter.result({
  "duration": 281496400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 24
    },
    {
      "val": "2022",
      "offset": 38
    }
  ],
  "location": "Step_Definition.user_Select_The_Expiry_Month_And_Year(String,String)"
});
formatter.result({
  "duration": 679053100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 6
    }
  ],
  "location": "Step_Definition.user_In_Cvv_Number_Field(String)"
});
formatter.result({
  "duration": 305843200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Book_Now_Button_And_It_Navigate_To_Booking_Confirmation()"
});
formatter.result({
  "duration": 6922100300,
  "status": "passed"
});
formatter.after({
  "duration": 184199,
  "status": "passed"
});
});