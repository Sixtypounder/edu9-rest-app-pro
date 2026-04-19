package gr.aueb.cf.eduapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Region extends JpaRepository<Region, Long> {

    List<Region> findAllByOrderByRegionNameAsc();
}
