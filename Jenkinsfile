pipeline {
    agent any
    
    tools {
        maven 'Maven_3.9' 
        jdk 'Java_17'     
    }
    
    stages {
        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }
        
        stage('Compile Application') {
            steps {
                echo 'Compiling Java source code files...'
                sh 'mvn clean compile'
            }
        }
        
        stage('Run Unit Tests') {
            steps {
                echo 'Executing JUnit regression test suites...'
                sh 'mvn test'
            }
        }
        
        stage('Package Artifact') {
            steps {
                echo 'Packaging application into a production-ready JAR file...'
                sh 'mvn package'
            }
        }
    }
}
