pipeline {
   agent any
   
   stages {
      stage('Pre') {
         steps {
            echo 'This is pre pipeline stage'
         }
      }
      stage('Docker build') {
         steps {
            sh 'docker build . -t realvega/dojo-java:basic -f Dockerfile.final'
         }
      }
      stage('Docker push') {
        environment {
            DOCKERHUB_SECRET = credentials('docker-secret')
        }      
         steps {
            sh 'docker login -u $DOCKERHUB_SECRET_USR -p $DOCKERHUB_SECRET_PSW'
            sh 'docker push realvega/dojo-java:basic'
         }
      }      
   }
}

