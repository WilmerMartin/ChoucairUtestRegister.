#Autor: wilmer martin

  @stories
  Feature: Automation Utest
    As a user I want to register on the Utest site
    @scenario1
    Scenario: Registration of a new user on the utest platform
      Given than Wilmer wants to register a new user by clicking on the Join Today button
      When he enters the First Name "Wilmer", Last Name "Martin", Email "Wilmerm@gmail.com", Language "Spanish"
      And in Step two enter city "Bogotá Bogota, Colombia", zip code "111071"
      And in Step four enter password "Wq10101010101", confirm password "Wq10101010101"
      Then he clicks on the complete setup button


