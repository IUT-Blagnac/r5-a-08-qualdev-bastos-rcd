Feature: Validate README.md file

  Scenario: The README.md file has the required sections and a valid license link
    Given a README.md file exists
    Then the first line should be a title starting with #
    And it should contain sections
      | ## About             |
      | ## Features          |
      | ## Technologies Used |
      | ## Getting Started   |
      | ## License           |