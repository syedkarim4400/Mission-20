$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginPage.feature");
formatter.feature({
  "line": 1,
  "name": "Home Page",
  "description": "",
  "id": "home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify user can login successfully",
  "description": "",
  "id": "home-page;verify-user-can-login-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click on Signin link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on Signin Button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click Signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Verify user can login successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 8
    }
  ],
  "location": "LoginPageSteps.launch_url(String)"
});
formatter.result({
  "duration": 3012918500,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.click_on_Signin_link()"
});
formatter.result({
  "duration": 894713900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.click_on_Signin_Button()"
});
formatter.result({
  "duration": 1715288500,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.enter_username_and_password()"
});
formatter.result({
  "duration": 1319082800,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.click_Signin_button()"
});
formatter.result({
  "duration": 154683500,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.Verify_user_can_login_successfully()"
});
formatter.result({
  "duration": 2421990100,
  "status": "passed"
});
});