package dev.idion.mvc.controller.get

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
@RestController
class GetApiController {

    @GetMapping("/hello")
    fun hello(): String {
        return "hello kotlin"
    }
}
