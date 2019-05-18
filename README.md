<h1>API automation testing training</h1>

<div>
<h3>To test API, we need to have API service:</h3>
<p>To set up API service I decided to use simple rest API with using 
dokcer-compose technology. To set up the service on your local machine
you need to install: docker and docker-compose.</p>
</div>

<div>
<h2>How to install docker and docker compose</h2>
<p>I use OS Linux Ubuntu 19.04, and this guide will describe how to work with
this OS.

To install docker you need to execute following commands: 
<ul>
	<li>sudo apt-key adv --keyserver hkp://p80.pool.sks-keyservers.net:80 --recv-keys 58118E89F3A912897C070ADBF76221572C52609D </li>
	<li>echo "deb https://apt.dockerproject.org/repo ubuntu-xenial main" | sudo tee /etc/apt/sources.list.d/docker.list</li>
	<li>sudo apt-get update</li>
	<li>apt-cache policy docker-engine</li>
	<li>sudo apt-get install -y docker-engine</li>
	<li>sudo apt-get install -y docker-compose</li>
</ul>
To set up the service you need to change directory to docker/ and then execute:
docker-compose up. And if you send request http://localhost:8080/Mr.Propper, 
you will get the next response: / - Hello Mr.Propper! Host:host
</p>

<h2>Added oportunity of execution test suites from command line: </h2>
<p>
Also it allows executing test with CI/CD

mvn clean integration-test -Dsuite=<name_of_suite>
mnv clean integration-test -Dsuite="first_suite"
<p>
</div>
