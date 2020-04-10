#!/usr/bin/env groovy
// File Downloading method
def call(String Artifactory_Credential_ID) {
	withCredentials([usernamePassword(credentialsId: "${Artifactory_Credential_ID}", usernameVariable: 'user', passwordVariable: 'password')]) {
        bat '''
         curl -sSf -H "X-JFrog-Art-Api:AKCp5ekwC4jCuLH48Gf3z8V8CwSVEtNtfZ9ZcGvwygHBpoqDzjaaZYG8dLHW3yFQFSi7vSZ4S" \
	   -o F:/InfoObjects/Jenkins/Download/test.jar https://akku.jfrog.io/artifactory/Jenkins-integration/org/springframework/jb-hello-world-maven/0.1.0/jb-hello-world-maven-0.1.0.jar
        '''
    }
	echo "Jar file downloading is complete"
}