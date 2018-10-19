pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
      args '-u root:root'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean install spring-boot:run'
      }
    }

  }
}