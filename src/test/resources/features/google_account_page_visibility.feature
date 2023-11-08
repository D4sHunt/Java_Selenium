Feature: Google Account Page Visibility
    Background: URL environment up
        Given Google url is open
    Scenario: Succesfull Google Account Page Visibility
        When Click on Google Applications button
        Then Validate Google Applications iframe is visible
        When Click on Account button
        Then Validate Google Account page is visible
        Then Close driver and browser