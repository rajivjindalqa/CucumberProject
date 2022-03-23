
@CarrierFile
 Feature: Data reported to the carrier

  @GetConfirmation
  Scenario Outline: As a user, I want to report my data to the carrier in the Bfexto File.
  
    Given <data> hass been reported to the carrier
    
    When Data is updated in the <required> table
    
    Then Will get the confirmation
    
Examples:

|data |required|
|data1|PED     |
|data2|SED     |    
|data3|RET     |    
    
    
   