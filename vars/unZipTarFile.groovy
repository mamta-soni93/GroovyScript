#!/bin/bash
//Unzip a tar file
def unZipTarFile(String path, String fileName, String tarExt) {
  dir (path) {
    echo "file decompression ${fileName}"
    bat 'dir'
	echo "here..."
    bat "tar -xf ${fileName}${tarExt}"
	echo "delete old compressed files ${fileName}"
    bat "del -f ${fileName}${tarExt}"  // sh "rm -f '${fileName}'"
    bat 'dir'
  }
}