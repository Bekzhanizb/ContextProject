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
        videoCard.setName("NVidia GeForce GTX 3060");
        return videoCard;
    }

    @Bean
    VideoCard geForce4050() {
        var videoCard = new VideoCard();
        videoCard.setName("NVidia GeForce GTX 4050");
        return videoCard;
    }

    @Bean
    VideoCard geForce5080() {
        var videoCard = new VideoCard();
        videoCard.setName("NVidia GeForce GTX 5080");
        return videoCard;
    }

    @Bean
    Laptop lenovo() {
        var laptop = new Laptop();
        laptop.setName("Lenovo ThinkPad");
        laptop.setVideoCard(geForce4050());
        return laptop;
    }

    @Bean
    Laptop gigabyte() {
        var laptop = new Laptop();
        laptop.setName("Gigabyte F5 MF5");
        laptop.setVideoCard(geForce3060());
        return laptop;
    }
}
