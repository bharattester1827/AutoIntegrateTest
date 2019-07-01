$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/AutoIntegrateTest.feature");
formatter.feature({
  "line": 2,
  "name": "Login Test",
  "description": "",
  "id": "login-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AutoIntegrateTest"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "User is on Login Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on Login page when browser opened",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 9,
  "name": "User login with valid credentials",
  "description": "",
  "id": "login-test;user-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User enter \"Username\" and \"Password\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User is able to view homepage",
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