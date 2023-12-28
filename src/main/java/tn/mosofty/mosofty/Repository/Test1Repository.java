package tn.mosofty.mosofty.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.mosofty.mosofty.Entity.test1;

@Repository
public interface Test1Repository extends JpaRepository<test1, Integer> {

}
