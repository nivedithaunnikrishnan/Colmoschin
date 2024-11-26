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
                    --scan C:\ProgramData\Jenkins\.jenkins\workspace\Colmsochin-pipeline  ^
                        --out C:\ProgramData\Jenkins\.jenkins\workspace\Colmsochin-pipeline ^
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
