pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }
        stage('OWASP Dependency Check') {
            steps {
                sh './gradlew dependencyCheckAnalyze'
            }
        }
    }

    post {
        always {
            dependencyCheckPublisher()
        }
    }
}