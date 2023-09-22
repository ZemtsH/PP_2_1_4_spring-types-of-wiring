package koschei.config;

import koschei.KoscheiTheDeathless;
import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {
    @Bean
    public KoscheiTheDeathless koscheiTheDeathless(Ocean1 ocean) {
        KoscheiTheDeathless koscheiTheDeathless = new KoscheiTheDeathless();
        koscheiTheDeathless.setOcean(ocean);
        return koscheiTheDeathless;
    }

    @Bean
    public Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public Wood3 wood3(Rabbit4 rabbit) {
        return new Wood3(rabbit);
    }

    @Bean
    public Needle7 needle7() {
        return new Needle7();
    }

    @Bean
    public Egg6 egg6(Needle7 needle) {
        return new Egg6(needle);
    }
}
