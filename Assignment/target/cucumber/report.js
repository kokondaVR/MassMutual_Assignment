$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MassMutual_Assignment.feature");
formatter.feature({
  "line": 2,
  "name": "Solution to Problem1",
  "description": "",
  "id": "solution-to-problem1",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Problem1"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "Pre-scenario steps",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "We open the url \"https://www.excercise1.com/values\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.excercise1.com/values",
      "offset": 17
    }
  ],
  "location": "del.we_open_the_url(String)"
});
formatter.result({
  "duration": 3286547200,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify values on the landing page",
  "description": "",
  "id": "solution-to-problem1;verify-values-on-the-landing-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Objectives"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "We verify the right count of \"5\" values appear on the screen",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "We verify the values are formatted as currencies",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "We verify the values on the screen are greater than \"0\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "We verify the total balance is correct based on the values listed on the screen",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "We verify the total balance matches the sum of the values",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Logout",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 30
    }
  ],
  "location": "del.we_verify_the_right_count_of_values_appear_on_the_screen(String)"
});
formatter.result({
  "duration": 340800,
  "status": "passed"
});
formatter.match({
  "location": "del.we_verify_the_values_are_formatted_as_currencies()"
});
formatter.result({
  "duration": 265200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 53
    }
  ],
  "location": "del.we_verify_the_values_on_the_screen_are_greater_than(String)"
});
formatter.result({
  "duration": 287000,
  "status": "passed"
});
formatter.match({
  "location": "del.we_verify_the_total_balance_is_correct_based_on_the_values_listed_on_the_screen()"
});
formatter.result({
  "duration": 2112400,
  "error_message": "java.lang.AssertionError: Total calculated balance 1000000.0 does not match the sum of all values: 997000.0\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat step_files.del.we_verify_the_total_balance_is_correct_based_on_the_values_listed_on_the_screen(del.java:86)\r\n\tat ✽.And We verify the total balance is correct based on the values listed on the screen(MassMutual_Assignment.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "del.we_verify_the_total_balance_matches_the_sum_of_the_values()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "del.logout()"
});
formatter.result({
  "status": "skipped"
});
});