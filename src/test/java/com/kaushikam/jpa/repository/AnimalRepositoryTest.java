package com.kaushikam.jpa.repository;

import com.kaushikam.jpa.JpaApplication;
import com.kaushikam.jpa.entity.inheritance.joined.Mammal;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest(classes = JpaApplication.class)
public class AnimalRepositoryTest {

    @Autowired
    private AnimalRepository animalRepository;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testSaveAnimal() {
        Mammal human = new Mammal("Human", 2);
        animalRepository.save(human);
        Assert.assertTrue(human.getId() > 0);
    }
}
