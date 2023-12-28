package tn.mosofty.mosofty.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.mosofty.mosofty.Entity.test1;
import tn.mosofty.mosofty.Service.Test1Service;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/test1")
public class Test1Controller {

    private final Test1Service test1Service;

    @Autowired
    public Test1Controller(Test1Service test1Service) {
        this.test1Service = test1Service;
    }

    @GetMapping("/alltests")
    public ResponseEntity<List<test1>> getAllTest1() {
        List<test1> test1List = test1Service.getAllTest1();
        return ResponseEntity.ok(test1List);
    }

    @GetMapping("/{id}")
    public ResponseEntity<test1> getTest1ById(@PathVariable Integer id) {
        Optional<test1> test1 = test1Service.getTest1ById(id);
        return test1.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/")
    public ResponseEntity<test1> createTest1(@RequestBody test1 test1) {
        test1 createdTest1 = test1Service.createTest1(test1);
        return new ResponseEntity<>(createdTest1, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<test1> updateTest1(@PathVariable Integer id, @RequestBody test1 test1) {
        test1 updatedTest1 = test1Service.updateTest1(id, test1);
        if (updatedTest1 != null) {
            return ResponseEntity.ok(updatedTest1);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTest1(@PathVariable Integer id) {
        test1Service.deleteTest1(id);
        return ResponseEntity.noContent().build();
    }
}
