Feature: To validate the login functionality of inmakes application

Scenario: To validate login with valid username and invalid password

Given To launch the chrome browser and maximise the window

When To launch the url of the inmakes application

And To pass the valid username in email field
And To pass invalid password in password field
And to click the login button
And To check wheather nagigate to home page or not

Then To close the browser

Scenario Outline: To validate the positive and negative combination of login functionality
Given user has to launch the browser and maximise the window
When user has hit the inmakes learning Url 
And user has to pass the data "<emaildatas>" in email field
And user has to pass the data "<passworddatas>" in password field
And user has to click the login button 
Then user has to close the browser

Examples:
|emaildatas                |passworddatas  |
|kasheefbasha1901@gmail.com|12345          |
|inmakes@gmail.com         |778647         |
|frameworks@gmail.com      |cucumber       |
|kash@gmail.com            |jujuju         |
|maffaaz@gmail.com         |kasheef12345   |
|abc@gmail.com             |778647         |
