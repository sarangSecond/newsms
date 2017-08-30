$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/first_cuke.feature");
formatter.feature({
  "line": 1,
  "name": "First cuke feature",
  "description": "This feature is for testing cucumber",
  "id": "first-cuke-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Simple scenario",
  "description": "",
  "id": "first-cuke-feature;simple-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Any test input",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Anything happens",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Any output",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});