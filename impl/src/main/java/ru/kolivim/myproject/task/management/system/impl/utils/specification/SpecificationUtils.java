package ru.kolivim.myproject.task.management.system.impl.utils.specification;

import org.springframework.data.jpa.domain.Specification;
import ru.kolivim.myproject.task.management.system.api.dto.search.BaseSearchDto;
import ru.kolivim.myproject.task.management.system.domain.base.BaseEntity_;

import java.time.LocalDateTime;

public class SpecificationUtils {

    public static <T> Specification<T> like(String key, String value) {
        return (root, query, criteriaBuilder) -> value == null
                ? null : criteriaBuilder.like(criteriaBuilder.lower(root.get(key)), "%" + value.toLowerCase() + "%");
    }

    public static <T, K> Specification<T> equal(String key, K value) {
        return (root, query, criteriaBuilder) -> value == null
                ? null : criteriaBuilder.equal(root.get(key), value);
    }
    public static <T, K> Specification<T>notEqual(String key, K value) {
        return (root, query, criteriaBuilder) -> value == null
                ? null : criteriaBuilder.notEqual(root.get(key), value);
    }

    public static Specification getBaseSpecification(BaseSearchDto baseSearchDto) {
        return equal(BaseEntity_.ID, baseSearchDto.getId())
                .and(equal(BaseEntity_.IS_DELETED, baseSearchDto.getIsDeleted()));
    }


    public static <T, K> Specification<T> in(String key, K value) {
        Specification<T> spec = (root, query, criteriaBuilder) -> value == null
                ? null : criteriaBuilder.in(root.get(key)).value(value);
        return spec;
    }

    public static <T, K> Specification<T>  between(String key, Integer ageFrom,  Integer ageTo) {
        Specification<T> spec = null;
        if((ageFrom==null)&(ageTo!=null)){
            spec = (root, query, criteriaBuilder) ->  criteriaBuilder.greaterThan(root.get(key),  LocalDateTime.now().minusYears((int)ageTo));
        }
        else if(((ageFrom!=null)&(ageTo==null))){
            spec = (root, query, criteriaBuilder) ->  criteriaBuilder.lessThan(root.get(key),  LocalDateTime.now().minusYears((int)ageFrom));
        }
        else if(((ageFrom!=null)&(ageTo!=null))) {
            spec = (root, query, criteriaBuilder) ->  criteriaBuilder.between(root.get(key), LocalDateTime.now().minusYears((int) ageTo), LocalDateTime.now().minusYears((int) ageFrom));
        }
        return spec;
    }



    public static <T, K> Specification <T> betweenDate(String key, LocalDateTime dateTimeFrom, LocalDateTime dateTimeTo){
        Specification<T> spec = ((root, query, criteriaBuilder) -> dateTimeFrom == null || dateTimeTo == null
                ? null : criteriaBuilder.between(root.get(key), dateTimeFrom, dateTimeTo));
        return spec;
    }

}