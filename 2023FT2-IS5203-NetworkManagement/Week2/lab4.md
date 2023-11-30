# Sim.Lab4.1
arp -a
> interface: 10.0.0.246 --- 0x6
> interface: 10.0.0.93 --- 0xf

use 10.0.0.113

When it detects duplicate IPv4, the system will recommend an APIPA address,
 - 169.254.183.21

# Sim.Lab4.2
1. Goto Control Panel -> Systme -> Remote Settings -> Remote Tab, Click Select User,
2. In the dialog, input the username -> LabConnection
3. Click Check Names
4. Goto Windows Defender Firewall >> Allowed Apps
5. Find Remote desktop to enable it both private and public
6. type mstsc in the search box, and input 10.0.0.242, 
7. click show options and Goto the tab "localResource", checked "Drives"
8. Click connect
9. input "Labconnection" , P@ssw0rd

Telnet, SSH, VPC are which type of software
a, VPN
b, RAS
(x)c, Terminal emulation
d, All of these are correct

Which protocol can be used to connect to and control Microsoft computers?
a, VNC
b, RDP
(x)c, Both choices will work
d, neither choices will work

When implementing secure remote file access which choices will be incompatible with each other?
[x]a, SFTP
b, TFTP
c, FTP
[x]d, FTPS
e, VSTP

Telent, SSH, RDP and VNC all rely on which type of management?
a Out-of-band
[x]b, In-band
c, On-demand
d, None of these are correct

When examining tunneling protocols, which choice is a component of the IPsec protocol suite?
[x]a, IKEv2
b, L2TP
c, OpenVPN
d, PPTP


# lab4.2
> netsh winHTTP set proxy proxy-server=”http://proxy:8080” bypass-list=”*.practicelabs.com”

Passw0rd

> Install-WindowsFeature -Name nlb -IncludeAllSubFeature -IncludeManagementTools