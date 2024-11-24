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
sh "'${MAVEN_HOME}/bin/mvn' clean install"
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
