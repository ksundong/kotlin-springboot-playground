package dev.idion.mvc.controller.get

import dev.idion.mvc.model.http.UserRequest
import org.springframework.web.bind.annotation.*

@RequestMapping("/api")
@RestController
class GetApiController {

    @GetMapping("/hello")
    fun hello(): String {
        return "hello kotlin"
    }

    @GetMapping("/hello/{name}")
    fun helloName(@PathVariable name: String): String {
        return "hello $name"
    }

    @GetMapping("/hi")
    fun queryParam(@RequestParam key: String): String {
        return "key: $key"
    }

    @GetMapping("/object")
    fun queryParamObject(userRequest: UserRequest): UserRequest {
        return userRequest
    }
}
