pipeline {
agent any
   
stages {
stage('Clone') {
steps {
git 'https://github.com/nivedithaunnikrishnan/Colmoschin.git'
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
   stage('Security Check') {
      steps {
         bat 'vagrant ssh db-server -c "sudo lynis audit system"'
      }
   }
}
}
