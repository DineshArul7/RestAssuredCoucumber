Feature: Validating Place API's

  @AddPlace
  Scenario Outline: Verify if place is bring succesfully added using AddPlaceAPI
    Given Add place Payload with "<name>" "<address>" "<language>"
    When user calls "AddPlaceAPI" with "POST" http request
    Then the API call got success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And Verify place_Id created maps to "<name>" using "getPlaceAPI"

Examples:
    | name | address | language|
    | Deekay     |  No 14 kvk swamy        |    Tamill     |
  #  | Awesome | no 3/440 |  German |

  @DeletePlace
    Scenario: Verify if added place is Deleted Successfully
      Given DeletePlace Payload build
      When user calls "deletePlaceAPI" with "POST" http request
      Then the API call got success with status code 200
      And "status" in response body is "OK"