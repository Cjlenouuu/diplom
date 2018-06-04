select charityname, firstname, lastname, RoleId 
from charity, registration, runner, user
where charity.CharityId = registration.CharityId and
		registration.RunnerId = runner.RunnerId and
        user.Email = runner.Email and
	LastName like 'A%' and FirstName like 'A%' and RoleId like 'R';