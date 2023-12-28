package tn.mosofty.mosofty.Interface;

import tn.mosofty.mosofty.Entity.test1;

import java.util.List;
import java.util.Optional;

public interface Test1Interface {
    List<test1> getAllTest1();

    Optional<test1> getTest1ById(Integer id);

    test1 createTest1(test1 test1);

    test1 updateTest1(Integer id, test1 test1);

    void deleteTest1(Integer id);
}
