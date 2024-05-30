package com.example.many_to_one_example.model;

import jakarta.persistence.*;
import lombok.*;


import java.util.List;
import java.util.Set;

@Entity
@Table(name = "student_table")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")

    private Long Id;

    private String studentName;

    @Column(name = "admission_no")
    private int admissionNo;

    @Column(name = "age")
    private int age;

    private String studentType;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Assignment> assignmentSet;


}

/*
Cascade Type: Assignment sınıfında Many-To-One ilişkisi tanımlarken CascadeType.ALL kullanmanız hatalı olabilir. Bu, Assignment'ı silerken Student'ın da silinmesine neden olabilir, ki bu muhtemelen istediğiniz bir davranış değil. CascadeType.ALL yerine yalnızca CascadeType.PERSIST veya CascadeType.MERGE gibi uygun cascade tiplerini kullanmalısınız, bağlantıyı güncellerken veya bir Student kaydı kaydederken Assignment kayıtlarının da otomatik olarak kaydedilmesini sağlamak için.
Fetch Type: Assignment sınıfında Student alanı için FetchType.EAGER kullanıyorsunuz. Bu, bir öğrenci nesnesi alındığında tüm atamaların da getirilmesini sağlar. Bu, performans sorunlarına neden olabilir, özellikle büyük veri setlerinde. Verileri gerçekten ihtiyacınız olduğunda getirmek için FetchType.LAZY kullanmayı düşünebilirsiniz.
NullPointerException Riski: Assignment nesnesi oluştururken Student özelliğini ayarlamadan önce Student nesnesini kaydediyorsunuz. Bu, student alanının null olma riskini taşır ve NullPointerException'a neden olabilir. Student nesnesini kaydetmeden önce Assignment nesnesini oluşturmayı düşünmelisiniz.
Temporal Type: dueDate alanı için TemporalType.DATE kullanıyorsunuz, bu yalnızca tarihi saklar, saat ve zaman bilgisini dikkate almaz. Eğer saat ve zaman bilgisini de saklamak istiyorsanız, TemporalType.TIMESTAMP kullanmalısınız.
Spring Context: AssignmentRepository ve StudentRepository'yi doğru şekilde otomatik olarak yapılandırmak için, ManyToOneExampleApplication sınıfının bulunduğu paket ve altındaki sınıfları tarayacak şekilde Spring Boot uygulamanızı yapılandırmanız gerekebilir.
Bu hataları düzeltmek için:

Cascade tipini gözden geçirin ve yalnızca gerekli olanları belirleyin.
Fetch tipini FetchType.LAZY olarak değiştirin.
Student nesnesini kaydetmeden önce Assignment nesnesini oluşturun.
dueDate alanının tipini TemporalType.TIMESTAMP olarak değiştirin.
Spring Boot uygulamanızın yapılandırmasını gözden geçirin ve bileşen taramasını doğru şekilde ayarlayın.
 */