# Database Developer vs Administrator

From Admin side:
* Software patches/fixes not update in-time and as a whole, missing some pieces;
* Running excessive privileges

From Developer side:
* sanitize user input with whitelists and mapping table


* how security mindset admin/developer can enhance the overall quality of application?
Talk back to the CIA Triad characteristics of the information security. A bad idea is that you think the three are always conflict each other, even though achieve a perfect balance is hard. But at least we should target for it.

However, in some specific domains, one of the three CIA would matter most. Like confidentiality to government and military applications; integrity to banking, financial, accounting system; availability to power company systems

* Diff between secure a db in production vs in development.
Secure a db in prod is very difficult because you could not leave little impact without upgrading your db system, sometimes you even need to let the db system down for a while until upgrading completion.


* Why DevSecOps is possible?
Have pipeline running to check the vulnerabilities before pushing the code to production.

If you have some critical business app, or sensitive information, dont put them in DMZ.

* Do not run everything as admin on your db management system.
* Do segregate things from other servers between your db server
* Buy some license software if possible, cheap does not always means good
* Encrypt sensitive information
* Do role-base access control
* Create policies for your db 
* Do turn on the auditing logs, as well as detection and rules to alert on malicious actions 


1. What was your biggest takeaway from podcast? 
2. Considering previous weeks' lessons, which role in Cybersecurity do you think should be interacting with Database professionals and developers and why do think that? 
3. What are the top security risks that Database professionals must be concerned with?

My key takeaway from this week's podcast is that database security should be integrated into the broader system security framework. Rather than being treated as isolated components, databases must be considered integral to the overall security picture. The second thing is that the principles of the CIA Triad—confidentiality, integrity, and availability—apply directly to database security. While database security measures may differ from those for operating systems, they share similarities because databases rely on database management systems (DBMS). Simply encrypting data within the database is insufficient protection; defending against potential threats requires a holistic approach that encompasses securing the DBMS itself. For instance, if a hacker gains access to administrative credentials, they could manipulate or delete the entire database, causing significant harm to the business without necessarily accessing sensitive or confidential information.

I believe each role within the cybersecurity team, from the CISO to the Information Security Architect, Analyst, and Auditor, plays a crucial part in interacting with database professionals and developers. When database professionals propose acquiring certain database components, the CISO should be involved to assess potential risks and understand the necessity of each component in maintaining database security. The Information Security Architect acts as a intepreter, providing insights and recommendations to the CISO to aid in decision-making. In the event of incidents, particularly concerning the database, the Information Security Analyst steps in to investigate details, analyze alerts, logs, and identify root causes to prevent future attacks or threats. Furthermore, when implementing security measures, the Auditor's role is pivotal. They conduct comprehensive assessments to ensure the integrity and effectiveness of the overall system security posture.

Top concerning database security risks
* Software patches and fixes not being updated in a timely manner, leaving vulnerabilities exposed.
* Abusive privileges can lead to unauthorized access and data breaches.
* Insecure user input handling by developers, such as failing to sanitize input with whitelists and mapping tables, which can result in SQL injection attacks and data manipulation.

IBM(n.d.). What is database security? IBM. https://www.ibm.com/topics/database-security


# Replise
* by Yaxuan Song - Wednesday, April 3, 2024, 9:30 PM
The summary is succinct and hits the point. Cybersecurity goes across the entire IT system, including the database. Drawing a clear line between Database developers and software developers can be challenging since software developers often write the code that interacts with the database. As a software developer, one essential and crucial task to safeguard the database is to write secure code, which includes sanitizing user inputs to prevent SQL injection attacks. A warm reminder is you could explain more on supporting your gain in the podcast to better align with the word counts requirement.

* by Naresh Kadiyam - Wednesday, April 3, 2024, 1:20 AM
Your wrap-up is both insightful and motivational. Role-based access control (RBAC) indeed holds a crucial position in contemporary practices, extending from operating systems to databases. Its significance cannot be overstated, as it enables us to effectively manage the risks associated with incorrect operations or unauthorized access. However, implementing RBAC can be challenging, as some users may express concerns about insufficient permissions hindering their tasks when interacting with the database. Thus, ongoing monitoring and adjustments are necessary. Additionally, I agree on your thoughts that teamwork matters in ensuring system security. It's imperative that no single role operates in isolation to achieve the highest level of security. My suggestion is that various roles collaborate closely, not just with the Chief Information Security Officer (CISO), to foster a culture of accountability, robust security measures, and optimal system availability.

# Vulnerability Management
It's foundational to own a good vulnerability/patch management solution. Prerequisites are:
* know all the software you are running
* know all the operating systems you are running
* know all the hardware types
* know existed CVEs for some known vulnerabilities
Can build a inventory for the above items. Hackers could take use of these known or unknown vulnerabilities and bugs with any malicious approaches, like virus, warm, remote control to gain access to your system, confidential and critical data. Famous companies, like Microsoft, Apple, Google are all doing patches release routinely. 
You also need a test patch management, like a plan to inform all related business units that we are going to do patches for some applications. Therefore, the business units won't expect any big surprise, like break/crash the system during installing patches.

In conclusion, Dr. Mclver thought that priorities of the cybersecurity in your organization
No.1 is People / User admin
No.2 is vulnerability management program