pipeline {
agent any
   
stages {
stage('Clone') {
steps {
git 'https://github.com/nivedithaunnikrishnan/Colmoschin.git'
}
}

   stage('OWASP Dependency Check') {
steps {
                bat '''
                    dependency-check.bat --project "Colmoschin-pipeline" ^
                    --scan . ^
                    --out dependency-check-report ^
                    --format HTML
                '''
            
   
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
