/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Админ
 * Created: 12.06.2018
 */

SELECT SponsorshipId, Amount, FirstName, LastName
FROM sponsorship, registration, runner, user 
WHERE SponsorshipId like "2" and
sponsorship.RegistrationId = registration.RegistrationId and
registration.RunnerId = runner.RunnerId and 
runner.Email = user.Email;