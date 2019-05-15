/**
 * Copyright 2013-present memtrip LTD.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.memtrip.eos.http.rpc.model.block.response

import com.squareup.moshi.JsonClass
import java.util.Date

@JsonClass(generateAdapter = true)
data class Block(
    val id: String,
    val block_num: Int,
    val ref_block_prefix: Long,
    val previous: String,
    val timestamp: String,
    val transaction_mroot: String,
    val action_mroot: String,
    val block_mroot: String?,
    val producer: String,
    val schedule_version: Int,
    val new_producers: Any?,
    val producer_signature: String,
    val regions: List<Region>?,
    val input_transactions: List<Any>?
)