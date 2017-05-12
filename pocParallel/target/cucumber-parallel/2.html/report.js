$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ThiyagaN/Documents/EclipseNeon2/eclipse/workspace/pocParallel/src/test/resources/features/parallel2.feature");
formatter.feature({
  "line": 1,
  "name": "A2",
  "description": "",
  "id": "a2",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4931670293,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "A21",
  "description": "",
  "id": "a2;a21",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@parallel"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the page [http://www.facebook.com] is loaded",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.facebook.com",
      "offset": 10
    }
  ],
  "location": "StepDefinitions.openPage(String)"
});
formatter.result({
  "duration": 11042072341,
  "status": "passed"
});
formatter.after({
  "duration": 2618236309,
  "status": "passed"
});
formatter.before({
  "duration": 3976088254,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "A22",
  "description": "",
  "id": "a2;a22",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@parallel"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "the page [http://www.twitter.com] is loaded",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.twitter.com",
      "offset": 10
    }
  ],
  "location": "StepDefinitions.openPage(String)"
});
formatter.result({
  "duration": 9535494972,
  "status": "passed"
});
formatter.after({
  "duration": 1776320131,
  "status": "passed"
});
});