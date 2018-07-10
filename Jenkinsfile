pipeline {
  agent any
  stages {
    stage('Check Tools') {
      steps {
        sh '''node -v
npm -v
bower -v
gulp -v'''
      }
    }
    stage('NPM Install') {
      steps {
        sh 'npm install'
      }
    }
    stage('Clean') {
      steps {
        sh './gradlew clean'
      }
    }
    stage('Building') {
      steps {
        sh './gradlew bootRepackage -Pprod -x test'
      }
    }
  }
}