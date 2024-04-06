Feature: Create Wallet
  Scenario: As User I want to create first main wallet without back up
    Given user in home page
    When user click button create new wallet
    And user redirect to connect wallet option modal
    And user click button create new wallet
    And user click button secret phrase
    And user redirect to Back up offer pages
    And user click button skip on Back up screen offer
    And user redirect to passcode pages
    And user input 6 digits passcode in creation passcode pages
    And user re-enter 6 digits passcode in cofirm passcode pages
    And user got Biometric login offer
    And user click confirm
    And user tap fingerprint for 3 seconds
    Then Biometric Login success
    And Wallet creation success
    And user redirect to home page
    And user should be able to see Welcome aboard modal

  Scenario: User accept offer start using wallet
    Given user success create wallet for the firs time
    And user should be able to see Welcome aboard modal
    And user should be able to see "Start using Trust Wallet" Offer button
    When user click button "Start using Trust Wallet"
    Then the modal closed

  Scenario: As User I create new first main wallet with Back up Secret Phrase
    Given user in home page
    When user click create new wallet button
    And user redirect to connect wallet option modal
    And user click button create new wallet
    And user click button secret phrase
    And user redirect to Back up offer pages
    And user click secret phrase
    And user click button create
    And should be able to see Back up pages
    And user click button Back up manually
    And user should be able to redirect to confirmation pages
    And user confirm all concern
    And user click button continue
    And user should be able to see secret phrase
    And user click button copy to clipboard to copy all phrase
    And user click button continue
    And user fulfill confirmation secret phrase
    And user click button Confirm
    And and user create 6 digits passcode
    And user re-enter passcode in the confimation pages
    And user got Biometric login offer
    And user click confirm
    And user tap fingerprint for 3 seconds
    Then Biometric Login success
    And user should be able to see welcome aboard modal
    And user user should be able to redirect to home pages

  Scenario: As User I want deny biometric login while first main create wallet
    Given user in home page
    When user click button create new wallet
    And user redirect to connect wallet option modal
    And user click button create new wallet
    And user click button secret phrase
    And user redirect to Back up offer pages
    And user click button skip on Back up screen offer
    And user redirect to passcode pages
    And user input 6 digits passcode in creation passcode pages
    And user re-enter 6 digits passcode in cofirm passcode pages
    And user got Biometric login offer
    And user click deny
    Then Wallet creation is success
    And user redirect to home page
    And user should be able to see Welcome aboard modal

  Scenario: As User I want to create second wallet
    Given user in home pages
    When user click Main Wallet option
    And user redirect to wallets pages
    And user should be able to see list of wallets user
    And user click button "+"
    And user select Create new wallet
    And user redirect to Back Up offer pages
    And user click button skip on Back up screen offer
    Then Wallet creation is success
    And user redirect to home page
    And user should be able to see Welcome aboard modal
    