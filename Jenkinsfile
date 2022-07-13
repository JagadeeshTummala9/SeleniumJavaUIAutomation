pipeline {
    agent any

    stages {
        stage ('Run Tests') {

            steps {
                withMaven(maven : 'maven_3.8.6') {
                    sh 'mvn test'
                }
            }
        }
    }
    }