pipeline{
   stages{
        stage('Compile'){
                  steps{
                      sh 'java --version'
                      sh './gradlew compileJava'
                  }
        }
        stage('Unit Test'){
              steps{
                      sh './gradlew test'
              }
        }
        stage('Code Coverage'){
             steps{
                sh "./gradlew jacocoTestReport"
                publishHTML (target: [
                        reportDir: 'build/reports/jacoco/test/html',
                        reportFiles: 'index.html',
                        reportName: "JaCoCo Report"
                ])
                sh "./gradlew jacocoTestCoverageVerification"
             }
        }
   }
}