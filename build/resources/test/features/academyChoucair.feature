# Autor: Dancevangot
@stories
Feature: uTest
  As a user, I want to join today to uTest

  @scenario1
  Scenario Outline: Join to Utest

    Given than Wilson wants to join uTest

    When he complete the form on the uTest platform
      | strFName   | strLName   | strEmail   | strMBirth   | strDBirth   | strYBirth   | strLanguage   | strCity   | strZip   | strCountry   | strMobileD   | strModel   | strOSystem   | strPassword   |
      | <strFName> | <strLName> | <strEmail> | <strMBirth> | <strDBirth> | <strYBirth> | <strLanguage> | <strCity> | <strZip> | <strCountry> | <strMobileD> | <strModel> | <strOSystem> | <strPassword> |

    Then he finds the button called to create user
      | strUserCreated   |
      | <strUserCreated> |

    Examples:
      | strUserCreated | strFName | strLName | strEmail         | strMBirth | strDBirth | strYBirth | strLanguage | strCity | strZip | strCountry | strMobileD | strModel         | strOSystem | strPassword    |
      | Complete Setup | Wilson   | Ramírez  | pepito@gmail.com | April     | 2         | 1994      | Spanish     | Bogotá  | 110141 | Colombia   | Xiaomi     | Redmi Note 6 Pro | Android 10 | uTest.Wilson01 |


