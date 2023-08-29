Feature: Calculate the total cost

  Background:
    #Given open the browser and launch the Vue app

@priceCalculator
  Scenario: Change Base Price and adding prices of other components
  #1. Change Base Price value to 5
    When Hover row on BasePrice component
    When User clicks on Pencil icon
    And User clicks on value input on the right
    Then User enters new value '5'
    And User clicks on Check icon
    Then User verify displayed sum shows correct '5.00'sum
  #2. Add all price components from Testdata
    When User adds all price components
      | label              | value |
      | Alloy surcharge    | 2.15  |
      | Scrap surcharge    | 3.14  |
      |Internal surcharge  |0.7658 |
      | External surcharge | 1     |
      | Storage surcharge  | 0.3   |
    Then verify value has more than decimal digits, round to decimal digits "12.36"
  #3. Remove price component: Internal surcharge
    When Hover row on Internal surcharge component
    And User click on Trash icon
    Then User verify displayed sum shows correct '11.59' sum
  #4. Edit price component: Storage surcharge
    When User hover row Storage surcharge component and clicks on the pencil icon
    And User clicks and enters new label 'T'
    Then Verify if input is invalid "This label is too short!" restore last valid state
  #5. Edit price component: Scrap surcharge
    When Hover row on Scrap surcharge component and clicks on the pencil icon
    And User enters negative value "-2.15"
    Then Verify values "Cannot be negative!" and restore last valid state
  #6. Edit price component: Alloy surcharge
    When Hover row on Alloy surcharge component and clicks on the pencil icon
    And User enters new value '1.79' and click on the Check icon
    Then Verify displayed sum shows correct sum '11.23'

  

















