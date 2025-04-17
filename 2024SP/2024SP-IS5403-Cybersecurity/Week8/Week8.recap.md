# Topic1 Cybersecurity Architecture: Networks 
## Firewalls
* Features
	- Packet Filter
		* it include the packet flowing through the internet, containing a packet header(SRC, DST, PORT) and payload(content). A typical webserver application could have at least two firewalls set up. One is to filter the external request from end-user devices, like browsers to the web server; the other is to filter the internal request from web-server to the database server. Usually external request would have port like 80(http)/443(https), while database server port is usually 3306(Mysql)
	- Stateful PKT inspection 
		* it investigates beyond packet headers, it would also check the payload part to see if it's harmful to our system. And it would even look at the context, not an individual packet.
	- Proxy
		* it is something that acts on behalf of something else. Nginx is a popular proxy tool
		* A good man-in-the-middle, a proxy server sits between the client side and server side. It could add more traffic security capabilities to our system. We could inspect the traffic and enforce some policy in the proxy server.
	- NET address translation (NAT)
		- NET Router/Firewall mains a table which is to translate the internal IP address starting with 10.xx.xx.xx or 192.168.x.x which are not routable across the outside internet. However, it's routable across an internal intranet or home network. It is converted into an external address, usually a single one address going out to the internet. When the response comes back, the NAT gateway would turn it back and send to the dest workstation.
		* it prevents someone from being able to get from the outside directly to the inside by default blocking rule of 192.168.*.* to flow through outside network.

## Segmentation
* Bastion, not recommended any more nowadays, two simple
* Tri-Homed firewall
	- it's more popular in home network and cheap
	- But it's Single point of failure(SPOF) whose failure would cause all system failure.
* Basic DMZ (end-device -> web server -> db server)
	- it's more scalable, add defense in depth for two more firewalls
	- it cost more, and complex because of >=2 firewalls
* Multi-Tier DMZ(demilitarized zone) (end-device -> web server -> app server -> db server)
	- even more complex and cost
	- more Defense in depth
	- higher granularity - to specify more detailed traffic rules from one zone to another
	- means more security

## VPN (Virtual Private Network)
* Secure channel -> untrusted net
* Encryption -> conf
* limited Insepction
### 7 Layers OSI Model
* A.P.S.T.N.D.P
	- Application (SSH)
	- Presentation
	- Session
	- Transport (TLS/SSL)
	- Network (IPsec, everything bet. two network addresses will be encrypted)
	- Data Link (P2PTP: point-to-point tunneling protocal)/L2TP(layer 2 tunneling protocol)
	- Physical
There is a trend to transit from Broad Net-based VPN to App Specific VPN. Reasons are
	* former is simple and Catch all
	* latter is more granularity and control over specific APPs

## SASE(Security, Access, Service, Edge)
* 


# Topic2 Cybersecurity Architecture: Application Security
There is a common sense, there is no bug free code. The buggy code would have some percentage of bugs turn out to be security vulnerabilities. To conclude, all software codes would contain security vulnerabilities. The security concern does not rise only from the coding stage, it could be introduced in every stage of the holistic software development life cycle. The most interesting part is that some of easy-to-spot vulnerabilities might also be found in the later stage of development activities, like testing. However, the cost could go up to 640 times as the bug spot timeline extends. Huge incentive to get the bug fix at a right and early stage.

Here are the approaches we could use to debug the application security more efficiently:
## SDLC
* Traditional approach
	- linear from design -> code -> test -> publish
	- slow
	- siloed
	- inflexible
	- over the wall (responsibility)
* DevOps approach
	- cyclic (feedback empowered)
	- integrated
	- rapid
	- agile
* DevSecOps 
	- Security is built-in, instead of bolt-on in the later phase
		- security by design
	- collaboration everywhere
	- auto
	- 

## Secure Coding
What we need to make secure coding practice
* coding practices/checklist
	- OWASP.org a great place to find security coding practices
* trusted libs
* standard architecture
* mistakes to avoid
* Software Bill Of Material
	- Components
	- Libs
	- dependencies
	- Versions
	- Origins
	- Vulns 

## VULN Testing
- throughout the holistic DevSecOps process
- two major classes of vuln testing tools are 
	* static application security testing (SAST)
		- white box testing
		- source code
		- Find Vuln earlier
	* Dynamic app security testing (DAST)
		- black box testing
		- running app/executable apps
		- Find Vuln later
	* Chatbot scan
		- code quickly
		- debug quickly
		* inject vuln
		* expose Intellectual property 



# Topic3 Cybersecurity Architecture: Data Security
- Why we care data security most?
	* $4.35M -> Cost of each data breach worldwide
	* $9.44M -> Cost of each data breach in the U.S. nearly twice 
	* 83% of organizations get >=1 data breach
* Governance
	- policies to specify what are sensitive
	- classify different level of security
	- catalog the actual datas into the classified level
	- resilience plan
* Discovery
	- database structured data
	- file - unstructured data
	- network
* Protection
	- encryption is the core
		* at rest/ in motion
	- key management
		* stongly recommended SSO
		* keep encryption algorithm update
		* keep routine password rotation because of quantum threat
	- access control
	- backup -> ransomware
* Compliance
	- industry regulations
		* GDPR
		* HIPPA
	- Report and Retain
* Detection
	- monitor
	- User behaviour analysis
		* find out misuse or abuse of data
	- Alerts
* Response
	- cases
	- Dynamic playbooks
	- Orchestration
	- Automation
Top 5 things to reduce the cost of data breach or the potential to be attacked.
* AI to empower automation
* DevSecOps to provide security oriented design
* Incident Response - to operate on an potential data breach and recover
* Crypto - data encryption
* employer training