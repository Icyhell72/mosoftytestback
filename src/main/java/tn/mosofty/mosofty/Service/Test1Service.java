package tn.mosofty.mosofty.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.mosofty.mosofty.Entity.test1;
import tn.mosofty.mosofty.Interface.Test1Interface;
import tn.mosofty.mosofty.Repository.Test1Repository;

import java.util.List;
import java.util.Optional;

@Service
public class Test1Service implements Test1Interface {

    private final Test1Repository test1Repository;

    @Autowired
    public Test1Service(Test1Repository test1Repository) {
        this.test1Repository = test1Repository;
    }

    @Override
    public List<test1> getAllTest1() {
        return test1Repository.findAll();
    }

    @Override
    public Optional<test1> getTest1ById(Integer id) {
        return test1Repository.findById(id);
    }

    @Override
    public test1 createTest1(test1 test1) {
        return test1Repository.save(test1);
    }

    @Override
    public test1 updateTest1(Integer id, test1 test1) {
        if (test1Repository.existsById(id)) {
            return test1Repository.save(test1);
        } else {
            return null;
        }
    }

    @Override
    public void deleteTest1(Integer id) {
        test1Repository.deleteById(id);
    }
}
