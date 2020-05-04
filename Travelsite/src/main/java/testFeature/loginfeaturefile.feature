Feature: Login features scenario

Scenario: booking.com login with valid credentials
Given open Chrome browser
Then enter bookingsite URl
Then I click Sign in
Then User logsin using Email "vinaysingh.ait@gmail.com" and Password "ZEppelin2K"
Then Login must be successfull

