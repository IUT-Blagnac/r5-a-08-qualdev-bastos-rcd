Feature: Is it friday ?
    I want to know if it's Friday

    Scenario: Not Friday because it's Sunday
        Given today is Sunday
        When I ask whether it's Friday yet
        Then I should be told "Nope"

    Scenario: Friday is Friday
        Given today is Friday
        When I ask whether it's Friday yet
        Then I should be told "TGIF"
    
    Scenario Outline: friday or not
        Given today is "<day>"
        When I ask whether it's Friday yet
        Then I should be told "<answer>"

        Examples:
            | day            | answer |
            | Friday         | TGIF   |
            | Sunday         | Nope   |
            | anything else! | Nope   |