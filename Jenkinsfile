pipeline{
   agent any
   triggers{
      pollSCM('* * * * *')
   }
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
                sh './gradlew jacocoTestReport'
                publishHTML (target: [
                        reportDir: 'build/reports/jacoco/test/html',
                        reportFiles: 'index.html',
                        reportName: 'JaCoCo Report'
                ])
                sh './gradlew jacocoTestCoverageVerification'
             }
        }
        stage('Static code analysis'){
            steps{
                sh './gradlew checkstyleMain'
            }
        }
   }
   post {
        always {
                slackSend channel: '#random',
                color: 'good',
                message: "The pipeline ${currentBuild.fullDisplayName} failed."
        }
//         always {
//             mail to: 'opeyemi.kabiru@yahoo.com',
//             subject: "Completed Pipeline: ${currentBuild.fullDisplayName}",
//             body: "Your build completed, please check: ${env.BUILD_URL}"
//         }

   }
}