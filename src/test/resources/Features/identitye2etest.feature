Feature:
  As a user
  I want to be able to check the information on my plate
  So I can tell if my vehicle is taxed and has an MOT

Scenario: Spreadsheet file with a valid plate number
  Given the user has a valid spreadsheet with a valid plate number
  When the user consults the provided URL
  Then the correct make and color details should be displayed