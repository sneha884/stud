pipeline {
    agent any 
     stages {
         stage('code-pull') 
         {
                steps 
        {
                      sh 'sudo apt-get install default-jre -y'
                    sh 'sudo apt-get install default-jdk -y'
        }
  }
   stage('Build') {
                steps {
                        echo 'Build'
                        echo 'this program is successfully build'
          }
   }      
       stage('test') { 
                steps {
                        echo 'Test'
                        echo 'this program is successfully test'
                }
       }
           }

        }
