#!/usr/bin/env groovy
// File Downloading method
def call() {
	bat '''
        curl -sSf -H "X-JFrog-Art-Api:AKCp5ekmsgbnFTK8mAWyiHq3W9q6KuDKGwBAjvNzvT5A2Vst1j4xHSZq3oPwC8V5jmLEqz3dQ" \
	   -o F:/InfoObjects/Jenkins/Download/test.jar https://hexxa.jfrog.io/artifactory/Jenkins-integration/jb-hello-world-maven-0.1.0.jar
    '''
	echo "Jar file downloading is complete"
}