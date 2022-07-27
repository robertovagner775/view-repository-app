package br.com.dio.app.repositories.data.services

import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubServices {

    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String): List<Repo>

}