Feature: Testleaf Login
Scenario Outline: Login into LeafTaps (positive)
#Given invoke LeafTap Application
And Enter the UserName as <Username>
And Enter the Password as <Password>
And Click on login button
And Click crmsfa link
And click leads tab
And click createlead link
And Enter the Company Name
And Enter the First Name
And Enter the Last Name
When click the CreateLead button
Then Verify the CreateLead Successfull
Examples:
|Username||Password|
|DemoSalesManager||crmsfa|
|DemoCSR||crmsfa|
