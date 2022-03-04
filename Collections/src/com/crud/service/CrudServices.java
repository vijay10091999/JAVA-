package com.crud.service;

import java.util.List;

import com.crud_model.Employee;

public interface CrudServices {
      public boolean insert ();
      public Employee display (Employee e);
      public int search ();
      public int delete ();
      public int update ();
      
}
