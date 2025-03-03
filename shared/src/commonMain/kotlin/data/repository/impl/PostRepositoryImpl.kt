/**
 * Copyright 2023 Shreyas Patil
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package data.repository.impl

import data.datasource.remote.PostRemoteDataSource
import data.model.Post
import data.repository.PostRepository
import io.ktor.client.request.get

/**
 * Default implementation for [PostRepository] that refers to the [PostRemoteDataSource] as
 * a data source
 */
internal class PostRepositoryImpl(private val dataSource: PostRemoteDataSource) : PostRepository {
    override suspend fun getAllPosts(): List<Post> {
        return dataSource.getAllPosts()
    }
}
