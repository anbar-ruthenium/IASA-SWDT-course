Feature: Dropbox WebAPI Test

  Scenario Outline: Upload file test
    Given I have a file "<name>"
    When I upload file "<name>" to Dropbox
    Then I see file "<name>" successfully uploaded
    Examples:
      |                           name |
      |         TestFileToTransfer.txt |

  Scenario Outline: Get file metadata test
    Given I have an uploaded file "<name>"
    When I request metadata of file "<name>" by its id
    Then I receive metadata for file "<name>"
    Examples:
      |                           name |
      |         TestFileToTransfer.txt |

  Scenario Outline: Delete file test
    Given I have an uploaded file "<name>"
    When I ask to delete file "<name>"
    Then I see file "<name>" is successfully deleted
    Examples:
      |                           name |
      |         TestFileToTransfer.txt |
