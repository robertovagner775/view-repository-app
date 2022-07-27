package br.com.dio.app.repositories.data.repositories

import br.com.dio.app.repositories.data.model.Repo

interface RepoRepositories {
    suspend fun listRepositories(user: String): List<Repo>
}