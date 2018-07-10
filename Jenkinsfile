pipeline {
  agent any
  stages {
    stage('Check Tools') {
      steps {
        bat 'yarn -v'
      }
    }
    stage('YARN Install') {
      steps {
        bat 'yarn install'
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