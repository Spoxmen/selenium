Feature: Login page test

	Scenario: Fill the reservation form
	Given I open main page
	When I click SIGN-ON link
	Then I should see login page
	When I log in as "ZenekNiszczyciel" with password "Zenek123"
	And I fill one passenger flight
	And Dates for tomorrow
	And From flight: "Boston" at day "10" month "7"
	And To flight: "London" at day "11" month "7"
	And Close the browser