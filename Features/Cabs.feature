Feature: MakeMyTrip Page

Scenario: Search cabs for one-way
Given I am on home page
When I click on Cabs
And I am on Outstation One-Way
And I select From as "Hyderabad"
And I select To as "Mumbai"
And I select Departure date as "29 Mar 24"
And I click on search 
And I select filter Cab Type as "SEDAN"
Then I able to view the car details based on preferences


Scenario: Search cabs for round trip
Given I am on Cabs
When I click on round trip
And I select From city as "Goa"
And I select To city as "Bengaluru"
And I select Departure as "29 Mar 24"
And I select return date as "30 Mar 24"
And I click on search button
And I select type as "SEDAN"
Then I able to view the car details for return date


Scenario: Search cabs for Airport
Given I am on Cabs
When I click on Airport transfers
And I select pickup type as "From Airport"
And I select Airport as "Rajiv Gandhi"
And I select Drop Location as "Jubilee Hills"
And I select date as "01 Apr 2024"
And I click on search for details
Then I able to view the car details for specific date


Scenario: Search cabs for Hourly Rentals
Given I am on Cabs
And I select pickup type as "From Airport"
And I select Airport as "Rajiv Gandhi"
And I select Drop Location as "Jubilee Hills"
And I select date as "01 Apr 2024"
And I click on search for details
When I click on Hourly Rentals
And I select pickup location as "Delhi"
And I select Pickup-Date as "02 Apr 2024"
And I select package as "2hrs 20kms"
And I click on search for cabs
Then I able to view the car details for location


Scenario: Setting Filters
Given I am on Cabs
When I click on Hourly Rentals
And I select pickup location as "Delhi"
And I select Pickup-Date as "02 Apr 2024"
And I select package as "2hrs 20kms"
And I click on search
And I select Cab type  as "HATCHBACK"
And I select Fuel type as "DIESEL"
Then I able to view the car details for package



