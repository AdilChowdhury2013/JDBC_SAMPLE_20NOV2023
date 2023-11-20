$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:feature_folder/LoginWithDataFromMySQLDB.feature");
formatter.feature({
  "name": "Codefios login page functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DbloginFeature"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the codefios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_is_on_Codefios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Other Scenario- user should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DbloginFeature"
    },
    {
      "name": "@DbScenario1"
    }
  ]
});
formatter.step({
  "name": "User enters the \"username\" from mySQL database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_Codefios_Signin_details_from_mySQL_database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"password\" from mySQL database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_Codefios_Signin_details_from_mySQL_database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the signin button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on Codefios dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});