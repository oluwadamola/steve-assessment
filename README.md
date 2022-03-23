# steve-assessment
1) create an API gateway through which micro services shall be accessed.

2) create micro services - security-ms, account-ms, report-ms

3) The API gateway shall call 'validateUser' method on 'security-ms' and returns a 'token'

4) The API gateway shall call 'accountBalance' method on 'account-ms' by passing a 'token' paramter, the method returns a balance after validating that the passed token is a valid one.  

4) The API gateway shall call 'reportConnection' method on 'report-ms' by passing a 'token' paramter, the method returns a connection after validating that the passed token is a valid one.  


Note - validateUser - This API validates and returns a token [security-ms]
         - accountBalance - This API returns a balance. [account-ms]
         - reportConnection - This API returns a connection. [report-ms]
         - The security-ms shall have a method that generates a token
         - The security-ms, account-ms, report-ms should have a way of validating if the token passed is a valid token.

Question B)

1) create a multitenant microservice 'mutitenant-ms' that can access 'N' number of databases from different vendors by passing a tenant Id from the controller to access a vendor database

Note - Property files containg 'N' number of database connection should be included in your submission.
     - The microservice should be able to created same tables across the different database when started.


Question C)
1) create a microservice certificate-ms that can validate a certificate and return a list of strings.
