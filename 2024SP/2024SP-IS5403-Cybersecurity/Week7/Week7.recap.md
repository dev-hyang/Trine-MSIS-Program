# Topic 1 Cybersecurity Architecture: Roles and Tools

## Roles:
* Stakeholders
	- Where the requirement come from
* Architect
	- Design the picture/blueprint/overview diagram what the requirement would be like in the software system
		- physical architecture
	- Normal IT architect: how to make the system workable
	- CyberSecurity Architect considerations: 
		* how the system would fail and what I need to do to prevent that
		* What could go wrong in each implementation step of the architecture?
			* would the passphases be broken or stolen? If so, set up MFA or else
			* would there be multiple device and related security monitoring software enough
			* network firewalls to some extent of isolation to prevent the penetration from outside directly to the most inner core system
			*  
* Contractor/Tech Developer
	- Who do the actual tasks
* Tools and Common diagrams architecture would use
	A normal architecture process would look like below steps:
		* Business Context Diagram
			- show internal relationships among different entities/departments/services
		* System Context Diagram
			- take Bus context diagram and decompose it further into system level outlooks
		* Architecture Overview Diagram
			- further decompose the system context into more High cohesion and low coupling modules
	Tools we use to add security consideration into this process, 
		* Principles
		* CIA Triad
		* [x]Frameworks: it defines the standardized/recommended frames that could fit the security considerations into the system building process. Such as Identify -> Protect -> Detect -> Respond -> Recover from NIST CST.
	The best practice of a cyber security architecture to engage cybersecurity architect from the starting (risk analysis) to the end and through each iterative upgrades to ensure the overall system development lifecycle.



# Topic 2 Cybersecurity Architecture: Who Are You? Identity and Access Management
* Idnetity and Access Management (IAM)
	The purpose of IAM is to figure out the user as soon as we can before any abnormal actions are taken to the system. The content of IAM is described as 4As, Administration, Authentication, Authorization and Audit.
	- Foundation/Base level: Store and Sync
		* Users would be categorized into Employees, Suppliers, Customers. Each category would have different roles, like employer could be in different department, customers could be commercial, retail etc
		* Users would have certain capacibility to finish their task. These capacibilities would be an essence of permission.
		Above information would be recorded into a storage, which would be called Directory in the video. The storage medium could include database, schema and protocal to access the data. The most common protocal is LDAP.
		As nowadays most of organization would have separate directories for different department, to align these separate directories together into a single one center directory, we need to synchronize them.
	- APPs
		* Admin: identity management or identity governance, to CRUD user profile, including role management, Access management
		* AuthN: determine who you are based on something you know, something you have (MFA), or something you are (facial or fingerprint). SSO system provides the idea that one password gets you into everything, MFA mitigates the security concern.
		* AuthZ: RBA/AA (Risk-Base AuthZ/Adapative AuthZ). 
			- Location
			- Request type
			- Request Amt
			- Freq
		Privileged Access Management: A special access management targets at special users - super users: like root, sys admin, DBA, NWA etc. It'a better practice to using PAM to center authenticate the super users with MFA to avoid directly login to the base system, and also support session recording in the PAM system to audit and track what the super users have done.
	- Connection
		* 



# 3. Cybersecurity Architecture: Endpoints Are the IT Front Door - Guard Them
Endpoint security
* What is endpoint
	- could be a any hardware platform in the network, from business use to individual use, actually there is no distinct border . An architect is recommended to view all the hardwares and different usability of these hardwares as a holistic approach. Because the attackers would try to breach into your account via different aspects from the picture.
* Controls
	- complexity is enemy of security, endpoint mess drives the purpose of controls on the endpoint to make it more secure
	- the best practice of endpoint control is to integrate all of those individual domains into a holistic endpoint security management system.
		* inventory - HW/SW
		* Security policy: to allow/prohibit adoption of HW/SW, password strength
		* Patching: to fix vulnerabilities in the system
		* Encryption
		* Remote wipe
		* Loc tracking
		* Anti-virus/EDR
		* Disposal: how you dispose retired device/hardwares/softwares
	- BYOD
		* Consent - monitor, usage, wipe
		* Software - 
		* Hardware - to be clear/specific on what are permitted or what are not
		* Services - Auth
It is not to say no, but to say how we need to secure the system, which could guide users to do the right thing.