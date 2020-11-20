package dev.idion.mvc.controller.put

import dev.idion.mvc.model.http.UserRequest
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
}
