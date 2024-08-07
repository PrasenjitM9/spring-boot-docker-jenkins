pipeline {
  agent any
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
    stage("Docker push") {
      steps {
        sh "docker push jeetdeveloper/spring-boot-test"
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
