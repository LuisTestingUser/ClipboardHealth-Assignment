#Author : luiscarloslozano92@gmail.com
@Assignment
Feature: Clipboard Health Assignment for Luis Lozano
    Background: User navigates to amazon site
      Given User navigates to amazon

    Scenario: Second highest priced item ,about this item
      Given user clicks on hamburger menu
      Then user scrolls down to "shop by department" menu section
      And  user selects "TV, Appliances, Electronics" under the desired menu
      Then user selects "Televisions" from the filtered department
      And  user Selects "Samsung" under "Brands"
      Then user sorts by "Price: High to Low"
      And user selects the second item listed
      Then user confirms the section "About this item"