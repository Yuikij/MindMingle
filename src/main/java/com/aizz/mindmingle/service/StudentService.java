package com.aizz.mindmingle.service;

import com.aizz.mindmingle.entity.dos.StudentDO;
import com.aizz.mindmingle.entity.dto.RemoveDTO;

import java.util.List;

public interface StudentService {
    List<StudentDO> list();

    void add(StudentDO studentDO);

    void edit(StudentDO studentDO);

    StudentDO detail(Long id);

    void remove(RemoveDTO removeDTO);
}
