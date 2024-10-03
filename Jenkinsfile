pipeline {
agent any
       environment {
        PATH = "/opt/dependency-check/bin/dependency-check.sh"  // Update with your actual path
    }
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
sh 'dependency-check.sh --scan ./ --out report'
}
}

}
}
