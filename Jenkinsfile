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
<<<<<<< HEAD
 /*   stage("Deploy to staging") {
=======
  /*  stage("Deploy to staging") {
>>>>>>> 705262b9485c78fffd2c3408fc0d55b3bb5580dd
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
<<<<<<< HEAD
  /*post {
=======
 /* post {
>>>>>>> 705262b9485c78fffd2c3408fc0d55b3bb5580dd
    always {
      sh "docker stop spring-boot-test"
    }
  } */
}
