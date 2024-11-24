pipeline {
agent any
environment {
        JAVA_HOME = tool name: 'JDK21', type: 'JDK'
    }       
stages {
stage('Clone') {
steps {
git 'https://github.com/nivedithaunnikrishnan/Colmoschin.git'
}
}
stage('Build') {
steps {
bat 'mvn clean package'
}
}
stage('Test') {
steps {
bat 'mvn test' 
}
}
stage('Provision Infrastructure') {
steps {
        script {
           bat 'vagrant up'
        }
    }
}
}
}
