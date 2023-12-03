pipeline {
	agent any


	tools {
		jdk "JAVA_HOME"
		maven "MAVEN_HOME"
	}

	stages {

		stage('Build'){
			steps {
				bat "mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				bat "mvn test"
			}
		}

		stage('Deploy') {
			steps {
			    bat "mvn spring-boot:run"
			}
		}
	}
}