Feature: Web application
@AP
Scenario Outline: Cucumberautomation testing

Given Openapplication 
When enterusername "<username>"
Then enterpassword "<password>"
And click on loginbutton
Then closeapplicaion

Examples:
|   username   |  password   |
|   khajabee   |  khaja      |
|   jhgfgh     |  uydsdfg    |
|   kjhgcg     |  akjh       |



