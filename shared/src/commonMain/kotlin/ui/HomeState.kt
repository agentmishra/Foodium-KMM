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
package ui

import androidx.compose.runtime.Immutable
import dev.shreyaspatil.mutekt.core.annotations.GenerateMutableModel

/**
 * The UI state of Home screen
 */
@GenerateMutableModel
interface HomeState {
    val isLoading: Boolean
    val posts: List<Post>
    val errorMessage: String?

    @Immutable
    data class Post(val id: Int, val title: String, val author: String, val imageUrl: String?)
}
