pipeline {
    agent any 
     stages {
         stage('code-pull') 
         {
                steps 
        {
                      sh '''  
                          sudo apt-get update -y
                         sudo apt-get install git -y
                      '''
                    git credentialsId: 'ubuntu', url: 'https://github.com/sneha884/stud.git'
        }
  }
   stage('Build') {
                steps {
                        
          }
   }      
       stage('test') { 
                steps {
                    
                }
       }
           }

        }
