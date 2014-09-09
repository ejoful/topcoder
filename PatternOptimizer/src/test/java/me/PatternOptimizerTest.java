package me;

import org.junit.*;
import static org.junit.Assert.*;

public class PatternOptimizerTest {

    public PatternOptimizerTest() {}

    @Test
    public void test() throws Exception {
        assertEquals("*??a", PatternOptimizer.optimize("*??*a"));
        assertEquals("*b*a*", PatternOptimizer.optimize("*b**a*"));
        assertEquals("cla??", PatternOptimizer.optimize("cla??"));
        assertEquals("*???", PatternOptimizer.optimize("*?*?*?*"));
        assertEquals("T*nd*?", PatternOptimizer.optimize("T***nd?*"));
        assertEquals("*???????caa??aaa*a*babc*?b*?", PatternOptimizer.optimize("????*???*caa??aaa*a*babc**?*b*?"));
        assertEquals("a", PatternOptimizer.optimize("a"));
        assertEquals("*?c", PatternOptimizer.optimize("?*c"));
        assertEquals("aa*a*?aa*a*a?b*?a*?caaa", PatternOptimizer.optimize("aa*a?*aa*a*a?b?*a*?*caaa"));
        assertEquals("*ac??a*b*c", PatternOptimizer.optimize("*ac??a**b***c"));
        assertEquals("a*?c*a*bc?a?a*c?a?ab", PatternOptimizer.optimize("a*?c**a*bc?a?a*c?a?ab"));
        assertEquals("?c*?aac*a????aa*???a*?b*ca*a*ca*c*?a?cca", PatternOptimizer.optimize("?c?*aac*a????aa??*?*a**?b*ca*a*ca***c?**a?cca"));
        assertEquals("?", PatternOptimizer.optimize("?"));
        assertEquals("*", PatternOptimizer.optimize("*"));
        assertEquals("*baa*?a?b????a*a*??", PatternOptimizer.optimize("*baa?*a?b????a*a?*?"));
        assertEquals("*b?a*?????c*c*??a?a*???aa*??a*c??a??a", PatternOptimizer.optimize("*b?a?*?*???**c*c??*a?a?*??**aa?*?a*c??a??a"));
        assertEquals("?ba*?b??a?c??aa*a*", PatternOptimizer.optimize("?ba**?b??a?c??aa*a*"));
        assertEquals("a*??a*??a?a????a*?aa*?a*??aa*??", PatternOptimizer.optimize("a*?****?a*??a?a????a**?aa*?*a**??aa***??"));
        assertEquals("a*????b*???a?a*??c?aa*????a*??aa", PatternOptimizer.optimize("a*?*???b?*??a?a*?*?c?aa*???*?a?*?aa"));
        assertEquals("a*?aaaa*aa?a*a*c*?a*???a*????b*a*a*???a?", PatternOptimizer.optimize("a*?aaaa*aa?a*a*c**?*a??*?*a?*???b**a*a*?***?*?*a?"));
        assertEquals("*a*??a*?????", PatternOptimizer.optimize("**a**??*a**???**??*"));
        assertEquals("*???a*a?a", PatternOptimizer.optimize("*???a***a?a"));
        assertEquals("c*??a*?b*?a*?a*??aaa*??a*a?a", PatternOptimizer.optimize("c?*?a**?b?*a*?*a??*aaa**??a**a?a"));
        assertEquals("ac?c*?a*??a*?????a", PatternOptimizer.optimize("ac?c*?*a*??**a?*?*???a"));
        assertEquals("a*??b*??b*?b*?a*????", PatternOptimizer.optimize("a?**?b***?*?**b****?b?*****a??**??**"));
        assertEquals("a*a*?????????a*?a*??a*?????", PatternOptimizer.optimize("a**a*?*****?*?*??*??**?***?a*?***a***?**?a*????*?"));
        assertEquals("*??????", PatternOptimizer.optimize("???**??**?"));
        assertEquals("*?a*???????a", PatternOptimizer.optimize("**?a***?**???**?**?*******?a"));
        assertEquals("*???a*?????a*?????", PatternOptimizer.optimize("??**?*a?*??***??a??*???"));
        assertEquals("*??????????????aaa*?a*????", PatternOptimizer.optimize("*??*???*???**?*?*?*?**?*****?aaa?***a**?*?*??"));
        assertEquals("*?a*a?a*?????a*???????aa*???", PatternOptimizer.optimize("*?*a*a?a?**????a**??*??*???aa??*?**"));
        assertEquals("a?a*????????aa*?a*???a???", PatternOptimizer.optimize("a?a???*?????**aa?*a?*??**a???"));
        assertEquals("a*??a*??", PatternOptimizer.optimize("a*??*a?*?*"));
        assertEquals("*?a*??a*??????", PatternOptimizer.optimize("*?a?*****?*a??*?*??*?"));
        assertEquals("*a*?a????aa*?????a*??a*???a*?????", PatternOptimizer.optimize("***a?**a????aa**?????a*?****?a???*a**????****?****"));
        assertEquals("*b*x*k?q*?dkkbuuj?sjoa*aa*oro*?o*c?d*?waaw?t?y?ie", PatternOptimizer.optimize("*b*x*k?q*?*dkkbuuj?sjoa*aa*oro*?o*c?d*?waaw?t?y?ie"));
        assertEquals("*aekldaun*eyz*???ighg*?oipmna*b?yeue*tas*e?iksd", PatternOptimizer.optimize("*aekldaun**eyz**???ighg?*oipmna*b?yeue**tas*e?iksd"));
        assertEquals("ycujo*fe*s*apfza?jaa*yca?oy*?yeqp?nwuuqocbssq*ges", PatternOptimizer.optimize("ycujo**fe*s*apfza?jaa*yca?oy*?yeqp?nwuuqocbssq*ges"));
        assertEquals("?eyagg*wkade*a?hccbcambeaa?wc*?dyye*?k?icnc*?qhia", PatternOptimizer.optimize("?eyagg*wkade*a?hccbcambeaa?wc*?dyye?*k?icnc**?qhia"));
        assertEquals("khv?a*q*squwaqzdq?dgu*ohqa*li?es?kqstyqedatk??akwa", PatternOptimizer.optimize("khv?a*q*squwaqzdq?dgu*ohqa*li?es?kqstyqedatk??akwa"));
        assertEquals("efv?tqq*w*oasessac?hhli?yp?dasstioy*c*xr??tacsca?", PatternOptimizer.optimize("efv?tqq**w*oasessac?hhli?yp?dasstioy*c*xr??tacsca?"));
        assertEquals("x*kyfo??uuzriw*va*?gzq?axy*??ucnwuen?y*lw*ii?cy", PatternOptimizer.optimize("x*kyfo??uuzriw*va*?*gzq?axy**??*ucnwuen?y*lw*ii?cy"));
        assertEquals("a*t??z?mi*?zr*szijfe?u?igbmaynb*ko?a*zue?wnkw?pq*?", PatternOptimizer.optimize("a*t??z?mi?*zr*szijfe?u?igbmaynb*ko?a*zue?wnkw?pq*?"));
        assertEquals("fk*iquk*??ofkhp*?uv?csacgfw?ax?b?ayzuqtym*faw*?sti", PatternOptimizer.optimize("fk*iquk??*ofkhp*?uv?csacgfw?ax?b?ayzuqtym*faw*?sti"));
        assertEquals("gmn*ufcam*pm*??a?cs?om*ix?iuizauv??amg?jas*?i*wy", PatternOptimizer.optimize("gmn***ufcam*pm?*?a?cs?om*ix?iuizauv??amg?jas*?i*wy"));
        assertEquals("icwyj*???kvci?eqj?i?wzs??ag*q*?aipj*?a*e*v*m*oga", PatternOptimizer.optimize("icwyj?*??kvci?eqj?i?wzs??ag*q**?*aipj*?a*e*v*m*oga"));
        assertEquals("*??wowch*budeun?x?aa*e*ceu?sq?qztucaiegcq*myrwjrqm", PatternOptimizer.optimize("*??wowch*budeun?x?aa*e*ceu?sq?qztucaiegcq*myrwjrqm"));
        assertEquals("suysq*kuuhyumei??c*yytqma?w*gck*?u*?xeys*a*?z*", PatternOptimizer.optimize("suysq*kuuhyumei??c*yytqma?w*gck***?*u?*xeys**a?*z*"));
        assertEquals("??cesxq*?b*?ily*?xlk*?oenirgsat*??xqcktw*?gqmxec", PatternOptimizer.optimize("??cesxq?*b?*ily*?*xlk**?oenirgsat*??xqcktw*?gqmxec"));
        assertEquals("*axa?xmmy?zcatwmyzv?tam???akc??eel*cws?lyy*?onar?n", PatternOptimizer.optimize("*axa?xmmy?zcatwmyzv?tam???akc??eel*cws?lyy?*onar?n"));
        assertEquals("c?uckxe*aqmb*?geykc*ouwiccwo?smu?uama*?scytjuqtj", PatternOptimizer.optimize("c?uckxe*aqmb*?**geykc*ouwiccwo?smu?uama*?scytjuqtj"));
        assertEquals("??ofe*yf*?uo*qg?aqagze?oswud*ra*kmic?mmpgwomo*wla", PatternOptimizer.optimize("??ofe**yf*?uo*qg?aqagze?oswud*ra*kmic?mmpgwomo*wla"));
        assertEquals("wk*vh?eu*??mana?yqpauaa*y*rpt?ax?suz*?a?x?twnuwie?", PatternOptimizer.optimize("wk*vh?eu?*?mana?yqpauaa*y*rpt?ax?suz?*a?x?twnuwie?"));
        assertEquals("ucjayghnq??gyy?uvii?lpa*y*?eua*n*??cnynmdiioqy*bik", PatternOptimizer.optimize("ucjayghnq??gyy?uvii?lpa*y?*eua*n??*cnynmdiioqy*bik"));
        assertEquals("gpc*k*?k?aeue*cc*a*psoaojst*s?wi?l?k?cwi*?ms?a*z", PatternOptimizer.optimize("gpc*k**?k?aeue*cc*a*psoaojst*s?wi?l?k?cwi?**ms?a*z"));
        assertEquals("???xx*?xx?x*?xxx*????x*?????xx*??????x*??", PatternOptimizer.optimize("???xx?*xx?x?*xxx???**?x??*?*?*?xx***??**??**??x??*"));
        assertEquals("*?x*???xx*x*????xx?x?x??z*z*??x*?x*??z*?", PatternOptimizer.optimize("****?x?***??xx*x?**?*??xx?x?x??z*z*??*x?*x?*?**z?*"));
        assertEquals("x?????z?xx?x*xx*?xyy*?????xx*???x*????????y*?", PatternOptimizer.optimize("x?????z?xx?x**xx?*xyy*?*????xx*???**x???????*?y**?"));
        assertEquals("*xy?x*?yxx*?x*?x*??x*x*???x*?xz*?????x", PatternOptimizer.optimize("***xy?x*?yxx**?x****?x*?*?x***x?*??x**?xz??*??*?*x"));
        assertEquals("x*??x*?x*???xxy*?x?x?x?????x*?xxx??xz*?y*??x*?", PatternOptimizer.optimize("x?*?x*?x?**??xxy*?x?x?x?????x*?xxx??xz?*y*?*?*x*?*"));
        assertEquals("*?????????????????????????????", PatternOptimizer.optimize("???**???***?*?***??*??*?***???**???***????????*??*"));
        assertEquals("*??????????????????????????????", PatternOptimizer.optimize("?*?**??***??***???**???*?*??*?**??*????*?*???*????"));
        assertEquals("*????????????????????????????", PatternOptimizer.optimize("????????*?*?*??*?****?***?***???**??***??**?*?????"));
        assertEquals("*???????????????????????????", PatternOptimizer.optimize("??**???*?****?*????***?*????**??***????????****?**"));
        assertEquals("*?????????????????????????????", PatternOptimizer.optimize("??*?????***???**?????***???***??*??**??***?***????"));
        assertEquals("*???????????????????????????????", PatternOptimizer.optimize("***??*????*????**??*???*?????*?*??*?****?**?*?????"));
        assertEquals("*???????????????????????", PatternOptimizer.optimize("*?****?**??*??*?*?*???*?**??**?**??*?*?*****???**?"));
        assertEquals("*???????????????????????????????", PatternOptimizer.optimize("????*?**???*?*?*??????**???****?????*????****?*?*?"));
        assertEquals("*????????????????????????????", PatternOptimizer.optimize("*????*???*?*???**???**?*?***???*?*????*??*??******"));
        assertEquals("*??????????????????????????????", PatternOptimizer.optimize("?*?*?*???***?*??**?***??????????*??*?????*?*?***?*"));
        assertEquals("*?????????????????????????", PatternOptimizer.optimize("?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*"));
        assertEquals("*?????????????????????????", PatternOptimizer.optimize("*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?*?"));
        assertEquals("*????????????z*????????????", PatternOptimizer.optimize("?*?*?*?*?*?*?*?*?*?*?*?*z*?*?*?*?*?*?*?*?*?*?*?*?*"));
        assertEquals("*????????????z*?????????????", PatternOptimizer.optimize("*?*?*?*?*?*?*?*?*?*?*?*?z?*?*?*?*?*?*?*?*?*?*?*?*?"));
        assertEquals("*", PatternOptimizer.optimize("**************************************************"));
        assertEquals("??????????????????????????????????????????????????", PatternOptimizer.optimize("??????????????????????????????????????????????????"));
        assertEquals("*?", PatternOptimizer.optimize("?*************************************************"));
        assertEquals("*?????????????????????????????????????????????????", PatternOptimizer.optimize("?????????????????????????????????????????????????*"));
        assertEquals("T*???", PatternOptimizer.optimize("T*??*?"));
        assertEquals("T*nd*?", PatternOptimizer.optimize("T***nd?*"));
        assertEquals("cla*?", PatternOptimizer.optimize("cla?*"));
        assertEquals("*??", PatternOptimizer.optimize("??*"));
        assertEquals("*", PatternOptimizer.optimize("**"));
        assertEquals("*?", PatternOptimizer.optimize("?*"));
        assertEquals("*???ab*??c*??ad*", PatternOptimizer.optimize("??****?ab?**?c**??ad*"));
        assertEquals("*????", PatternOptimizer.optimize("????****"));
        assertEquals("A*?", PatternOptimizer.optimize("A?*"));
        assertEquals("x", PatternOptimizer.optimize("x"));
        assertEquals("T*nd*?nd*?", PatternOptimizer.optimize("T***nd?*nd?*"));
        assertEquals("*?", PatternOptimizer.optimize("*?"));
        assertEquals("*asg*??????g*h*??????p*?", PatternOptimizer.optimize("**asg*??*?*?*?*?g**h????*?*?*p*?"));
    }
}