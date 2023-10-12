pipeline {
	agent any 
	tools {
		maven 'MAVEN_HOME'
		}
		
		stages{
			
			stage('Welcome Stage')
			{
				steps {
					 echo 'Welcome to Jenkins Pipeline'
					}
				}
			stage('Maven Clean')
			{
				steps {
					bat  'mvn clean'
					}
				}
			stage('Mevan Build')
			{
				steps {
					bat 'mvn clean'
					}
				}
			stage('Mevan Install')
			{
				steps {
					bat 'mvn install'
					}
				}		
			stage('Mevan Test')
			{
				steps {
					bat 'mvn Test'
					}
				}		
			stage('Final Build Step')
			{
				steps {
					echo 'Build DOne'
					}
				}
			}		
		}
