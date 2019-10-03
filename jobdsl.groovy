pipelineJob('DSL-Pipeline-HappyTrip') {
    definition {
        cpsScm {
            scm { 
       git {
            remote {
                url('https://github.com/jenkinsci/job-dsl-plugin.git')
				credentials('GitHub-Credential')
            }
			branch('master')
			
    }
          scriptPath('Code/Jenkins.txt')
        }
    }
}
}
