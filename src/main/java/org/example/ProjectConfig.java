package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    @Bean
    @Primary
    VideoCard geForce3060() {
        var videoCard = new VideoCard();
        videoCard.setName("NVidia GeForce 3060");
        return videoCard;
    }

    @Bean
    VideoCard geForce4050() {
        var videoCard = new VideoCard();
        videoCard.setName("NVidia GeForce 4050");
        return videoCard;
    }

    @Bean
    Laptop laptop() {
        var laptop = new Laptop();
        laptop.setName("Lenovo");
        laptop.setVideoCard(geForce3060());
        return laptop;
    }
}
