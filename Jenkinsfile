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
sh 'mvn clean package' // For Java: mvn clean package
}
}
stage('Test') {
steps {
sh 'mvn test' 
}
}
stages {
        stage('Run OWASP ZAP Scan') {
            steps {
                // Connect to Kali Linux and run OWASP ZAP headless or with GUI
                sh 'ssh abiya@10.0.0.85 "owasp-zap -daemon -port 8080"' 

}
}
}
}
