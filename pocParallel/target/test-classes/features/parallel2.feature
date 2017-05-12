Feature: A2
  
  	@parallel
    Scenario: A21
    When the page [http://www.facebook.com] is loaded
     
    @parallel 
    Scenario: A22
    When the page [http://www.twitter.com] is loaded
    
    #@parallel 
#		Scenario Outline: Simple interaction with a web page firefox
    #Given I am on the Google search page on firefox
    #When I search for <1A>
    #Then the site <2A> should be present in the results
    #
     #Examples:
    #|1A|2A|
    #|"OpenCredo"|"www.opencredo.com"|