package models;

/**
 * Created by Mandy on 4/22/16.
 */
import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.List;

@Named
@Singleton
public interface GroupRequestorRepository extends CrudRepository<GroupRequestor, Long>  {
    GroupRequestor findById(Long id);
    List<GroupRequestor> findBysenderId(Long id);
    List<GroupRequestor> findBygroupUrl(String url);
}
