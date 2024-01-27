import java.util.Arrays;
import java.util.Scanner;
public class Mbti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String[] optionA = {
                "A. expand energy, enjoy groups",
                "A. more outgoing, think out loud",
                "A. seek many task, public activities, interact with others",
                "A. external, communicative, express yourself",
                "A. active, initiate",
                "A. logical, thinking, questioning",
                "A. candid, straight forward, frank",
                "A. firm, tend to criticise, hold the line",
                "A. tough minded, just",
                "A. matter of fact, issue_oriented",
                "A. organised, orderly",
                "A. plan, schedule",
                "A. regulated, structured",
                "A. preparation, plan ahead",
                "A. control, govern",
                "A. interpret literally",
                "A. practical, realistic, experiential",
                "A. standard, usual, conventional",
                "A. focus on here and now",
                "A. facts, things, what is",
        };

        String[] optionB = {
                "B. conserve energy",
                "B. more reserved, think to yourself",
                "B. seek private, solitary activities with quiet to concentrate",
                "B. internal reticent, keep to yourself",
                "B. reflective, deliberate",
                "B. empathetic, feeling, accommodating",
                "B. tactful, kind, encouraging",
                "B. gentle, tend to appreciate, conciliate",
                "B. tender-hearted, merciful",
                "B. sensitive, people-oriented, compassionate",
                "B. flexible, adaptable",
                "B. unplanned, spontaneous",
                "B. easygoing, live and let live",
                "B. go with the flow, adapt as you go",
                "B. latitude, freedom",
                "B. look for meaning and possibilities",
                "B. imaginative, innovative, theoretical",
                "B. different, novel, unique",
                "B. look to the future, global perspective, big picture",
                "B. ideas, dreams, what could be, philosophical"
        };

        String answer = "";
        String[] answerA = {"E", "S", "T", "J"};
        String[] answerB = {"I", "N", "F", "P"};
        String[][] answerBook = new String[4][5];
        for (int E = 0; E < 5; E++) {
            System.out.println(optionA[E] + "\t\t" + optionB[E]);
            answer = input.next();

            if (answer.equalsIgnoreCase("a")) {
                answerBook[0][E] = answer + optionA[E];
            } else if (answer.equalsIgnoreCase("b")) {

                answerBook[0][E] = answer + optionB[E];

            }
            while (!answer.equals("a") && !answer.equals("b")) {
                System.out.println(optionA[E] + "\t\t" + optionB[E]);
                answer = input.next();

                if (answer.equalsIgnoreCase("a")) {
                    answerBook[0][E] = answer + optionA[E];
                } else if (answer.equalsIgnoreCase("b")) {
                    answerBook[0][E] = answer + optionB[E];

                }
            }
        }
        int count = 0;
        for (int T = 5; T < 10; T++) {
            System.out.println(optionA[T] + "\t\t" + optionB[T]);
            answer = input.next();

            if (answer.equalsIgnoreCase("a")) {
                answerBook[1][count] = answer + optionA[T];
            } else if (answer.equalsIgnoreCase("b")) {
                answerBook[1][count] = answer + optionB[T];
            }
            count++;
            while (!answer.equals("a") && !answer.equals("b")) {
                System.out.println(optionA[T] + "\t\t" + optionB[T]);
                answer = input.next();

                if (answer.equalsIgnoreCase("a")) {
                    answerBook[1][count] = answer + optionA[T];
                } else if (answer.equalsIgnoreCase("b")) {
                    answerBook[1][count] = answer + optionB[T];

                }
            }

        }
        count = 0;
        for (int J = 10; J < 15; J++) {
            System.out.println(optionA[J] + "\t\t" + optionB[J]);
            answer = input.next();
            if (answer.equalsIgnoreCase("a")) {
                answerBook[2][count] = answer + optionA[J];
            } else if (answer.equalsIgnoreCase("b")) {
                answerBook[2][count] = answer + optionB[J];
            }
            count++;
            while (!answer.equals("a") && !answer.equals("b")) {
                System.out.println(optionA[J] + "\t\t" + optionB[J]);
                answer = input.next();
                if (answer.equalsIgnoreCase("a")) {
                    answerBook[2][count] = answer + optionA[J];
                } else if (answer.equalsIgnoreCase("b")) {
                    answerBook[2][count] = answer + optionB[J];
                }
            }
        }
        count = 0;
        for (int S = 15; S < 20; S++) {
            System.out.println(optionA[S] + "\t\t" + optionB[S]);
            answer = input.next();
            if (answer.equalsIgnoreCase("a")) {
                answerBook[3][count] = answer + optionA[S];
            } else if (answer.equalsIgnoreCase("b")) {
                answerBook[3][count] = answer + optionB[S];
            }
            count++;
            while (!answer.equals("a") && !answer.equals("b")) {
                System.out.println(optionA[S] + "\t\t" + optionB[S]);
                answer = input.next();
                if (answer.equalsIgnoreCase("a")) {
                    answerBook[3][count] = answer + optionA[S];
                } else if (answer.equalsIgnoreCase("b")) {
                    answerBook[3][count] = answer + optionB[S];
                }
            }
        }
        System.out.println(Arrays.deepToString(answerBook));
        int numberE = 0;
        int numberI = 0;
        int numberS = 0;
        int numberIn = 0;
        String response;
        String point = "";
        for (int counts = 0; counts < answerBook.length; counts++) {
            for (int counter = 0; counter < answerBook[counts].length; counter++) {
                response = answerBook[counts][counter];
                System.out.println(response);
                if (response.startsWith("a")) {
                    numberE++;
                } else {
                    numberI++;
                }
            }

            if (numberI > numberE) {
                point += answerA[counts];
            } else {
                point += answerB[counts];
            }
            System.out.println("Number of A is " + numberE);
            System.out.println("number of B is " + numberI);
            System.out.println();
            System.out.println(point);
            numberE = 0;
            numberI = 0;
            System.out.println();
        }
        if (point.equals("INTJ")) {
            System.out.println("""
                            An Architect (INTJ) is a person with the Introverted, Intuitive, Thinking, and Judging personality traits.
                            These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do.
                            Their inner world is often a private, complex one.
                            Thought constitutes the greatness of man. Man is a reed, the feeblest thing in nature, but he is a thinking reed.
                            BLAISE PASCAL
                            It can be lonely at the top. As one of the rarest personality types – and one of the most capable – Architects (INTJs) know this all too well.
                            Rational and quick-witted, Architects pride themselves on their ability to think for themselves, not to mention their uncanny knack for seeing
                            right through phoniness and hypocrisy. But because their minds are never at rest, Architects may struggle to find people who can keep up with 
                            their nonstop analysis of everything around them.
                            Informed – Few personality types are as devoted as Architects to developing rational, correct, and evidence-based opinions. Rather than hunches
                            or half-baked assumptions, they base their conclusions on research and analysis. This gives them the conviction that they need to stand up for 
                            their ideas, even in the face of disagreement.
                            Independent – For these personalities, conformity is more or less synonymous with mediocrity. Creative and self-motivated, Architects strive to
                            do things their own way. They can imagine few things more frustrating than allowing arbitrary rules or conventions to stand in the way of their success.
                            Determined – This personality type is known for being ambitious and goal-oriented. Architects won’t rest until they’ve achieved their own 
                            definition of success – which usually entails mastering the subjects and pursuits that matter to them.
                            Architects (INTJs) approach romance the way they do most challenges: strategically, with clear-cut goals and a plan for achieving them. 
                            In a purely rational world, this approach would be foolproof. Alas, love is rarely rational, and Architects are at risk of overlooking or 
                            misinterpreting the unpredictability of human nature and affection.
                            
                            For people with this personality type, finding a compatible partner can be a particular challenge. Rarely satisfied with things as they are, 
                            Architects can’t help but imagine how the world could be better than it already is – and they often bring this same mindset to the realm of love. 
                            Unfortunately, if Architects apply a relentlessly critical eye to every potential partner, they may find themselves constantly dissatisfied.
                    """);
        }
        if (point.equals("INTP")) {
            System.out.println("""
                    A Logician (INTP) is someone with the Introverted, Intuitive, Thinking, and Prospecting personality traits. These flexible thinkers enjoy taking an 
                    unconventional approach to many aspects of life. They often seek out unlikely paths, mixing willingness to experiment with personal creativity.
                                    
                    The important thing is not to stop questioning. Curiosity has its own reason for existence.
                                    
                    ALBERT EINSTEIN
                    Logicians pride themselves on their unique perspectives and vigorous intellect. They can’t help but puzzle over the mysteries of the universe – which 
                    may explain why some of the most influential philosophers and scientists of all time have been Logicians. This personality type is fairly rare, but with 
                    their creativity and inventiveness, Logicians aren’t afraid to stand out from the crowd.
                    Analytical – Logicians analyze everything that they come across, from research data to the behavior of the people around them. This gives them a knack for 
                    spotting unexpected patterns and connections that other personality types might overlook.
                    Original – Thanks to their unrelenting imagination, Logicians can come up with creative, counterintuitive ideas that wouldn’t occur to most people. Not all 
                    of these ideas are feasible, of course, but Logicians’ willingness to think outside the box can produce remarkable innovations.
                    Open-Minded – Logicians are driven by curiosity and an intense desire to learn everything that they can. People with this personality type tend to be 
                    receptive to new ideas and ways of doing things – as long as those ideas are supported by sound reasoning.
                    Curious – These personalities are always casting about for new pursuits, hobbies, and areas of research. One week, they might be obsessed with geophysics, 
                    and the next, they might lose themselves in videos about guitar building. When inspiration strikes, Logicians go all in on their newfound interest, learning 
                    everything that they can.
                    Objective – Logicians care about the truth. Rather than taking comfort in ideology or received ideas, they want to understand what’s really going on beneath 
                    the surface of things. As a result, they can be relied upon to combat bias and misinformation, even when it isn’t easy to do so – and they expect other 
                    people to be honest with them in return.
                    Logician (INTP) Weaknesses
                    Logician (INTP) weaknesses
                    Disconnected – Logicians can get lost in their own train of thought, even when they’re with other people. When these personalities finally resurface with 
                    something to say, they may find that the conversation has moved on without them. This can cause them to feel disconnected from other people, especially in 
                    large social gatherings.
                    """);
        }

        if (point.equals("ENTJ")) {
            System.out.println("""
                    A Commander (ENTJ) is someone with the Extraverted, Intuitive, Thinking, and Judging personality traits. They are decisive people who love momentum and 
                    accomplishment. They gather information to construct their creative visions but rarely hesitate for long before acting on them.
                                    
                    Your time is limited, so don’t waste it living someone else’s life.
                                    
                    STEVE JOBS
                    Commanders are natural-born leaders. People with this personality type embody the gifts of charisma and confidence, and project authority in a way that 
                    draws crowds together behind a common goal. However, Commanders are also characterized by an often ruthless level of rationality, using their drive, 
                    determination and sharp minds to achieve whatever end they’ve set for themselves. Perhaps it is best that they make up only three percent of the population, 
                    lest they overwhelm the more timid and sensitive personality types that make up much of the rest of the world – but we have Commanders to thank for many of 
                    the businesses and institutions we take for granted every day.
                                    
                    Striving for Greatness
                    If there’s anything Commanders love, it’s a good challenge, big or small, and they firmly believe that given enough time and resources, they can achieve any goal. 
                    This quality makes people with the Commander personality type brilliant entrepreneurs, and their ability to think strategically and hold a long-term focus while 
                    executing each step of their plans with determination and precision makes them powerful business leaders. This determination is often a self-fulfilling prophecy, 
                    as Commanders push their goals through with sheer willpower where others might give up and move on, and their Extraverted (E) nature means they are likely to push 
                    everyone else right along with them, achieving spectacular results in the process.
                    Striving for Greatness
                    If there’s anything Commanders love, it’s a good challenge, big or small, and they firmly believe that given enough time and resources, they can achieve any goal. 
                    This quality makes people with the Commander personality type brilliant entrepreneurs, and their ability to think strategically and hold a long-term focus while 
                    executing each step of their plans with determination and precision makes them powerful business leaders. This determination is often a self-fulfilling prophecy, 
                    as Commanders push their goals through with sheer willpower where others might give up and move on, and their Extraverted (E) nature means they are likely to push 
                    everyone else right along with them, achieving spectacular results in the process.
                    Efficient – Commanders see inefficiency not just as a problem in its own right, but as something that pulls time and energy away from all their future goals, an 
                    elaborate sabotage consisting of irrationality and laziness. People with the Commander personality type will root out such behavior wherever they go.
                    Energetic – Rather than finding this process taxing Commanders are energized by it, genuinely enjoying leading their teams forward as they implement their plans 
                    and goals.
                    Self-Confident – Commanders couldn’t do this if they were plagued by self-doubt – they trust their abilities, make known their opinions, and believe in their 
                    capacities as leaders.
                    Strong-Willed – Nor do they give up when the going gets tough – Commander personalities strive to achieve their goals, but really nothing is quite as satisfying to 
                    them as 
                    rising to the challenge of each obstacle in their run to the finish line.
                    Strategic Thinkers – Commanders exemplify the difference between moment-to-moment crisis management and navigating the challenges and steps of a bigger plan, and are 
                    known for examining every angle of a problem and not just resolving momentary issues, but moving the whole project forward with their solutions.
                    Charismatic and Inspiring – These qualities combine to create individuals who are able to inspire and invigorate others, who people actually want to be their leaders, 
                    and this in turn helps Commanders to accomplish their often ambitious goals that could never be finished alone.
                                    
                    """);
        }
        if (point.equals("ENTP")) {
            System.out.println("""
                    A Debater (ENTP) is a person with the Extraverted, Intuitive, Thinking, and Prospecting personality traits. They tend to be bold and creative, deconstructing and 
                    rebuilding ideas with great mental agility. They pursue their goals vigorously despite any resistance they might encounter.
                                    
                    Quick-witted and audacious, Debaters aren’t afraid to disagree with the status quo. In fact, they’re not afraid to disagree with pretty much anything or anyone. 
                    Few things light up people with this personality type more than a bit of verbal sparring – and if the conversation veers into controversial terrain, so much the better.
                                    
                    It would be a mistake, though, to think of Debaters as disagreeable or mean-spirited. Instead, people with this personality type are knowledgeable and curious, with 
                    a playful sense of humor, and they can be incredibly entertaining. They simply have an offbeat, contrarian idea of fun – one that involves a healthy dose of spirited 
                    debate.
                    Knowledgeable – Debaters rarely pass up a good opportunity to learn something new, especially abstract concepts. This information isn’t usually absorbed for any 
                    planned purpose as with dedicated studying, people with the Debater personality type just find it fascinating.
                    Quick Thinkers – Debaters have tremendously flexible minds, and are able to shift from idea to idea without effort, drawing on their accumulated knowledge to 
                    prove their points, or their opponents’, as they see fit.
                    Original – Having little attachment to tradition, Debater personalities are able to discard existing systems and methods and pull together disparate ideas from 
                    their extensive knowledge base, with a little raw creativity to hold them together, to formulate bold new ideas. If presented with chronic, systemic problems 
                    and given rein to solve them, Debaters respond with unabashed glee.
                    Excellent Brainstormers – Nothing is quite as enjoyable to Debaters as analyzing problems from every angle to find the best solutions. Combining their knowledge 
                    and originality to splay out every aspect of the subject at hand, rejecting without remorse options that don’t work and presenting ever more possibilities, 
                    Debaters are irreplaceable in brainstorming sessions.
                    If there’s one thing Debaters are good at, it’s coming up with a never-ending stream of innovations and ideas to keep things moving forward, and this is evident in 
                    their romantic relationships as well. For people with the Debater personality type growth is key, and even before they’ve found a dating partner, they imagine all 
                    the ways that they can experience new things together, to grow in tandem. This can be an overwhelming process if their partner doesn’t match up, but when Debaters 
                    find someone who shares their love of intellectual exploration, watch out.
                    Loyalty, support, emotional feedback – these are not what Debaters look for in their friendships. The last thing people with the Debater personality type want to 
                    hear is “you’re right”, not unless they have absolutely earned the distinction in a heated round of intellectual debate. If they’re wrong, Debaters want to be 
                    told so, and they want every detail of the faults in their logic to be laid bare, partly in their quest for oftentimes arbitrary truth, and partly just so they 
                    have to work to defend that logic with counterpoint and parry.
                    One might think that the blustery and flighty nature of Debaters would make parenting a particular challenge for them, and in many ways, they’d be right. However, 
                    one thing people with the Debater personality type love more than just about anything is a good challenge, a problem to fix, even if it comes to addressing their 
                    own weaknesses. Debaters take their roles as parents seriously, and they are bound to be affected profoundly by this development in their lives – if anyone is able
                     to take an outside influence, like their children, and use that influence to address their own faults, it is Debaters.
                    In the world of careers, Debaters have the benefit of being naturally engaged and interested in being productive and helpful. But rather than the sort of 
                    people-oriented helpfulness that Diplomat personality types bring to the table, Debater personalities are focused on developing solutions to interesting and diverse 
                    technical and intellectual problems. Debaters are a versatile personality type, and while it may take time for them to get to a point where they can fully utilize 
                    their skillset and qualities, they are likely to find that those qualities translate well into pretty much any career that so much as piques their interest.
                                    
                    """);
        }
        if (point.equals("ENTP")) {
            System.out.println("""
                    An Advocate (INFJ) is someone with the Introverted, Intuitive, Feeling, and Judging personality traits. They tend to approach life with deep thoughtfulness and 
                    imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.
                                    
                    “Treat people as if they were what they ought to be and you help them to become what they are capable of being.”
                                    
                    JOHANN WOLFGANG VON GOETHE
                    Advocates (INFJs) may be the rarest personality type of all, but they certainly leave their mark on the world. Idealistic and principled, they aren’t content to 
                    coast through life – they want to stand up and make a difference. For Advocate personalities, success doesn’t come from money or status but from seeking fulfillment, 
                    helping others, and being a force for good in the world.
                                    
                    While they have lofty goals and ambitions, Advocates shouldn’t be mistaken for idle dreamers. People with this personality type care about integrity, and they’re 
                    rarely satisfied until they’ve done what they know to be right. Conscientious to the core, they move through life with a clear sense of their values, and they aim 
                    never to lose sight of what truly matters – not according to other people or society at large, but according to their own wisdom and intuition.
                                    
                    Creative – Advocates aren’t exactly like everyone else – and that’s a wonderful thing. People with this personality type embrace their creative side, always on the 
                    lookout for opportunities to express themselves and think outside the box.
                    Insightful – These personalities know all too well that appearances can be misleading. Advocates strive to move beyond superficiality and seek out the deeper truths 
                    in life. This can give them an almost uncanny ability to understand people’s true motivations, feelings, and needs.
                    Principled – Advocates tend to have strong beliefs and values, particularly when it comes to matters of ethics. When Advocates talk about topics close to their heart, 
                    their conviction and heartfelt idealism can inspire and persuade even the sternest of skeptics.
                    Passionate – Advocates crave a sense of purpose in life. Rather than living on autopilot or sticking to the status quo, they want to chase after their ideals. 
                    This isn’t a personality type that shies away from big dreams – in fact, Advocates are energized and impassioned by the beauty of their visions for the future.
                    Altruistic – People with this personality type aren’t happy to succeed at another person’s expense. Advocates want to use their strengths for the greater good, 
                    and they rarely lose sight of how their words and actions might affect others. In their heart of hearts, they want to make the world a better place, starting 
                    with the people around them.
                    Advocates (INFJs) look for depth and meaning in their relationships – and their romantic relationships are no different. This is a personality type known for 
                    having a vibrant, vivid imagination, but few Advocates can imagine themselves settling for a match founded on anything less than true love.
                                    
                    It can take time for Advocates to find a compatible partner. Some people might think that Advocates are too choosy, and it’s true that these personalities can 
                    be prone to unrealistic expectations. With their perfectionistic, idealistic nature, Advocates might be tempted to hold out for a “perfect” partner or relationship 
                    that ultimately doesn’t exist. The good news? Advocates’ idealism – if balanced with just enough realism – can actually enhance their love life.
                    Advocates (INFJs) rarely settle for shallow, superficial friendships. When it comes to social fulfillment, they aren’t satisfied by casual interactions with colleagues 
                    or classmates. Advocate personalities crave authentic, meaningful friendships – friendships that allow them to share their dreams, bare their souls, and feel understood 
                    and accepted for who they are. And if that means having just one or two confidants rather than a wide circle of acquaintances, so be it.
                                    
                    While Advocates may seem quiet or reserved to the world at large, they absolutely light up around their close friends. Few things bring them more pleasure or 
                    delight 
                    than talking through their passions, interests, and beliefs with a kindred spirit. People with this personality type enjoy the pleasure of their own company, 
                    but Advocates still find it liberating to let their guard down and be completely and utterly themselves with a friend they know they can trust.
                    “It’s better to fail while striving for something wonderful, challenging, adventurous, and uncertain than to say, ‘I don’t want to try because I may not 
                    succeed completely.’”
                                    
                    JIMMY CARTER
                    Advocates (INFJs) long to find a career that aligns with their values and their dreams – a career that allows them to fulfill their unique mission in this world. 
                    For these personalities, a job isn’t satisfying if it doesn’t offer a deeper sense of purpose – no matter how good the salary is. The good news is that people with 
                    this personality type can use their creativity and determination to find work that suits their needs in just about any field.
                                    
                    In fact, Advocates have trouble deciding which job is best for them because they’re able to imagine so many possibilities. They may see half a dozen wildly different 
                    paths forward, each with its own set of rewards. This can be exciting but also stress-inducing, because picking just one means letting go of so many others. 
                    Advocates may even feel a sense of loss when so many doors close because one was selected.                
                                    
                                    
                    """);
        }
        if (point.equals("INFP")) {
            System.out.println("""
                    WHO IS A MEDIATOR (INFP)?
                                    
                    A Mediator (INFP) is someone who possesses the Introverted, Intuitive, Feeling, and Prospecting personality traits. These rare personality types tend to be quiet, 
                    open-minded, and imaginative, and they apply a caring and creative approach to everything they do.
                                    
                    Although they may seem quiet or unassuming, Mediators (INFPs) have vibrant, passionate inner lives. Creative and imaginative, they happily lose themselves in 
                    daydreams, inventing all sorts of stories and conversations in their minds. These personalities are known for their sensitivity – Mediators can have profound 
                    emotional responses to music, art, nature, and the people around them.
                                    
                    Idealistic and empathetic, Mediators long for deep, soulful relationships, and they feel called to help others. But because this personality type makes up such 
                    a small portion of the population, Mediators may sometimes feel lonely or invisible, adrift in a world that doesn’t seem to appreciate the traits that make them unique.
                                    
                    All that is gold does not glitter; not all those who wander are lost; the old that is strong does not wither; deep roots are not reached by the frost.
                                    
                    J. R. R. TOLKIEN
                    Empathetic – Mediators don’t just care about other people in an abstract sense. These personalities can actually feel another person’s emotions, from joy and 
                    elation to sorrow and regret. Because of this sensitivity, Mediators tend to be thoughtful and kindhearted, and they hate the idea of hurting anyone, even 
                    unintentionally.
                    Generous – Mediators rarely enjoy succeeding at other people’s expense. They feel called to share the good things in their lives, give credit where it’s due, 
                    and uplift the people around them. These personalities want to contribute to a world where every voice is heard and no one’s needs go unmet.
                    Open-Minded – Tolerant and accepting, Mediators try not to judge anyone else’s beliefs, lifestyles, or decisions. This is a personality type that prefers 
                    compassion to fault-finding, and many Mediators feel empathy even for those who have done wrong. Because they’re so accepting, Mediators often become confidants 
                    for their friends and loved ones – and occasionally for total strangers.
                    Creative – Mediators love to see things from unconventional perspectives. Few things give them more pleasure than allowing their minds to wander through all sorts 
                    of ideas and possibilities and daydreams. It’s no wonder, then, that many Mediators are drawn to creative pursuits – or that this personality type is well represented 
                    among writers and artists.
                    Passionate – When an idea or movement captures their imagination, Mediators want to give their whole heart to it. People with this personality type may not always 
                    be outspoken, but that doesn’t diminish their strong feelings for a cause that speaks to their beliefs and convictions.
                    Idealistic – Mediators strive to follow their conscience, even when doing the right thing isn’t easy or convenient. They rarely lose sight of their desire to live 
                    a meaningful, purpose-filled life – one that helps others and leaves the world a better place.
                    Mediators are adaptable, but they may find it demotivating to work in high-stress, bureaucratic, or hectic environments. They can also become frustrated by workplaces 
                    that are highly critical or competitive. Workplaces that reward independence tend to be a good fit for Mediators, although they may appreciate some structure and 
                    oversight to help them avoid procrastinating and getting lost in thought.
                                    
                    That said, Mediators don’t need ideal conditions to thrive professionally. These personalities want to live in tune with their values, in their careers as much as 
                    in any other aspect of their lives. They can put up with – and overcome – any number of challenges as they pursue a sense of mission in their work.
                                    
                    """);
        }
        if (point.equals("ENFJ")) {
            System.out.println("""
                    A Protagonist (ENFJ) is a person with the Extraverted, Intuitive, Feeling, and Judging personality traits. These warm, forthright types love helping others, and they 
                    tend to have strong ideas and values. They back their perspective with the creative energy to achieve their goals.
                                    
                    Protagonists (ENFJs) feel called to serve a greater purpose in life. Thoughtful and idealistic, these personality types strive to have a positive impact on other 
                    people 
                    and the world around them. They rarely shy away from an opportunity to do the right thing, even when doing so is far from easy.
                    Receptive – Protagonists have strong opinions, but they’re far from closed-minded. They recognize the importance of allowing others to express themselves fully. 
                    Even when Protagonists don’t agree with someone, they recognize that person’s right to voice their truth.
                    Reliable – Few things bother Protagonists more than the prospect of letting down a person or cause that they believe in. People with this personality type can be 
                    counted on to see their promises and responsibilities through – even when it’s difficult to do so.
                    Passionate – Protagonists are far from being boring do-gooders. These types brim with interests, and they take great pleasure in pursuing their hobbies – whether 
                    that’s hiking, cooking, dancing, growing houseplants, or something else entirely. As a result, they rarely find themselves at a loss for something interesting to do.
                    Altruistic – These personalities are known for harboring a deep desire to be a force for positive change. Protagonists genuinely believe that if they bring people 
                    together, they can do a world of good.
                    Charismatic – Determined and inspiring, Protagonists often find their way into leadership roles. Whether they’re captain of their softball team or a leader on the 
                    world stage, they rarely lose sight of their main goal: to be of service to others.
                    When it comes to choosing a career, Protagonists (ENFJs) find fulfillment in doing what they love most – helping other people. And with their creativity and drive, 
                    they can find ways to serve and uplift others in nearly any work environment, whether they’re behind a gleaming table in a corporate boardroom or behind the counter 
                    at a beloved local coffee shop.
                                    
                                    
                                   
                    """);
        }
        if (point.equals("ENFP")) {
            System.out.println("""
                    A Campaigner (ENFP) is someone with the Extraverted, Intuitive, Feeling, and Prospecting personality traits. These people tend to embrace big ideas and actions that 
                    reflect their sense of hope and goodwill toward others. Their vibrant energy can flow in many directions.
                                    
                    It doesn’t interest me what you do for a living. I want to know what you ache for – and if you dare to dream of meeting your heart’s longing.
                                    
                    ORIAH MOUNTAIN DREAMER
                    Campaigners (ENFPs) are true free spirits – outgoing, openhearted, and open-minded. With their lively, upbeat approach to life, they stand out in any crowd. But even 
                    though they can be the life of the party, Campaigners don’t just care about having a good time. These personality types run deep – as does their longing for meaningful, 
                    emotional connections with other people.
                    Curious – Campaigners can find beauty and fascination in nearly anything. Imaginative and open-minded, these personalities aren’t afraid to venture beyond their 
                    comfort zones in search of new ideas, experiences, and adventures.
                    Perceptive – To people with this personality type, no one is unimportant – which might explain how they can pick up on even the subtlest shifts in another person’s 
                    mood or expression. Because they’re so sensitive to other people’s feelings and needs, Campaigners can make full use of their caring, considerate nature.
                    Enthusiastic – When something captures their imagination and inspires them, Campaigners want to share it with anyone who will listen. And they’re just as eager to 
                    hear other people’s ideas and opinions – even if those thoughts are wildly different from their own.
                    Excellent Communicators – Campaigners brim with things to say, but they can be caring listeners as well. This gives them a nearly unmatched ability to have positive 
                    and enjoyable conversations with all sorts of people – even people who aren’t particularly sociable or agreeable.
                    Festive – Campaigners may live for deep, meaningful conversations, but they can also be spontaneous and lighthearted. These personalities know how to find fun and 
                    joy in the present moment – and few things give them more pleasure than sharing their joy with others.
                    Good-Natured – All of these strengths come together to form a person who is warmhearted and approachable, with an altruistic spirit and a friendly disposition. 
                    Campaigners strive to get along with pretty much everyone, and their circles of acquaintances and friends often stretch far and wide.
                    “Maybe I could…fly helicopters and be an oceanographer who writes songs and cooks?” Campaigners (ENFPs) are known for having a wealth of ideas, interests, and 
                    hobbies – to the extent that they may struggle to fit everything that they care about into their lives.
                    """);
        }
        if (point.equals("ISTJ")) {
            System.out.println("""
                    A Logistician (ISTJ) is someone with the Introverted, Observant, Thinking, and Judging personality traits. These people tend to be reserved yet willful, with a 
                    rational outlook on life. They compose their actions carefully and carry them out with methodical purpose.
                                    
                    I’d be more frightened by not using whatever abilities I’d been given. I’d be more frightened by procrastination and laziness.
                                    
                    DENZEL WASHINGTON
                    Logisticians pride themselves on their integrity. People with this personality type mean what they say, and when they commit to doing something, they make sure to 
                    follow through.
                                    
                    This personality type makes up a good portion of the overall population, and while Logisticians may not be particularly flashy or attention-seeking, they do more 
                    than their share to keep society on a sturdy, stable foundation. In their families and their communities, Logisticians often earn respect for their reliability, 
                    their practicality, and their ability to stay grounded and logical, even in the most stressful situations.
                    Honest and Direct – Integrity is the heart of the Logistician personality type. Emotional manipulation, mind games and reassuring lies all run counter to 
                    Logisticians’ preference for managing the reality of the situations they encounter with plain and simple honesty.
                    Strong-willed and Dutiful – Logisticians embody that integrity in their actions too, working hard and staying focused on their goals. Patient and determined, 
                    people with the Logistician personality type meet their obligations, period.
                    Very Responsible – Logisticians’ word is a promise, and a promise means everything. Logisticians would rather run themselves into the ground with extra days 
                    and lost sleep than fail to deliver the results they said they would. Loyalty is a strong sentiment for Logistician personalities, and they fulfill their 
                    duties to the people and organizations they’ve committed themselves to.
                    Calm and Practical – None of their promises would mean much if Logisticians lost their tempers and broke down at every sign of hardship – they keep their feet 
                    on the ground and make clear, rational decisions. Peoples’ preferences are a factor to consider in this process, and Logisticians work to make the best use of 
                    individual qualities, but these decisions are made with effectiveness in mind more so than empathy. The same applies to criticisms, for others and themselves.
                    While many personality types may be comfortable with flexible work as consultants and sole proprietors, Logisticians are much more focused on building long-term, 
                    stable careers. That’s not to say that Logisticians can’t do that sort of work – many find themselves thinking about what’s on the other side of those cubical 
                    walls – but what they crave is dependability, and that is reflected in their choice of work perhaps more so than in any other part of their lives.               
                                
                    """);
        }
        if (point.equals("ISFJ")) {
            System.out.println("""
                    A Defender (ISFJ) is someone with the Introverted, Observant, Feeling, and Judging personality traits. These people tend to be warm and unassuming in their own 
                    steady way. They’re efficient and responsible, giving careful attention to practical details in their daily lives.
                                    
                    Love only grows by sharing. You can only have more for yourself by giving it away to others.
                                    
                    BRIAN TRACY
                    In their unassuming, understated way, Defenders help make the world go round. Hardworking and devoted, people with this personality type feel a deep sense of 
                    responsibility to those around them. Defenders can be counted on to meet deadlines, remember birthdays and special occasions, uphold traditions, and shower 
                    their loved ones with gestures of care and support. But they rarely demand recognition for all that they do, preferring instead to operate behind the scenes.
                                    
                    This is a capable, can-do personality type, with a wealth of versatile gifts. Though sensitive and caring, Defenders also have excellent analytical abilities 
                    and an eye for detail. And despite their reserve, they tend to have well-developed people skills and robust social relationships. Defenders are truly more 
                    than the sum of their parts, and their varied strengths shine in even the most ordinary aspects of their daily lives.
                    Supportive – Defenders truly enjoy helping others, and they happily share their knowledge, attention, and expertise with anyone who needs it. People with 
                    this personality type strive for win-win situations, choosing teamwork over competition whenever possible.
                    Reliable – Rather than working in sporadic, excited bursts that leave things half finished, Defenders are meticulous and careful. They take a steady approach, 
                    ensuring that things are done to the highest standard – and often going well beyond what is required.
                    Observant – Defender personalities have a talent for noticing things, particularly about other people. They pay attention to the smallest details of what 
                    someone says and does, giving them unexpected insights into other people’s lives and emotions.
                    Enthusiastic – When the goal is right, Defenders apply all of their gifts to something that they believe will make a real, positive difference in people’s 
                    lives – whether that’s fighting poverty with a global initiative or simply making a customer’s day.
                    Hardworking – Defenders don’t just get their work done – they take pride in it. People with this personality type often form an emotional attachment to the 
                    projects and organizations that they’ve dedicated themselves to, and they won’t rest until they’ve done their share – or more than their share – to be of help.
                    Defenders are often the backbone of their workplace: reliable, hardworking, and always ready to lend a hand. People with this personality type take pride in 
                    getting the job done and getting it done well, rarely cutting corners or balking at a time-consuming task. This unshakable work ethic, combined with a 
                    genuine desire to be of service to others, makes Defenders invaluable in a range of careers.
                                    
                                   
                    """);
        }
        if (point.equals("ESTJ")) {
            System.out.println("""
                    An Executive (ESTJ) is someone with the Extraverted, Observant, Thinking, and Judging personality traits. They possess great fortitude, emphatically following 
                    their own sensible judgment. They often serve as a stabilizing force among others, able to offer solid direction amid adversity.
                                    
                    Good order is the foundation of all things.
                                    
                    EDMUND BURKE
                    Executives are representatives of tradition and order, utilizing their understanding of what is right, wrong and socially acceptable to bring families and communities
                     together. Embracing the values of honesty, dedication and dignity, people with the Executive personality type are valued for their clear advice and guidance, and 
                     they happily lead the way on difficult paths. Taking pride in bringing people together, Executives often take on roles as community organizers, working hard to 
                     bring everyone together in celebration of cherished local events, or in defense of the traditional values that hold families and communities together.
                    Executives are fairly unique in that their relationships don’t really change as they progress from the dating phase into more steady, long-term relationships and 
                    further into marriage. Because they value honesty and straightforwardness so highly, people with the Executive personality type are likely to be clear about who 
                    they are, what they’re like and what their goals are from the start, and to stick to those statements long-term. So long as their partner is able to take them at 
                    their word and follow suit, they are bound to be extremely stable relationships.                
                    Executives’ career paths are often as clear and straightforward as they are themselves. Though there are many directions they can choose to go, people with the 
                    Executive personality type almost always end up in situations where they have the opportunity to exercise their affinity for organization, structure, and 
                    follow-through. Providing further focus, Executives share a profound respect for tradition, stability and security, qualities which lend themselves well to 
                    progressing along clear paths to increased responsibility and dependability.                
                               
                    """);
        }
        if (point.equals("ESFJ")) {
            System.out.println("""
                    A Consul (ESFJ) is a person with the Extraverted, Observant, Feeling, and Judging personality traits. They are attentive and people-focused, and they enjoy taking 
                    part in their social community. Their achievements are guided by decisive values, and they willingly offer guidance to others.
                                    
                    Encourage, lift, and strengthen one another. For the positive energy spread to one will be felt by us all.
                                    
                    DEBORAH DAY
                    For Consuls, life is sweetest when it’s shared with others. People with this personality type form the bedrock of many communities, opening their homes – and their 
                    hearts – to friends, loved ones, and neighbors.
                                    
                    This doesn’t mean that Consuls like everyone, or that they’re saints. But Consuls do believe in the power of hospitality and good manners, and they tend to feel a 
                    sense of duty to those around them. Generous and reliable, people with this personality type often take it upon themselves – in ways both large and small – to hold 
                    their families and their communities together.
                    Strong Practical Skills – Consuls are excellent managers of day-to-day tasks and routine maintenance, enjoying making sure that those who are close to them are well 
                    cared for.
                    Strong Sense of Duty – People with the Consul personality type have a strong sense of responsibility and strive to meet their obligations, though this may sometimes 
                    be more from a sense of social expectations than intrinsic drive.
                    Very Loyal – Valuing stability and security very highly, Consuls are eager to preserve the status quo, which makes them extremely loyal and trustworthy partners 
                    and employees. Consuls are true pillars of any groups they belong to – whether it is their family or a community club, people with this personality type can 
                    always be relied upon.
                    Sensitive and Warm – Helping to ensure that stability, Consul personalities seek harmony and care deeply about other people’s feelings, being careful not to 
                    offend or hurt anybody. Consuls are strong team players, and win-win situations are the stuff smiles are made of.
                    Good at Connecting with Others – These qualities come together to make Consuls social, comfortable and well-liked. Consul personalities have a strong need 
                    to “belong”, and have no problem with small talk or following social cues in order to help them take an active role in their communities.
                    Because Consuls’ traits are so strongly expressed, leading with practical sense and social vigor, the careers they find most satisfying usually revolve 
                    around making the best use of these qualities. Consuls are well-organized, enjoying bringing order and structure to their workplaces, and often work best in 
                    environments with clear, predictable hierarchies and tasks. Monotony and routine work are not a challenge for the Consul personality type, as they are happy to 
                    do what needs to be done.
                    """);
        }
        if (point.equals("ISTP")) {
            System.out.println("""
                    A Virtuoso (ISTP) is someone with the Introverted, Observant, Thinking, and Prospecting personality traits. They tend to have an individualistic mindset, 
                    pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their approach as needed.
                                    
                    I wanted to live the life, a different life. I didn’t want to go to the same place every day and see the same people and do the same job. I wanted interesting 
                    challenges.
                                    
                    HARRISON FORD
                    Virtuosos love to explore with their hands and their eyes, touching and examining the world around them with cool rationalism and spirited curiosity. 
                    People with this personality type are natural Makers, moving from project to project, building the useful and the superfluous for the fun of it, and 
                    learning from their environment as they go. Often mechanics and engineers, Virtuosos find no greater joy than in getting their hands dirty pulling 
                    things apart and putting them back together, just a little bit better than they were before.
                    Optimistic and Energetic – Virtuosos are usually up to their elbows in some project or other. Cheerful and good-natured, people with the Virtuoso 
                    personality type (especially Assertive ones) rarely get stressed out, preferring to go with the flow.
                    Creative and Practical – Virtuosos are very imaginative when it comes to practical things, mechanics, and crafts. Novel ideas come easily, and they 
                    love using their hands to put them into action.
                    Spontaneous and Rational – Combining spontaneity with logic, Virtuosos can switch mindsets to fit new situations with little effort, making them 
                    flexible and versatile individuals.
                    Know How to Prioritize – This flexibility comes with some unpredictability, but Virtuoso personalities are able to store their spontaneity for a rainy 
                    day, releasing their energy just when it’s needed most.
                    Great in a Crisis – With all this hands-on creativity and spontaneity, it’s no wonder that Virtuosos are naturals in crisis situations. People with this 
                    personality type usually enjoy a little physical risk, and they aren’t afraid to get their hands dirty when the situation calls for it.
                    Relaxed – Through all this, Virtuosos are able to stay quite relaxed. They live in the moment and go with the flow, refusing to worry too much about the 
                    future.
                    The Virtuoso personality type is probably the hardest to pin down in many aspects of life, but especially in their careers. Virtuosos thrive on diversity 
                    and unpredictability, on wondering “what’s next?” every morning. This makes Virtuosos one of the most mysterious personality types, but also one of the 
                    most versatile in the professional world.
                                    
                    Virtuosos are born problem-solvers with an unwavering focus on practical solutions (though perhaps not always solutions to practical problems). No other 
                    type is quite as fascinated by how things work, how tools can be used, and how facts can be put together to create immediate and satisfying results. 
                    This combination of curiosity and hands-on vigor make people with the Virtuoso personality type excellent mechanics, engineers, graphic designers, and 
                    forensic scientists.
                                    
                                    
                    """);
        }
        if (point.equals("ISFP")) {
            System.out.println("""
                    An Adventurer (ISFP) is a person with the Introverted, Observant, Feeling, and Prospecting personality traits. They tend to have open minds, approaching life, 
                    new experiences, and people with grounded warmth. Their ability to stay in the moment helps them uncover exciting potentials.
                                    
                    I change during the course of a day. I wake and I’m one person, and when I go to sleep I know for certain I’m somebody else.
                                    
                    BOB DYLAN
                    Adventurers are true artists – although not necessarily in the conventional sense. For this personality type, life itself is a canvas for self-expression. 
                    From what they wear to how they spend their free time, Adventurers act in ways that vividly reflect who they are as unique individuals.
                                    
                    And every Adventurer is certainly unique. Driven by curiosity and eager to try new things, people with this personality often have a fascinating array of 
                    passions and interests. With their exploratory spirits and their ability to find joy in everyday life, Adventurers can be among the most interesting people 
                    you’ll ever meet. The only irony? Unassuming and humble, Adventurers tend to see themselves as “just doing their own thing,” so they may not even realize how remarkable they really are.
                    Charming – People with the Adventurer personality type are relaxed and warm, and their “live and let live” attitude naturally makes them likable and popular.
                    Sensitive to Others – Adventurers easily relate to others’ emotions, helping them to establish harmony and good will, and minimize conflict.
                    Imaginative – Being so aware of others’ emotions, Adventurer personalities use creativity and insight to craft bold ideas that speak to people’s hearts. 
                    While it’s hard to explain this quality on a resume, this vivid imagination and exploratory spirit help Adventurers in unexpected ways.
                    Passionate – Beneath Adventurers’ quiet shyness beats an intensely feeling heart. When people with this personality type are caught up in something exciting and 
                    interesting, they can leave everything else in the dust.
                    Curious – Ideas are well and good, but Adventurers need to see and explore for themselves whether their ideas ring true. Work revolving around the sciences 
                    may seem a poor match for their traits, but a boldly artistic and humanistic vision is often exactly what research needs to move forward – if Adventurers are 
                    given the freedom they need to do so.
                    Artistic – Adventurers are able to show their creativity in tangible ways and with stunning beauty. Whether writing a song, painting an emotion, or presenting 
                    a statistic in a graph, Adventurers have a way of visualizing things that resonates with their audience.                
                    When it comes to the career world, Adventurers need more than just a job. Wealth, power, structure, advancement and security are all lesser goals to Adventurer personalities’ greatest need: creative freedom. Adventurers crave a tangible outlet for their imagination, a chance to express themselves artistically.                
                    """);
        }
        if (point.equals("ESTP")) {
            System.out.println("""
                    An Entrepreneur (ESTP) is someone with the Extraverted, Observant, Thinking, and Prospecting personality traits. They tend to be energetic and action-oriented, 
                    deftly navigating whatever is in front of them. They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.
                                    
                    Life is either a daring adventure or nothing at all.
                                    
                    HELEN KELLER
                    Entrepreneurs always have an impact on their immediate surroundings – the best way to spot them at a party is to look for the whirling eddy of people flitting 
                    about them as they move from group to group. Laughing and entertaining with a blunt and earthy humor, Entrepreneur personalities love to be the center of attention. 
                    If an audience member is asked to come on stage, Entrepreneurs volunteer – or volunteer a shy friend.
                                    
                    Theory, abstract concepts and plodding discussions about global issues and their implications don’t keep Entrepreneurs interested for long. Entrepreneurs keep 
                    their conversation energetic, with a good dose of intelligence, but they like to talk about what is – or better yet, to just go out and do it. Entrepreneurs 
                    leap before they look, fixing their mistakes as they go, rather than sitting idle, preparing contingencies and escape clauses.
                    Bold – People with the Entrepreneur personality type are full of life and energy. There is no greater joy for Entrepreneurs than pushing boundaries and discovering 
                    and using new things and ideas.
                    Rational and Practical – Entrepreneurs love knowledge and philosophy, but not for their own sake. What’s fun for Entrepreneur personalities is finding ideas that
                     are actionable and drilling into the details so they can put them to use. If a discussion is completely arbitrary, there are better uses for Entrepreneurs’ time.
                    Original – Combining their boldness and practicality, Entrepreneurs love to experiment with new ideas and solutions. They put things together in ways no one else 
                    would think to.
                    Perceptive – This originality is helped by Entrepreneurs’ ability to notice when things change – and when they need to change! Small shifts in habits and appearances 
                    stick out to Entrepreneurs, and they use these observations to help create connections with others.
                    Direct – This perceptive skill isn’t used for mind games – Entrepreneurs prefer to communicate clearly, with direct and factual questions and answers. Things are 
                    what they are.
                    Sociable – All these qualities pull together to make a natural group leader in Entrepreneurs. This isn’t something that they actively seek – people with this 
                    personality type just have a knack for making excellent use of social interactions and networking opportunities.
                    When it comes to Entrepreneurs’ career options, “action” is the word of the day. People with the Entrepreneur personality type think on their feet and are 
                    great at making quick decisions in the heat of the moment. At the same time, they’re affable people who always seem to make friends and connections wherever they go. Popularity and solid networking can be huge assets in the working world, and Entrepreneurs nail it.                
                                    
                    """);
        }
        if (point.equals("ENTP")) {
            System.out.println("""
                    An Entertainer (ESFP) is a person with the Extraverted, Observant, Feeling, and Prospecting personality traits. These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. They can be very social, often encouraging others into shared activities.
                                    
                    Live for each second without hesitation.
                                    
                    ELTON JOHN
                    If anyone is to be found spontaneously breaking into song and dance, it is the Entertainer personality type. Entertainers get caught up in the excitement of the 
                    moment, and want everyone else to feel that way, too. No other personality type is as generous with their time and energy as Entertainers when it comes to encouraging 
                    others, and no other personality type does it with such irresistible style.
                    Bold – Entertainers aren’t known for holding back. Wanting to experience everything there is to experience, people with the Entertainer personality type don’t mind 
                    stepping out of their comfort zones when no one else is willing.
                    Original – Traditions and expectations are secondary to Entertainers, if a consideration at all. Entertainer personalities love to experiment with new styles, and 
                    constantly find new ways to stick out in the crowd.
                    Aesthetics and Showmanship – Not stopping at mere outfits, Entertainers inject artistic creativity into their words and actions, too. Every day is a performance, 
                    and Entertainers love to put on a show.
                    Practical – To Entertainers, the world is meant to be felt and experienced. Truth is stranger than fiction, and Entertainers prefer to see and do than to wax 
                    philosophical about “what-ifs”.
                    Observant – With all this focus on the here and now, on doing and acting, it makes sense that Entertainers are naturals when it comes to noticing real, tangible 
                    things and changes.
                    Excellent People Skills – More so than things though, Entertainers love to pay attention to people. They are talkative, witty, and almost never run out of things to 
                    discuss. For people with this personality type, happiness and satisfaction stem from the time they spend with the people they enjoy being with.
                    Entertainers have a unique quality that makes them exceptional in some careers, and miserable in others – they mirror the mood around them. When people with the 
                    Entertainer personality type are at a party or concert, they reflect that mood, giving them that “party people” image. When their friends are sad, they mirror 
                    that with sympathy and empathy. And when there is a crisis, Entertainers adapt as well, matching the intensity of the situation.
                    """);

        }
    }
}