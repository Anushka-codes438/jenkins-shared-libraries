def call(){
   withCredentials([usernamePassword(credentialsId:"dockerHubCred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
                    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                    sh "docker image tag notes-app:latest anushka431/notes-app:latest"
                    sh "docker push ${env.dockerHubUser}/notes-app:latest"
                    echo "push image to dockerhub"
}
