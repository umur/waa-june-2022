package com.example.demo.util;

import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ModelMapperUtils {
  public static <T> T map(Object source, Class<T> destination) {
    ModelMapper modelMapper = new ModelMapper();
    return modelMapper.map(source, destination);
  }

  <S, T> List<T> mapList(List<S> source, Class<T> targetClass) {
    ModelMapper modelMapper = new ModelMapper();

    return source
            .stream()
            .map(element -> modelMapper.map(element, targetClass))
            .collect(Collectors.toList());
  }
}
