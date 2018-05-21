select CharityLogo, CharityName, sum(Amount)
from charity, sponsorship, registration
where charity.CharityId=registration.CharityId and
	  registration.RegistrationId=sponsorship.RegistrationId
group by CharityName;