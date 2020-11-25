
This API is serving the purpose of contact storage and manipulation. Following operations are supported by the API.

Implemented functionality:
- List contacts
- Add a contact
- Edit contact
- Delete/Inactivate a contact

Contact model fields accommodates:
- First Name
- Last Name
- Email
- Phone Number
- Status (accepted values: Active/Inactive)

Resource URI's supported
- Get the list of contact : http://localhost:8080/api/contact
RequestMethod should be GET and no data in body required.

- Add a contact : http://localhost:8080/api/contact
RequestMethod should be POST and json model data which needs to be inserted should be provided in the body.
Data Required : {
        "firstName": "satveer",
        "lastName": "bhatia",
        "email": "satveer.bhatia@xyz.com",
        "phoneNo": 234567891,
        "status": "active"
    }
	
	
- Edit a contact : http://localhost:8080/api/contact
RequestMethod should be PUT to replace the contact and data should be provided in the body.
Data Required : {
        "firstName": "satveer",
        "lastName": "bhatia",
        "email": "satveer.bhatia@xyz.com",
        "phoneNo": 234567891,
        "status": "active"
    }
	
- Delete a contact : http://localhost:8080/api/contact/{id}
RequestMethod should be DELETE to delete a contact from the database