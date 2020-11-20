package dev.idion.mvc.controller.delete

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class DeleteApiController {

    @DeleteMapping("/delete")
    fun deleteMapping(@RequestParam name: String,
                      @RequestParam age: Int): String {
        return "$name $age"
    }
}
