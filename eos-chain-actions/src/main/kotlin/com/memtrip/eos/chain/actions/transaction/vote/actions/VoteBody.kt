package com.memtrip.eos.chain.actions.transaction.vote.actions

import com.memtrip.eos.abi.writer.Abi
import com.memtrip.eos.abi.writer.ChildCompress

@Abi
data class VoteBody(
    val code: String,
    val action: String,
    val args: VoteArgs
) {

    val getArgs: VoteArgs
        @ChildCompress get() = args
}