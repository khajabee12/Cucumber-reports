Feature: Web application
Scenario Outline: Cucumberautomation testing

Given Openapplication 
When enterusername "<username>"
Then enterpassword "<password>"
And click on loginbutton
Then closeapplicaion


Examples:
|username   |  password    |
|khajabee   |  khaja     |
|AKfeature  |   AK     |
|khajabee   |  ar  |



