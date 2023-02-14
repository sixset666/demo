package com.example.demo.controller;

import com.example.demo.entity.BookEntity;
import com.example.demo.response.BaseResponse;
import com.example.demo.response.BookListResponse;
import com.example.demo.servise.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/book")
public class BookController {
    private BookService service;

    private BookController(BookService service){
        this.service = service;
    }
    @GetMapping("/all")
    public ResponseEntity<BaseResponse> getAll(){
        return ResponseEntity.ok(new BookListResponse(service.getAll()));
    }

    @PostMapping("/add")
    public ResponseEntity <BaseResponse> registration(@RequestBody BookEntity data){
        try{
            service.save(data);
            return ResponseEntity.ok(new BaseResponse(false,"Книга добавлена"));
        } catch (Exception e){
            return ResponseEntity.badRequest().body(new BaseResponse(false,e.getMessage()));
        }
    }

}

