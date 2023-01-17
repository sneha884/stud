pipeline {
    agent any
    stages {
        stage('code-build') {
            steps {
                git branch: 'prod', credentialsId: 'demo', url: 'git@github.com:sneha884/demo.git'
            }
        }
           stage('test') {
            steps {
                sh 'sudo apt update -y'
                sh 'sudo apt install maven -y'
                sh ls
                sh 'env'
                sh 'PATH'
            }
        }  
        stage('test') {
            steps {
                sh 'sudo apt update -y'
                sh 'sudo apt install openjdk-11-jre -y'
                sh ls
                sh 'env'
                sh 'PATH'
            }
        }
    }
}    