package dev.idion.mvc.controller.post

import dev.idion.mvc.model.http.UserRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PostApiController {

    @PostMapping("/post")
    fun postMapping(): String {
        return "post"
    }

    @PostMapping("/post/object")
    fun postMapping(@RequestBody userRequest: UserRequest): UserRequest {
        return userRequest
    }
}
