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
sh 'mvn test' // For Python
}
}
stage('Security Scan') {
steps {
sh 'dependency-check --scan ./ --out report'
}
}
  
          stage('DAST Test on VM 3') {
            steps {
                sh 'ssh abiya@10.0.0.85 zap-cli quick-scan http://10.0.2.15:8080'
            }
        }
    }

}
}
