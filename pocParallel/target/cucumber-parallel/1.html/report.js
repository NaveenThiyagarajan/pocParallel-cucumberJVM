$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ThiyagaN/Documents/EclipseNeon2/eclipse/workspace/pocParallel/src/test/resources/features/parallel1.feature");
formatter.feature({
  "line": 1,
  "name": "A1",
  "description": "",
  "id": "a1",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5110112299,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "A11",
  "description": "",
  "id": "a1;a11",
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
  "name": "the page [http://www.google.com] is loaded",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.google.com",
      "offset": 10
    }
  ],
  "location": "StepDefinitions.openPage(String)"
});
formatter.result({
  "duration": 11375407384,
  "status": "passed"
});
formatter.after({
  "duration": 2360130458,
  "status": "passed"
});
formatter.before({
  "duration": 3233739745,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "A12",
  "description": "",
  "id": "a1;a12",
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
  "name": "the page [http://www.apple.com] is loaded",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.apple.com",
      "offset": 10
    }
  ],
  "location": "StepDefinitions.openPage(String)"
});
formatter.result({
  "duration": 9470411317,
  "status": "passed"
});
formatter.after({
  "duration": 1782751836,
  "status": "passed"
});
});