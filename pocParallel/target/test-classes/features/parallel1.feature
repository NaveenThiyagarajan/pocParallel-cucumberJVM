Feature: A1
  
  	@parallel
    Scenario: A11
    When the page [http://www.google.com] is loaded
     
    @parallel 
    Scenario: A12
    When the page [http://www.apple.com] is loaded
    
    #@parallel
#		Scenario Outline: Simple interaction with a web page chrome
    #Given I am on the Google search page on chrome
    #When I search for <1A>
    #Then the site <2A> should be present in the results
    #
    #Examples:
    #|1A|2A|
    #|"OpenCredo"|"www.opencredo.com"|