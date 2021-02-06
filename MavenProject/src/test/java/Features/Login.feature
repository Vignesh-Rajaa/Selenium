Feature: Login to the leaftaps  

Scenario Outline: TC001 Flow of the login
When Click login button
Then Verify the login
Given Click the crmsfa link
And Click Create Lead
And Enter Company Name <cmp name>
And Enter First Name <first name>
And Enter Last Name <last name>
And Click Create Lead button

Examples:
|cmp name|first name|last name|
|'Info'|'Vignesh'|'B'|
|'Tcs'|'Rajaa'|'B'|
