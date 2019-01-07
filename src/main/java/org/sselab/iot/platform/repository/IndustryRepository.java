package org.sselab.iot.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.sselab.iot.platform.domain.Industry;

/**
 * @author PanTeng
 * @version 1.0
 * @file IndustryRepository.java
 * @date 2019/1/7
 * @attention Copyright (C),2004-2019,SSELab, SEI, XiDian University
 */
public interface IndustryRepository extends JpaRepository<Industry,Long> {
}
