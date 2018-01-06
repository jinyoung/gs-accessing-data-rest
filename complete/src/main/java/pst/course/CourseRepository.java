package pst.course;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by uengine on 2018. 1. 6..
 */
//@RepositoryRestResource
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
