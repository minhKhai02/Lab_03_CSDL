package com.example._ChuMinhKhai_A6.Validator;


import com.example._ChuMinhKhai_A6.Validator.annotation.ValidCategoryId;
import com.example._ChuMinhKhai_A6.entity.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return  category != null && category.getId() != null ;
    }
}
