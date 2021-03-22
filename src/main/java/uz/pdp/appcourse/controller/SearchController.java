package uz.pdp.appcourse.controller;

import org.springframework.web.bind.annotation.*;
import uz.pdp.appcourse.constants.FrontURLs;
import uz.pdp.appcourse.dtos.response.ResponseCompany;
import uz.pdp.appcourse.dtos.response.ResponseCourse;
import uz.pdp.appcourse.repository.CourseRepository;
import uz.pdp.appcourse.service.CompanyService;
import uz.pdp.appcourse.service.CourseService;

import java.util.List;

@RestController
@RequestMapping(FrontURLs.SEARCH)
public class SearchController {

    //*
    // * Joy bo'yicha(Address bo'yicha) company qidirish
    // (Toshkentdagi IT bo'yicha o'quv markazlari)
    // * Kurs nomlari bo'yicha
    // * Kurs kategoriyasi bo'yicha
    // * Kategoriya bo'yicha kurs qidirish
    // * Kategoriya bo'yicha company larni qidirish
    // * Yosh chegarasi bo'yicha o'quv markaz qidirish
    // (Xorazmdagi 15 - 18 yoshdagilar uchun til kurslari)
    // * Zaproslarni Page qilib tayyorlash
    // (Toshkentda yoshlar uchun ingiliz tili kursini topish)
    //
    // */

    final CompanyService companyService;
    final CourseService courseService;

    public SearchController(CompanyService companyService, CourseRepository courseRepository, CourseService courseService) {
        this.companyService = companyService;
        this.courseService = courseService;
    }

    @GetMapping("/companies")
    List<ResponseCompany> getCompaniesByRegionAndCourseCategory(@RequestParam("region") String region, @RequestParam("courseCategory") String courseCategory) {
        return companyService.findAllByCategoryAndAddress(region, courseCategory);
    }

    @GetMapping("/companiesByCourseName")
    List<ResponseCompany> getCompaniesByRegionAndCourseCategory(@RequestParam("courseName") String courseName) {
        return companyService.findAllByCourseName(courseName);
    }

    @GetMapping("/courses")
    List<ResponseCourse> getCourseByCategory(@RequestParam("category") String category){
        return courseService.findAllByCategory(category);
    }




}
