Feature: Messages by Admin Validate with API
  Scenario: Admin can go to messages portal and view all messages, their authors and emails
    Given medunna ana sayfasina gider
    And Login as admin
    And Clicks on items and titles
    And Clicks on Messages
    Then Tests whether the author and messages are visible
    And tarayiciyi kapatir



    Scenario: Admin can edit view and delete messages
      Given medunna ana sayfasina gider
      And Login as admin
      And Clicks on items and titles
      And Clicks on Messages
      Then Tests Delete Edit And View Buttons are enabled
      And tarayiciyi kapatir


      Scenario: Message Validation with API
        Given User creates a Message
        And Posts the message
        Then With request compares both messages

