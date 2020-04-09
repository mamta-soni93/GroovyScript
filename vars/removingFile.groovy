#!/usr/bin/env groovy
//Removing a file
def call(String path, String fileName, String fileExtension) {
  dir (path) {
    echo "Removing file : ${fileName}${fileExtension}"
    bat 'dir' //ls -la
	bat "del -f ${fileName}${fileExtension}"  // rm -f
	echo "File is successfully removed..!"
  }
}