package dev.idion.mvc.controller.put

import dev.idion.mvc.model.http.Result
import dev.idion.mvc.model.http.UserRequest
import dev.idion.mvc.model.http.UserResponse
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PutApiController {

    @PutMapping("/put")
    fun putMapping(): String {
        return "put"
    }

    @PutMapping("/put/object")
    fun putMappingObject(@RequestBody userRequest: UserRequest): UserRequest {
        return userRequest
    }

    @PutMapping("/put/response-object")
    fun putMappingResponseObject(): UserResponse {
        return UserResponse().apply {
            this.result = Result().apply {
                this.resultCode = "OK"
                this.resultMessage = "성공"
            }
        }.apply {
            this.description = "~~~~~~~~~~~~~~~~~~~~~~"
        }.apply {
            val userList = mutableListOf<UserRequest>()
            userList.add(UserRequest().apply {
                this.name = "a"
                this.age = 10
                this.email = "a@gmail.com"
                this.address = "a address"
                this.phoneNumber = "010-1234-5666"
            })
            userList.add(UserRequest().apply {
                this.name = "b"
                this.age = 15
                this.email = "b@gmail.com"
                this.address = "b address"
                this.phoneNumber = "010-1234-5663"
            })

            this.userRequests = userList
        }
    }
}
