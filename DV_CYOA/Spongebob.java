/*
 * Diego Velasco
 * Start Date 10/27/2022 - End Date 12/14/2022
 * Project CYOA
 */
import java.util.concurrent.TimeUnit;
//import java.util.Date;
import java.util.Scanner;

public class Spongebob {
  
  public Spongebob() {
    
      // user's decisions.
    String responseOne;
    String responseTwo;
    String responseThree;
    String responseFour;
    
      // random number for (A,A,A,B).
    double randomNumber = Math.random();
    
      // first choice in Dora story.
    System.out.println("\nWelcome to the Spongebob story game!");
    System.out.println("It's a regular day in Bikini Bottom. Do you wanna hang out with Patrick or Squidward?");
    System.out.println("a) Patrick");
    System.out.println("b) Squidward");
    
    Scanner scan = new Scanner(System.in);
    
    
    do {
      
      responseOne = scan.next();
      
        // choices (A)
      if(responseOne.equals("a")) {
        
        System.out.println("You head to Patrick's place. You lift up his rock and slide under. Patrick greets you. What do you guys do now?");
        System.out.println("a) Chill under his rock");
        System.out.println("b) Go jellyfishing in the fields");
        
        responseTwo = scan.next();
        
          // choices (A,A)
        if(responseTwo.equals("a")) {
          
          System.out.println("You guys decide to stay at his place. What do you do now?");
          System.out.println("a) Sit with him");
          System.out.println("b) Stand with him");
          
          responseThree = scan.next();
          
            // choices (A,A,A)
          if(responseThree.equals("a")) {
            System.out.println("You decide to sit with him. What do you do now?");
            System.out.println("a) Let's lay on the floor");
            System.out.println("b) Let's do mental math");
            
            responseFour = scan.next();
            
              // choices (A,A,A,A)
            if (responseFour.equals("a")) {
              System.out.println("\n\"Let's lay on the floor\" you say. You both lay back across from each other and begin to relax. You close your eyes and begin to doze off.");
              System.out.println("zzzzzzzzzzzzzzz...");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // choices (A,A,A,B)
            else if (responseFour.equals("b")) {
              System.out.println("\n\"Hey Patrick, what's " + randomNumber + " squared?\"");
              System.out.println("Patrick says, \"" + Math.pow((randomNumber),2) + ".\"");
              System.out.println("\nYou step back, stunned by Patrick's sudden intellectual powers. He looks at you with a face of shock and embarrassment.\n\n\"Wait Spongebob, I can ex-\" \n\nYou turn away from him, cutting him off.\n\n\'Is he living a double life?\' you think to yourself, \'Can I trust him?\'\n\n\"I can't take my chances, Patrick.\"\nYou decide to cut ties with him. You leave his house, never seeing him again.\n\n\n...\n");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            } 
            
              // Error input.
            else {
              System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
              System.out.println("a) Patrick");
              System.out.println("b) Squidward");
            }
          }
            
            // choices (A,A,B)
          else if(responseThree.equals("b")) {
            System.out.println("You chose to stand with him. What do you do now?");
            System.out.println("a) Stare at him");
            System.out.println("b) ¥Ó¡»ˆ€Š Ãéö:œ=");
            
            responseFour = scan.next();
            
              // choices (A,A,B,A)
            if (responseFour.equals("a")) {
              System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
              System.out.println("                           👁   👁");
              System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // choices (A,A,B,B)
            else if (responseFour.equals("b")) {
              
              try {
                Thread.sleep(2000);
              } 
              catch(InterruptedException e) {
              }
              
                //loops the "corrupt text" five times.
                // credit to Kyle for this cool for-loop.
              for(int i = 0; i<5;i++ ) {
                System.out.println("\n‚ÀÇ‚ÀÇ‚ÀGô]_Àw…ÿþ“¿gï­?!ë¶‘ïúr¾1#pÆ± pÆ± ðÀÌF?¿ëqß6~ˆÈ×&ðå_ËïŸÛ æwÅód•Ä");
                
                try {
                  Thread.sleep(200);
                } 
                catch(InterruptedException e) {
                }
                
                System.out.println("Û ‰šÜBxá<ß©åw,üšPUTsƒõ<iÞûÑˆPÕ©Ïs£[þ!Œˆ‘oD¨sU]øU03Pð>ãêéWíP˜Ñ¨V+¬®®’$	Y–ŽQUúý>WWWt»]‚NFV«…ª’eÎ¹ñ÷ðr“û²Ïº½.WÏ®æ›ÀÌ‡MŽ¨ ÆñÉ1îÜeyÒ4ETèõú˜ÁÞÞ>Äq<e Ÿ<yÂýû÷qNˆã˜^¯G§ìïï³½½= ïë Ë¤ÉVU>ðG‡æ—@Aà+bAUi_÷xøà!ƒá3¾ÿÆ›Ôë\n$\n´û=>ýø>ûä�nÞ¼IEˆ×××2øá¿|‹ÖR“{_<æ×ï}J·Û¥V«±¶¶¼Ü Nš[Uú U99<&6?¿2zS„ãä¾Éóää~·Ë?}ãÿöß£’&ÌM§üÕÛÇí»Ÿ°½Þbuuo	Ñ1%NRVUV–jœ×SúýkŽ¯9ïì³¼¹Ž“õ™ä$Š£QÁ 0ñ–‘ùÀþþöücŸ P0VÂPÄ9Ú½>§OŽ¨%Ê›·hÔ*Xˆ‰‹¹q°ËöÖŸ>|ÀéÉ");
                
                try {
                  Thread.sleep(50);
                } 
                catch(InterruptedException e) {
                }
                
                System.out.println("­¥:A•`îÝ¾ËÑíÛÄIÂU§Ã");
                
                try {
                  Thread.sleep(600);
                } 
                catch(InterruptedException e) {
                }
                
                System.out.println("ñÅ;»ë³î5~ÐGû}B$T\nçètÚ‡}jµ*ÕJ5J ‚÷~ä?çšÀò©ž¤N¤ä2RÎÏÎi_žóÚ^‹Uúý>wîÞŒ7öX_[ææÍWøðÞ=>~ÄöÎ:i=¦×»¦×íòôé)_œ  hã áüüŒ“Ó_“u¡<CMb’4%Ë†ô×ÄIÊÎö{Û;T*•‰ý~Ÿëëk²áp~	œòVŒÆ`\nÊpxrø˜HŒ½-ªiÂƒÃCþÇÛïà4å þk×êÜÜ[esy‡§ Ü<?g%^âìâ’öÙ7¶øþ¿ÿ­jÄÝãKþáƒ¸ºìòèþ#$‰ø£ƒ[l­µøüÑ1ï}øëëküøÿœ,ÔùðÓÏùíñ	–ynÝº5}ý~Ÿîõ5ø9Oä§Œf0�£|¯Óép~~ÎZ+áÆî:Ê“³.¿üÕ X¦üøOþ˜W_Ùcgs[ûÛüü7¿æèði½K§{I¯wÅ·¶ù ÿéOYm¤|pç˜‡¸{÷.‡¼ö½›üðÿ„ýÍv<Â9Ïîîúãïs~ÑæÎûÜ=|Äñú:»»»T* Ï;{½fa¾	Ä^¬®xT#²`<½8#ómö¶Ø ©Ñóû‡ Ü¹ó€ÎÅ5wï?â‡ÿúŸ±Ô¨óê­]Þûà6‡Çg,oí fÄ¨DB5Q $ÔÓ„èw:ô*5§´š–ê)oæø²sÍ‡ÆÝû¹wï>2#ô‘$Eóø†,ó„y.¥Ó¡»ˆ€ŠÃDéö:œ==¦šû»[T*	Ÿ^ñÞ{ïóàÎg»ž>ºÍééØÙYã`o“½Íî>:âìô‘ ²õ2ŒŸy‚®»m†ýY–!â¨U* vºü¯¿ýoÿÍ» <»&NnÝz•Z%E,€TBa?æ·˜mifÅH´Ü¦ùWûÙ%‹§ì®¯°±¶\n");
                
                try {
                  Thread.sleep(400);
                } 
                catch(InterruptedException e) {
                }
                
                System.out.println("×íçÇ§¤±Q­E<99ãèè1ÏZ³Æ7÷‘Ìsvô„n§ƒYaã|Å€^·G»ÝaÐ”;yÏo?øˆ¿úŸÍÏÞý÷îÝ£Ûí‚A,ËÈ²ì…„nG`	W<Ë†ÁÑ s~qJ–õyeg›ÕV J½žð¯þÍ¨4Rå­[7i.¥ˆ*Z·^ÛâWïW8{ú€þ°™ yTdˆÌ†ôz¼f³-¬@oèùâÁ!îÝåÙÅ	I¢ˆHPƒý~ŸZ-0*Þ(àæØ„¾‚ t:mÎŸž°¶ gk4Ž0`uu…?ÿÆþ³¢•(¦ÚHQacc™ýeýæëÞ€X&2MŒ<Pê÷û—§)%²ÌsyqI»ÝŒ(ŠHâ˜(z9EBQVûß‘ÿ!¥AËa–¿÷!ãÙÕÝg—ÜØYgmµ‰aô†—í!âzšP«$3:½@wf4›)ß{ó€j%áääŒëë>à@jˆA°ûÃàÉMwÀû!Ý^—€°´¼ÂÖî6[;;¬¬®Òh4ˆã˜éj›™÷Xð§nÊ9ºOŸÒ¨¤¼zsŸz­JðéíüÍOÁÕÉ1qæ =ôlì¼Âøw?âß¼AÇ¼ñêkìíÞæ³ÛO`ØF%Å¹1A]„¨â¥(‰‰‚º¼€ ‚©’Vë,¯®óÆ[oqëÖëloí°¼¼L¥RAuÜ¹êæ¾dØs[.  ¹¸¸`{u‰ÕµUT…vwÀ¯þþ}þò ÿG÷ï ‚(ô†ý[oÐÇ«»;4ê	F‹¯“ÄŸpuqÍp`„ XP2CÑ„Œˆ¾zAÁ$¢^¯³µµÅë¯¿ÎÁÁ-–šk4\n¢(*òSÃ¬ðÛaŽG “€šgˆæU²!Ýg—œ]<e0¸ä¿{ŸåZ…³³KÞ}çg|qçcÚgG Šˆb²ë6?ýéK­eÖÖÖz8::Ã‚Ñî]ðáí;üä&Z•Ïòøð„H•D… ÇOùÛŸý†­Õ...¹ï‘KY[Ý`{m‡Íõm’Z%Håf?xDÀ†|üágóK …B˜Ä¸+žeC �ßëó«Ë_ÿäm|¿CÖkstø˜ëÞQš’$1ªÊ ? ËzüâÝŸsïÿÜ I+HÚ@Ó*ƒ~Ÿ0xÆ þ6ÿû—ï€	Þgt¯;TœPO”»Ÿ}Äí?Ä[Þaôz4jU–—W¨×êT*â´‚¸¨¸FÃBžy}ÞyçÝ9&0oÖ�EDç=ÃAÄA=vtžóéûÿÀåÉ1>‘8¢Qo°Ôh’VR §}:6OOïñøáÇˆ: }™•Íu¶Ö7ˆ€ Ç‡œ>zÂp0 ®VØØÞaww—ZE8=9æþý{tÎ ˆ“˜Ívþè_°¼ºJZ­¡.Ê%eî`ã¨UE8>z<ÇŠ‚ÿ}ó!ëÒ>ÃûŽ!©uxš­[Û[lloÑl6‰ G¿wÍÉé	ÇxzzÊ`0 r*nHB Bª¤b F­*¬4#ÖZ	Q¤tb£ž*ƒTHSGk©ÊÚÊ2æWÆ-K3˜ÐÒ¤±£V‰æ—À²“Wcò4 „Àp8$˜‘¦)+ËË¤¢hœ²º¾Îþþ>;¯ì³±±‹ín›ÃÃCZõ x Ì³g$‘§YMH Å¹˜ååeT•ápH­VcccƒV«…sŽÁ`À`0 V«Ekkk,µ–¨Tª¨›ÎðòÈs¬h4›lnnÎ1Lv#ŠˆJœÐl,³±½—û¥~Ÿ$©°²²ÉÞÞ\nvnì³¾¾Fœ$t{]VVžÐj®ÑZÙàÙùb}’$!­Ô8¡ç‡¬t»dYF¥RaumÕÕUâ( i,“6Wh?ë¢NY]ß¢µ±CZ]B ‚©ÃZ–Ï\n•[ElmnÐ»ùê˜—2€<™PU’$¥Ñ fsçÄ%lnm1‰¢„¥æ\nkk;¬l­³ÔjG1™ÏHk+Ôš-6Ö_¡sq…A.÷‹ˆ#úÁã³,ïDõZf³99í´Ût®¯ Ñ bu}‹ååÒ´‚¨£¬â¨*„¼Ç1;»{ÄQ<¿íÛüµ¨â¢˜êÒ*Sk­\nf‚&5êõ%*Í<:t. †ÆUªõk«{»]ð}PA1´€…€™á Gä â8&Š#0è÷ûôû×FGÔªuêõišŒÄLcEZ~­Qœ°¾¹CµÞš_]QÞòä!àM¡ETšKxïsUÈéÈ|E‘¢¢˜(Zq¤IL­^%xúBŠ¡…¨wR]\n„Ë¦±÷~Jï’Ÿ?BŠÄ½Ü ?ØÒžúÒ2I½1¿¾ªJ¬ãòH=m•q§> òÞœçXÕ&fy‰à9	~ù=“Êìç?U‚LK	 ÷òÊL4Ç¢&oJ˜¨å‹D&E°Éq^­™¸ŸbÍT-$õ¾ôY:ªòLíDltºR\nå˜ÉÔþ ÌÍÐ sÝ}~Kñ»x%EGÖ”)öŠwc|^æ‹å1:IÛè•¨Œ5UåÜ	Ë)›¼&ÔsÚP)®}Ž	?í_¥ÐþŠ£ó[úœÙ{á¸‚„ uùFÉEÆò—0¶“xÙ¨ù%PBþC>6žoŒÃ½pØô>Å©ˆFÌ}\n¹>å÷ž€ò·ŽÎùœÅþÒóÌ ¿ ~Ï)~ =üœs~	4Â—}üÿôb¾9æ–@+§É´?›5Ì¯&ÝõaJÌ5,W:×ò{`n	,ó¬É|n1·>r©ºŒ²é Ÿ§þÍ_ÿR¼dd³Ö¾ØËÓŸ¹b¸BýU÷ô›,ê“Ïþð¡ÑÀé<:2z?Yd–ry‘ßáÜ¾ O %Aoiµ¦ š_yÅß“—µÊÚqiæÊB–}C“WŠÞCqÒQI[oÿÌéÜX† ^!(øÒú�¡“F:”‰¹×ã3|\nŸX\npË¹£‘­ÓërßÉïøªó –Ú2 à,c8Í}¤H†BÌQÔ:iŸ3­2É¯LÔxd<el¦mâ  öa ëÕéÏÉP23Di&JÝ±e˜f .€+º…,Q&Ì$”3dÀ!ŸY«*hÈû‚±IÖ²s˜÷–�!“Ü€!:š:£¢ú¸]a€Ÿû)ÖäfÌ[FLºzVBÀ]aWG }¢Èp’áB \nFF_\n&ù\nä3Ž°©[Ÿ_ Â½H …	š?c¿XÌXteCX	¡èö–ûÎ-A<AFŸOÌ€´ÿŒpyÌå÷é|ñ1Î·IâŒØ2ÄÂHŠ?¶m…é›ìÔ¿=nÜñ |è´ôE Tfsù ?.€›–å+|ò(ñB˜çÉ-ù\nÉoŠOŒG†]üùC®?þÝ÷HmT{d2‘7•N4_KÌXï&XAZxŽºÜçû<X*’ƒÈ š¾“_WSäšsnB)¤z†¸¼.š!`‰ïQÏú¤: Èp”jX9h`L`ño ±Éõ1åûÌ¦›V¹8jb›×A9É›¡“°0!±€Ì³Tò§Ø›4b¨ŽL#46L¸€ÄÈò`%ˆ‘iNb¾¦™é€Ó	ßÈ›UyOƒÊs‹¾N•¿Æ‘ù«Ü‘f éTj˜H%ïþÏ-yr›¾€#“ 18Íç¯;A2A‹pÐ\nëåJËK(ÃŽÑÒ “EË%M<G†Êxñ×ò<ƒòIÍÌÔ>nlBsýÌûÀ2òS05TÒÜ5a˜ô!Î†¨A(ô3 ††P”ÇlT­…„…8)„|ôI©ky¾|æý” m5!Ø„fÑÆZS¦L(…rn¡£µ€zï‘l�Y²kÌwÁ©zÑÀäâ”£Å´ç²«‘—è¦£U‘éÚK©f+«<f’ëAËŒ");
                
                try {
                  Thread.sleep(400);
                } 
                catch(InterruptedException e) {
                }
                
                System.out.println("AJ=ié[Ýß=Çæ7ÆÌrâ\nÂ\nB€DãhÐŠ µÓ¢•tLX>_BôsPÍW’)u¥¹ Wp¡<“¸¢#òbiŽ	Ì§”)ƒ ›(Dµbgxg½c`@	dˆd`b´ND—ãŽFþ>øóñ“MuÇRÅÜ‚šo+¯n¢VZ.N›¯+¦üçüø’n« ¨&8I1WÁœ’ù¸Ðz7Y&šŒAFÛ Ï™KîcÊ:§Q$*Å¢éVX˜P›¨µ–ë¹&ÈÈx{ùz~	4Ís¯à	¨…Q ‰4¿Ý!Áç+øªŽ•Ó*£b¶KNQqKe|“]YÁ™,žÈ¯%„¼H “f·<êËÿ4ÁÜ((f‚Z2¤ŒÔ<Q0 æp™¢NF£@ h÷7V|žû“:ÓqDZ0Ãd0ÃÄƒ�€Ê$ç£’•‹ñ}Ixn	´¢SOS Q8ŽM‰M°�‰Ï=V `:e£Ü»ˆ8ÅÜø—1FÑJPQBˆŠdˆÚó’ï>Ê# ŸTÈøAšÄÜ¨dHècdà!È‚aAÁW	Ap™P±À Ã“!D!÷[å­Ô³i�¡üK-aT\n”qj™ŽV–|•Äü½º\nãät®859fž+1R£Bž[ o‚§oùL¿L†x¡øñœÁ`äÁ f åñENN™û™†â˜éètj ç¨á—1*yÛ—í7\n_Ô\næ–À²µ`ärŠLaT!S#(ô£qF&“2íÈ[±&¹IUULÉK`6î<äCËö“R²£2ò„L$\nˆŒmð—ýu4{É›ù%Eˆ°hˆ9E‚…S%\nô#O^Sñ£Ñ¡ÀP5%Ëo¼8Ð±¿pÁFSÍDJèÆ9Ÿ£TŠby° ×›q„`S\ná2àù¿«äÑ‘¦×%����IEND®B`‚ d");
              }
              
              System.out.println("\n\n\nAfter the long day, you say goodbye to Patrick and head back home.");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
              
            }
            
              // Error input.
            else {
              System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
              System.out.println("a) Patrick");
              System.out.println("b) Squidward");
            }
          }
          
            // Error input.
          else {
            System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
            System.out.println("a) Patrick");
            System.out.println("b) Squidward");
          }
        }
        
          // choices (A,B)
        else if (responseTwo.equals("b")) {
          
          System.out.println("You and Patrick head to the jellyfish fields to fish some jellyfish!\nOh no! Patrick got stung! He went into a coma! What do you do?????");
          System.out.println("a) Take him to the hospital");
          System.out.println("b) Leave him.");
          
          responseThree = scan.next();
          
            // choices (A,B,A)
          if(responseThree.equals("a")) {
            
            if (randomNumber >= .5) {
              System.out.println("\nAt the hospital, the doctors treat Patrick's injuries. He makes a full recovery!\nYou two celebrate by heading out to the fields to do some jellyfishing.\n\nWait...");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            else {
              System.out.println("\nAt the hospital, the doctors had to operate on Patrick to amputate a limb.\nAfterward, he makes a full recovery! Plus, you get to keep the limb.\nIt's a little gross, because it's starting to get bigger.\n\n...\n\nTurns out, the limb actually grew into another Patrick. You now have two Patricks in your life.\n\nYou ponder on how this could have happened and think about how this will affect the future.");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
            
          }
            
            // choices (A,B,B)
          else if(responseThree.equals("b")) {
            System.out.println("Are you sure you want to leave him?");
            System.out.println("a) Go back and help him");
            System.out.println("b) I want to leave him to die.");
            
            responseFour = scan.next();
            
              // choices (A,B,B,A)
            if (responseFour.equals("a")) {
              
              System.out.println("\n\nThank you.\n");
              
              if (randomNumber >= .5) {
              System.out.println("\nAt the hospital, the doctors treat Patrick's injuries. He makes a full recovery!\nYou two celebrate by heading out to the fields to do some jellyfishing.\n\nWait...");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
              }
              else {
                System.out.println("\nAt the hospital, the doctors had to operate on Patrick to amputate a limb.\nAfterward, he makes a full recovery! Plus, you get to keep the limb.\nIt's a little gross, because it's starting to get bigger.\n\n...\n\nTurns out, the limb actually grew into another Patrick. You now have two Patricks in your life.\n\nYou ponder on how this could have happened and think about how this will affect the future.");
                System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
                break;
              }
              
            }
            
              // choices (A,B,B,B)
            else if (responseFour.equals("b")) {
              System.out.println("\n\nYou are sick. Like literally, what is wrong with you?\n\nWhy would you leave your best friend behind like that?\n\nI don't even want to give you any dialogue on the story, you disgust me.\n\nConsider your actions and their consequences next time, please.\nStuff like this makes me feel horrible. Were you even thinking? Patrick's life was in your hands, and just for fun you decided to pick this option.\nDid you really want Patrick to die? Just like that?\nOr did you pick this option to see all of the dialogue?\n\nSigh. Jesus.\n\nHow about this, let me give you a different insight. Let's say you lived the life of Spongebob, so that the choices you made here would actually come true. As spongebob, would you let Patrick die? Morally, would you let your friend die just like that? If he were to die, you would have no close friend to hang out with. No close friend to go jellyfishing with.\n\nYou would be alone.\n\nI'm pretty sure no one would want to be alone in this difficult world that we live in. I personally think friends are what make life so fun! Why would you want to let go of that so quickly?\n\nYou know what, nevermind. I should of let this go a long time ago already.\n\n\nBye.");
              System.exit(0);
            }
            
              // Error input.
            else {
              System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
              System.out.println("a) Patrick");
              System.out.println("b) Squidward");
            }
          }
          
            // Error input.
          else {
            System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
            System.out.println("a) Patrick");
            System.out.println("b) Squidward");
          }
        }
          
          // Error input.
        else {
          System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
          System.out.println("a) Patrick");
          System.out.println("b) Squidward");
        }
      }
      
        // choices (B)
      else if(responseOne.equals("b")) {
        
        System.out.println("You head to Squidward's place. You open his door and head inside. Squidward says hello. What do you guys do now?");
        System.out.println("a) Play his clarinet");
        System.out.println("b) Go to a restaraunt");
        
        responseTwo = scan.next();
        
          // choices (B,A)
        if(responseTwo.equals("a")) {
          
          System.out.println("You decide to play his clarinet.");
          System.out.println("a) Firmly grasp the clarinet");
          System.out.println("b) Be gentle with the clarinet");
          
          responseThree = scan.next();
          
            // choices (B,A,A)
          if(responseThree.equals("a")) {
            System.out.println("You firmly grasped the clarinet and it breaks. Squidward looks at you in distress. What do you do?");
            System.out.println("a) Apologize and get him a new one");
            System.out.println("b) Gaslight him");
            
            responseFour = scan.next();
            
              // choices (B,A,A,A)
            if (responseFour.equals("a")) {
              System.out.println("\nYou apologize to squidward and feel bad for him. You tell him you'll help him in any way possible so he gets his clarinet back\n\nHe says thank you, it means a lot to him.\nHe appreciates that you'll stick through hard times with him.");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // choices (B,A,A,B)
            else if (responseFour.equals("b")) {
              System.out.println("\nYou stare at squidward, looking annoyed.\nYou say, \"I can't believe you let me play a broken clarinet.\"\nSquidward shouts at you and you shout back. He yells at you to leave his house.\n\nYou never talk to him again.");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            } 
            
              // Error input.
            else {
              System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
              System.out.println("a) Patrick");
              System.out.println("b) Squidward");
            }
          }
            
            // choices (B,A,B)
          else if(responseThree.equals("b")) {
            System.out.println("\nYou decide to be careful with his clarinet. You play a small, slow piece of music.\n\nSquidward gives a happy sigh and looks at you with a smile. You smile back, glad to see him relaxed.\n\nYou feel a small romantic tension between you two, and quickly excused yourself to go back home.\n\nSquidward says, \"Wait! You're leaving so soon??\"\n\nYou tell him that you're sorry and rush out the door...");
          }
          
            // Error input.
          else {
            System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
            System.out.println("a) Patrick");
            System.out.println("b) Squidward");
          }
        }
        
          // choices (B,B)
        else if (responseTwo.equals("b")) {
          
          System.out.println("You guys decide to head out to a restaurant. Which one do you go to?");
          System.out.println("a) Krusty Krab");
          System.out.println("b) Chum Bucket");
          
          responseThree = scan.next();
          
            // choices (B,B,A)
          if(responseThree.equals("a")) {
            System.out.println("You two head to the Krusty Krab. You walk inside, hungry for adventure.");
            System.out.println("a) Order a Krabby Patty?");
            System.out.println("b) Head to the back room?");
            
            responseFour = scan.next();
            
              // choices (B,B,A,A)
            if (responseFour.equals("a")) {
              System.out.println("\nYou order Krabby Patties for you and Squidward.\nYou take a bite out of yours and it's good and juicy.\nSquidward says he tastes something fishy. Actually, he says he tastes something crabby.\n\nAfter he says that, Mr. Krabs from across the restaurant looks up and stares at Squidward. He sweats profusely...\n\nAfterwards, you and Squidward head out to do something else.");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // choices (B,B,A,B)
            else if (responseFour.equals("b")) {
              System.out.println("\nYou guys head to the back room. Immediately walking in, you smell a weird gas in the air. You turn to ask Squidward something when you see him faint and hit the ground.");
              
              try {
                Thread.sleep(6000);
              } 
              catch(InterruptedException e) {
              }
              
              System.out.println("\nYour vision begins to get blurry. You lose your voice. You can't stand anymore.");
              
              try {
                Thread.sleep(4000);
              } 
              catch(InterruptedException e) {
              }
              
              System.out.println("\ns");
              try {
                Thread.sleep(300);
              } 
              catch(InterruptedException e) {
              }
              System.out.println("q");
              try {
                Thread.sleep(300);
              } 
              catch(InterruptedException e) {
              }
              System.out.println("u");
              try {
                Thread.sleep(300);
              } 
              catch(InterruptedException e) {
              }System.out.println("i");
              try {
                Thread.sleep(300);
              } 
              catch(InterruptedException e) {
              }
              System.out.println("d");
              try {
                Thread.sleep(300);
              } 
              catch(InterruptedException e) {
              }
              System.out.println("w");
              try {
                Thread.sleep(300);
              } 
              catch(InterruptedException e) {
              }
              System.out.println("a");
              try {
                Thread.sleep(300);
              } 
              catch(InterruptedException e) {
              }
              System.out.println("r");
              try {
                Thread.sleep(300);
              } 
              catch(InterruptedException e) {
              }
              System.out.println("d");
              try {
                Thread.sleep(300);
              } 
              catch(InterruptedException e) {
              }
              System.out.println("?");
              try {
                Thread.sleep(2000);
              } 
              catch(InterruptedException e) {
              }
              
              System.out.println("You fall to the ground and pass out...");
              
              try {
                Thread.sleep(1000);
              } 
              catch(InterruptedException e) {
              }
              
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            } 
            
              // Error input.
            else {
              System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
              System.out.println("a) Patrick");
              System.out.println("b) Squidward");
            }
          }
            
            // choices (B,B,B)
          else if(responseThree.equals("b")) {
            System.out.println("You head to the Chum Bucket. What do you do now?");
            System.out.println("a) Beat up Plankton");
            System.out.println("b) Beat up Plankton");
            
            responseFour = scan.next();
            
              // choices (B,B,B,A)
            if (responseFour.equals("a")) {
              System.out.println("\nYou and Squidward head to the back of the restaurant and jump Plankton. You beat his tiny ass to the ground. His shit gets destroyed as he gets curb stomped. His body composition goes flat as y'all murk him. You both spit on him and walk out of the place.");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // choices (B,B,B,B)
            else if (responseFour.equals("b")) {
              System.out.println("\nYou and Squidward head to the back of the restaurant and jump Plankton. You beat his tiny ass to the ground. His shit gets destroyed as he gets curb stomped. His body composition goes flat as y'all murk him. You both spit on him and walk out of the place.");
              System.out.println("\n------------------------------------------------------------------\n\nThank you for playing!\nRestarting code...");
              break;
            }
            
              // Error input.
            else {
              System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
              System.out.println("a) Patrick");
              System.out.println("b) Squidward");
            }
          }
          
            // Error input.
          else {
            System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
            System.out.println("a) Patrick");
            System.out.println("b) Squidward");
          }
        }
          
          // Error input.
        else {
          System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
          System.out.println("a) Patrick");
          System.out.println("b) Squidward");
        }
      }
      
        // Error input.
      else {
        System.out.println("Unknown answer. Restarting code.\nPlease select an option listed.");
        System.out.println("a) Patrick");
        System.out.println("b) Squidward");
      }
      
    }
    while (!responseOne.equals("a") || !responseOne.equals("b") || !responseOne.equals("c"));
    
    
    
    
  }
  
}