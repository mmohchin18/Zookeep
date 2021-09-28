Feature: Flying Bat
    The Bat wants to fly


  Scenario: Bat wants to fly
    @Given The bat wants to fly
    @And The bat can fly
    @When it is not windy
    @Then the bat cn fly

    Scenario: The bat cant fly
      @Given It is sunny
      @And The bat does not take off
      @When The bat does not fly