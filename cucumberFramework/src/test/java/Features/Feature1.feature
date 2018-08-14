Feature: GetValues
  
Scenario Outline: Check value for id,name and company
    Given name is "<name>", id is "<id>" and company is "<company>"
    When get method is called.
    Then name, id and company matches
    
Examples: 
		|name			|id					|company	|
		|Shubham	|11574302		|Accenture|
		
	