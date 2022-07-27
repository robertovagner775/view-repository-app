package br.com.dio.app.repositories.domain.di

import br.com.dio.app.repositories.domain.ListUserRepositoryUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainObject {

    fun load () {
        loadKoinModules(useCaseModule())

    }

    private fun useCaseModule(): Module {
        return module {
            factory { ListUserRepositoryUseCase(get()) }
        }

    }
}