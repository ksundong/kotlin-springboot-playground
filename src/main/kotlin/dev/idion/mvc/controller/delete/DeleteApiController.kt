package dev.idion.mvc.controller.delete

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class DeleteApiController {

    @DeleteMapping("/delete")
    fun deleteMapping(@RequestParam name: String,
                      @RequestParam age: Int): String {
        return "$name $age"
    }

    @DeleteMapping("/delete/name/{name}/age/{age}")
    fun deteleMappingPath(@PathVariable name: String,
                          @PathVariable age: Int): String {
        return "$name $age"
    }
}
