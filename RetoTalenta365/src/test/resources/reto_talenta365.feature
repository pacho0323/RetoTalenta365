#Author: pacho0323@hotmail.com
Feature: Create user

  Background: 
    Given that the user is on the website

  @createUser
  Scenario Outline: Create user
    When enter the data of the user
      | username   | password   | confirmpassword   | email   | firtsName   | lastName   | phone   | country   | city   | address   | state   | postalCode   |
      | <username> | <password> | <confirmpassword> | <email> | <firtsName> | <lastName> | <phone> | <country> | <city> | <address> | <state> | <postalCode> |
    Then the user should see at <username> logged in

    Examples: User
      | username | password     | confirmpassword | email                 | firtsName      | lastName       | phone      | country  | city     | address | state     | postalCode |
      | pacho00  | Diciembre202 | Diciembre202    | pacho0323@hotmail.com | Juan Francisco | Builes Montoya | 3004500101 | Colombia | Medellin | calle 2 | Antioquia |     050001 |

  @logIn
  Scenario Outline: Log in
    When the user log in with the data
      | username   | password   |
      | <username> | <password> |
    Then the user should see at <username> logged in

    Examples: Login
      | username | password     |
      | pacho00 | Diciembre202 |

  @buyProduct
  Scenario Outline: Buy a product
    When the user log in with the data
      | username   | password   |
      | <username> | <password> |
    And user search for product
      | category   | products    |
      | <category> | <products> |
    Then the user should see the product selected <products>

    Examples: Product
      | username | password     | category | products                     |
      | pacho00  | Diciembre202 | LAPTOPS  | HP Pavilion 15t Touch Laptop |