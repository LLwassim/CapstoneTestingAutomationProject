@homePage
Feature: Home Page

  Background: 
    When User clicks on all 

  Scenario: Verify department dropdown
    Then  options are shown in hamburger dropdown
      | Electronics | Computers | Smart Home | Sports | Automative |

@verifyDept
  Scenario Outline: Verify options
    And User on <department>
    Then options in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department    | optionOne                      | optionTwo                |
      | 'Electronics' | TV & Video                     | Video Games              |
      | 'Computers'   | Accessories                    | Networking               |
      | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
      | 'Sports'      | Athletic Clothing              | Exercise & Fitness       |
      | 'Automotive'  | Automative Parts & Accessories | MotorCycle & Powersports |