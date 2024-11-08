pipeline {
  agent any
  stages {
    stage('Checkout Git') {
      steps {
        git(url: 'https://github.com/nes211/moviehelper', branch: 'master', changelog: true)
      }
    }

  }
}