pipeline {
  agent any
  tools{
	maven 'Maven'
	jdk 'jdk8'
  }
  
  stages {
    stage('Initialize') {
      steps {
        sh '''
			echo "PATH = ${PATH}"
			echo "M2_HOME = ${M2_HOME}"
		'''
      }
    }
	stage('Build') {
      steps {
        sh 'mvn clean install spring-boot:run'
      }
    }

  }
}