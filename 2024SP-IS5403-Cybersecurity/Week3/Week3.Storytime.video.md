# Storytime
This week I am speaking on Frameworks in Cybersecurity and why they matter. Frameworks allow for the synchronization of thought. It allows for the mobilization of best practices as well. I also do a lot of teaching of cyberspace principles and IT infrastructure practices. I do this with frameworks because it is professional (repeatable & shareable) and non-technical people can follow highly technical concepts if you build them a "path". Finally, frameworks set a "standard" and a baseline ensuring a certain level of proficiency

* miter attack framework
* lockhead martin skill chain

* security framework & risk management framework

Frameworks are same for all the organizations to cover the base lines, what really make a big difference from good level to advanced level is the talent resources, decisions, wisdom, insight intelligence applied following the framework. The same principle could also be applied to the risk management framework.

Why framework matters?
* framework build a mindset with certain criteria or scenario analysis for people to consider before the actual implementation,  framework also keeps people on the same page
* frameworks also contribute to learning and teaching across different domains, because just like you speak in the same language, you don't worry about too much that another people would not understand you under the same language context.
	* something that the students don't need to know, like how to write a cross site script
	* something that they would learn and master, like how to locate, identify the attack and how to use the proper counter-attack measures to stop them
* allows for mobilization of best practices, esp. when you are in the board team to make a decision, the stakeholders might want you to offer a mature/seccussful solution to handle something. With framework, you might copy the success from one company to another.


Based on my experience in the engineering field, while various industries may adopt different development lifecycles, there are universal best practices that offer shared benefits. Instead of venturing into uncharted territory, businesses often opt for these best practices to maximize profitability. This is precisely where frameworks come into play, serving the purpose of streamlining processes and ensuring adherence to established standards.

Cisternelli, E.(2024, February 27). 7 Cybersecurity Frameworks That Help Reduce Cyber Risk (List & Resources). BitSight. https://www.bitsight.com/blog/7-cybersecurity-frameworks-to-reduce-cyber-risk


# Cyber Arch: Five principles to follow (one to avoid)
* foundamental
* cyber domain

* defense in depth
Avoid SPOF (No single point of failure), even it fails, it fails safe.

* least privilege
	* only give the specific group of users the access to certain resources within some qualified timeframes to finish their job
	* or give only the access rights you need for as long as you need them.

* sepration of duties
	* no SPOC (single point of control)
	* collision
* secure by design
	* means that we should take security into consideration from the start(requirement analysis) to the end (delivery step) in web development lifecycle.
* Keep it simple, stupid (KISS)
	* complexity !== security

Matthieu.(2019, April 27). A Detailed Explanation of The KISS Principle in Software. The valuable dev. 

# Cybersercurity Architecture: Foundamentals

CIA Triad:
* Confidentiality
	* access control: 
		* Authentication : who are you
		* Authroziation : what you can do
	* encryption
know who you are does not mean I know what you are allowed to do. Sometimes, the Role based access control(RBA) comes in.

* Integrity
	* keep the data accountable
	* methods(Digital signature, MAC) to detect any modifications to the data
	* decision to take efficient counter-measures
* Availability: website is available, resources are available
	* Denial of service (like high frequency malicious robotic reqs)
	* DDOS (Distributed DOS)
	* SYN Flood

Hunt, J.(2023, October 24). What is decentralized data storage? The Block.


# Reflection
In this week, we learnt from the story time video from Dr. Mclver that frameworks are very important and helpful in the cybersecurity world. Frameworks could serve as foundational guidelines that establish a common baseline for cybersecurity practices across organizations. While the framework itself is standardized, what sets apart organizations in terms of cybersecurity effectiveness is the utilization of talent, informed decision-making, and strategic intelligence within the framework's framework. The frameworks provide a structured approach to cybersecurity that fosters a shared mindset and ensures alignment across teams. The benefits of frameworks include establishing a common mindset, facilitating learning and teaching, and mobilizing best practices. They are used often as invaluable tools for organizations seeking to go through the complex landscape of cybersecurity effectively. Their impact extends far beyond organizations and goes into our daily lives. For instance, consider the financial software we use, developed by ISO 27001-certified contractor companies, or the health information managed by HIPAA-compliant organizations. These standards ensure that the products and services we interact with adhere to strict security protocols, safeguarding our sensitive data and promoting trust and reliability in our daily digital experiences.

I want to express my gratitude to Prof. Jeff for his informative video, particularly focusing on five principles of the cybersecurity architecture. These principles inspires me to think twice where our current secure strategy could improve in the coming future. And I want to highlight three of the five principles: least privilege, defense in depth and KISS. These principles are commonly applied in everyday life. For instance, just as we have multiple keys for different doors and purposes, we maintain various credentials for different online accounts. This ensures that each resource is accessed securely and with appropriate permissions. As both an engineer and an internet user, I strongly believe that simplicity is key to effective security. While it's crucial to protect our data, overly complex systems can confuse users and inadvertently compromise security measures. However, there are also challenges when individuals with good intentions unintentionally breach security protocols. This highlights the importance of continual vigilance and adaptability in cybersecurity practices.

Finally, when we look back to the week3's Coursera course, we would find it very helpful as it provided a comprehensive journey from understanding compliance frameworks to hands-on labs in Linux and Windows security. We acquired essential skills in basic windows/bash commands for user and server admins. Some of them are crucial for identifying vulnerabilities within operating systems. Moreover, we delved into the concepts of patch/change management and endpoint security. These are vital for maintaining up-to-date systems to mitigate cybersecurity threats effectively. A highlight of the course was the in-depth exploration of cryptography and encryption, offering insights into how these concepts impact software security within organizations. What impressed me most was the final project, which equipped us with real-world experience to play as system administrators to handle some common scenarios. For example, we gained practical experience in tasks such as creating and updating users, managing group permissions, and encrypting and decrypting files. Additionally, the Mailvelope extensions introduced us to encrypting email content on the fly. Overall, these invaluable knowledge points have bolstered our confidence in the cybersecurity domain, equipping us with practical skills to address security challenges effectively.
