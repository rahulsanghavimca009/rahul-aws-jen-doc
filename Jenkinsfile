pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/rahulsanghavimca009/rahul-aws-jen-doc.git'
            }
        }
        stage('Build JAR') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t rahulaws-jen-doc:latest .'
            }
        }
        stage('Run Container') {
            steps {
                sh '''
                docker rm -f rahulaws-jen-doc || true
                docker run -d --name rahulaws-jen-doc -p 9090:9090 rahulaws-jen-doc:latest
                '''
            }
        }
    }
}
