pipeline {
agent any
       
stages {
stage('Clone') {
steps {
git 'https://github.com/nivedithaunnikrishnan/Colmoschin.git'
}
}
stage('Build') {
steps {
sh 'mvn clean package'
}
}
stage('Test') {
steps {
sh 'mvn test' 
}
}
stage('Provision Infrastructure') {
steps {
        script {
           sh 'vagrant up'
        }
    }
}
}
}
