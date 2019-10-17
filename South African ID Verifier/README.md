# South African ID Verifier
### A java method that Verifies South African ID Numbers

Method will output either ``1`` (True) or ``0`` (False) as a String

Example of use:
```java
    String IDInput = "8001015009087"; //example ID
    String SAIDVerifyOUT = SAIDVerify.Validator(IDInput);//calls Method
    int isValid = Integer.parseInt(SAIDVerifyOUT);//converts String to int
```