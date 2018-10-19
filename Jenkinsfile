pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
      args '-v /root/.m2:/root/.m2'
    }

  }
  stages {
    stage('Build') {
      steps {
        git(url: 'https://github.com/MillieMax/project-Spring.git', branch: 'master', credentialsId: 'Buxar89@')
      }
    }
  }
}