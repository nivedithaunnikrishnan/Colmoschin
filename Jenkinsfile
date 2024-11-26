pipeline {
agent any
   
stages {
stage('Clone') {
steps {
git 'https://github.com/nivedithaunnikrishnan/Colmoschin.git'
}
}

   stage('Dependency Check') {
steps {
       bat "dependency-check.bat --version"
}
   }
   stage('Validate Vagrant file') {
steps {
bat 'vagrant validate'
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
