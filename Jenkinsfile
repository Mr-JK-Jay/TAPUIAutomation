pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Hello World'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Tested and validated'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Build the application successfully'
            }
        }
    }
    
    post {
        always {
            emailext body: '', subject: 'Project_Status', to: 'jselvaraj@tekvizion.com'
        }
    }
}
