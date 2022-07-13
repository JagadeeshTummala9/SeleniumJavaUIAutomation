pipeline {
    agent any
    tools {
        maven 'maven_3.8.6'
        jdk 'jdk-17.0.1.jdk'
    }
    stages {
        stage ('Run tests') {
            steps {
                sh 'mvn test'
            }
        }
        stage ('sample') {
                    steps {
                        sh 'echo "sample"'
                    }
                }
    }
}