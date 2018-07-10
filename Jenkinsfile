pipeline {
  agent any
  stages {
    stage('Check Tools') {
      steps {
        bat 'node -v'
        bat 'npm -v'
      }
    }
    stage('NPM Install') {
      steps {
        bat 'npm install'
        bat 'bower install'
      }
    }
    stage('Clean') {
      steps {
        bat 'gradlew clean'
      }
    }
    stage('Building') {
      steps {
        bat 'gradlew bootRepackage -Pprod'
      }
    }
  }
}