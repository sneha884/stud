pipeline {
    agent any 
     stages {
         stage('code-pull') 
         {
                steps 
        {
                      sh '''  
                          sudo apt-get update -y
                         sudo apt-get install git
                      '''
                    git credentialsId: 'ubuntu', url: 'https://github.com/sneha884/stud.git'
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
