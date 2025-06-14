package com.loc.newsapp.data.manager

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import com.loc.newsapp.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow


class LocalUserManagerImpl(
    private val context: Context
): LocalUserManager{
    override suspend fun saveAppEntry(){
        TODO("Not yet implemented")
    }

    override fun readAppEntry(): Flow<Boolean> {
        TODO("Not yet implemented")
    }
}

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = )