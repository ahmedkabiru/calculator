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
   }
}