package patches.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.ui.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a vcsRoot with id = 'GitGithubComAragastmatbExampleTeamcityGitRefsHeadsMaster'
in the root project, and delete the patch script.
*/
create(DslContext.projectId, GitVcsRoot({
    id("GitGithubComAragastmatbExampleTeamcityGitRefsHeadsMaster")
    name = "git@github.com:aragastmatb/example-teamcity.git#refs/heads/master"
    url = "git@github.com:aragastmatb/example-teamcity.git"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
    authMethod = uploadedKey {
        userName = "git"
        uploadedKey = "id_rsa"
    }
    param("secure:password", "")
}))

