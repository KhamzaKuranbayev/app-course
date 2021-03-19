package uz.pdp.appcourse.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.appcourse.constants.FrontURLs;
import uz.pdp.appcourse.dtos.response.ResponseCompany;
import uz.pdp.appcourse.entity.Course;
import uz.pdp.appcourse.service.CompanyService;

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

    public SearchController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/companies")
    List<ResponseCompany> getCompaniesByRegionAndCourseCategory(@RequestHeader("region") String region, @RequestHeader("course") String course) {
        return companyService.findAllByCategoryAndAddress(region, course);
    }


}
