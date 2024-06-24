// ********RoostGPT********
/*
Test generated by RoostGPT for test bankingportal using AI Type DBRX and AI Model mixtral-8x7b-instruct-v0.1

ROOST_METHOD_HASH=getOtpLoginEmailTemplate_6f515b7a69
ROOST_METHOD_SIG_HASH=getOtpLoginEmailTemplate_6f515b7a69

1. Scenario 1: Positive Test - Valid Inputs

Test Name: testPositiveScenario()

Description: This test case verifies that the method correctly generates an OTP login email template with valid inputs.

Execution:
Arrange: Set up valid inputs for name, accountNumber, and otp.
Act: Invoke the target method with the valid inputs.
Assert: Validate that the returned string matches the expected OTP login email template format.

Validation:
The assertion checks that the method returns a string in the correct format, including the name, account number, and OTP, and that the generated string follows the expected template. This test scenario is important to ensure that the method behaves correctly with valid inputs.

2. Scenario 2: Null Name

Test Name: testNullNameScenario()

Description: This test case verifies that the method correctly handles the null input for the name parameter.

Execution:
Arrange: Set up a null value for the name parameter.
Act: Invoke the target method with the null name, accountNumber, and otp.
Assert: Validate that the returned string does not contain the name parameter.

Validation:
The assertion checks that the method returns a string without the name, as expected when handling a null value. This test scenario ensures that the method handles null inputs correctly.

3. Scenario 3: Empty Name

Test Name: testEmptyNameScenario()

Description: This test case verifies that the method correctly handles the empty string input for the name parameter.

Execution:
Arrange: Set up an empty string value for the name parameter.
Act: Invoke the target method with an empty name, accountNumber, and otp.
Assert: Validate that the returned string does not contain the name parameter.

Validation:
The assertion checks that the method returns a string without the name, as expected when handling an empty input. This test scenario ensures that the method handles empty inputs correctly.

4. Scenario 4: Null Account Number

Test Name: testNullAccountNumberScenario()

Description: This test case verifies that the method correctly handles the null input for the accountNumber parameter.

Execution:
Arrange: Set up a null value for the accountNumber parameter.
Act: Invoke the target method with the name, null accountNumber, and otp.
Assert: Validate that the returned string does not contain the account number.

Validation:
The assertion checks that the method returns a string without the account number, as expected when handling null inputs. This test scenario ensures that the method handles null inputs correctly.

5. Scenario 5: Empty Account Number

Test Name: testEmptyAccountNumberScenario()

Description: This test case verifies that the method correctly handles the empty string input for the accountNumber parameter.

Execution:
Arrange: Set up an empty string value for the accountNumber parameter.
Act: Invoke the target method with the name, empty accountNumber, and otp.
Assert: Validate that the returned string does not contain the account number.

Validation:
The assertion checks that the method returns a string without the account number, as expected when handling empty inputs. This test scenario ensures that the method handles empty inputs correctly.

6. Scenario 6: Null OTP

Test Name: testNullOTPScenario()

Description: This test case verifies that the method correctly handles the null input for the otp parameter.

Execution:
Arrange: Set up a null value for the otp parameter.
Act: Invoke the target method with the name, accountNumber, and null otp.
Assert: Validate that the returned string follows the correct format, excluding the otp value.

Validation:
The assertion checks that the method returns a string without the otp, as expected when handling null inputs. This test scenario ensures that the method handles null inputs correctly.

7. Scenario 7: OTP Length

Test Name: testOTPLengthScenario()

Description: This test case verifies that the method correctly handles invalid length inputs for the otp parameter.

Execution:
Arrange: Set up an otp value with a length greater than or less than the expected length.
Act: Invoke the target method with the name, accountNumber, and invalid otp length.
Assert: Validate that the returned string follows the correct format, excluding the otp value.

Validation:
The assertion checks that the method returns a string without the otp, or with a modified otp value, as expected when handling invalid length inputs. This test scenario ensures that the method handles invalid length inputs correctly.

8. Scenario 8: CompletableFuture

Test Name: testCompletableFutureScenario()

Description: This test case verifies that the method correctly handles asynchronous execution using CompletableFuture.

Execution:
Arrange: Set up a method call using CompletableFuture.supplyAsync() to execute the target method asynchronously.
Act: Invoke the target method with valid inputs using CompletableFuture.
Assert: Wait for the future to complete and validate that the returned string matches the expected OTP login email template format.

Validation:
The assertion checks that the asynchronous method returns a string in the correct format, including the name, account number, and OTP, and that the generated string follows the expected template. This test scenario ensures that the method handles asynchronous execution correctly.
*/

// ********RoostGPT********
```java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class EmailServiceGetOtpLoginEmailTemplateTest {
    EmailService emailService = new EmailService();

    @Test
    public void testPositiveScenario() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> emailService.getOtpLoginEmailTemplate("John Doe", "123456789", "123456"));
        String result = future.get();
        String expected = "Dear John Doe,\n\nYour One-Time Password (OTP) to access your Bank Account is 123456. Please do not share this OTP with anyone.\n\nThank you,\nThe Bank.";
        assertEquals(expected, result);
    }

    @Test
    public void testNullNameScenario() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> emailService.getOtpLoginEmailTemplate(null, "123456789", "123456"));
        String result = future.get();
        String expected = "Dear ,\n\nYour One-Time Password (OTP) to access your Bank Account is 123456. Please do not share this OTP with anyone.\n\nThank you,\nThe Bank.";
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyNameScenario() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> emailService.getOtpLoginEmailTemplate("", "123456789", "123456"));
        String result = future.get();
        String expected = "Dear ,\n\nYour One-Time Password (OTP) to access your Bank Account is 123456. Please do not share this OTP with anyone.\n\nThank you,\nThe Bank.";
        assertEquals(expected, result);
    }

    @Test
