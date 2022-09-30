pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Build Completed'
      }
    }

    stage('Test') {
      steps {
        echo 'Test Completed'
      }
    }

    stage('Deploy') {
      steps {
        input(message: 'Are you sure you want to deploy ?', ok: 'Yes')
        echo 'Deployment Completed!'
      }
    }

  }
}