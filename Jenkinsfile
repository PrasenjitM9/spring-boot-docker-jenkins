pipeline {
  agent any
  environment {
        registryCredential = "dockerhub"
        // Nexus repository credentials ID
        //NEXUS_CREDENTIALS_ID = 'nexus-credentials-id'
        // Nexus repository URL
        //NEXUS_URL = 'http://your-nexus-repo-url/repository/your-repository/'
    }
  stages {
    stage("Compile") {
      steps {
        sh "mvn compile"
      }
    }
    stage("Unit test") {
      steps {
        sh "mvn test"
      }
    }
    stage("Build JAR") {
      steps {
        sh "mvn package"
      }
    }
    stage("Build Docker Image") {
      steps {
        sh "docker build -t jeetdeveloper/spring-boot-test:latest ."
      }
    }
/*    stage("Docker push") {
      steps {
        sh "docker push jeetdeveloper/spring-boot-test:latest"
      }
    } */
    stage('Push Docker Image') {
            steps {
                withDockerRegistry([credentialsId: "dockerhub", url: "https://index.docker.io/v1/"]) {
                    sh "docker push jeetdeveloper/spring-boot-test:latest"
                }
            }
        }
 /*   stage("Deploy to staging") {
      steps {
        sh "docker run -d --rm -p 8765:8080 --name spring-boot-test jeetdeveloper/spring-boot-test"
      }
    }
    stage("Acceptance test") {
      steps {
        sleep 60
        sh "chmod +x acceptance_test.sh && ./acceptance_test.sh"
      }
    } */
  }

 /* post {
    always {
      sh "docker stop spring-boot-test"
    }
  } */
}
