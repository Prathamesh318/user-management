pipeline {
    agent any
    stages {
        stage('Clone Repo') {
            steps {
                git 'https://github.com/Prathamesh318/user-management.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Docker Build and Push') {
            steps {
                sh '''
                docker build -t prathamesh318/user-management:latest .
                docker push prathamesh318/user-management:latest
                '''
            }
        }
        stage('Kubernetes Deploy') {
            steps {
                sh '''
                kubectl apply -f k8s/deployment.yaml
                kubectl apply -f k8s/service.yaml
                '''
            }
        }
    }
}

