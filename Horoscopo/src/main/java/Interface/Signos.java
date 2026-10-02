/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Image;
import java.time.LocalDate;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author IsraelSantos
 */
public class Signos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Signos.class.getName());

    /**
     * Creates new form Signos
     */
    
    // CRIANDO VARIÁVEL PARA GUARDAR A MÚSICA
    Clip musica;
    
    public Signos() {
        initComponents();
        RedimensionarImagens();
        PreencherPrevisao();
        PreencherMensagem();
        CorrigirAreasTexto();
        
    }
    // TODA FUNÇÃO É CRIADA ABAIXO DO CONSTRUTOR
    
    public void RedimensionarImagens(){
        
        // Capturar as imagens que estão dentro da label
        
        // ÁRIES
        ImageIcon aries = (ImageIcon) imgSignoAries.getIcon();        
        // redimensionar o tamanho delas
        Image imgAries = aries.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);        
        // Jogar a imagem redimensionada na Label novamente
        imgSignoAries.setIcon(new ImageIcon (imgAries));
        
        // TOURO
        ImageIcon touro = (ImageIcon) imgSignoTouro.getIcon();
        // redimensionar o tamanho delas
        Image imgTouro = touro.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);        
        // Jogar a imagem redimensionada na Label novamente
        imgSignoTouro.setIcon(new ImageIcon (imgTouro));
        
        // GÊMEOS
        ImageIcon gemeos = (ImageIcon) imgSignoGemeos.getIcon();
        // redimensionar o tamanho delas
        Image imgGemeos = gemeos.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);        
        // Jogar a imagem redimensionada na Label novamente
        imgSignoGemeos.setIcon(new ImageIcon (imgGemeos));
        
        // CÂNCER
        ImageIcon cancer = (ImageIcon) imgSignoCancer.getIcon();
        // redimensionar o tamanho delas
        Image imgCancer = cancer.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);        
        // Jogar a imagem redimensionada na Label novamente
        imgSignoCancer.setIcon(new ImageIcon (imgCancer));
        
        // LEÃO
        ImageIcon leao = (ImageIcon) imgSignoLeao.getIcon();
        // redimensionar o tamanho delas
        Image imgLeao = leao.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);        
        // Jogar a imagem redimensionada na Label novamente
        imgSignoLeao.setIcon(new ImageIcon (imgLeao));
        
        // VIRGEM
        ImageIcon virgem = (ImageIcon) imgSignoVirgem.getIcon();
        // redimensionar o tamanho delas
        Image imgVirgem = virgem.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);        
        // Jogar a imagem redimensionada na Label novamente
        imgSignoVirgem.setIcon(new ImageIcon (imgVirgem));
        
        // LIBRA
        ImageIcon libra = (ImageIcon) imgSignoLibra.getIcon();
        // redimensionar o tamanho delas
        Image imgLibra = libra.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);        
        // Jogar a imagem redimensionada na Label novamente
        imgSignoLibra.setIcon(new ImageIcon (imgLibra));
        
        // ESCORPIÃO
        ImageIcon escorpiao = (ImageIcon) imgSignoEscorpiao.getIcon();
        // redimensionar o tamanho delas
        Image imgEscorpiao = escorpiao.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);        
        // Jogar a imagem redimensionada na Label novamente
        imgSignoEscorpiao.setIcon(new ImageIcon (imgEscorpiao));
        
        // SAGITÁRIO
        ImageIcon sagitario = (ImageIcon) imgSignoSagitario.getIcon();
        // redimensionar o tamanho delas
        Image imgSagitario = sagitario.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);        
        // Jogar a imagem redimensionada na Label novamente
        imgSignoSagitario.setIcon(new ImageIcon (imgSagitario));
        
        // CAPRICÓRNIO
        ImageIcon capricornio = (ImageIcon) imgSignoCapricornio.getIcon();
        // redimensionar o tamanho delas
        Image imgCapricornio = capricornio.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);        
        // Jogar a imagem redimensionada na Label novamente
        imgSignoCapricornio.setIcon(new ImageIcon (imgCapricornio));
        
        // AQUÁRIO
        ImageIcon aquario = (ImageIcon) imgSignoAquario.getIcon();
        // redimensionar o tamanho delas
        Image imgAquario = aquario.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);        
        // Jogar a imagem redimensionada na Label novamente
        imgSignoAquario.setIcon(new ImageIcon (imgAquario));
        
        // PEIXES
        ImageIcon peixes = (ImageIcon) imgSignoPeixes.getIcon();
        // redimensionar o tamanho delas
        Image imgPeixes = peixes.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);        
        // Jogar a imagem redimensionada na Label novamente
        imgSignoPeixes.setIcon(new ImageIcon (imgPeixes));
        
    } // fim da função
    
    public void PreencherPrevisao(){
        
        // Verificar o dia da semana
        int diaSemana = LocalDate.now().getDayOfWeek().getValue();
        // LocalDate --> puxa a data do computador
        
        // CRIAR A CONDICIONAL PARA PREENCHER O CAMPO PREVISÃO.
        switch (diaSemana) {

            case 1: // Segunda-feira
                txPrevisaoAries.setText("Hoje é um bom dia para tomar a iniciativa e colocar seus planos em prática.");
                txPrevisaoTouro.setText("Tenha paciência e confie no seu ritmo. Pequenos passos podem trazer bons resultados.");
                txPrevisaoGemeos.setText("Uma conversa pode trazer uma nova oportunidade. Esteja aberto para ouvir e compartilhar ideias.");
                txPrevisaoCancer.setText("Valorize as pessoas que fazem você se sentir bem. O apoio emocional será importante hoje.");
                txPrevisaoLeao.setText("Sua confiança estará em alta. Aproveite para mostrar seus talentos e assumir novos desafios.");
                txPrevisaoVirgem.setText("Organização será sua aliada. Coloque suas tarefas em ordem e evite deixar tudo para depois.");
                txPrevisaoLibra.setText("Procure manter o equilíbrio nas suas decisões. Evite agir por impulso.");
                txPrevisaoEscorpiao.setText("Sua determinação estará forte. Use essa energia para resolver algo que vem sendo adiado.");
                txPrevisaoSagitario.setText("O dia favorece novas ideias e planos. Permita-se pensar em novas possibilidades.");
                txPrevisaoCapricornio.setText("Foco e responsabilidade podem ajudar você a avançar em seus objetivos.");
                txPrevisaoAquario.setText("Uma ideia diferente pode chamar sua atenção. Não tenha medo de pensar fora da caixa.");
                txPrevisaoPeixes.setText("Reserve um momento para cuidar de si e ouvir sua intuição.");
                break;

            case 2: // Terça-feira
                txPrevisaoAries.setText("Uma oportunidade inesperada pode surgir. Esteja preparado para agir.");
                txPrevisaoTouro.setText("Evite decisões precipitadas. Hoje, a calma pode ajudar você a enxergar melhor as situações.");
                txPrevisaoGemeos.setText("Sua comunicação estará favorecida. Use as palavras certas para aproximar pessoas.");
                txPrevisaoCancer.setText("Uma lembrança pode despertar sentimentos importantes. Aproveite para refletir sobre o que realmente deseja.");
                txPrevisaoLeao.setText("Você poderá receber reconhecimento por algo que fez. Continue demonstrando seu potencial.");
                txPrevisaoVirgem.setText("Uma tarefa que parecia complicada pode se tornar mais simples se você dividir o problema em etapas.");
                txPrevisaoLibra.setText("Um diálogo sincero pode ajudar a resolver uma situação que estava causando dúvidas.");
                txPrevisaoEscorpiao.setText("Confie mais na sua percepção. Você pode perceber detalhes que outras pessoas não estão enxergando.");
                txPrevisaoSagitario.setText("O desejo de mudança estará presente. Pense com cuidado antes de tomar uma decisão importante.");
                txPrevisaoCapricornio.setText("Persistência será fundamental. Continue trabalhando, mesmo que os resultados demorem um pouco.");
                txPrevisaoAquario.setText("Uma conversa com alguém pode despertar uma ideia interessante para o futuro.");
                txPrevisaoPeixes.setText("Sua sensibilidade estará mais aguçada. Use-a para compreender melhor as pessoas ao seu redor.");
                break;

            case 3: // Quarta-feira
                txPrevisaoAries.setText("Metade da semana chegou. Aproveite sua energia para concluir aquilo que começou.");
                txPrevisaoTouro.setText("Um pouco de tranquilidade fará bem. Não tenha pressa para resolver tudo de uma vez.");
                txPrevisaoGemeos.setText("Novidades podem aparecer através de uma mensagem ou conversa inesperada.");
                txPrevisaoCancer.setText("O dia pede equilíbrio entre suas responsabilidades e o tempo dedicado às pessoas que ama.");
                txPrevisaoLeao.setText("Sua presença poderá chamar atenção. Use seu carisma de maneira positiva.");
                txPrevisaoVirgem.setText("Revisar seus planos pode revelar algo que precisa ser melhorado.");
                txPrevisaoLibra.setText("Uma escolha pode exigir mais atenção. Analise os dois lados antes de decidir.");
                txPrevisaoEscorpiao.setText("Não deixe uma pequena dificuldade tirar seu foco. Você tem capacidade para superar esse momento.");
                txPrevisaoSagitario.setText("Um novo aprendizado pode ser mais importante do que você imagina.");
                txPrevisaoCapricornio.setText("Continue firme em seus objetivos. Seu esforço poderá trazer resultados no futuro.");
                txPrevisaoAquario.setText("Uma solução criativa pode aparecer quando você menos esperar.");
                txPrevisaoPeixes.setText("Dedique um tempo para algo que desperte sua criatividade e imaginação.");
                break;

            case 4: // Quinta-feira
                txPrevisaoAries.setText("Seu entusiasmo pode contagiar as pessoas ao seu redor. Aproveite essa energia.");
                txPrevisaoTouro.setText("Uma situação financeira pode exigir atenção. Organize seus gastos e planeje os próximos passos.");
                txPrevisaoGemeos.setText("Você poderá conhecer uma informação interessante que mudará sua maneira de enxergar uma situação.");
                txPrevisaoCancer.setText("Um gesto simples de carinho pode tornar seu dia muito melhor.");
                txPrevisaoLeao.setText("Não tenha medo de assumir responsabilidades. Você está preparado para novos desafios.");
                txPrevisaoVirgem.setText("Concentre-se no que realmente importa e evite perder tempo com pequenos detalhes.");
                txPrevisaoLibra.setText("Um momento de tranquilidade pode ajudar você a tomar uma decisão que estava pendente.");
                txPrevisaoEscorpiao.setText("Hoje é um bom dia para deixar para trás aquilo que não contribui mais para sua vida.");
                txPrevisaoSagitario.setText("Uma oportunidade de aprender algo novo pode surgir. Aproveite a experiência.");
                txPrevisaoCapricornio.setText("Seu comprometimento será percebido. Continue fazendo seu trabalho com dedicação.");
                txPrevisaoAquario.setText("Uma mudança de perspectiva pode ajudar você a encontrar uma solução.");
                txPrevisaoPeixes.setText("Siga sua intuição, mas procure também observar os fatos antes de tomar decisões.");
                break;

            case 5: // Sexta-feira
                txPrevisaoAries.setText("O fim da semana chega com energia para você. Aproveite para comemorar pequenas conquistas.");
                txPrevisaoTouro.setText("Depois de uma semana intensa, permita-se descansar e aproveitar os momentos simples.");
                txPrevisaoGemeos.setText("O dia favorece encontros e conversas descontraídas. Aproveite para estar perto de quem gosta.");
                txPrevisaoCancer.setText("Um momento agradável em família ou com amigos pode renovar suas energias.");
                txPrevisaoLeao.setText("Você estará mais disposto a se divertir. Aproveite o dia sem esquecer seus limites.");
                txPrevisaoVirgem.setText("Finalize suas pendências antes de descansar. Assim, você poderá aproveitar melhor o fim de semana.");
                txPrevisaoLibra.setText("Boas companhias podem transformar um dia comum em uma lembrança especial.");
                txPrevisaoEscorpiao.setText("Deixe de lado preocupações desnecessárias e aproveite o momento presente.");
                txPrevisaoSagitario.setText("A vontade de sair da rotina estará forte. Planeje algo diferente para fazer.");
                txPrevisaoCapricornio.setText("Depois de cumprir suas responsabilidades, permita-se descansar sem culpa.");
                txPrevisaoAquario.setText("Uma conversa descontraída pode trazer boas ideias e momentos divertidos.");
                txPrevisaoPeixes.setText("Aproveite o dia para fazer algo que traga alegria e tranquilidade.");
                break;

            case 6: // Sábado
                txPrevisaoAries.setText("O sábado pede ação. Faça algo que você realmente gosta e aproveite sua energia.");
                txPrevisaoTouro.setText("Um dia tranquilo pode ser exatamente o que você precisa para recuperar as energias.");
                txPrevisaoGemeos.setText("Novos encontros podem tornar seu sábado mais divertido e interessante.");
                txPrevisaoCancer.setText("A companhia de pessoas queridas será especialmente importante hoje.");
                txPrevisaoLeao.setText("Aproveite para se divertir e deixar sua personalidade brilhar.");
                txPrevisaoVirgem.setText("Organize seu espaço, mas não se esqueça de reservar tempo para descansar.");
                txPrevisaoLibra.setText("Um passeio ou encontro agradável pode deixar seu dia mais leve.");
                txPrevisaoEscorpiao.setText("Use o sábado para se afastar um pouco das preocupações da semana.");
                txPrevisaoSagitario.setText("Uma aventura fora da rotina pode tornar seu dia muito mais especial.");
                txPrevisaoCapricornio.setText("Descanse e recarregue suas energias para os próximos desafios.");
                txPrevisaoAquario.setText("Experimente algo diferente. Uma nova experiência pode surpreender você.");
                txPrevisaoPeixes.setText("Um momento de paz e tranquilidade ajudará você a recuperar o equilíbrio.");
                break;

            case 7: // Domingo
                txPrevisaoAries.setText("Domingo é um bom momento para descansar e preparar seus planos para a próxima semana.");
                txPrevisaoTouro.setText("Aproveite o dia para relaxar e desfrutar das coisas simples da vida.");
                txPrevisaoGemeos.setText("Uma conversa agradável pode trazer boas lembranças e renovar seu ânimo.");
                txPrevisaoCancer.setText("Passe um tempo com pessoas importantes para você. Afeto será a palavra do dia.");
                txPrevisaoLeao.setText("Valorize suas conquistas e comece a próxima semana com confiança.");
                txPrevisaoVirgem.setText("Organize mentalmente seus próximos passos, mas não esqueça de aproveitar o domingo.");
                txPrevisaoLibra.setText("Busque tranquilidade e equilíbrio. Um domingo leve pode preparar você para uma boa semana.");
                txPrevisaoEscorpiao.setText("Use o dia para refletir sobre seus objetivos e deixar para trás aquilo que não faz mais sentido.");
                txPrevisaoSagitario.setText("Planeje novas experiências para os próximos dias e mantenha o otimismo.");
                txPrevisaoCapricornio.setText("Descanse sem culpa. Recuperar as energias também faz parte da caminhada.");
                txPrevisaoAquario.setText("Uma ideia para a próxima semana pode surgir durante um momento de tranquilidade.");
                txPrevisaoPeixes.setText("Permita-se sonhar e imaginar novos caminhos. A próxima semana pode trazer novidades.");
                break;
        }
    }
    
    public void PreencherMensagem() {

        // CAPTURA DIA DA SEMANA
        int diaSemana = LocalDate.now().getDayOfWeek().getValue();

        // CONDICIONAL
        switch (diaSemana) {

            case 1: // Segunda-feira
                txMensagemAries.setText("Comece a semana com coragem e determinação. Confie no seu potencial.");
                txMensagemTouro.setText("Tenha paciência e siga seu ritmo. Bons resultados levam tempo.");
                txMensagemGemeos.setText("Uma boa conversa pode abrir portas para novas oportunidades.");
                txMensagemCancer.setText("Valorize quem está ao seu lado e permita-se começar a semana com tranquilidade.");
                txMensagemLeao.setText("Mostre sua confiança, mas lembre-se de ouvir as pessoas ao seu redor.");
                txMensagemVirgem.setText("Organização será importante para manter o controle das tarefas desta semana.");
                txMensagemLibra.setText("Busque equilíbrio entre suas responsabilidades e seus momentos de descanso.");
                txMensagemEscorpiao.setText("Use sua determinação para enfrentar qualquer desafio que aparecer.");
                txMensagemSagitario.setText("Mantenha o otimismo e esteja aberto a novas experiências.");
                txMensagemCapricornio.setText("Foco e disciplina ajudarão você a avançar em seus objetivos.");
                txMensagemAquario.setText("Uma ideia diferente pode ser o começo de algo muito interessante.");
                txMensagemPeixes.setText("Confie na sua intuição, mas mantenha os pés no chão.");

                break;

            case 2: // Terça-feira
                txMensagemAries.setText("Uma oportunidade pode surgir de maneira inesperada. Esteja preparado para agir.");
                txMensagemTouro.setText("Evite tomar decisões com pressa. Analise tudo com calma.");
                txMensagemGemeos.setText("Sua comunicação estará favorecida. Aproveite para trocar ideias.");
                txMensagemCancer.setText("Cuide das suas emoções e não tenha medo de demonstrar seus sentimentos.");
                txMensagemLeao.setText("Seu talento poderá ser reconhecido. Continue acreditando em si mesmo.");
                txMensagemVirgem.setText("Concentre-se nas prioridades e não se preocupe com pequenos problemas.");
                txMensagemLibra.setText("Uma conversa sincera pode ajudar a resolver uma situação pendente.");
                txMensagemEscorpiao.setText("Confie mais na sua percepção. Você pode enxergar detalhes importantes.");
                txMensagemSagitario.setText("Novos conhecimentos podem trazer mudanças positivas para seus planos.");
                txMensagemCapricornio.setText("Continue persistindo. Seus esforços podem trazer bons resultados.");
                txMensagemAquario.setText("Uma nova ideia pode mudar sua maneira de enxergar determinada situação.");
                txMensagemPeixes.setText("Sua sensibilidade estará em destaque. Use-a para compreender melhor as pessoas.");

                break;

            case 3: // Quarta-feira
                txMensagemAries.setText("Use sua energia para concluir aquilo que começou no início da semana.");
                txMensagemTouro.setText("Não tenha pressa. Algumas coisas precisam acontecer no tempo certo.");
                txMensagemGemeos.setText("Uma mensagem ou conversa pode trazer uma novidade interessante.");
                txMensagemCancer.setText("Procure equilibrar suas obrigações com momentos ao lado de quem você ama.");
                txMensagemLeao.setText("Seu carisma pode ajudar você a conquistar a confiança de outras pessoas.");
                txMensagemVirgem.setText("Revisar seus planos pode ajudar a encontrar algo que precisa ser melhorado.");
                txMensagemLibra.setText("Antes de escolher, considere todos os lados da situação.");
                txMensagemEscorpiao.setText("Não permita que pequenos obstáculos atrapalhem seus objetivos.");
                txMensagemSagitario.setText("Um novo aprendizado poderá ser mais importante do que você imagina.");
                txMensagemCapricornio.setText("Mantenha o foco e continue trabalhando pelos seus objetivos.");
                txMensagemAquario.setText("Uma solução criativa pode aparecer quando você menos esperar.");
                txMensagemPeixes.setText("Reserve um momento para sua criatividade e para aquilo que faz você feliz.");

                break;

            case 4: // Quinta-feira
                txMensagemAries.setText("Sua determinação estará forte. Aproveite para enfrentar um desafio.");
                txMensagemTouro.setText("Organize suas finanças e evite gastos desnecessários.");
                txMensagemGemeos.setText("Uma informação nova pode mudar sua perspectiva sobre uma situação.");
                txMensagemCancer.setText("Um pequeno gesto de carinho pode transformar o seu dia.");
                txMensagemLeao.setText("Assuma suas responsabilidades com confiança e mostre seu potencial.");
                txMensagemVirgem.setText("Concentre-se no que realmente importa e evite excesso de preocupação.");
                txMensagemLibra.setText("Um momento de tranquilidade pode ajudar você a tomar uma decisão.");
                txMensagemEscorpiao.setText("Deixe para trás aquilo que não contribui mais para sua vida.");
                txMensagemSagitario.setText("Aproveite uma oportunidade para aprender algo diferente.");
                txMensagemCapricornio.setText("Seu comprometimento poderá ser percebido por pessoas importantes.");
                txMensagemAquario.setText("Mudar sua perspectiva pode ajudar você a encontrar uma solução.");
                txMensagemPeixes.setText("Confie na sua intuição, mas também observe os fatos antes de decidir.");

                break;

            case 5: // Sexta-feira
                txMensagemAries.setText("A semana está chegando ao fim. Aproveite para reconhecer suas conquistas.");
                txMensagemTouro.setText("Depois de uma semana intensa, permita-se aproveitar momentos tranquilos.");
                txMensagemGemeos.setText("Boas conversas podem tornar seu dia mais leve e divertido.");
                txMensagemCancer.setText("A companhia de pessoas queridas pode renovar suas energias.");
                txMensagemLeao.setText("Aproveite o dia para se divertir e deixar sua personalidade brilhar.");
                txMensagemVirgem.setText("Finalize suas pendências para aproveitar melhor o fim de semana.");
                txMensagemLibra.setText("Boas companhias podem transformar um dia comum em um momento especial.");
                txMensagemEscorpiao.setText("Deixe algumas preocupações de lado e aproveite o presente.");
                txMensagemSagitario.setText("A vontade de sair da rotina pode trazer uma experiência divertida.");
                txMensagemCapricornio.setText("Depois de cumprir suas responsabilidades, permita-se descansar.");
                txMensagemAquario.setText("Uma conversa descontraída pode trazer ideias interessantes.");
                txMensagemPeixes.setText("Faça algo que traga alegria e tranquilidade para o seu dia.");

                break;

            case 6: // Sábado
                txMensagemAries.setText("Aproveite sua energia para fazer algo que realmente gosta.");
                txMensagemTouro.setText("Um dia tranquilo pode ser exatamente o que você precisa para descansar.");
                txMensagemGemeos.setText("Novos encontros podem tornar seu sábado mais divertido.");
                txMensagemCancer.setText("Estar perto de pessoas queridas pode deixar seu dia ainda melhor.");
                txMensagemLeao.setText("Aproveite o sábado para se divertir e aproveitar bons momentos.");
                txMensagemVirgem.setText("Organize seu espaço, mas não se esqueça de reservar tempo para descansar.");
                txMensagemLibra.setText("Um passeio agradável pode trazer leveza para o seu dia.");
                txMensagemEscorpiao.setText("Afaste-se um pouco das preocupações e aproveite o momento.");
                txMensagemSagitario.setText("Uma experiência diferente pode tornar seu sábado inesquecível.");
                txMensagemCapricornio.setText("Descanse e recarregue suas energias para a próxima semana.");
                txMensagemAquario.setText("Experimente algo novo. Uma mudança de rotina pode surpreender você.");
                txMensagemPeixes.setText("Procure um lugar tranquilo para relaxar e recuperar suas energias.");

                break;

            case 7: // Domingo
                txMensagemAries.setText("Use o domingo para descansar e preparar seus planos para a próxima semana.");
                txMensagemTouro.setText("Aproveite as coisas simples da vida e permita-se relaxar.");
                txMensagemGemeos.setText("Uma conversa agradável pode trazer boas lembranças.");
                txMensagemCancer.setText("Passe um tempo com as pessoas que são importantes para você.");
                txMensagemLeao.setText("Valorize suas conquistas e prepare-se para novos desafios.");
                txMensagemVirgem.setText("Planeje sua próxima semana, mas não esqueça de aproveitar o domingo.");
                txMensagemLibra.setText("Busque tranquilidade e equilíbrio antes do início de uma nova semana.");
                txMensagemEscorpiao.setText("Reflita sobre seus objetivos e deixe para trás o que não faz mais sentido.");
                txMensagemSagitario.setText("Planeje novas experiências e mantenha o otimismo.");
                txMensagemCapricornio.setText("Descanse sem culpa. Recuperar as energias também é importante.");
                txMensagemAquario.setText("Uma ideia para a próxima semana pode surgir durante um momento de tranquilidade.");
                txMensagemPeixes.setText("Permita-se sonhar com novos caminhos e possibilidades.");

                break;
        }
    }
    
    public void CorrigirAreasTexto(){

        // ==================== CORRIGIR MENSAGEM ====================

        txMensagemAries.setLineWrap(true);
        txMensagemAries.setWrapStyleWord(true);

        txMensagemTouro.setLineWrap(true);
        txMensagemTouro.setWrapStyleWord(true);

        txMensagemGemeos.setLineWrap(true);
        txMensagemGemeos.setWrapStyleWord(true);

        txMensagemCancer.setLineWrap(true);
        txMensagemCancer.setWrapStyleWord(true);

        txMensagemLeao.setLineWrap(true);
        txMensagemLeao.setWrapStyleWord(true);

        txMensagemVirgem.setLineWrap(true);
        txMensagemVirgem.setWrapStyleWord(true);

        txMensagemLibra.setLineWrap(true);
        txMensagemLibra.setWrapStyleWord(true);

        txMensagemEscorpiao.setLineWrap(true);
        txMensagemEscorpiao.setWrapStyleWord(true);

        txMensagemSagitario.setLineWrap(true);
        txMensagemSagitario.setWrapStyleWord(true);

        txMensagemCapricornio.setLineWrap(true);
        txMensagemCapricornio.setWrapStyleWord(true);

        txMensagemAquario.setLineWrap(true);
        txMensagemAquario.setWrapStyleWord(true);

        txMensagemPeixes.setLineWrap(true);
        txMensagemPeixes.setWrapStyleWord(true);


        // ==================== CORRIGIR PREVISÃO ====================

        txPrevisaoAries.setLineWrap(true);
        txPrevisaoAries.setWrapStyleWord(true);

        txPrevisaoTouro.setLineWrap(true);
        txPrevisaoTouro.setWrapStyleWord(true);

        txPrevisaoGemeos.setLineWrap(true);
        txPrevisaoGemeos.setWrapStyleWord(true);

        txPrevisaoCancer.setLineWrap(true);
        txPrevisaoCancer.setWrapStyleWord(true);

        txPrevisaoLeao.setLineWrap(true);
        txPrevisaoLeao.setWrapStyleWord(true);

        txPrevisaoVirgem.setLineWrap(true);
        txPrevisaoVirgem.setWrapStyleWord(true);

        txPrevisaoLibra.setLineWrap(true);
        txPrevisaoLibra.setWrapStyleWord(true);

        txPrevisaoEscorpiao.setLineWrap(true);
        txPrevisaoEscorpiao.setWrapStyleWord(true);

        txPrevisaoSagitario.setLineWrap(true);
        txPrevisaoSagitario.setWrapStyleWord(true);

        txPrevisaoCapricornio.setLineWrap(true);
        txPrevisaoCapricornio.setWrapStyleWord(true);

        txPrevisaoAquario.setLineWrap(true);
        txPrevisaoAquario.setWrapStyleWord(true);

        txPrevisaoPeixes.setLineWrap(true);
        txPrevisaoPeixes.setWrapStyleWord(true);


        // ==================== CORRIGIR PONTOS FORTES ====================

        txFortesAries.setLineWrap(true);
        txFortesAries.setWrapStyleWord(true);

        txFortesTouro.setLineWrap(true);
        txFortesTouro.setWrapStyleWord(true);

        txFortesGemeos.setLineWrap(true);
        txFortesGemeos.setWrapStyleWord(true);

        txFortesCancer.setLineWrap(true);
        txFortesCancer.setWrapStyleWord(true);

        txFortesLeao.setLineWrap(true);
        txFortesLeao.setWrapStyleWord(true);

        txFortesVirgem.setLineWrap(true);
        txFortesVirgem.setWrapStyleWord(true);

        txFortesLibra.setLineWrap(true);
        txFortesLibra.setWrapStyleWord(true);

        txFortesEscorpiao.setLineWrap(true);
        txFortesEscorpiao.setWrapStyleWord(true);

        txFortesSagitario.setLineWrap(true);
        txFortesSagitario.setWrapStyleWord(true);

        txFortesCapricornio.setLineWrap(true);
        txFortesCapricornio.setWrapStyleWord(true);

        txFortesAquario.setLineWrap(true);
        txFortesAquario.setWrapStyleWord(true);

        txFortesPeixes.setLineWrap(true);
        txFortesPeixes.setWrapStyleWord(true);


        // ==================== CORRIGIR PONTOS A MELHORAR ====================

        txMelhorarAries.setLineWrap(true);
        txMelhorarAries.setWrapStyleWord(true);

        txMelhorarTouro.setLineWrap(true);
        txMelhorarTouro.setWrapStyleWord(true);

        txMelhorarGemeos.setLineWrap(true);
        txMelhorarGemeos.setWrapStyleWord(true);

        txMelhorarCancer.setLineWrap(true);
        txMelhorarCancer.setWrapStyleWord(true);

        txMelhorarLeao.setLineWrap(true);
        txMelhorarLeao.setWrapStyleWord(true);

        txMelhorarVirgem.setLineWrap(true);
        txMelhorarVirgem.setWrapStyleWord(true);

        txMelhorarLibra.setLineWrap(true);
        txMelhorarLibra.setWrapStyleWord(true);

        txMelhorarEscorpiao.setLineWrap(true);
        txMelhorarEscorpiao.setWrapStyleWord(true);

        txMelhorarSagitario.setLineWrap(true);
        txMelhorarSagitario.setWrapStyleWord(true);

        txMelhorarCapricornio.setLineWrap(true);
        txMelhorarCapricornio.setWrapStyleWord(true);

        txMelhorarAquario.setLineWrap(true);
        txMelhorarAquario.setWrapStyleWord(true);

        txMelhorarPeixes.setLineWrap(true);
        txMelhorarPeixes.setWrapStyleWord(true);

    } // fim do método
    
    public void CalcularSigno(){
        // Capturar dados da comboBox
        // convertendo texto em numero inteiro (intereger, Double. Boolean)
        int dia = Integer.parseInt(cbDia.getSelectedItem().toString());
        String mes = cbMes.getSelectedItem().toString();

        // Variável que guarda a imagem do signo
        ImageIcon imagem = null;

        // Verificar dia e mês dos signos com if else

        if((mes.equalsIgnoreCase("Março") && dia >= 21) || 
           (mes.equalsIgnoreCase("Abril") && dia <= 19)){

            signo.setText("Aries"); // preenche o nome do signo
            imagem = (ImageIcon) imgSignoAries.getIcon(); // captura sua imagem

        }else if((mes.equalsIgnoreCase("Abril") && dia >= 20) || 
                 (mes.equalsIgnoreCase("Maio") && dia <= 20)){

            signo.setText("Touro"); // preenche o nome do signo
            imagem = (ImageIcon) imgSignoTouro.getIcon(); // captura sua imagem

        }else if((mes.equalsIgnoreCase("Maio") && dia >= 21) || 
                 (mes.equalsIgnoreCase("Junho") && dia <= 20)){

            signo.setText("Gemeos"); // preenche o nome do signo
            imagem = (ImageIcon) imgSignoGemeos.getIcon(); // captura sua imagem

        }else if((mes.equalsIgnoreCase("Junho") && dia >= 21) || 
                 (mes.equalsIgnoreCase("Julho") && dia <= 22)){

            signo.setText("Cancer"); // preenche o nome do signo
            imagem = (ImageIcon) imgSignoCancer.getIcon(); // captura sua imagem

        }else if((mes.equalsIgnoreCase("Julho") && dia >= 23) || 
                 (mes.equalsIgnoreCase("Agosto") && dia <= 22)){

            signo.setText("Leao"); // preenche o nome do signo
            imagem = (ImageIcon) imgSignoLeao.getIcon(); // captura sua imagem

        }else if((mes.equalsIgnoreCase("Agosto") && dia >= 23) || 
                 (mes.equalsIgnoreCase("Setembro") && dia <= 22)){

            signo.setText("Virgem"); // preenche o nome do signo
            imagem = (ImageIcon) imgSignoVirgem.getIcon(); // captura sua imagem

        }else if((mes.equalsIgnoreCase("Setembro") && dia >= 23) || 
                 (mes.equalsIgnoreCase("Outubro") && dia <= 22)){

            signo.setText("Libra"); // preenche o nome do signo
            imagem = (ImageIcon) imgSignoLibra.getIcon(); // captura sua imagem

        }else if((mes.equalsIgnoreCase("Outubro") && dia >= 23) || 
                 (mes.equalsIgnoreCase("Novembro") && dia <= 21)){

            signo.setText("Escorpiao"); // preenche o nome do signo
            imagem = (ImageIcon) imgSignoEscorpiao.getIcon(); // captura sua imagem

        }else if((mes.equalsIgnoreCase("Novembro") && dia >= 22) || 
                 (mes.equalsIgnoreCase("Dezembro") && dia <= 21)){

            signo.setText("Sagitario"); // preenche o nome do signo
            imagem = (ImageIcon) imgSignoSagitario.getIcon(); // captura sua imagem

        }else if((mes.equalsIgnoreCase("Dezembro") && dia >= 22) || 
                 (mes.equalsIgnoreCase("Janeiro") && dia <= 19)){

            signo.setText("Capricornio"); // preenche o nome do signo
            imagem = (ImageIcon) imgSignoCapricornio.getIcon(); // captura sua imagem

        }else if((mes.equalsIgnoreCase("Janeiro") && dia >= 20) || 
                 (mes.equalsIgnoreCase("Fevereiro") && dia <= 18)){

            signo.setText("Aquario"); // preenche o nome do signo
            imagem = (ImageIcon) imgSignoAquario.getIcon(); // captura sua imagem

        }else if((mes.equalsIgnoreCase("Fevereiro") && dia >= 19) || 
                 (mes.equalsIgnoreCase("Março") && dia <= 20)){

            signo.setText("Peixes"); // preenche o nome do signo
            imagem = (ImageIcon) imgSignoPeixes.getIcon(); // captura sua imagem

        }
        Image imgRedimensionada = imagem.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH); 
        
        // Para preencher o botão azul, substitua btnSigno pelo nome dele:
        btnSigno.setIcon(new ImageIcon(imgRedimensionada));
    } // fim do método CalcularSigno
    
    public void CalcularCompatibilidade(){

        // Capturar os dados da comboBox
        String signo1 = cbSigno1.getSelectedItem().toString();
        String signo2 = cbSigno2.getSelectedItem().toString();

        // ==================== ÁRIES ====================

        if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Touro")){
            tfCompatibilidade.setText("70% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Gêmeos")){
            tfCompatibilidade.setText("50% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Câncer")){
            tfCompatibilidade.setText("60% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Leão")){
            tfCompatibilidade.setText("90% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Virgem")){
            tfCompatibilidade.setText("55% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Libra")){
            tfCompatibilidade.setText("75% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Escorpião")){
            tfCompatibilidade.setText("65% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Sagitário")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Capricórnio")){
            tfCompatibilidade.setText("50% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Aquário")){
            tfCompatibilidade.setText("85% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Peixes")){
            tfCompatibilidade.setText("60% compatibilidade!");


        // ==================== TOURO ====================

        }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Áries")){
            tfCompatibilidade.setText("70% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Gêmeos")){
            tfCompatibilidade.setText("55% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Câncer")){
            tfCompatibilidade.setText("90% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Leão")){
            tfCompatibilidade.setText("65% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Virgem")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Libra")){
            tfCompatibilidade.setText("75% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Escorpião")){
            tfCompatibilidade.setText("85% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Sagitário")){
            tfCompatibilidade.setText("50% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Capricórnio")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Aquário")){
            tfCompatibilidade.setText("45% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Peixes")){
            tfCompatibilidade.setText("90% compatibilidade!");


        // ==================== GÊMEOS ====================

        }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Áries")){
            tfCompatibilidade.setText("50% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Touro")){
            tfCompatibilidade.setText("55% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Câncer")){
            tfCompatibilidade.setText("60% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Leão")){
            tfCompatibilidade.setText("85% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Virgem")){
            tfCompatibilidade.setText("65% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Libra")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Escorpião")){
            tfCompatibilidade.setText("45% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Sagitário")){
            tfCompatibilidade.setText("80% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Capricórnio")){
            tfCompatibilidade.setText("50% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Aquário")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Peixes")){
            tfCompatibilidade.setText("60% compatibilidade!");


        // ==================== CÂNCER ====================

        }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Áries")){
            tfCompatibilidade.setText("60% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Touro")){
            tfCompatibilidade.setText("90% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Gêmeos")){
            tfCompatibilidade.setText("60% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Leão")){
            tfCompatibilidade.setText("70% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Virgem")){
            tfCompatibilidade.setText("85% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Libra")){
            tfCompatibilidade.setText("65% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Escorpião")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Sagitário")){
            tfCompatibilidade.setText("50% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Capricórnio")){
            tfCompatibilidade.setText("80% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Aquário")){
            tfCompatibilidade.setText("45% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Peixes")){
            tfCompatibilidade.setText("95% compatibilidade!");


        // ==================== LEÃO ====================

        }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Áries")){
            tfCompatibilidade.setText("90% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Touro")){
            tfCompatibilidade.setText("65% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Gêmeos")){
            tfCompatibilidade.setText("85% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Câncer")){
            tfCompatibilidade.setText("70% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Virgem")){
            tfCompatibilidade.setText("60% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Libra")){
            tfCompatibilidade.setText("90% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Escorpião")){
            tfCompatibilidade.setText("65% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Sagitário")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Capricórnio")){
            tfCompatibilidade.setText("55% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Aquário")){
            tfCompatibilidade.setText("80% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Peixes")){
            tfCompatibilidade.setText("60% compatibilidade!");


        // ==================== VIRGEM ====================

        }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Áries")){
            tfCompatibilidade.setText("55% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Touro")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Gêmeos")){
            tfCompatibilidade.setText("65% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Câncer")){
            tfCompatibilidade.setText("85% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Leão")){
            tfCompatibilidade.setText("60% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Libra")){
            tfCompatibilidade.setText("70% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Escorpião")){
            tfCompatibilidade.setText("85% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Sagitário")){
            tfCompatibilidade.setText("55% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Capricórnio")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Aquário")){
            tfCompatibilidade.setText("60% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Peixes")){
            tfCompatibilidade.setText("90% compatibilidade!");


        // ==================== LIBRA ====================

        }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Áries")){
            tfCompatibilidade.setText("75% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Touro")){
            tfCompatibilidade.setText("75% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Gêmeos")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Câncer")){
            tfCompatibilidade.setText("65% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Leão")){
            tfCompatibilidade.setText("90% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Virgem")){
            tfCompatibilidade.setText("70% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Escorpião")){
            tfCompatibilidade.setText("70% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Sagitário")){
            tfCompatibilidade.setText("85% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Capricórnio")){
            tfCompatibilidade.setText("55% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Aquário")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Peixes")){
            tfCompatibilidade.setText("75% compatibilidade!");


        // ==================== ESCORPIÃO ====================

        }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Áries")){
            tfCompatibilidade.setText("65% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Touro")){
            tfCompatibilidade.setText("85% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Gêmeos")){
            tfCompatibilidade.setText("45% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Câncer")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Leão")){
            tfCompatibilidade.setText("65% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Virgem")){
            tfCompatibilidade.setText("85% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Libra")){
            tfCompatibilidade.setText("70% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Sagitário")){
            tfCompatibilidade.setText("60% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Capricórnio")){
            tfCompatibilidade.setText("90% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Aquário")){
            tfCompatibilidade.setText("50% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Peixes")){
            tfCompatibilidade.setText("95% compatibilidade!");


        // ==================== SAGITÁRIO ====================

        }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Áries")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Touro")){
            tfCompatibilidade.setText("50% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Gêmeos")){
            tfCompatibilidade.setText("80% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Câncer")){
            tfCompatibilidade.setText("50% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Leão")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Virgem")){
            tfCompatibilidade.setText("55% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Libra")){
            tfCompatibilidade.setText("85% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Escorpião")){
            tfCompatibilidade.setText("60% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Capricórnio")){
            tfCompatibilidade.setText("65% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Aquário")){
            tfCompatibilidade.setText("90% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Peixes")){
            tfCompatibilidade.setText("70% compatibilidade!");


        // ==================== CAPRICÓRNIO ====================

        }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Áries")){
            tfCompatibilidade.setText("50% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Touro")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Gêmeos")){
            tfCompatibilidade.setText("50% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Câncer")){
            tfCompatibilidade.setText("80% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Leão")){
            tfCompatibilidade.setText("55% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Virgem")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Libra")){
            tfCompatibilidade.setText("55% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Escorpião")){
            tfCompatibilidade.setText("90% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Sagitário")){
            tfCompatibilidade.setText("65% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Aquário")){
            tfCompatibilidade.setText("60% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Peixes")){
            tfCompatibilidade.setText("85% compatibilidade!");


        // ==================== AQUÁRIO ====================

        }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Áries")){
            tfCompatibilidade.setText("85% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Touro")){
            tfCompatibilidade.setText("45% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Gêmeos")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Câncer")){
            tfCompatibilidade.setText("45% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Leão")){
            tfCompatibilidade.setText("80% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Virgem")){
            tfCompatibilidade.setText("60% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Libra")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Escorpião")){
            tfCompatibilidade.setText("50% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Sagitário")){
            tfCompatibilidade.setText("90% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Capricórnio")){
            tfCompatibilidade.setText("60% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Peixes")){
            tfCompatibilidade.setText("65% compatibilidade!");


        // ==================== PEIXES ====================

        }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Áries")){
            tfCompatibilidade.setText("60% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Touro")){
            tfCompatibilidade.setText("90% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Gêmeos")){
            tfCompatibilidade.setText("60% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Câncer")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Leão")){
            tfCompatibilidade.setText("60% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Virgem")){
            tfCompatibilidade.setText("90% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Libra")){
            tfCompatibilidade.setText("75% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Escorpião")){
            tfCompatibilidade.setText("95% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Sagitário")){
            tfCompatibilidade.setText("70% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Capricórnio")){
            tfCompatibilidade.setText("85% compatibilidade!");

        }else if(signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Aquário")){
            tfCompatibilidade.setText("65% compatibilidade!");
        }
    }
    
    public void TocarMusica() {
    try {
        // Se a música já foi carregada, continuar a reprodução
        if (musica != null && musica.isOpen()) {
            musica.start();
            return;
        }

        // Localizar o arquivo dentro do projeto
        java.net.URL arquivo = getClass().getResource("/musica/asitwas.wav");

        if (arquivo == null) {
            JOptionPane.showMessageDialog(this, "Arquivo de música não encontrado!");
            return;
        }

        // Abrir o áudio e carregar a música
        try (AudioInputStream audio = AudioSystem.getAudioInputStream(arquivo)) {
            musica = AudioSystem.getClip();
            musica.open(audio);
        }

        // Iniciar a reprodução
        musica.start();

    } catch (Exception erro) {
        JOptionPane.showMessageDialog(
                this,
                "Erro ao tocar a música: " + erro.getMessage()
        );
    }
}// Fim do TocarMusica
    
    public void PausarMusica() {
    if (musica != null && musica.isOpen()) {
        // Pausar na posição atual
        musica.stop();
        }
    }// Fim do PausarMusica


    public void PararMusica() {
        if (musica != null && musica.isOpen()) {
            // Parar e voltar ao início
            musica.stop();
            musica.setFramePosition(0);
        }
    }// Fim do PararMusica
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        areaAbas = new javax.swing.JTabbedPane();
        inicio = new javax.swing.JPanel();
        areaResultado = new javax.swing.JPanel();
        signo = new javax.swing.JLabel();
        compatibilidade = new javax.swing.JLabel();
        btnSigno = new javax.swing.JButton();
        tfCompatibilidade = new javax.swing.JTextField();
        btnPlay = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        areaDescobrirSigno = new javax.swing.JPanel();
        Signo1 = new javax.swing.JLabel();
        tituloCompatibilidade1 = new javax.swing.JLabel();
        Signo2 = new javax.swing.JLabel();
        cbSigno1 = new javax.swing.JComboBox<>();
        cbSigno2 = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        areaDescobrirSigno1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        diaNascimento = new javax.swing.JLabel();
        mesNascimento = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        btnDescobrirSigno = new javax.swing.JButton();
        fundoInicio = new javax.swing.JLabel();
        aries = new javax.swing.JPanel();
        areaInformacoesAries = new javax.swing.JPanel();
        imgSignoAries = new javax.swing.JLabel();
        tituloAries = new javax.swing.JLabel();
        periodoAries = new javax.swing.JLabel();
        elementoAries = new javax.swing.JLabel();
        planetaAries = new javax.swing.JLabel();
        corAries = new javax.swing.JLabel();
        numeroAries = new javax.swing.JLabel();
        tfPeriodoAries = new javax.swing.JTextField();
        tfElementoAries = new javax.swing.JTextField();
        tfPlanetaAries = new javax.swing.JTextField();
        tfCorAries = new javax.swing.JTextField();
        tfNumeroAries = new javax.swing.JTextField();
        areaCaracteristicasAries = new javax.swing.JPanel();
        tituloCaracteristicasAries = new javax.swing.JLabel();
        pfortesAries = new javax.swing.JLabel();
        pMelhorarAries = new javax.swing.JLabel();
        txtFortesAries = new javax.swing.JScrollPane();
        txFortesAries = new javax.swing.JTextArea();
        txtMelhorarAries = new javax.swing.JScrollPane();
        txMelhorarAries = new javax.swing.JTextArea();
        areaEnergiaAries = new javax.swing.JPanel();
        tituloEnergiaAries = new javax.swing.JLabel();
        amorAries = new javax.swing.JLabel();
        trabalhoAries = new javax.swing.JLabel();
        saudeAries = new javax.swing.JLabel();
        sorteAries = new javax.swing.JLabel();
        tfAmorAries = new javax.swing.JTextField();
        tfTrabalhoAries = new javax.swing.JTextField();
        tfSaudeAries = new javax.swing.JTextField();
        tfSorteAries = new javax.swing.JTextField();
        areaPrevisoesAries = new javax.swing.JPanel();
        previsaoAries = new javax.swing.JLabel();
        btnPrevisaoAries = new javax.swing.JButton();
        txtPrevisaoAries = new javax.swing.JScrollPane();
        txPrevisaoAries = new javax.swing.JTextArea();
        areaMensagemAries = new javax.swing.JPanel();
        tituloMensagemAries = new javax.swing.JLabel();
        txtMensagemAries = new javax.swing.JScrollPane();
        txMensagemAries = new javax.swing.JTextArea();
        btnCopiarMsgAries = new javax.swing.JButton();
        fundoInicio2 = new javax.swing.JLabel();
        touro = new javax.swing.JPanel();
        areaInformacoesTouro = new javax.swing.JPanel();
        imgSignoTouro = new javax.swing.JLabel();
        tituloTouro = new javax.swing.JLabel();
        periodoTouro = new javax.swing.JLabel();
        elementoTouro = new javax.swing.JLabel();
        planetaTouro = new javax.swing.JLabel();
        corTouro = new javax.swing.JLabel();
        numeroTouro = new javax.swing.JLabel();
        tfPeriodoTouro = new javax.swing.JTextField();
        tfElementoTouro = new javax.swing.JTextField();
        tfPlanetaTouro = new javax.swing.JTextField();
        tfCorTouro = new javax.swing.JTextField();
        tfNumeroTouro = new javax.swing.JTextField();
        areaCaracteristicasTouro = new javax.swing.JPanel();
        tituloCaracteristicasTouro = new javax.swing.JLabel();
        pfortesTouro = new javax.swing.JLabel();
        pMelhorarTouro = new javax.swing.JLabel();
        txtFortesTouro = new javax.swing.JScrollPane();
        txFortesTouro = new javax.swing.JTextArea();
        txtMelhorarTouro = new javax.swing.JScrollPane();
        txMelhorarTouro = new javax.swing.JTextArea();
        areaEnergiaTouro = new javax.swing.JPanel();
        tituloEnergiaTouro = new javax.swing.JLabel();
        amorTouro = new javax.swing.JLabel();
        trabalhoTouro = new javax.swing.JLabel();
        saudeTouro = new javax.swing.JLabel();
        sorteTouro = new javax.swing.JLabel();
        tfAmorTouro = new javax.swing.JTextField();
        tfTrabalhoTouro = new javax.swing.JTextField();
        tfSaudeTouro = new javax.swing.JTextField();
        tfSorteTouro = new javax.swing.JTextField();
        areaPrevisoesTouro = new javax.swing.JPanel();
        previsaoTouro = new javax.swing.JLabel();
        btnPrevisaoTouro = new javax.swing.JButton();
        txtPrevisaoTouro = new javax.swing.JScrollPane();
        txPrevisaoTouro = new javax.swing.JTextArea();
        areaMensagemTouro = new javax.swing.JPanel();
        tituloMensagemTouro = new javax.swing.JLabel();
        txtMensagemTouro = new javax.swing.JScrollPane();
        txMensagemTouro = new javax.swing.JTextArea();
        btnCopiarMsgTouro = new javax.swing.JButton();
        fundoInicio3 = new javax.swing.JLabel();
        gemeos = new javax.swing.JPanel();
        areaInformacoesGemeos = new javax.swing.JPanel();
        imgSignoGemeos = new javax.swing.JLabel();
        tituloGemeos = new javax.swing.JLabel();
        periodoGemeos = new javax.swing.JLabel();
        elementoGemeos = new javax.swing.JLabel();
        planetaGemeos = new javax.swing.JLabel();
        corGemeos = new javax.swing.JLabel();
        numeroGemeos = new javax.swing.JLabel();
        tfPeriodoGemeos = new javax.swing.JTextField();
        tfElementoGemeos = new javax.swing.JTextField();
        tfPlanetaGemeos = new javax.swing.JTextField();
        tfCorGemeos = new javax.swing.JTextField();
        tfNumeroGemeos = new javax.swing.JTextField();
        areaCaracteristicasGemeos = new javax.swing.JPanel();
        tituloCaracteristicasGemeos = new javax.swing.JLabel();
        pfortesGemeos = new javax.swing.JLabel();
        pMelhorarGemeos = new javax.swing.JLabel();
        txtFortesGemeos = new javax.swing.JScrollPane();
        txFortesGemeos = new javax.swing.JTextArea();
        txtMelhorarGemeos = new javax.swing.JScrollPane();
        txMelhorarGemeos = new javax.swing.JTextArea();
        areaEnergiaGemeos = new javax.swing.JPanel();
        tituloEnergiaGemeos = new javax.swing.JLabel();
        amorGemeos = new javax.swing.JLabel();
        trabalhoGemeos = new javax.swing.JLabel();
        saudeGemeos = new javax.swing.JLabel();
        sorteGemeos = new javax.swing.JLabel();
        tfAmorGemeos = new javax.swing.JTextField();
        tfTrabalhoGemeos = new javax.swing.JTextField();
        tfSaudeGemeos = new javax.swing.JTextField();
        tfSorteGemeos = new javax.swing.JTextField();
        areaPrevisoesGemeos = new javax.swing.JPanel();
        previsaoGemeos = new javax.swing.JLabel();
        btnPrevisaoGemeos = new javax.swing.JButton();
        txtPrevisaoGemeos = new javax.swing.JScrollPane();
        txPrevisaoGemeos = new javax.swing.JTextArea();
        areaMensagemGemeos = new javax.swing.JPanel();
        tituloMensagemGemeos = new javax.swing.JLabel();
        txtMensagemGemeos = new javax.swing.JScrollPane();
        txMensagemGemeos = new javax.swing.JTextArea();
        btnCopiarMsgGemeos = new javax.swing.JButton();
        fundoInicio4 = new javax.swing.JLabel();
        cancer = new javax.swing.JPanel();
        areaInformacoesCancer = new javax.swing.JPanel();
        imgSignoCancer = new javax.swing.JLabel();
        tituloCancer = new javax.swing.JLabel();
        periodoCancer = new javax.swing.JLabel();
        elementoCancer = new javax.swing.JLabel();
        planetaCancer = new javax.swing.JLabel();
        corCancer = new javax.swing.JLabel();
        numeroCancer = new javax.swing.JLabel();
        tfPeriodoCancer = new javax.swing.JTextField();
        tfElementoCancer = new javax.swing.JTextField();
        tfPlanetaCancer = new javax.swing.JTextField();
        tfCorCancer = new javax.swing.JTextField();
        tfNumeroCancer = new javax.swing.JTextField();
        areaCaracteristicasCancer = new javax.swing.JPanel();
        tituloCaracteristicasCancer = new javax.swing.JLabel();
        pfortesCancer = new javax.swing.JLabel();
        pMelhorarCancer = new javax.swing.JLabel();
        txtFortesCancer = new javax.swing.JScrollPane();
        txFortesCancer = new javax.swing.JTextArea();
        txtMelhorarCancer = new javax.swing.JScrollPane();
        txMelhorarCancer = new javax.swing.JTextArea();
        areaEnergiaCancer = new javax.swing.JPanel();
        tituloEnergiaCancer = new javax.swing.JLabel();
        amorCancer = new javax.swing.JLabel();
        trabalhoCancer = new javax.swing.JLabel();
        saudeCancer = new javax.swing.JLabel();
        sorteCancer = new javax.swing.JLabel();
        tfAmorCancer = new javax.swing.JTextField();
        tfTrabalhoCancer = new javax.swing.JTextField();
        tfSaudeCancer = new javax.swing.JTextField();
        tfSorteCancer = new javax.swing.JTextField();
        areaPrevisoesCancer = new javax.swing.JPanel();
        previsaoCancer = new javax.swing.JLabel();
        btnPrevisaoCancer = new javax.swing.JButton();
        txtPrevisaoCancer = new javax.swing.JScrollPane();
        txPrevisaoCancer = new javax.swing.JTextArea();
        areaMensagemCancer = new javax.swing.JPanel();
        tituloMensagemCancer = new javax.swing.JLabel();
        txtMensagemCancer = new javax.swing.JScrollPane();
        txMensagemCancer = new javax.swing.JTextArea();
        btnCopiarMsgCancer = new javax.swing.JButton();
        fundoInicio5 = new javax.swing.JLabel();
        leao = new javax.swing.JPanel();
        areaInformacoesLeao = new javax.swing.JPanel();
        imgSignoLeao = new javax.swing.JLabel();
        tituloLeao = new javax.swing.JLabel();
        periodoLeao = new javax.swing.JLabel();
        elementoLeao = new javax.swing.JLabel();
        planetaLeao = new javax.swing.JLabel();
        corLeao = new javax.swing.JLabel();
        numeroLeao = new javax.swing.JLabel();
        tfPeriodoLeao = new javax.swing.JTextField();
        tfElementoLeao = new javax.swing.JTextField();
        tfPlanetaLeao = new javax.swing.JTextField();
        tfCorLeao = new javax.swing.JTextField();
        tfNumeroLeao = new javax.swing.JTextField();
        areaCaracteristicasLeao = new javax.swing.JPanel();
        tituloCaracteristicasLeao = new javax.swing.JLabel();
        pfortesLeao = new javax.swing.JLabel();
        pMelhorarLeao = new javax.swing.JLabel();
        txtFortesLeao = new javax.swing.JScrollPane();
        txFortesLeao = new javax.swing.JTextArea();
        txtMelhorarLeao = new javax.swing.JScrollPane();
        txMelhorarLeao = new javax.swing.JTextArea();
        areaEnergiaLeao = new javax.swing.JPanel();
        tituloEnergiaLeao = new javax.swing.JLabel();
        amorLeao = new javax.swing.JLabel();
        trabalhoLeao = new javax.swing.JLabel();
        saudeLeao = new javax.swing.JLabel();
        sorteLeao = new javax.swing.JLabel();
        tfAmorLeao = new javax.swing.JTextField();
        tfTrabalhoLeao = new javax.swing.JTextField();
        tfSaudeLeao = new javax.swing.JTextField();
        tfSorteLeao = new javax.swing.JTextField();
        areaPrevisoesLeao = new javax.swing.JPanel();
        previsaoLeao = new javax.swing.JLabel();
        btnPrevisaoLeao = new javax.swing.JButton();
        txtPrevisaoLeao = new javax.swing.JScrollPane();
        txPrevisaoLeao = new javax.swing.JTextArea();
        areaMensagemLeao = new javax.swing.JPanel();
        tituloMensagemLeao = new javax.swing.JLabel();
        txtMensagemLeao = new javax.swing.JScrollPane();
        txMensagemLeao = new javax.swing.JTextArea();
        btnCopiarMsgLeao = new javax.swing.JButton();
        fundoInicio6 = new javax.swing.JLabel();
        virgem = new javax.swing.JPanel();
        areaInformacoesVirgem = new javax.swing.JPanel();
        imgSignoVirgem = new javax.swing.JLabel();
        tituloVirgem = new javax.swing.JLabel();
        periodoVirgem = new javax.swing.JLabel();
        elementoAries5 = new javax.swing.JLabel();
        planetaVirgem = new javax.swing.JLabel();
        corVirgem = new javax.swing.JLabel();
        numeroVirgem = new javax.swing.JLabel();
        tfPeriodoVirgem = new javax.swing.JTextField();
        tfElementoVirgem = new javax.swing.JTextField();
        tfPlanetaVirgem = new javax.swing.JTextField();
        tfCorVirgem = new javax.swing.JTextField();
        tfNumeroVirgem = new javax.swing.JTextField();
        areaCaracteristicasVirgem = new javax.swing.JPanel();
        tituloCaracteristicasVirgem = new javax.swing.JLabel();
        pfortesVirgem = new javax.swing.JLabel();
        pMelhorarVirgem = new javax.swing.JLabel();
        txtFortesVirgem = new javax.swing.JScrollPane();
        txFortesVirgem = new javax.swing.JTextArea();
        txtMelhorarVirgem = new javax.swing.JScrollPane();
        txMelhorarVirgem = new javax.swing.JTextArea();
        areaEnergiaVirgem = new javax.swing.JPanel();
        tituloEnergiaVirgem = new javax.swing.JLabel();
        amorVirgem = new javax.swing.JLabel();
        trabalhoVirgem = new javax.swing.JLabel();
        saudeVirgem = new javax.swing.JLabel();
        sorteVirgem = new javax.swing.JLabel();
        tfAmorVirgem = new javax.swing.JTextField();
        tfTrabalhoVirgem = new javax.swing.JTextField();
        tfSaudeVirgem = new javax.swing.JTextField();
        tfSorteVirgem = new javax.swing.JTextField();
        areaPrevisoesVirgem = new javax.swing.JPanel();
        previsaoVirgem = new javax.swing.JLabel();
        btnPrevisaoVirgem = new javax.swing.JButton();
        txtPrevisaoVirgem = new javax.swing.JScrollPane();
        txPrevisaoVirgem = new javax.swing.JTextArea();
        areaMensagemVirgem = new javax.swing.JPanel();
        tituloMensagemVirgem = new javax.swing.JLabel();
        txtMensagemVirgem = new javax.swing.JScrollPane();
        txMensagemVirgem = new javax.swing.JTextArea();
        btnCopiarMsgVirgem = new javax.swing.JButton();
        fundoInicio7 = new javax.swing.JLabel();
        libra = new javax.swing.JPanel();
        areaInformacoesLibra = new javax.swing.JPanel();
        imgSignoLibra = new javax.swing.JLabel();
        tituloLibra = new javax.swing.JLabel();
        periodoLibra = new javax.swing.JLabel();
        elementoLibra = new javax.swing.JLabel();
        planetaLibra = new javax.swing.JLabel();
        corLibra = new javax.swing.JLabel();
        numeroLibra = new javax.swing.JLabel();
        tfPeriodoLibra = new javax.swing.JTextField();
        tfElementoLibra = new javax.swing.JTextField();
        tfPlanetaLibra = new javax.swing.JTextField();
        tfCorLibra = new javax.swing.JTextField();
        tfNumeroLibra = new javax.swing.JTextField();
        areaCaracteristicasLibra = new javax.swing.JPanel();
        tituloCaracteristicasLibra = new javax.swing.JLabel();
        pfortesLibra = new javax.swing.JLabel();
        pMelhorarLibra = new javax.swing.JLabel();
        txtFortesLibra = new javax.swing.JScrollPane();
        txFortesLibra = new javax.swing.JTextArea();
        txtMelhorarLibra = new javax.swing.JScrollPane();
        txMelhorarLibra = new javax.swing.JTextArea();
        areaEnergiaLibra = new javax.swing.JPanel();
        tituloEnergiaLibra = new javax.swing.JLabel();
        amorLibra = new javax.swing.JLabel();
        trabalhoLibra = new javax.swing.JLabel();
        saudeLibra = new javax.swing.JLabel();
        sorteLibra = new javax.swing.JLabel();
        tfAmorLibra = new javax.swing.JTextField();
        tfTrabalhoLibra = new javax.swing.JTextField();
        tfSaudeLibra = new javax.swing.JTextField();
        tfSorteLibra = new javax.swing.JTextField();
        areaPrevisoesLibra = new javax.swing.JPanel();
        previsaoLibra = new javax.swing.JLabel();
        btnPrevisaoLibra = new javax.swing.JButton();
        txtPrevisaoLibra = new javax.swing.JScrollPane();
        txPrevisaoLibra = new javax.swing.JTextArea();
        areaMensagemLibra = new javax.swing.JPanel();
        tituloMensagemLibra = new javax.swing.JLabel();
        txtMensagemLibra = new javax.swing.JScrollPane();
        txMensagemLibra = new javax.swing.JTextArea();
        btnCopiarMsgLibra = new javax.swing.JButton();
        fundoInicio8 = new javax.swing.JLabel();
        escorpiao = new javax.swing.JPanel();
        areaInformacoesEscorpiao = new javax.swing.JPanel();
        imgSignoEscorpiao = new javax.swing.JLabel();
        tituloEscorpiao = new javax.swing.JLabel();
        periodoEscorpiao = new javax.swing.JLabel();
        elementoEscorpiao = new javax.swing.JLabel();
        planetaEscorpiao = new javax.swing.JLabel();
        corEscorpiao = new javax.swing.JLabel();
        numeroEscorpiao = new javax.swing.JLabel();
        tfPeriodoEscorpiao = new javax.swing.JTextField();
        tfElementoEscorpiao = new javax.swing.JTextField();
        tfPlanetaEscorpiao = new javax.swing.JTextField();
        tfCorEscorpiao = new javax.swing.JTextField();
        tfNumeroEscorpiao = new javax.swing.JTextField();
        areaCaracteristicasEscorpiao = new javax.swing.JPanel();
        tituloCaracteristicasEscorpiao = new javax.swing.JLabel();
        pfortesEscorpiao = new javax.swing.JLabel();
        pMelhorarEscorpiao = new javax.swing.JLabel();
        txtFortesEscorpiao = new javax.swing.JScrollPane();
        txFortesEscorpiao = new javax.swing.JTextArea();
        txtMelhorarEscorpiao = new javax.swing.JScrollPane();
        txMelhorarEscorpiao = new javax.swing.JTextArea();
        areaEnergiaEscorpiao = new javax.swing.JPanel();
        tituloEnergiaEscorpiao = new javax.swing.JLabel();
        amorEscorpiao = new javax.swing.JLabel();
        trabalhoEscorpiao = new javax.swing.JLabel();
        saudeEscorpiao = new javax.swing.JLabel();
        sorteEscorpiao = new javax.swing.JLabel();
        tfAmorEscorpiao = new javax.swing.JTextField();
        tfTrabalhoEscorpiao = new javax.swing.JTextField();
        tfSaudeEscorpiao = new javax.swing.JTextField();
        tfSorteEscorpiao = new javax.swing.JTextField();
        areaPrevisoesEscorpiao = new javax.swing.JPanel();
        previsaoEscorpiao = new javax.swing.JLabel();
        btnPrevisaoEscorpiao = new javax.swing.JButton();
        txtPrevisaoEscorpiao = new javax.swing.JScrollPane();
        txPrevisaoEscorpiao = new javax.swing.JTextArea();
        areaMensagemEscorpiao = new javax.swing.JPanel();
        tituloMensagemEscorpiao = new javax.swing.JLabel();
        txtMensagemEscorpiao = new javax.swing.JScrollPane();
        txMensagemEscorpiao = new javax.swing.JTextArea();
        btnCopiarMsgEscorpiao = new javax.swing.JButton();
        fundoInicio9 = new javax.swing.JLabel();
        sagitario = new javax.swing.JPanel();
        areaInformacoesSagitario = new javax.swing.JPanel();
        imgSignoSagitario = new javax.swing.JLabel();
        tituloSagitario = new javax.swing.JLabel();
        periodoSagitario = new javax.swing.JLabel();
        elementoSagitario = new javax.swing.JLabel();
        planetaSagitario = new javax.swing.JLabel();
        corSagitario = new javax.swing.JLabel();
        numeroSagitario = new javax.swing.JLabel();
        tfPeriodoSagitario = new javax.swing.JTextField();
        tfElementoSagitario = new javax.swing.JTextField();
        tfPlanetaSagitario = new javax.swing.JTextField();
        tfCorSagitario = new javax.swing.JTextField();
        tfNumeroSagitario = new javax.swing.JTextField();
        areaCaracteristicasSagitario = new javax.swing.JPanel();
        tituloCaracteristicasSagitario = new javax.swing.JLabel();
        pfortesSagitario = new javax.swing.JLabel();
        pMelhorarSagitario = new javax.swing.JLabel();
        txtFortesSagitario = new javax.swing.JScrollPane();
        txFortesSagitario = new javax.swing.JTextArea();
        txtMelhorarSagitario = new javax.swing.JScrollPane();
        txMelhorarSagitario = new javax.swing.JTextArea();
        areaEnergiaSagitario = new javax.swing.JPanel();
        tituloEnergiaSagitario = new javax.swing.JLabel();
        amorSagitario = new javax.swing.JLabel();
        trabalhoSagitario = new javax.swing.JLabel();
        saudeSagitario = new javax.swing.JLabel();
        sorteSagitario = new javax.swing.JLabel();
        tfAmorSagitario = new javax.swing.JTextField();
        tfTrabalhoSagitario = new javax.swing.JTextField();
        tfSaudeSagitario = new javax.swing.JTextField();
        tfSorteSagitario = new javax.swing.JTextField();
        areaPrevisoesSagitario = new javax.swing.JPanel();
        previsaoSagitario = new javax.swing.JLabel();
        btnPrevisaoSagitario = new javax.swing.JButton();
        txtPrevisaoSagitario = new javax.swing.JScrollPane();
        txPrevisaoSagitario = new javax.swing.JTextArea();
        areaMensagemSagitario = new javax.swing.JPanel();
        tituloMensagemSagitario = new javax.swing.JLabel();
        txtMensagemSagitario = new javax.swing.JScrollPane();
        txMensagemSagitario = new javax.swing.JTextArea();
        btnCopiarMsgSagitario = new javax.swing.JButton();
        fundoInicio10 = new javax.swing.JLabel();
        capricornio = new javax.swing.JPanel();
        areaInformacoesCapricornio = new javax.swing.JPanel();
        imgSignoCapricornio = new javax.swing.JLabel();
        tituloCapricornio = new javax.swing.JLabel();
        periodoCapricornio = new javax.swing.JLabel();
        elementoCapricornio = new javax.swing.JLabel();
        planetaCapricornio = new javax.swing.JLabel();
        corCapricornio = new javax.swing.JLabel();
        numeroCapricornio = new javax.swing.JLabel();
        tfPeriodoCapricornio = new javax.swing.JTextField();
        tfElementoCapricornio = new javax.swing.JTextField();
        tfPlanetaCapricornio = new javax.swing.JTextField();
        tfCorCapricornio = new javax.swing.JTextField();
        tfNumeroCapricornio = new javax.swing.JTextField();
        areaCaracteristicasCapricornio = new javax.swing.JPanel();
        tituloCaracteristicasCapricornio = new javax.swing.JLabel();
        pfortesCapricornio = new javax.swing.JLabel();
        pMelhorarCapricornio = new javax.swing.JLabel();
        txtFortesCapricornio = new javax.swing.JScrollPane();
        txFortesCapricornio = new javax.swing.JTextArea();
        txtMelhorarCapricornio = new javax.swing.JScrollPane();
        txMelhorarCapricornio = new javax.swing.JTextArea();
        areaEnergiaCapricornio = new javax.swing.JPanel();
        tituloEnergiaCapricornio = new javax.swing.JLabel();
        amorCapricornio = new javax.swing.JLabel();
        trabalhoCapricornio = new javax.swing.JLabel();
        saudeCapricornio = new javax.swing.JLabel();
        sorteCapricornio = new javax.swing.JLabel();
        tfAmorCapricornio = new javax.swing.JTextField();
        tfTrabalhoCapricornio = new javax.swing.JTextField();
        tfSaudeCapricornio = new javax.swing.JTextField();
        tfSorteCapricornio = new javax.swing.JTextField();
        areaPrevisoesCapricornio = new javax.swing.JPanel();
        previsaoCapricornio = new javax.swing.JLabel();
        btnPrevisaoCapricornio = new javax.swing.JButton();
        txtPrevisaoCapricornio = new javax.swing.JScrollPane();
        txPrevisaoCapricornio = new javax.swing.JTextArea();
        areaMensagemCapricornio = new javax.swing.JPanel();
        tituloMensagemCapricornio = new javax.swing.JLabel();
        txtMensagemCapricornio = new javax.swing.JScrollPane();
        txMensagemCapricornio = new javax.swing.JTextArea();
        btnCopiarMsgCapricornio = new javax.swing.JButton();
        fundoInicio11 = new javax.swing.JLabel();
        aquario = new javax.swing.JPanel();
        areaInformacoesAquario = new javax.swing.JPanel();
        imgSignoAquario = new javax.swing.JLabel();
        tituloAquario = new javax.swing.JLabel();
        periodoAquario = new javax.swing.JLabel();
        elementoAquario = new javax.swing.JLabel();
        planetaAquario = new javax.swing.JLabel();
        corAquario = new javax.swing.JLabel();
        numeroAquario = new javax.swing.JLabel();
        tfPeriodoAquario = new javax.swing.JTextField();
        tfElementoAquario = new javax.swing.JTextField();
        tfPlanetaAquario = new javax.swing.JTextField();
        tfCorAquario = new javax.swing.JTextField();
        tfNumeroAquario = new javax.swing.JTextField();
        areaCaracteristicasAquario = new javax.swing.JPanel();
        tituloCaracteristicasAquario = new javax.swing.JLabel();
        pfortesAquario = new javax.swing.JLabel();
        pMelhorarAquario = new javax.swing.JLabel();
        txtFortesAquario = new javax.swing.JScrollPane();
        txFortesAquario = new javax.swing.JTextArea();
        txtMelhorarAquario = new javax.swing.JScrollPane();
        txMelhorarAquario = new javax.swing.JTextArea();
        areaEnergiaAquario = new javax.swing.JPanel();
        tituloEnergiaAquario = new javax.swing.JLabel();
        amorAquario = new javax.swing.JLabel();
        trabalhoAquario = new javax.swing.JLabel();
        saudeAquario = new javax.swing.JLabel();
        sorteAquario = new javax.swing.JLabel();
        tfAmorAquario = new javax.swing.JTextField();
        tfTrabalhoAquario = new javax.swing.JTextField();
        tfSaudeAquario = new javax.swing.JTextField();
        tfSorteAquario = new javax.swing.JTextField();
        areaPrevisoesAquario = new javax.swing.JPanel();
        previsaoAquario = new javax.swing.JLabel();
        btnPrevisaoAquario = new javax.swing.JButton();
        txtPrevisaoAquario = new javax.swing.JScrollPane();
        txPrevisaoAquario = new javax.swing.JTextArea();
        areaMensagemAquario = new javax.swing.JPanel();
        tituloMensagemAquario = new javax.swing.JLabel();
        txtMensagemAquario = new javax.swing.JScrollPane();
        txMensagemAquario = new javax.swing.JTextArea();
        btnCopiarMsgAquario = new javax.swing.JButton();
        fundoInicio12 = new javax.swing.JLabel();
        peixes = new javax.swing.JPanel();
        areaInformacoesPeixes = new javax.swing.JPanel();
        imgSignoPeixes = new javax.swing.JLabel();
        tituloPeixes = new javax.swing.JLabel();
        periodoPeixes = new javax.swing.JLabel();
        elementoPeixes = new javax.swing.JLabel();
        planetaPeixes = new javax.swing.JLabel();
        corPeixes = new javax.swing.JLabel();
        numeroPeixes = new javax.swing.JLabel();
        tfPeriodoPeixes = new javax.swing.JTextField();
        tfElementoPeixes = new javax.swing.JTextField();
        tfPlanetaPeixes = new javax.swing.JTextField();
        tfCorPeixes = new javax.swing.JTextField();
        tfNumeroPeixes = new javax.swing.JTextField();
        areaCaracteristicasPeixes = new javax.swing.JPanel();
        tituloCaracteristicasPeixes = new javax.swing.JLabel();
        pfortesPeixes = new javax.swing.JLabel();
        pMelhorarPeixes = new javax.swing.JLabel();
        txtFortesPeixes = new javax.swing.JScrollPane();
        txFortesPeixes = new javax.swing.JTextArea();
        txtMelhorarPeixes = new javax.swing.JScrollPane();
        txMelhorarPeixes = new javax.swing.JTextArea();
        areaEnergiaPeixes = new javax.swing.JPanel();
        tituloEnergiaPeixes = new javax.swing.JLabel();
        amorPeixes = new javax.swing.JLabel();
        trabalhoPeixes = new javax.swing.JLabel();
        saudePeixes = new javax.swing.JLabel();
        sortePeixes = new javax.swing.JLabel();
        tfAmorPeixes = new javax.swing.JTextField();
        tfTrabalhoPeixes = new javax.swing.JTextField();
        tfSaudePeixes = new javax.swing.JTextField();
        tfSortePeixes = new javax.swing.JTextField();
        areaPrevisoesPeixes = new javax.swing.JPanel();
        previsaoPeixes = new javax.swing.JLabel();
        btnPrevisaoPeixes = new javax.swing.JButton();
        txtPrevisaoPeixes = new javax.swing.JScrollPane();
        txPrevisaoPeixes = new javax.swing.JTextArea();
        areaMensagemPeixes = new javax.swing.JPanel();
        tituloMensagemAries11 = new javax.swing.JLabel();
        txtMensagemPeixes = new javax.swing.JScrollPane();
        txMensagemPeixes = new javax.swing.JTextArea();
        btnCopiarMsgPeixes = new javax.swing.JButton();
        fundoInicio13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        areaAbas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        inicio.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        signo.setText("Signo");

        compatibilidade.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        compatibilidade.setText("Compatibilidade");

        btnSigno.addActionListener(this::btnSignoActionPerformed);

        tfCompatibilidade.addActionListener(this::tfCompatibilidadeActionPerformed);

        btnPlay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlay.setText("Play");
        btnPlay.addActionListener(this::btnPlayActionPerformed);

        btnPause.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPause.setText("Pause");
        btnPause.addActionListener(this::btnPauseActionPerformed);

        javax.swing.GroupLayout areaResultadoLayout = new javax.swing.GroupLayout(areaResultado);
        areaResultado.setLayout(areaResultadoLayout);
        areaResultadoLayout.setHorizontalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(signo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaResultadoLayout.createSequentialGroup()
                        .addComponent(btnSigno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(areaResultadoLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(compatibilidade)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfCompatibilidade)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaResultadoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnPlay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btnPause)
                .addGap(46, 46, 46))
        );
        areaResultadoLayout.setVerticalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(signo)
                .addGap(62, 62, 62)
                .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(compatibilidade)
                .addGap(30, 30, 30)
                .addComponent(tfCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlay)
                    .addComponent(btnPause))
                .addGap(26, 26, 26))
        );

        inicio.add(areaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 40, 310, 740));

        Signo1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Signo1.setText("Primeiro Signo:");

        tituloCompatibilidade1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        tituloCompatibilidade1.setText("Compatibilidade");

        Signo2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Signo2.setText("Segundo Signo:");

        cbSigno1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes" }));

        cbSigno2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes" }));
        cbSigno2.addActionListener(this::cbSigno2ActionPerformed);

        btnCalcular.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(this::btnCalcularActionPerformed);

        javax.swing.GroupLayout areaDescobrirSignoLayout = new javax.swing.GroupLayout(areaDescobrirSigno);
        areaDescobrirSigno.setLayout(areaDescobrirSignoLayout);
        areaDescobrirSignoLayout.setHorizontalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addComponent(Signo1)
                                .addGap(18, 18, 18)
                                .addComponent(cbSigno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addComponent(Signo2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSigno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(tituloCompatibilidade1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaDescobrirSignoLayout.setVerticalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloCompatibilidade1)
                .addGap(41, 41, 41)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Signo1)
                    .addComponent(cbSigno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Signo2)
                    .addComponent(cbSigno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18))
        );

        inicio.add(areaDescobrirSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 410, 250));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setText("Descubra seu signo");

        nome.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        nome.setText("Nome:");

        diaNascimento.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        diaNascimento.setText("Dia de Nascimento:");

        mesNascimento.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        mesNascimento.setText("Mês de Nascimento:");

        tfNome.setText("digite seu nome");

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbDia.addActionListener(this::cbDiaActionPerformed);

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        btnDescobrirSigno.setText("Descobrir signo");
        btnDescobrirSigno.addActionListener(this::btnDescobrirSignoActionPerformed);

        javax.swing.GroupLayout areaDescobrirSigno1Layout = new javax.swing.GroupLayout(areaDescobrirSigno1);
        areaDescobrirSigno1.setLayout(areaDescobrirSigno1Layout);
        areaDescobrirSigno1Layout.setHorizontalGroup(
            areaDescobrirSigno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaDescobrirSigno1Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(areaDescobrirSigno1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(areaDescobrirSigno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDescobrirSigno)
                    .addGroup(areaDescobrirSigno1Layout.createSequentialGroup()
                        .addGroup(areaDescobrirSigno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaDescobrirSigno1Layout.createSequentialGroup()
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNome))
                            .addGroup(areaDescobrirSigno1Layout.createSequentialGroup()
                                .addComponent(diaNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaDescobrirSigno1Layout.createSequentialGroup()
                        .addComponent(mesNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaDescobrirSigno1Layout.setVerticalGroup(
            areaDescobrirSigno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSigno1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(areaDescobrirSigno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaDescobrirSigno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaNascimento)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaDescobrirSigno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesNascimento)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnDescobrirSigno)
                .addGap(42, 42, 42))
        );

        inicio.add(areaDescobrirSigno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 410, 290));

        fundoInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\plano de fundo.png")); // NOI18N
        inicio.add(fundoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        areaAbas.addTab("Início", inicio);

        aries.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\áries.png")); // NOI18N

        tituloAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloAries.setText("ÁRIES");

        periodoAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        periodoAries.setText("PERÍODO:");

        elementoAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        elementoAries.setText("ELEMENTO:");

        planetaAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        planetaAries.setText("PLANETA REGENTE:");

        corAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        corAries.setText("COR:");

        numeroAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numeroAries.setText("NÚMERO DA SORTE:");

        tfPeriodoAries.setText("21/03 a 19/04");
        tfPeriodoAries.addActionListener(this::tfPeriodoAriesActionPerformed);

        tfElementoAries.setText("Fogo");

        tfPlanetaAries.setText("Marte");

        tfCorAries.setText("Vermelho");
        tfCorAries.addActionListener(this::tfCorAriesActionPerformed);

        tfNumeroAries.setText("9");
        tfNumeroAries.addActionListener(this::tfNumeroAriesActionPerformed);

        javax.swing.GroupLayout areaInformacoesAriesLayout = new javax.swing.GroupLayout(areaInformacoesAries);
        areaInformacoesAries.setLayout(areaInformacoesAriesLayout);
        areaInformacoesAriesLayout.setHorizontalGroup(
            areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                        .addComponent(tituloAries)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                        .addComponent(elementoAries)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfElementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                        .addComponent(planetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAriesLayout.createSequentialGroup()
                            .addComponent(numeroAries)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNumeroAries))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAriesLayout.createSequentialGroup()
                            .addComponent(corAries)
                            .addGap(18, 18, 18)
                            .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                        .addComponent(periodoAries)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        areaInformacoesAriesLayout.setVerticalGroup(
            areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAries)
                    .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAries)
                    .addComponent(tfElementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAries)
                    .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAries)
                    .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAries)
                    .addComponent(tfNumeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        aries.add(areaInformacoesAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 270, 730));

        tituloCaracteristicasAries.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloCaracteristicasAries.setText("Características");

        pfortesAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesAries.setText("Pontos Fortes:");

        pMelhorarAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pMelhorarAries.setText("Pontos a Melhorar:");

        txFortesAries.setColumns(20);
        txFortesAries.setRows(5);
        txFortesAries.setText("Coragem, iniciativa e determinação. Gosta de novos desafios, demonstra entusiasmo e tem facilidade para tomar a frente de projetos.");
        txtFortesAries.setViewportView(txFortesAries);

        txMelhorarAries.setColumns(20);
        txMelhorarAries.setRows(5);
        txMelhorarAries.setText("Desenvolver a paciência, controlar a impulsividade e ouvir outras opiniões. Refletir antes de agir pode evitar conflitos.");
        txtMelhorarAries.setViewportView(txMelhorarAries);

        javax.swing.GroupLayout areaCaracteristicasAriesLayout = new javax.swing.GroupLayout(areaCaracteristicasAries);
        areaCaracteristicasAries.setLayout(areaCaracteristicasAriesLayout);
        areaCaracteristicasAriesLayout.setHorizontalGroup(
            areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAriesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pfortesAries)
                    .addComponent(pMelhorarAries)
                    .addComponent(txtFortesAries, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtMelhorarAries))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCaracteristicasAriesLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(tituloCaracteristicasAries, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        areaCaracteristicasAriesLayout.setVerticalGroup(
            areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAriesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloCaracteristicasAries)
                .addGap(18, 18, 18)
                .addComponent(pfortesAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFortesAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMelhorarAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aries.add(areaCaracteristicasAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 370, 350));

        tituloEnergiaAries.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloEnergiaAries.setText("Energia do Dia");

        amorAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amorAries.setText("Amor:");

        trabalhoAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trabalhoAries.setText("Trabalho:");

        saudeAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saudeAries.setText("Saúde:");

        sorteAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sorteAries.setText("Sorte:");

        tfAmorAries.setText("85%");
        tfAmorAries.addActionListener(this::tfAmorAriesActionPerformed);

        tfTrabalhoAries.setText("90%");

        tfSaudeAries.setText("75%");

        tfSorteAries.setText("80%");

        javax.swing.GroupLayout areaEnergiaAriesLayout = new javax.swing.GroupLayout(areaEnergiaAries);
        areaEnergiaAries.setLayout(areaEnergiaAriesLayout);
        areaEnergiaAriesLayout.setHorizontalGroup(
            areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                        .addGroup(areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amorAries)
                            .addComponent(trabalhoAries)
                            .addComponent(saudeAries)
                            .addComponent(sorteAries))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaEnergiaAriesLayout.createSequentialGroup()
                        .addGroup(areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfSorteAries, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSaudeAries, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTrabalhoAries, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAmorAries, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(tituloEnergiaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))))
        );
        areaEnergiaAriesLayout.setVerticalGroup(
            areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloEnergiaAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(trabalhoAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTrabalhoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(saudeAries)
                .addGap(11, 11, 11)
                .addComponent(tfSaudeAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        aries.add(areaEnergiaAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 370, 350));

        previsaoAries.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        previsaoAries.setText("Previsão do Dia");

        btnPrevisaoAries.setBackground(new java.awt.Color(0, 51, 102));
        btnPrevisaoAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPrevisaoAries.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevisaoAries.setText("Atualizar Previsão");
        btnPrevisaoAries.addActionListener(this::btnPrevisaoAriesActionPerformed);

        txPrevisaoAries.setColumns(20);
        txPrevisaoAries.setRows(5);
        txtPrevisaoAries.setViewportView(txPrevisaoAries);

        javax.swing.GroupLayout areaPrevisoesAriesLayout = new javax.swing.GroupLayout(areaPrevisoesAries);
        areaPrevisoesAries.setLayout(areaPrevisoesAriesLayout);
        areaPrevisoesAriesLayout.setHorizontalGroup(
            areaPrevisoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesAriesLayout.createSequentialGroup()
                .addGroup(areaPrevisoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesAriesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtPrevisaoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisoesAriesLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(previsaoAries))
                    .addGroup(areaPrevisoesAriesLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnPrevisaoAries)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoesAriesLayout.setVerticalGroup(
            areaPrevisoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesAriesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrevisaoAries, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevisaoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        aries.add(areaPrevisoesAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 370, 290));

        tituloMensagemAries.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloMensagemAries.setText("Mensagem do Dia");

        txMensagemAries.setColumns(20);
        txMensagemAries.setRows(5);
        txtMensagemAries.setViewportView(txMensagemAries);

        btnCopiarMsgAries.setBackground(new java.awt.Color(0, 51, 102));
        btnCopiarMsgAries.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgAries.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgAries.setText("Copiar Mensagem");
        btnCopiarMsgAries.addActionListener(this::btnCopiarMsgAriesActionPerformed);

        javax.swing.GroupLayout areaMensagemAriesLayout = new javax.swing.GroupLayout(areaMensagemAries);
        areaMensagemAries.setLayout(areaMensagemAriesLayout);
        areaMensagemAriesLayout.setHorizontalGroup(
            areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                .addGroup(areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnCopiarMsgAries))
                    .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(tituloMensagemAries)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        areaMensagemAriesLayout.setVerticalGroup(
            areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloMensagemAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgAries, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        aries.add(areaMensagemAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 370, 290));

        fundoInicio2.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\plano de fundo.png")); // NOI18N
        aries.add(fundoInicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Áries", aries);

        touro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\touro.png")); // NOI18N

        tituloTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloTouro.setText("TOURO");

        periodoTouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        periodoTouro.setText("PERÍODO:");

        elementoTouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        elementoTouro.setText("ELEMENTO:");

        planetaTouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        planetaTouro.setText("PLANETA REGENTE:");

        corTouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        corTouro.setText("COR:");

        numeroTouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numeroTouro.setText("NÚMERO DA SORTE:");

        tfPeriodoTouro.setText("20/04 a 20/05");
        tfPeriodoTouro.addActionListener(this::tfPeriodoTouroActionPerformed);

        tfElementoTouro.setText("Terra");

        tfPlanetaTouro.setText("Vênus");

        tfCorTouro.setText("Verde");
        tfCorTouro.addActionListener(this::tfCorTouroActionPerformed);

        tfNumeroTouro.setText("6");
        tfNumeroTouro.addActionListener(this::tfNumeroTouroActionPerformed);

        javax.swing.GroupLayout areaInformacoesTouroLayout = new javax.swing.GroupLayout(areaInformacoesTouro);
        areaInformacoesTouro.setLayout(areaInformacoesTouroLayout);
        areaInformacoesTouroLayout.setHorizontalGroup(
            areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                        .addComponent(tituloTouro)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                        .addComponent(elementoTouro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfElementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                        .addComponent(planetaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPlanetaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesTouroLayout.createSequentialGroup()
                            .addComponent(numeroTouro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNumeroTouro))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesTouroLayout.createSequentialGroup()
                            .addComponent(corTouro)
                            .addGap(18, 18, 18)
                            .addComponent(tfCorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                        .addComponent(periodoTouro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        areaInformacoesTouroLayout.setVerticalGroup(
            areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoTouro)
                    .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoTouro)
                    .addComponent(tfElementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaTouro)
                    .addComponent(tfPlanetaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corTouro)
                    .addComponent(tfCorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroTouro)
                    .addComponent(tfNumeroTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        touro.add(areaInformacoesTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 270, 730));

        tituloCaracteristicasTouro.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloCaracteristicasTouro.setText("Características");

        pfortesTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesTouro.setText("Pontos Fortes:");

        pMelhorarTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pMelhorarTouro.setText("Pontos a Melhorar:");

        txFortesTouro.setColumns(20);
        txFortesTouro.setRows(5);
        txFortesTouro.setText("Determinação, lealdade e estabilidade. Valoriza segurança, conforto e costuma persistir até alcançar seus objetivos.");
        txtFortesTouro.setViewportView(txFortesTouro);

        txMelhorarTouro.setColumns(20);
        txMelhorarTouro.setRows(5);
        txMelhorarTouro.setText("Evitar a teimosia e estar mais aberto a mudanças. Flexibilidade pode ajudar a lidar melhor com situações inesperadas.");
        txtMelhorarTouro.setViewportView(txMelhorarTouro);

        javax.swing.GroupLayout areaCaracteristicasTouroLayout = new javax.swing.GroupLayout(areaCaracteristicasTouro);
        areaCaracteristicasTouro.setLayout(areaCaracteristicasTouroLayout);
        areaCaracteristicasTouroLayout.setHorizontalGroup(
            areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pfortesTouro)
                    .addComponent(pMelhorarTouro)
                    .addComponent(txtFortesTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtMelhorarTouro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCaracteristicasTouroLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(tituloCaracteristicasTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        areaCaracteristicasTouroLayout.setVerticalGroup(
            areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloCaracteristicasTouro)
                .addGap(18, 18, 18)
                .addComponent(pfortesTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFortesTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMelhorarTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        touro.add(areaCaracteristicasTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 370, 350));

        tituloEnergiaTouro.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloEnergiaTouro.setText("Energia do Dia");

        amorTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amorTouro.setText("Amor:");

        trabalhoTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trabalhoTouro.setText("Trabalho:");

        saudeTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saudeTouro.setText("Saúde:");

        sorteTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sorteTouro.setText("Sorte:");

        tfAmorTouro.setText("90%");
        tfAmorTouro.addActionListener(this::tfAmorTouroActionPerformed);

        tfTrabalhoTouro.setText("85%");

        tfSaudeTouro.setText("80%");

        tfSorteTouro.setText("75%");

        javax.swing.GroupLayout areaEnergiaTouroLayout = new javax.swing.GroupLayout(areaEnergiaTouro);
        areaEnergiaTouro.setLayout(areaEnergiaTouroLayout);
        areaEnergiaTouroLayout.setHorizontalGroup(
            areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                        .addGroup(areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amorTouro)
                            .addComponent(trabalhoTouro)
                            .addComponent(saudeTouro)
                            .addComponent(sorteTouro))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaEnergiaTouroLayout.createSequentialGroup()
                        .addGroup(areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfSorteTouro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSaudeTouro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTrabalhoTouro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAmorTouro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(tituloEnergiaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))))
        );
        areaEnergiaTouroLayout.setVerticalGroup(
            areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloEnergiaTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(trabalhoTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTrabalhoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(saudeTouro)
                .addGap(11, 11, 11)
                .addComponent(tfSaudeTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        touro.add(areaEnergiaTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 370, 350));

        previsaoTouro.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        previsaoTouro.setText("Previsão do Dia");

        btnPrevisaoTouro.setBackground(new java.awt.Color(0, 51, 102));
        btnPrevisaoTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPrevisaoTouro.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevisaoTouro.setText("Atualizar Previsão");
        btnPrevisaoTouro.addActionListener(this::btnPrevisaoTouroActionPerformed);

        txPrevisaoTouro.setColumns(20);
        txPrevisaoTouro.setRows(5);
        txtPrevisaoTouro.setViewportView(txPrevisaoTouro);

        javax.swing.GroupLayout areaPrevisoesTouroLayout = new javax.swing.GroupLayout(areaPrevisoesTouro);
        areaPrevisoesTouro.setLayout(areaPrevisoesTouroLayout);
        areaPrevisoesTouroLayout.setHorizontalGroup(
            areaPrevisoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesTouroLayout.createSequentialGroup()
                .addGroup(areaPrevisoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesTouroLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtPrevisaoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisoesTouroLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(previsaoTouro))
                    .addGroup(areaPrevisoesTouroLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnPrevisaoTouro)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoesTouroLayout.setVerticalGroup(
            areaPrevisoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesTouroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrevisaoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevisaoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        touro.add(areaPrevisoesTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 370, 290));

        tituloMensagemTouro.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloMensagemTouro.setText("Mensagem do Dia");

        txMensagemTouro.setColumns(20);
        txMensagemTouro.setRows(5);
        txtMensagemTouro.setViewportView(txMensagemTouro);

        btnCopiarMsgTouro.setBackground(new java.awt.Color(0, 51, 102));
        btnCopiarMsgTouro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgTouro.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgTouro.setText("Copiar Mensagem");
        btnCopiarMsgTouro.addActionListener(this::btnCopiarMsgTouroActionPerformed);

        javax.swing.GroupLayout areaMensagemTouroLayout = new javax.swing.GroupLayout(areaMensagemTouro);
        areaMensagemTouro.setLayout(areaMensagemTouroLayout);
        areaMensagemTouroLayout.setHorizontalGroup(
            areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                .addGroup(areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnCopiarMsgTouro))
                    .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(tituloMensagemTouro)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        areaMensagemTouroLayout.setVerticalGroup(
            areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloMensagemTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        touro.add(areaMensagemTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 370, 290));

        fundoInicio3.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\plano de fundo.png")); // NOI18N
        touro.add(fundoInicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Touro", touro);

        gemeos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\gêmeos.png")); // NOI18N

        tituloGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloGemeos.setText("GÊMEOS");

        periodoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        periodoGemeos.setText("PERÍODO:");

        elementoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        elementoGemeos.setText("ELEMENTO:");

        planetaGemeos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        planetaGemeos.setText("PLANETA REGENTE:");

        corGemeos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        corGemeos.setText("COR:");

        numeroGemeos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numeroGemeos.setText("NÚMERO DA SORTE:");

        tfPeriodoGemeos.setText("21/05 a 20/06");
        tfPeriodoGemeos.addActionListener(this::tfPeriodoGemeosActionPerformed);

        tfElementoGemeos.setText("Ar");

        tfPlanetaGemeos.setText("Mercúrio");

        tfCorGemeos.setText("Amarelo");
        tfCorGemeos.addActionListener(this::tfCorGemeosActionPerformed);

        tfNumeroGemeos.setText("5");
        tfNumeroGemeos.addActionListener(this::tfNumeroGemeosActionPerformed);

        javax.swing.GroupLayout areaInformacoesGemeosLayout = new javax.swing.GroupLayout(areaInformacoesGemeos);
        areaInformacoesGemeos.setLayout(areaInformacoesGemeosLayout);
        areaInformacoesGemeosLayout.setHorizontalGroup(
            areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                        .addComponent(tituloGemeos)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                        .addComponent(elementoGemeos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfElementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                        .addComponent(planetaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPlanetaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesGemeosLayout.createSequentialGroup()
                            .addComponent(numeroGemeos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNumeroGemeos))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesGemeosLayout.createSequentialGroup()
                            .addComponent(corGemeos)
                            .addGap(18, 18, 18)
                            .addComponent(tfCorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                        .addComponent(periodoGemeos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        areaInformacoesGemeosLayout.setVerticalGroup(
            areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoGemeos)
                    .addComponent(tfPeriodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoGemeos)
                    .addComponent(tfElementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaGemeos)
                    .addComponent(tfPlanetaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corGemeos)
                    .addComponent(tfCorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroGemeos)
                    .addComponent(tfNumeroGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        gemeos.add(areaInformacoesGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 270, 730));

        tituloCaracteristicasGemeos.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloCaracteristicasGemeos.setText("Características");

        pfortesGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesGemeos.setText("Pontos Fortes:");

        pMelhorarGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pMelhorarGemeos.setText("Pontos a Melhorar:");

        txFortesGemeos.setColumns(20);
        txFortesGemeos.setRows(5);
        txFortesGemeos.setText("Comunicação, criatividade e curiosidade. Aprende rapidamente, gosta de conversar e possui facilidade para se adaptar a diferentes situações.");
        txtFortesGemeos.setViewportView(txFortesGemeos);

        txMelhorarGemeos.setColumns(20);
        txMelhorarGemeos.setRows(5);
        txMelhorarGemeos.setText("Trabalhar a concentração e evitar começar muitas coisas ao mesmo tempo. Ter mais constância ajuda a concluir seus objetivos.");
        txtMelhorarGemeos.setViewportView(txMelhorarGemeos);

        javax.swing.GroupLayout areaCaracteristicasGemeosLayout = new javax.swing.GroupLayout(areaCaracteristicasGemeos);
        areaCaracteristicasGemeos.setLayout(areaCaracteristicasGemeosLayout);
        areaCaracteristicasGemeosLayout.setHorizontalGroup(
            areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pfortesGemeos)
                    .addComponent(pMelhorarGemeos)
                    .addComponent(txtFortesGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtMelhorarGemeos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCaracteristicasGemeosLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(tituloCaracteristicasGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        areaCaracteristicasGemeosLayout.setVerticalGroup(
            areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloCaracteristicasGemeos)
                .addGap(18, 18, 18)
                .addComponent(pfortesGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFortesGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMelhorarGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gemeos.add(areaCaracteristicasGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 370, 350));

        tituloEnergiaGemeos.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloEnergiaGemeos.setText("Energia do Dia");

        amorGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amorGemeos.setText("Amor:");

        trabalhoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trabalhoGemeos.setText("Trabalho:");

        saudeGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saudeGemeos.setText("Saúde:");

        sorteGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sorteGemeos.setText("Sorte:");

        tfAmorGemeos.setText("80%");
        tfAmorGemeos.addActionListener(this::tfAmorGemeosActionPerformed);

        tfTrabalhoGemeos.setText("88%");

        tfSaudeGemeos.setText("72%");

        tfSorteGemeos.setText("85%");

        javax.swing.GroupLayout areaEnergiaGemeosLayout = new javax.swing.GroupLayout(areaEnergiaGemeos);
        areaEnergiaGemeos.setLayout(areaEnergiaGemeosLayout);
        areaEnergiaGemeosLayout.setHorizontalGroup(
            areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                        .addGroup(areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amorGemeos)
                            .addComponent(trabalhoGemeos)
                            .addComponent(saudeGemeos)
                            .addComponent(sorteGemeos))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaEnergiaGemeosLayout.createSequentialGroup()
                        .addGroup(areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfSorteGemeos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSaudeGemeos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTrabalhoGemeos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAmorGemeos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(tituloEnergiaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))))
        );
        areaEnergiaGemeosLayout.setVerticalGroup(
            areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloEnergiaGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(trabalhoGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTrabalhoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(saudeGemeos)
                .addGap(11, 11, 11)
                .addComponent(tfSaudeGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        gemeos.add(areaEnergiaGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 370, 350));

        previsaoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        previsaoGemeos.setText("Previsão do Dia");

        btnPrevisaoGemeos.setBackground(new java.awt.Color(0, 51, 102));
        btnPrevisaoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPrevisaoGemeos.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevisaoGemeos.setText("Atualizar Previsão");
        btnPrevisaoGemeos.addActionListener(this::btnPrevisaoGemeosActionPerformed);

        txPrevisaoGemeos.setColumns(20);
        txPrevisaoGemeos.setRows(5);
        txtPrevisaoGemeos.setViewportView(txPrevisaoGemeos);

        javax.swing.GroupLayout areaPrevisoesGemeosLayout = new javax.swing.GroupLayout(areaPrevisoesGemeos);
        areaPrevisoesGemeos.setLayout(areaPrevisoesGemeosLayout);
        areaPrevisoesGemeosLayout.setHorizontalGroup(
            areaPrevisoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesGemeosLayout.createSequentialGroup()
                .addGroup(areaPrevisoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesGemeosLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtPrevisaoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisoesGemeosLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(previsaoGemeos))
                    .addGroup(areaPrevisoesGemeosLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnPrevisaoGemeos)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoesGemeosLayout.setVerticalGroup(
            areaPrevisoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesGemeosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrevisaoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevisaoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        gemeos.add(areaPrevisoesGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 370, 290));

        tituloMensagemGemeos.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloMensagemGemeos.setText("Mensagem do Dia");

        txMensagemGemeos.setColumns(20);
        txMensagemGemeos.setRows(5);
        txtMensagemGemeos.setViewportView(txMensagemGemeos);

        btnCopiarMsgGemeos.setBackground(new java.awt.Color(0, 51, 102));
        btnCopiarMsgGemeos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgGemeos.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgGemeos.setText("Copiar Mensagem");
        btnCopiarMsgGemeos.addActionListener(this::btnCopiarMsgGemeosActionPerformed);

        javax.swing.GroupLayout areaMensagemGemeosLayout = new javax.swing.GroupLayout(areaMensagemGemeos);
        areaMensagemGemeos.setLayout(areaMensagemGemeosLayout);
        areaMensagemGemeosLayout.setHorizontalGroup(
            areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                .addGroup(areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnCopiarMsgGemeos))
                    .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(tituloMensagemGemeos)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        areaMensagemGemeosLayout.setVerticalGroup(
            areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloMensagemGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        gemeos.add(areaMensagemGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 370, 290));

        fundoInicio4.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\plano de fundo.png")); // NOI18N
        gemeos.add(fundoInicio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Gêmeos", gemeos);

        cancer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\câncer.png")); // NOI18N

        tituloCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloCancer.setText("CÂNCER");

        periodoCancer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        periodoCancer.setText("PERÍODO:");

        elementoCancer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        elementoCancer.setText("ELEMENTO:");

        planetaCancer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        planetaCancer.setText("PLANETA REGENTE:");

        corCancer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        corCancer.setText("COR:");

        numeroCancer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numeroCancer.setText("NÚMERO DA SORTE:");

        tfPeriodoCancer.setText("21/06 a 22/07");
        tfPeriodoCancer.addActionListener(this::tfPeriodoCancerActionPerformed);

        tfElementoCancer.setText("Água");

        tfPlanetaCancer.setText("Lua");

        tfCorCancer.setText("Prata");
        tfCorCancer.addActionListener(this::tfCorCancerActionPerformed);

        tfNumeroCancer.setText("2");
        tfNumeroCancer.addActionListener(this::tfNumeroCancerActionPerformed);

        javax.swing.GroupLayout areaInformacoesCancerLayout = new javax.swing.GroupLayout(areaInformacoesCancer);
        areaInformacoesCancer.setLayout(areaInformacoesCancerLayout);
        areaInformacoesCancerLayout.setHorizontalGroup(
            areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                        .addComponent(tituloCancer)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                        .addComponent(elementoCancer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfElementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                        .addComponent(planetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPlanetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCancerLayout.createSequentialGroup()
                            .addComponent(numeroCancer)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNumeroCancer))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCancerLayout.createSequentialGroup()
                            .addComponent(corCancer)
                            .addGap(18, 18, 18)
                            .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                        .addComponent(periodoCancer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        areaInformacoesCancerLayout.setVerticalGroup(
            areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoCancer)
                    .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoCancer)
                    .addComponent(tfElementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaCancer)
                    .addComponent(tfPlanetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corCancer)
                    .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroCancer)
                    .addComponent(tfNumeroCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        cancer.add(areaInformacoesCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 270, 730));

        tituloCaracteristicasCancer.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloCaracteristicasCancer.setText("Características");

        pfortesCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesCancer.setText("Pontos Fortes:");

        pMelhorarCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pMelhorarCancer.setText("Pontos a Melhorar:");

        txFortesCancer.setColumns(20);
        txFortesCancer.setRows(5);
        txFortesCancer.setText("Sensibilidade, empatia e lealdade. Valoriza as pessoas próximas e costuma demonstrar cuidado e dedicação em seus relacionamentos.");
        txtFortesCancer.setViewportView(txFortesCancer);

        txMelhorarCancer.setColumns(20);
        txMelhorarCancer.setRows(5);
        txMelhorarCancer.setText("Evitar guardar sentimentos e não deixar que emoções influenciem todas as decisões. Aprender a estabelecer limites também é importante.");
        txtMelhorarCancer.setViewportView(txMelhorarCancer);

        javax.swing.GroupLayout areaCaracteristicasCancerLayout = new javax.swing.GroupLayout(areaCaracteristicasCancer);
        areaCaracteristicasCancer.setLayout(areaCaracteristicasCancerLayout);
        areaCaracteristicasCancerLayout.setHorizontalGroup(
            areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pfortesCancer)
                    .addComponent(pMelhorarCancer)
                    .addComponent(txtFortesCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtMelhorarCancer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCaracteristicasCancerLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(tituloCaracteristicasCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        areaCaracteristicasCancerLayout.setVerticalGroup(
            areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloCaracteristicasCancer)
                .addGap(18, 18, 18)
                .addComponent(pfortesCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFortesCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMelhorarCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cancer.add(areaCaracteristicasCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 370, 350));

        tituloEnergiaCancer.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloEnergiaCancer.setText("Energia do Dia");

        amorCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amorCancer.setText("Amor:");

        trabalhoCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trabalhoCancer.setText("Trabalho:");

        saudeCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saudeCancer.setText("Saúde:");

        sorteCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sorteCancer.setText("Sorte:");

        tfAmorCancer.setText("92%");
        tfAmorCancer.addActionListener(this::tfAmorCancerActionPerformed);

        tfTrabalhoCancer.setText("78%");

        tfSaudeCancer.setText("80%");

        tfSorteCancer.setText("76%");

        javax.swing.GroupLayout areaEnergiaCancerLayout = new javax.swing.GroupLayout(areaEnergiaCancer);
        areaEnergiaCancer.setLayout(areaEnergiaCancerLayout);
        areaEnergiaCancerLayout.setHorizontalGroup(
            areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                        .addGroup(areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amorCancer)
                            .addComponent(trabalhoCancer)
                            .addComponent(saudeCancer)
                            .addComponent(sorteCancer))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaEnergiaCancerLayout.createSequentialGroup()
                        .addGroup(areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfSorteCancer, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSaudeCancer, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTrabalhoCancer, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAmorCancer, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(tituloEnergiaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))))
        );
        areaEnergiaCancerLayout.setVerticalGroup(
            areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloEnergiaCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(trabalhoCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTrabalhoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(saudeCancer)
                .addGap(11, 11, 11)
                .addComponent(tfSaudeCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        cancer.add(areaEnergiaCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 370, 350));

        previsaoCancer.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        previsaoCancer.setText("Previsão do Dia");

        btnPrevisaoCancer.setBackground(new java.awt.Color(0, 51, 102));
        btnPrevisaoCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPrevisaoCancer.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevisaoCancer.setText("Atualizar Previsão");
        btnPrevisaoCancer.addActionListener(this::btnPrevisaoCancerActionPerformed);

        txPrevisaoCancer.setColumns(20);
        txPrevisaoCancer.setRows(5);
        txtPrevisaoCancer.setViewportView(txPrevisaoCancer);

        javax.swing.GroupLayout areaPrevisoesCancerLayout = new javax.swing.GroupLayout(areaPrevisoesCancer);
        areaPrevisoesCancer.setLayout(areaPrevisoesCancerLayout);
        areaPrevisoesCancerLayout.setHorizontalGroup(
            areaPrevisoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesCancerLayout.createSequentialGroup()
                .addGroup(areaPrevisoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesCancerLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtPrevisaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisoesCancerLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(previsaoCancer))
                    .addGroup(areaPrevisoesCancerLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnPrevisaoCancer)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoesCancerLayout.setVerticalGroup(
            areaPrevisoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesCancerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrevisaoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevisaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        cancer.add(areaPrevisoesCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 370, 290));

        tituloMensagemCancer.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloMensagemCancer.setText("Mensagem do Dia");

        txMensagemCancer.setColumns(20);
        txMensagemCancer.setRows(5);
        txtMensagemCancer.setViewportView(txMensagemCancer);

        btnCopiarMsgCancer.setBackground(new java.awt.Color(0, 51, 102));
        btnCopiarMsgCancer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgCancer.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgCancer.setText("Copiar Mensagem");
        btnCopiarMsgCancer.addActionListener(this::btnCopiarMsgCancerActionPerformed);

        javax.swing.GroupLayout areaMensagemCancerLayout = new javax.swing.GroupLayout(areaMensagemCancer);
        areaMensagemCancer.setLayout(areaMensagemCancerLayout);
        areaMensagemCancerLayout.setHorizontalGroup(
            areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                .addGroup(areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnCopiarMsgCancer))
                    .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(tituloMensagemCancer)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        areaMensagemCancerLayout.setVerticalGroup(
            areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloMensagemCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        cancer.add(areaMensagemCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 370, 290));

        fundoInicio5.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\plano de fundo.png")); // NOI18N
        cancer.add(fundoInicio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Câncer", cancer);

        leao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\leão.png")); // NOI18N

        tituloLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloLeao.setText("LEÃO");

        periodoLeao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        periodoLeao.setText("PERÍODO:");

        elementoLeao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        elementoLeao.setText("ELEMENTO:");

        planetaLeao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        planetaLeao.setText("PLANETA REGENTE:");

        corLeao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        corLeao.setText("COR:");

        numeroLeao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numeroLeao.setText("NÚMERO DA SORTE:");

        tfPeriodoLeao.setText("23/07 a 22/08");
        tfPeriodoLeao.addActionListener(this::tfPeriodoLeaoActionPerformed);

        tfElementoLeao.setText("Fogo");

        tfPlanetaLeao.setText("Sol");

        tfCorLeao.setText("Dourado");
        tfCorLeao.addActionListener(this::tfCorLeaoActionPerformed);

        tfNumeroLeao.setText("1");
        tfNumeroLeao.addActionListener(this::tfNumeroLeaoActionPerformed);

        javax.swing.GroupLayout areaInformacoesLeaoLayout = new javax.swing.GroupLayout(areaInformacoesLeao);
        areaInformacoesLeao.setLayout(areaInformacoesLeaoLayout);
        areaInformacoesLeaoLayout.setHorizontalGroup(
            areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                        .addComponent(tituloLeao)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                        .addComponent(elementoLeao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfElementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                        .addComponent(planetaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPlanetaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLeaoLayout.createSequentialGroup()
                            .addComponent(numeroLeao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNumeroLeao))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLeaoLayout.createSequentialGroup()
                            .addComponent(corLeao)
                            .addGap(18, 18, 18)
                            .addComponent(tfCorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                        .addComponent(periodoLeao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        areaInformacoesLeaoLayout.setVerticalGroup(
            areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoLeao)
                    .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoLeao)
                    .addComponent(tfElementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLeao)
                    .addComponent(tfPlanetaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLeao)
                    .addComponent(tfCorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLeao)
                    .addComponent(tfNumeroLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        leao.add(areaInformacoesLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 270, 730));

        tituloCaracteristicasLeao.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloCaracteristicasLeao.setText("Características");

        pfortesLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesLeao.setText("Pontos Fortes:");

        pMelhorarLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pMelhorarLeao.setText("Pontos a Melhorar:");

        txFortesLeao.setColumns(20);
        txFortesLeao.setRows(5);
        txFortesLeao.setText("Confiança, criatividade e liderança. Possui presença marcante, gosta de desafios e costuma motivar as pessoas ao seu redor.");
        txtFortesLeao.setViewportView(txFortesLeao);

        txMelhorarLeao.setColumns(20);
        txMelhorarLeao.setRows(5);
        txMelhorarLeao.setText("Evitar o excesso de orgulho e aprender a aceitar críticas. Dividir o espaço com outras pessoas pode fortalecer suas relações.");
        txtMelhorarLeao.setViewportView(txMelhorarLeao);

        javax.swing.GroupLayout areaCaracteristicasLeaoLayout = new javax.swing.GroupLayout(areaCaracteristicasLeao);
        areaCaracteristicasLeao.setLayout(areaCaracteristicasLeaoLayout);
        areaCaracteristicasLeaoLayout.setHorizontalGroup(
            areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pfortesLeao)
                    .addComponent(pMelhorarLeao)
                    .addComponent(txtFortesLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtMelhorarLeao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCaracteristicasLeaoLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(tituloCaracteristicasLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        areaCaracteristicasLeaoLayout.setVerticalGroup(
            areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloCaracteristicasLeao)
                .addGap(18, 18, 18)
                .addComponent(pfortesLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFortesLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMelhorarLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        leao.add(areaCaracteristicasLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 370, 350));

        tituloEnergiaLeao.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloEnergiaLeao.setText("Energia do Dia");

        amorLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amorLeao.setText("Amor:");

        trabalhoLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trabalhoLeao.setText("Trabalho:");

        saudeLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saudeLeao.setText("Saúde:");

        sorteLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sorteLeao.setText("Sorte:");

        tfAmorLeao.setText("88%");
        tfAmorLeao.addActionListener(this::tfAmorLeaoActionPerformed);

        tfTrabalhoLeao.setText("92%");

        tfSaudeLeao.setText("82%");

        tfSorteLeao.setText("87%");

        javax.swing.GroupLayout areaEnergiaLeaoLayout = new javax.swing.GroupLayout(areaEnergiaLeao);
        areaEnergiaLeao.setLayout(areaEnergiaLeaoLayout);
        areaEnergiaLeaoLayout.setHorizontalGroup(
            areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                        .addGroup(areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amorLeao)
                            .addComponent(trabalhoLeao)
                            .addComponent(saudeLeao)
                            .addComponent(sorteLeao))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaEnergiaLeaoLayout.createSequentialGroup()
                        .addGroup(areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfSorteLeao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSaudeLeao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTrabalhoLeao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAmorLeao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(tituloEnergiaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))))
        );
        areaEnergiaLeaoLayout.setVerticalGroup(
            areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloEnergiaLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(trabalhoLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTrabalhoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(saudeLeao)
                .addGap(11, 11, 11)
                .addComponent(tfSaudeLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        leao.add(areaEnergiaLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 370, 350));

        previsaoLeao.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        previsaoLeao.setText("Previsão do Dia");

        btnPrevisaoLeao.setBackground(new java.awt.Color(0, 51, 102));
        btnPrevisaoLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPrevisaoLeao.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevisaoLeao.setText("Atualizar Previsão");
        btnPrevisaoLeao.addActionListener(this::btnPrevisaoLeaoActionPerformed);

        txPrevisaoLeao.setColumns(20);
        txPrevisaoLeao.setRows(5);
        txtPrevisaoLeao.setViewportView(txPrevisaoLeao);

        javax.swing.GroupLayout areaPrevisoesLeaoLayout = new javax.swing.GroupLayout(areaPrevisoesLeao);
        areaPrevisoesLeao.setLayout(areaPrevisoesLeaoLayout);
        areaPrevisoesLeaoLayout.setHorizontalGroup(
            areaPrevisoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesLeaoLayout.createSequentialGroup()
                .addGroup(areaPrevisoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesLeaoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtPrevisaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisoesLeaoLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(previsaoLeao))
                    .addGroup(areaPrevisoesLeaoLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnPrevisaoLeao)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoesLeaoLayout.setVerticalGroup(
            areaPrevisoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesLeaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrevisaoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevisaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        leao.add(areaPrevisoesLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 370, 290));

        tituloMensagemLeao.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloMensagemLeao.setText("Mensagem do Dia");

        txMensagemLeao.setColumns(20);
        txMensagemLeao.setRows(5);
        txtMensagemLeao.setViewportView(txMensagemLeao);

        btnCopiarMsgLeao.setBackground(new java.awt.Color(0, 51, 102));
        btnCopiarMsgLeao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgLeao.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgLeao.setText("Copiar Mensagem");
        btnCopiarMsgLeao.addActionListener(this::btnCopiarMsgLeaoActionPerformed);

        javax.swing.GroupLayout areaMensagemLeaoLayout = new javax.swing.GroupLayout(areaMensagemLeao);
        areaMensagemLeao.setLayout(areaMensagemLeaoLayout);
        areaMensagemLeaoLayout.setHorizontalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addGroup(areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnCopiarMsgLeao))
                    .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(tituloMensagemLeao)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        areaMensagemLeaoLayout.setVerticalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloMensagemLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        leao.add(areaMensagemLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 370, 290));

        fundoInicio6.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\plano de fundo.png")); // NOI18N
        leao.add(fundoInicio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Leão", leao);

        virgem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\virgem.png")); // NOI18N

        tituloVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloVirgem.setText("VIRGEM");

        periodoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        periodoVirgem.setText("PERÍODO:");

        elementoAries5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        elementoAries5.setText("ELEMENTO:");

        planetaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        planetaVirgem.setText("PLANETA REGENTE:");

        corVirgem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        corVirgem.setText("COR:");

        numeroVirgem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numeroVirgem.setText("NÚMERO DA SORTE:");

        tfPeriodoVirgem.setText("23/08 a 22/09");
        tfPeriodoVirgem.addActionListener(this::tfPeriodoVirgemActionPerformed);

        tfElementoVirgem.setText("Terra");

        tfPlanetaVirgem.setText("Mercúrio");

        tfCorVirgem.setText("Azul-marinho");
        tfCorVirgem.addActionListener(this::tfCorVirgemActionPerformed);

        tfNumeroVirgem.setText("5");
        tfNumeroVirgem.addActionListener(this::tfNumeroVirgemActionPerformed);

        javax.swing.GroupLayout areaInformacoesVirgemLayout = new javax.swing.GroupLayout(areaInformacoesVirgem);
        areaInformacoesVirgem.setLayout(areaInformacoesVirgemLayout);
        areaInformacoesVirgemLayout.setHorizontalGroup(
            areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                        .addComponent(tituloVirgem)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                        .addComponent(elementoAries5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfElementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                        .addComponent(planetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPlanetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesVirgemLayout.createSequentialGroup()
                            .addComponent(numeroVirgem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNumeroVirgem))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesVirgemLayout.createSequentialGroup()
                            .addComponent(corVirgem)
                            .addGap(18, 18, 18)
                            .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                        .addComponent(periodoVirgem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        areaInformacoesVirgemLayout.setVerticalGroup(
            areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoVirgem)
                    .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAries5)
                    .addComponent(tfElementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaVirgem)
                    .addComponent(tfPlanetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corVirgem)
                    .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroVirgem)
                    .addComponent(tfNumeroVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        virgem.add(areaInformacoesVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 270, 730));

        tituloCaracteristicasVirgem.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloCaracteristicasVirgem.setText("Características");

        pfortesVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesVirgem.setText("Pontos Fortes:");

        pMelhorarVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pMelhorarVirgem.setText("Pontos a Melhorar:");

        txFortesVirgem.setColumns(20);
        txFortesVirgem.setRows(5);
        txFortesVirgem.setText("Organização, responsabilidade e atenção aos detalhes. Gosta de planejar e procura realizar suas tarefas com eficiência.");
        txtFortesVirgem.setViewportView(txFortesVirgem);

        txMelhorarVirgem.setColumns(20);
        txMelhorarVirgem.setRows(5);
        txMelhorarVirgem.setText("Evitar o perfeccionismo e a preocupação excessiva com pequenos erros. Nem tudo precisa sair exatamente como planejado.");
        txtMelhorarVirgem.setViewportView(txMelhorarVirgem);

        javax.swing.GroupLayout areaCaracteristicasVirgemLayout = new javax.swing.GroupLayout(areaCaracteristicasVirgem);
        areaCaracteristicasVirgem.setLayout(areaCaracteristicasVirgemLayout);
        areaCaracteristicasVirgemLayout.setHorizontalGroup(
            areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pfortesVirgem)
                    .addComponent(pMelhorarVirgem)
                    .addComponent(txtFortesVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtMelhorarVirgem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCaracteristicasVirgemLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(tituloCaracteristicasVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        areaCaracteristicasVirgemLayout.setVerticalGroup(
            areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloCaracteristicasVirgem)
                .addGap(18, 18, 18)
                .addComponent(pfortesVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFortesVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMelhorarVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        virgem.add(areaCaracteristicasVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 370, 350));

        tituloEnergiaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloEnergiaVirgem.setText("Energia do Dia");

        amorVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amorVirgem.setText("Amor:");

        trabalhoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trabalhoVirgem.setText("Trabalho:");

        saudeVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saudeVirgem.setText("Saúde:");

        sorteVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sorteVirgem.setText("Sorte:");

        tfAmorVirgem.setText("76%");
        tfAmorVirgem.addActionListener(this::tfAmorVirgemActionPerformed);

        tfTrabalhoVirgem.setText("94%");

        tfSaudeVirgem.setText("86%");

        tfSorteVirgem.setText("78%");

        javax.swing.GroupLayout areaEnergiaVirgemLayout = new javax.swing.GroupLayout(areaEnergiaVirgem);
        areaEnergiaVirgem.setLayout(areaEnergiaVirgemLayout);
        areaEnergiaVirgemLayout.setHorizontalGroup(
            areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                        .addGroup(areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amorVirgem)
                            .addComponent(trabalhoVirgem)
                            .addComponent(saudeVirgem)
                            .addComponent(sorteVirgem))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaEnergiaVirgemLayout.createSequentialGroup()
                        .addGroup(areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfSorteVirgem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSaudeVirgem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTrabalhoVirgem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAmorVirgem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(tituloEnergiaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))))
        );
        areaEnergiaVirgemLayout.setVerticalGroup(
            areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloEnergiaVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(trabalhoVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTrabalhoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(saudeVirgem)
                .addGap(11, 11, 11)
                .addComponent(tfSaudeVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        virgem.add(areaEnergiaVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 370, 350));

        previsaoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        previsaoVirgem.setText("Previsão do Dia");

        btnPrevisaoVirgem.setBackground(new java.awt.Color(0, 51, 102));
        btnPrevisaoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPrevisaoVirgem.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevisaoVirgem.setText("Atualizar Previsão");
        btnPrevisaoVirgem.addActionListener(this::btnPrevisaoVirgemActionPerformed);

        txPrevisaoVirgem.setColumns(20);
        txPrevisaoVirgem.setRows(5);
        txtPrevisaoVirgem.setViewportView(txPrevisaoVirgem);

        javax.swing.GroupLayout areaPrevisoesVirgemLayout = new javax.swing.GroupLayout(areaPrevisoesVirgem);
        areaPrevisoesVirgem.setLayout(areaPrevisoesVirgemLayout);
        areaPrevisoesVirgemLayout.setHorizontalGroup(
            areaPrevisoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesVirgemLayout.createSequentialGroup()
                .addGroup(areaPrevisoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesVirgemLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtPrevisaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisoesVirgemLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(previsaoVirgem))
                    .addGroup(areaPrevisoesVirgemLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnPrevisaoVirgem)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoesVirgemLayout.setVerticalGroup(
            areaPrevisoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesVirgemLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrevisaoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevisaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        virgem.add(areaPrevisoesVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 370, 290));

        tituloMensagemVirgem.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloMensagemVirgem.setText("Mensagem do Dia");

        txMensagemVirgem.setColumns(20);
        txMensagemVirgem.setRows(5);
        txtMensagemVirgem.setViewportView(txMensagemVirgem);

        btnCopiarMsgVirgem.setBackground(new java.awt.Color(0, 51, 102));
        btnCopiarMsgVirgem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgVirgem.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgVirgem.setText("Copiar Mensagem");
        btnCopiarMsgVirgem.addActionListener(this::btnCopiarMsgVirgemActionPerformed);

        javax.swing.GroupLayout areaMensagemVirgemLayout = new javax.swing.GroupLayout(areaMensagemVirgem);
        areaMensagemVirgem.setLayout(areaMensagemVirgemLayout);
        areaMensagemVirgemLayout.setHorizontalGroup(
            areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                .addGroup(areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnCopiarMsgVirgem))
                    .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(tituloMensagemVirgem)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        areaMensagemVirgemLayout.setVerticalGroup(
            areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloMensagemVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        virgem.add(areaMensagemVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 370, 290));

        fundoInicio7.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\plano de fundo.png")); // NOI18N
        virgem.add(fundoInicio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Virgem", virgem);

        libra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoLibra.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\libra.png")); // NOI18N

        tituloLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloLibra.setText("LIBRA");

        periodoLibra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        periodoLibra.setText("PERÍODO:");

        elementoLibra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        elementoLibra.setText("ELEMENTO:");

        planetaLibra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        planetaLibra.setText("PLANETA REGENTE:");

        corLibra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        corLibra.setText("COR:");

        numeroLibra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numeroLibra.setText("NÚMERO DA SORTE:");

        tfPeriodoLibra.setText("23/09 a 22/10");
        tfPeriodoLibra.addActionListener(this::tfPeriodoLibraActionPerformed);

        tfElementoLibra.setText("Ar");

        tfPlanetaLibra.setText("Vênus");
        tfPlanetaLibra.addActionListener(this::tfPlanetaLibraActionPerformed);

        tfCorLibra.setText("Rosa");
        tfCorLibra.addActionListener(this::tfCorLibraActionPerformed);

        tfNumeroLibra.setText("6");
        tfNumeroLibra.addActionListener(this::tfNumeroLibraActionPerformed);

        javax.swing.GroupLayout areaInformacoesLibraLayout = new javax.swing.GroupLayout(areaInformacoesLibra);
        areaInformacoesLibra.setLayout(areaInformacoesLibraLayout);
        areaInformacoesLibraLayout.setHorizontalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addComponent(tituloLibra)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addComponent(elementoLibra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfElementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addComponent(planetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPlanetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLibraLayout.createSequentialGroup()
                            .addComponent(numeroLibra)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNumeroLibra))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLibraLayout.createSequentialGroup()
                            .addComponent(corLibra)
                            .addGap(18, 18, 18)
                            .addComponent(tfCorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addComponent(periodoLibra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        areaInformacoesLibraLayout.setVerticalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoLibra)
                    .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoLibra)
                    .addComponent(tfElementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLibra)
                    .addComponent(tfPlanetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLibra)
                    .addComponent(tfCorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLibra)
                    .addComponent(tfNumeroLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        libra.add(areaInformacoesLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 270, 730));

        tituloCaracteristicasLibra.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloCaracteristicasLibra.setText("Características");

        pfortesLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesLibra.setText("Pontos Fortes:");

        pMelhorarLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pMelhorarLibra.setText("Pontos a Melhorar:");

        txFortesLibra.setColumns(20);
        txFortesLibra.setRows(5);
        txFortesLibra.setText("Diplomacia, equilíbrio e simpatia. Procura manter boas relações e possui facilidade para compreender diferentes pontos de vista.");
        txtFortesLibra.setViewportView(txFortesLibra);

        txMelhorarLibra.setColumns(20);
        txMelhorarLibra.setRows(5);
        txMelhorarLibra.setText("Evitar indecisões e a necessidade constante de agradar aos outros. Aprender a tomar decisões com mais segurança é importante.");
        txtMelhorarLibra.setViewportView(txMelhorarLibra);

        javax.swing.GroupLayout areaCaracteristicasLibraLayout = new javax.swing.GroupLayout(areaCaracteristicasLibra);
        areaCaracteristicasLibra.setLayout(areaCaracteristicasLibraLayout);
        areaCaracteristicasLibraLayout.setHorizontalGroup(
            areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pfortesLibra)
                    .addComponent(pMelhorarLibra)
                    .addComponent(txtFortesLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtMelhorarLibra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCaracteristicasLibraLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(tituloCaracteristicasLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        areaCaracteristicasLibraLayout.setVerticalGroup(
            areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloCaracteristicasLibra)
                .addGap(18, 18, 18)
                .addComponent(pfortesLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFortesLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMelhorarLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        libra.add(areaCaracteristicasLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 370, 350));

        tituloEnergiaLibra.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloEnergiaLibra.setText("Energia do Dia");

        amorLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amorLibra.setText("Amor:");

        trabalhoLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trabalhoLibra.setText("Trabalho:");

        saudeLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saudeLibra.setText("Saúde:");

        sorteLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sorteLibra.setText("Sorte:");

        tfAmorLibra.setText("94%");
        tfAmorLibra.addActionListener(this::tfAmorLibraActionPerformed);

        tfTrabalhoLibra.setText("82%");

        tfSaudeLibra.setText("79%");

        tfSorteLibra.setText("88%");

        javax.swing.GroupLayout areaEnergiaLibraLayout = new javax.swing.GroupLayout(areaEnergiaLibra);
        areaEnergiaLibra.setLayout(areaEnergiaLibraLayout);
        areaEnergiaLibraLayout.setHorizontalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addGroup(areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amorLibra)
                            .addComponent(trabalhoLibra)
                            .addComponent(saudeLibra)
                            .addComponent(sorteLibra))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaEnergiaLibraLayout.createSequentialGroup()
                        .addGroup(areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfSorteLibra, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSaudeLibra, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTrabalhoLibra, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAmorLibra, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(tituloEnergiaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))))
        );
        areaEnergiaLibraLayout.setVerticalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloEnergiaLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(trabalhoLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTrabalhoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(saudeLibra)
                .addGap(11, 11, 11)
                .addComponent(tfSaudeLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        libra.add(areaEnergiaLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 370, 350));

        previsaoLibra.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        previsaoLibra.setText("Previsão do Dia");

        btnPrevisaoLibra.setBackground(new java.awt.Color(0, 51, 102));
        btnPrevisaoLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPrevisaoLibra.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevisaoLibra.setText("Atualizar Previsão");
        btnPrevisaoLibra.addActionListener(this::btnPrevisaoLibraActionPerformed);

        txPrevisaoLibra.setColumns(20);
        txPrevisaoLibra.setRows(5);
        txtPrevisaoLibra.setViewportView(txPrevisaoLibra);

        javax.swing.GroupLayout areaPrevisoesLibraLayout = new javax.swing.GroupLayout(areaPrevisoesLibra);
        areaPrevisoesLibra.setLayout(areaPrevisoesLibraLayout);
        areaPrevisoesLibraLayout.setHorizontalGroup(
            areaPrevisoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesLibraLayout.createSequentialGroup()
                .addGroup(areaPrevisoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesLibraLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtPrevisaoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisoesLibraLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(previsaoLibra))
                    .addGroup(areaPrevisoesLibraLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnPrevisaoLibra)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoesLibraLayout.setVerticalGroup(
            areaPrevisoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesLibraLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrevisaoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevisaoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        libra.add(areaPrevisoesLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 370, 290));

        tituloMensagemLibra.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloMensagemLibra.setText("Mensagem do Dia");

        txMensagemLibra.setColumns(20);
        txMensagemLibra.setRows(5);
        txtMensagemLibra.setViewportView(txMensagemLibra);

        btnCopiarMsgLibra.setBackground(new java.awt.Color(0, 51, 102));
        btnCopiarMsgLibra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgLibra.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgLibra.setText("Copiar Mensagem");
        btnCopiarMsgLibra.addActionListener(this::btnCopiarMsgLibraActionPerformed);

        javax.swing.GroupLayout areaMensagemLibraLayout = new javax.swing.GroupLayout(areaMensagemLibra);
        areaMensagemLibra.setLayout(areaMensagemLibraLayout);
        areaMensagemLibraLayout.setHorizontalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addGroup(areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnCopiarMsgLibra))
                    .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(tituloMensagemLibra)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        areaMensagemLibraLayout.setVerticalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloMensagemLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        libra.add(areaMensagemLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 370, 290));

        fundoInicio8.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\plano de fundo.png")); // NOI18N
        libra.add(fundoInicio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Libra", libra);

        escorpiao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\escorpião.png")); // NOI18N

        tituloEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloEscorpiao.setText("ESCORPIÃO");

        periodoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        periodoEscorpiao.setText("PERÍODO:");

        elementoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        elementoEscorpiao.setText("ELEMENTO:");

        planetaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        planetaEscorpiao.setText("PLANETA REGENTE:");

        corEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        corEscorpiao.setText("COR:");

        numeroEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numeroEscorpiao.setText("NÚMERO DA SORTE:");

        tfPeriodoEscorpiao.setText("23/10 a 21/11");
        tfPeriodoEscorpiao.addActionListener(this::tfPeriodoEscorpiaoActionPerformed);

        tfElementoEscorpiao.setText("Água");
        tfElementoEscorpiao.addActionListener(this::tfElementoEscorpiaoActionPerformed);

        tfPlanetaEscorpiao.setText("Plutão");

        tfCorEscorpiao.setText("Vinho");
        tfCorEscorpiao.addActionListener(this::tfCorEscorpiaoActionPerformed);

        tfNumeroEscorpiao.setText("8");
        tfNumeroEscorpiao.addActionListener(this::tfNumeroEscorpiaoActionPerformed);

        javax.swing.GroupLayout areaInformacoesEscorpiaoLayout = new javax.swing.GroupLayout(areaInformacoesEscorpiao);
        areaInformacoesEscorpiao.setLayout(areaInformacoesEscorpiaoLayout);
        areaInformacoesEscorpiaoLayout.setHorizontalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addComponent(tituloEscorpiao)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addComponent(elementoEscorpiao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfElementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addComponent(planetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPlanetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addComponent(numeroEscorpiao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNumeroEscorpiao))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesEscorpiaoLayout.createSequentialGroup()
                            .addComponent(corEscorpiao)
                            .addGap(18, 18, 18)
                            .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addComponent(periodoEscorpiao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        areaInformacoesEscorpiaoLayout.setVerticalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoEscorpiao)
                    .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoEscorpiao)
                    .addComponent(tfElementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaEscorpiao)
                    .addComponent(tfPlanetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corEscorpiao)
                    .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroEscorpiao)
                    .addComponent(tfNumeroEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        escorpiao.add(areaInformacoesEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 270, 730));

        tituloCaracteristicasEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloCaracteristicasEscorpiao.setText("Características");

        pfortesEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesEscorpiao.setText("Pontos Fortes:");

        pMelhorarEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pMelhorarEscorpiao.setText("Pontos a Melhorar:");

        txFortesEscorpiao.setColumns(20);
        txFortesEscorpiao.setRows(5);
        txFortesEscorpiao.setText("Determinação, intensidade e percepção. É persistente, reservado e costuma se dedicar profundamente aos seus objetivos.");
        txtFortesEscorpiao.setViewportView(txFortesEscorpiao);

        txMelhorarEscorpiao.setColumns(20);
        txMelhorarEscorpiao.setRows(5);
        txMelhorarEscorpiao.setText("Trabalhar a desconfiança e evitar guardar ressentimentos. Expressar os sentimentos de maneira equilibrada pode melhorar seus relacionamentos.");
        txtMelhorarEscorpiao.setViewportView(txMelhorarEscorpiao);

        javax.swing.GroupLayout areaCaracteristicasEscorpiaoLayout = new javax.swing.GroupLayout(areaCaracteristicasEscorpiao);
        areaCaracteristicasEscorpiao.setLayout(areaCaracteristicasEscorpiaoLayout);
        areaCaracteristicasEscorpiaoLayout.setHorizontalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pfortesEscorpiao)
                    .addComponent(pMelhorarEscorpiao)
                    .addComponent(txtFortesEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtMelhorarEscorpiao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(tituloCaracteristicasEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        areaCaracteristicasEscorpiaoLayout.setVerticalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloCaracteristicasEscorpiao)
                .addGap(18, 18, 18)
                .addComponent(pfortesEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFortesEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMelhorarEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        escorpiao.add(areaCaracteristicasEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 370, 350));

        tituloEnergiaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloEnergiaEscorpiao.setText("Energia do Dia");

        amorEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amorEscorpiao.setText("Amor:");

        trabalhoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trabalhoEscorpiao.setText("Trabalho:");

        saudeEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saudeEscorpiao.setText("Saúde:");

        sorteEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sorteEscorpiao.setText("Sorte:");

        tfAmorEscorpiao.setText("89%");
        tfAmorEscorpiao.addActionListener(this::tfAmorEscorpiaoActionPerformed);

        tfTrabalhoEscorpiao.setText("91%");

        tfSaudeEscorpiao.setText("77%");

        tfSorteEscorpiao.setText("84%");

        javax.swing.GroupLayout areaEnergiaEscorpiaoLayout = new javax.swing.GroupLayout(areaEnergiaEscorpiao);
        areaEnergiaEscorpiao.setLayout(areaEnergiaEscorpiaoLayout);
        areaEnergiaEscorpiaoLayout.setHorizontalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amorEscorpiao)
                            .addComponent(trabalhoEscorpiao)
                            .addComponent(saudeEscorpiao)
                            .addComponent(sorteEscorpiao))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfSorteEscorpiao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSaudeEscorpiao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTrabalhoEscorpiao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAmorEscorpiao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(tituloEnergiaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))))
        );
        areaEnergiaEscorpiaoLayout.setVerticalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloEnergiaEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(trabalhoEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTrabalhoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(saudeEscorpiao)
                .addGap(11, 11, 11)
                .addComponent(tfSaudeEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        escorpiao.add(areaEnergiaEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 370, 350));

        previsaoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        previsaoEscorpiao.setText("Previsão do Dia");

        btnPrevisaoEscorpiao.setBackground(new java.awt.Color(0, 51, 102));
        btnPrevisaoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPrevisaoEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevisaoEscorpiao.setText("Atualizar Previsão");
        btnPrevisaoEscorpiao.addActionListener(this::btnPrevisaoEscorpiaoActionPerformed);

        txPrevisaoEscorpiao.setColumns(20);
        txPrevisaoEscorpiao.setRows(5);
        txtPrevisaoEscorpiao.setViewportView(txPrevisaoEscorpiao);

        javax.swing.GroupLayout areaPrevisoesEscorpiaoLayout = new javax.swing.GroupLayout(areaPrevisoesEscorpiao);
        areaPrevisoesEscorpiao.setLayout(areaPrevisoesEscorpiaoLayout);
        areaPrevisoesEscorpiaoLayout.setHorizontalGroup(
            areaPrevisoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesEscorpiaoLayout.createSequentialGroup()
                .addGroup(areaPrevisoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesEscorpiaoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtPrevisaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisoesEscorpiaoLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(previsaoEscorpiao))
                    .addGroup(areaPrevisoesEscorpiaoLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnPrevisaoEscorpiao)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoesEscorpiaoLayout.setVerticalGroup(
            areaPrevisoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesEscorpiaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrevisaoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevisaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        escorpiao.add(areaPrevisoesEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 370, 290));

        tituloMensagemEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloMensagemEscorpiao.setText("Mensagem do Dia");

        txMensagemEscorpiao.setColumns(20);
        txMensagemEscorpiao.setRows(5);
        txtMensagemEscorpiao.setViewportView(txMensagemEscorpiao);

        btnCopiarMsgEscorpiao.setBackground(new java.awt.Color(0, 51, 102));
        btnCopiarMsgEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgEscorpiao.setText("Copiar Mensagem");
        btnCopiarMsgEscorpiao.addActionListener(this::btnCopiarMsgEscorpiaoActionPerformed);

        javax.swing.GroupLayout areaMensagemEscorpiaoLayout = new javax.swing.GroupLayout(areaMensagemEscorpiao);
        areaMensagemEscorpiao.setLayout(areaMensagemEscorpiaoLayout);
        areaMensagemEscorpiaoLayout.setHorizontalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addGroup(areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnCopiarMsgEscorpiao))
                    .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(tituloMensagemEscorpiao)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        areaMensagemEscorpiaoLayout.setVerticalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloMensagemEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        escorpiao.add(areaMensagemEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 370, 290));

        fundoInicio9.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\plano de fundo.png")); // NOI18N
        escorpiao.add(fundoInicio9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Escorpião", escorpiao);

        sagitario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoSagitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\sagitário.png")); // NOI18N

        tituloSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloSagitario.setText("SAGITÁRIO");

        periodoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        periodoSagitario.setText("PERÍODO:");

        elementoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        elementoSagitario.setText("ELEMENTO:");

        planetaSagitario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        planetaSagitario.setText("PLANETA REGENTE:");

        corSagitario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        corSagitario.setText("COR:");

        numeroSagitario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numeroSagitario.setText("NÚMERO DA SORTE:");

        tfPeriodoSagitario.setText("22/11 a 21/12");
        tfPeriodoSagitario.addActionListener(this::tfPeriodoSagitarioActionPerformed);

        tfElementoSagitario.setText("Fogo");

        tfPlanetaSagitario.setText("Júpiter");

        tfCorSagitario.setText("Roxo");
        tfCorSagitario.addActionListener(this::tfCorSagitarioActionPerformed);

        tfNumeroSagitario.setText("3");
        tfNumeroSagitario.addActionListener(this::tfNumeroSagitarioActionPerformed);

        javax.swing.GroupLayout areaInformacoesSagitarioLayout = new javax.swing.GroupLayout(areaInformacoesSagitario);
        areaInformacoesSagitario.setLayout(areaInformacoesSagitarioLayout);
        areaInformacoesSagitarioLayout.setHorizontalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                        .addComponent(tituloSagitario)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                        .addComponent(elementoSagitario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfElementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                        .addComponent(planetaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPlanetaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addComponent(numeroSagitario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNumeroSagitario))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesSagitarioLayout.createSequentialGroup()
                            .addComponent(corSagitario)
                            .addGap(18, 18, 18)
                            .addComponent(tfCorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                        .addComponent(periodoSagitario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        areaInformacoesSagitarioLayout.setVerticalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoSagitario)
                    .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoSagitario)
                    .addComponent(tfElementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaSagitario)
                    .addComponent(tfPlanetaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corSagitario)
                    .addComponent(tfCorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroSagitario)
                    .addComponent(tfNumeroSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        sagitario.add(areaInformacoesSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 270, 730));

        tituloCaracteristicasSagitario.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloCaracteristicasSagitario.setText("Características");

        pfortesSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesSagitario.setText("Pontos Fortes:");

        pMelhorarSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pMelhorarSagitario.setText("Pontos a Melhorar:");

        txFortesSagitario.setColumns(20);
        txFortesSagitario.setRows(5);
        txFortesSagitario.setText("Otimismo, liberdade e entusiasmo. Gosta de aprender, conhecer coisas novas e encarar desafios com confiança.");
        txtFortesSagitario.setViewportView(txFortesSagitario);

        txMelhorarSagitario.setColumns(20);
        txMelhorarSagitario.setRows(5);
        txMelhorarSagitario.setText("Evitar agir sem pensar e cumprir melhor os compromissos assumidos. Ter mais atenção aos detalhes pode evitar problemas.");
        txtMelhorarSagitario.setViewportView(txMelhorarSagitario);

        javax.swing.GroupLayout areaCaracteristicasSagitarioLayout = new javax.swing.GroupLayout(areaCaracteristicasSagitario);
        areaCaracteristicasSagitario.setLayout(areaCaracteristicasSagitarioLayout);
        areaCaracteristicasSagitarioLayout.setHorizontalGroup(
            areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pfortesSagitario)
                    .addComponent(pMelhorarSagitario)
                    .addComponent(txtFortesSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtMelhorarSagitario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(tituloCaracteristicasSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        areaCaracteristicasSagitarioLayout.setVerticalGroup(
            areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloCaracteristicasSagitario)
                .addGap(18, 18, 18)
                .addComponent(pfortesSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFortesSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMelhorarSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sagitario.add(areaCaracteristicasSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 370, 350));

        tituloEnergiaSagitario.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloEnergiaSagitario.setText("Energia do Dia");

        amorSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amorSagitario.setText("Amor:");

        trabalhoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trabalhoSagitario.setText("Trabalho:");

        saudeSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saudeSagitario.setText("Saúde:");

        sorteSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sorteSagitario.setText("Sorte:");

        tfAmorSagitario.setText("86%");
        tfAmorSagitario.addActionListener(this::tfAmorSagitarioActionPerformed);

        tfTrabalhoSagitario.setText("84%");

        tfSaudeSagitario.setText("90%");

        tfSorteSagitario.setText("93%");
        tfSorteSagitario.addActionListener(this::tfSorteSagitarioActionPerformed);

        javax.swing.GroupLayout areaEnergiaSagitarioLayout = new javax.swing.GroupLayout(areaEnergiaSagitario);
        areaEnergiaSagitario.setLayout(areaEnergiaSagitarioLayout);
        areaEnergiaSagitarioLayout.setHorizontalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addGroup(areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amorSagitario)
                            .addComponent(trabalhoSagitario)
                            .addComponent(saudeSagitario)
                            .addComponent(sorteSagitario))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addGroup(areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfSorteSagitario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSaudeSagitario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTrabalhoSagitario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAmorSagitario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(tituloEnergiaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))))
        );
        areaEnergiaSagitarioLayout.setVerticalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloEnergiaSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(trabalhoSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTrabalhoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(saudeSagitario)
                .addGap(11, 11, 11)
                .addComponent(tfSaudeSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        sagitario.add(areaEnergiaSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 370, 350));

        previsaoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        previsaoSagitario.setText("Previsão do Dia");

        btnPrevisaoSagitario.setBackground(new java.awt.Color(0, 51, 102));
        btnPrevisaoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPrevisaoSagitario.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevisaoSagitario.setText("Atualizar Previsão");
        btnPrevisaoSagitario.addActionListener(this::btnPrevisaoSagitarioActionPerformed);

        txPrevisaoSagitario.setColumns(20);
        txPrevisaoSagitario.setRows(5);
        txtPrevisaoSagitario.setViewportView(txPrevisaoSagitario);

        javax.swing.GroupLayout areaPrevisoesSagitarioLayout = new javax.swing.GroupLayout(areaPrevisoesSagitario);
        areaPrevisoesSagitario.setLayout(areaPrevisoesSagitarioLayout);
        areaPrevisoesSagitarioLayout.setHorizontalGroup(
            areaPrevisoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesSagitarioLayout.createSequentialGroup()
                .addGroup(areaPrevisoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesSagitarioLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtPrevisaoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisoesSagitarioLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(previsaoSagitario))
                    .addGroup(areaPrevisoesSagitarioLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnPrevisaoSagitario)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoesSagitarioLayout.setVerticalGroup(
            areaPrevisoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesSagitarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrevisaoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevisaoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        sagitario.add(areaPrevisoesSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 370, 290));

        tituloMensagemSagitario.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloMensagemSagitario.setText("Mensagem do Dia");

        txMensagemSagitario.setColumns(20);
        txMensagemSagitario.setRows(5);
        txtMensagemSagitario.setViewportView(txMensagemSagitario);

        btnCopiarMsgSagitario.setBackground(new java.awt.Color(0, 51, 102));
        btnCopiarMsgSagitario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgSagitario.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgSagitario.setText("Copiar Mensagem");
        btnCopiarMsgSagitario.addActionListener(this::btnCopiarMsgSagitarioActionPerformed);

        javax.swing.GroupLayout areaMensagemSagitarioLayout = new javax.swing.GroupLayout(areaMensagemSagitario);
        areaMensagemSagitario.setLayout(areaMensagemSagitarioLayout);
        areaMensagemSagitarioLayout.setHorizontalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addGroup(areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnCopiarMsgSagitario))
                    .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(tituloMensagemSagitario)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        areaMensagemSagitarioLayout.setVerticalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloMensagemSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        sagitario.add(areaMensagemSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 370, 290));

        fundoInicio10.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\plano de fundo.png")); // NOI18N
        sagitario.add(fundoInicio10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Sagitário", sagitario);

        capricornio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoCapricornio.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\capricórnio.png")); // NOI18N

        tituloCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloCapricornio.setText("CAPRICÓRNIO");

        periodoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        periodoCapricornio.setText("PERÍODO:");

        elementoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        elementoCapricornio.setText("ELEMENTO:");

        planetaCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        planetaCapricornio.setText("PLANETA REGENTE:");

        corCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        corCapricornio.setText("COR:");

        numeroCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numeroCapricornio.setText("NÚMERO DA SORTE:");

        tfPeriodoCapricornio.setText("22/12 a 19/01");
        tfPeriodoCapricornio.addActionListener(this::tfPeriodoCapricornioActionPerformed);

        tfElementoCapricornio.setText("Terra");

        tfPlanetaCapricornio.setText("Saturno");

        tfCorCapricornio.setText("Marrom");
        tfCorCapricornio.addActionListener(this::tfCorCapricornioActionPerformed);

        tfNumeroCapricornio.setText("8");
        tfNumeroCapricornio.addActionListener(this::tfNumeroCapricornioActionPerformed);

        javax.swing.GroupLayout areaInformacoesCapricornioLayout = new javax.swing.GroupLayout(areaInformacoesCapricornio);
        areaInformacoesCapricornio.setLayout(areaInformacoesCapricornioLayout);
        areaInformacoesCapricornioLayout.setHorizontalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                        .addComponent(tituloCapricornio)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                        .addComponent(elementoCapricornio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfElementoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                        .addComponent(planetaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPlanetaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addComponent(numeroCapricornio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNumeroCapricornio))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addComponent(corCapricornio)
                            .addGap(18, 18, 18)
                            .addComponent(tfCorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                        .addComponent(periodoCapricornio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        areaInformacoesCapricornioLayout.setVerticalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoCapricornio)
                    .addComponent(tfPeriodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoCapricornio)
                    .addComponent(tfElementoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaCapricornio)
                    .addComponent(tfPlanetaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corCapricornio)
                    .addComponent(tfCorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroCapricornio)
                    .addComponent(tfNumeroCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        capricornio.add(areaInformacoesCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 270, 730));

        tituloCaracteristicasCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloCaracteristicasCapricornio.setText("Características");

        pfortesCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesCapricornio.setText("Pontos Fortes:");

        pMelhorarCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pMelhorarCapricornio.setText("Pontos a Melhorar:");

        txFortesCapricornio.setColumns(20);
        txFortesCapricornio.setRows(5);
        txFortesCapricornio.setText("Disciplina, responsabilidade e ambição. É persistente e costuma trabalhar com planejamento para alcançar resultados concretos.");
        txtFortesCapricornio.setViewportView(txFortesCapricornio);

        txMelhorarCapricornio.setColumns(20);
        txMelhorarCapricornio.setRows(5);
        txMelhorarCapricornio.setText("Evitar excesso de cobrança e aprender a descansar. Demonstrar mais os sentimentos pode fortalecer seus relacionamentos.");
        txtMelhorarCapricornio.setViewportView(txMelhorarCapricornio);

        javax.swing.GroupLayout areaCaracteristicasCapricornioLayout = new javax.swing.GroupLayout(areaCaracteristicasCapricornio);
        areaCaracteristicasCapricornio.setLayout(areaCaracteristicasCapricornioLayout);
        areaCaracteristicasCapricornioLayout.setHorizontalGroup(
            areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pfortesCapricornio)
                    .addComponent(pMelhorarCapricornio)
                    .addComponent(txtFortesCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtMelhorarCapricornio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCaracteristicasCapricornioLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(tituloCaracteristicasCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        areaCaracteristicasCapricornioLayout.setVerticalGroup(
            areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloCaracteristicasCapricornio)
                .addGap(18, 18, 18)
                .addComponent(pfortesCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFortesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMelhorarCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        capricornio.add(areaCaracteristicasCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 370, 350));

        tituloEnergiaCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloEnergiaCapricornio.setText("Energia do Dia");

        amorCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amorCapricornio.setText("Amor:");

        trabalhoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trabalhoCapricornio.setText("Trabalho:");

        saudeCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saudeCapricornio.setText("Saúde:");

        sorteCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sorteCapricornio.setText("Sorte:");

        tfAmorCapricornio.setText("78%");
        tfAmorCapricornio.addActionListener(this::tfAmorCapricornioActionPerformed);

        tfTrabalhoCapricornio.setText("96%");
        tfTrabalhoCapricornio.addActionListener(this::tfTrabalhoCapricornioActionPerformed);

        tfSaudeCapricornio.setText("83%");

        tfSorteCapricornio.setText("81%");

        javax.swing.GroupLayout areaEnergiaCapricornioLayout = new javax.swing.GroupLayout(areaEnergiaCapricornio);
        areaEnergiaCapricornio.setLayout(areaEnergiaCapricornioLayout);
        areaEnergiaCapricornioLayout.setHorizontalGroup(
            areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                        .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amorCapricornio)
                            .addComponent(trabalhoCapricornio)
                            .addComponent(saudeCapricornio)
                            .addComponent(sorteCapricornio))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaEnergiaCapricornioLayout.createSequentialGroup()
                        .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfSorteCapricornio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSaudeCapricornio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTrabalhoCapricornio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAmorCapricornio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(tituloEnergiaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))))
        );
        areaEnergiaCapricornioLayout.setVerticalGroup(
            areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloEnergiaCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(trabalhoCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTrabalhoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(saudeCapricornio)
                .addGap(11, 11, 11)
                .addComponent(tfSaudeCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        capricornio.add(areaEnergiaCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 370, 350));

        previsaoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        previsaoCapricornio.setText("Previsão do Dia");

        btnPrevisaoCapricornio.setBackground(new java.awt.Color(0, 51, 102));
        btnPrevisaoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPrevisaoCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevisaoCapricornio.setText("Atualizar Previsão");
        btnPrevisaoCapricornio.addActionListener(this::btnPrevisaoCapricornioActionPerformed);

        txPrevisaoCapricornio.setColumns(20);
        txPrevisaoCapricornio.setRows(5);
        txtPrevisaoCapricornio.setViewportView(txPrevisaoCapricornio);

        javax.swing.GroupLayout areaPrevisoesCapricornioLayout = new javax.swing.GroupLayout(areaPrevisoesCapricornio);
        areaPrevisoesCapricornio.setLayout(areaPrevisoesCapricornioLayout);
        areaPrevisoesCapricornioLayout.setHorizontalGroup(
            areaPrevisoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesCapricornioLayout.createSequentialGroup()
                .addGroup(areaPrevisoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesCapricornioLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtPrevisaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisoesCapricornioLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(previsaoCapricornio))
                    .addGroup(areaPrevisoesCapricornioLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnPrevisaoCapricornio)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoesCapricornioLayout.setVerticalGroup(
            areaPrevisoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesCapricornioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrevisaoCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevisaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        capricornio.add(areaPrevisoesCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 370, 290));

        tituloMensagemCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloMensagemCapricornio.setText("Mensagem do Dia");

        txMensagemCapricornio.setColumns(20);
        txMensagemCapricornio.setRows(5);
        txtMensagemCapricornio.setViewportView(txMensagemCapricornio);

        btnCopiarMsgCapricornio.setBackground(new java.awt.Color(0, 51, 102));
        btnCopiarMsgCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgCapricornio.setText("Copiar Mensagem");
        btnCopiarMsgCapricornio.addActionListener(this::btnCopiarMsgCapricornioActionPerformed);

        javax.swing.GroupLayout areaMensagemCapricornioLayout = new javax.swing.GroupLayout(areaMensagemCapricornio);
        areaMensagemCapricornio.setLayout(areaMensagemCapricornioLayout);
        areaMensagemCapricornioLayout.setHorizontalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addGroup(areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnCopiarMsgCapricornio))
                    .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(tituloMensagemCapricornio)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        areaMensagemCapricornioLayout.setVerticalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloMensagemCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        capricornio.add(areaMensagemCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 370, 290));

        fundoInicio11.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\plano de fundo.png")); // NOI18N
        capricornio.add(fundoInicio11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Capricórnio", capricornio);

        aquario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoAquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\aquário.png")); // NOI18N

        tituloAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloAquario.setText("AQUÁRIO");

        periodoAquario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        periodoAquario.setText("PERÍODO:");

        elementoAquario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        elementoAquario.setText("ELEMENTO:");

        planetaAquario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        planetaAquario.setText("PLANETA REGENTE:");

        corAquario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        corAquario.setText("COR:");

        numeroAquario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numeroAquario.setText("NÚMERO DA SORTE:");

        tfPeriodoAquario.setText("20/01 a 18/02");
        tfPeriodoAquario.addActionListener(this::tfPeriodoAquarioActionPerformed);

        tfElementoAquario.setText("Ar");

        tfPlanetaAquario.setText("Urano");

        tfCorAquario.setText("Azul");
        tfCorAquario.addActionListener(this::tfCorAquarioActionPerformed);

        tfNumeroAquario.setText("11");
        tfNumeroAquario.addActionListener(this::tfNumeroAquarioActionPerformed);

        javax.swing.GroupLayout areaInformacoesAquarioLayout = new javax.swing.GroupLayout(areaInformacoesAquario);
        areaInformacoesAquario.setLayout(areaInformacoesAquarioLayout);
        areaInformacoesAquarioLayout.setHorizontalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                        .addComponent(tituloAquario)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                        .addComponent(elementoAquario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfElementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                        .addComponent(planetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPlanetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAquarioLayout.createSequentialGroup()
                            .addComponent(numeroAquario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNumeroAquario))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAquarioLayout.createSequentialGroup()
                            .addComponent(corAquario)
                            .addGap(18, 18, 18)
                            .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                        .addComponent(periodoAquario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        areaInformacoesAquarioLayout.setVerticalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAquario)
                    .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAquario)
                    .addComponent(tfElementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAquario)
                    .addComponent(tfPlanetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAquario)
                    .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAquario)
                    .addComponent(tfNumeroAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        aquario.add(areaInformacoesAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 270, 730));

        tituloCaracteristicasAquario.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloCaracteristicasAquario.setText("Características");

        pfortesAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesAquario.setText("Pontos Fortes:");

        pMelhorarAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pMelhorarAquario.setText("Pontos a Melhorar:");

        txFortesAquario.setColumns(20);
        txFortesAquario.setRows(5);
        txFortesAquario.setText("Criatividade, independência e originalidade. Gosta de novas ideias, valoriza a liberdade e costuma enxergar soluções diferentes.");
        txtFortesAquario.setViewportView(txFortesAquario);

        txMelhorarAquario.setColumns(20);
        txMelhorarAquario.setRows(5);
        txMelhorarAquario.setText("Ter mais paciência com opiniões diferentes e demonstrar mais seus sentimentos. Nem sempre é necessário fazer tudo sozinho.");
        txtMelhorarAquario.setViewportView(txMelhorarAquario);

        javax.swing.GroupLayout areaCaracteristicasAquarioLayout = new javax.swing.GroupLayout(areaCaracteristicasAquario);
        areaCaracteristicasAquario.setLayout(areaCaracteristicasAquarioLayout);
        areaCaracteristicasAquarioLayout.setHorizontalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pfortesAquario)
                    .addComponent(pMelhorarAquario)
                    .addComponent(txtFortesAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtMelhorarAquario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(tituloCaracteristicasAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        areaCaracteristicasAquarioLayout.setVerticalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloCaracteristicasAquario)
                .addGap(18, 18, 18)
                .addComponent(pfortesAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFortesAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMelhorarAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aquario.add(areaCaracteristicasAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 370, 350));

        tituloEnergiaAquario.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloEnergiaAquario.setText("Energia do Dia");

        amorAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amorAquario.setText("Amor:");

        trabalhoAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trabalhoAquario.setText("Trabalho:");

        saudeAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saudeAquario.setText("Saúde:");

        sorteAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sorteAquario.setText("Sorte:");

        tfAmorAquario.setText("82%");
        tfAmorAquario.addActionListener(this::tfAmorAquarioActionPerformed);

        tfTrabalhoAquario.setText("89%");

        tfSaudeAquario.setText("76%");

        tfSorteAquario.setText("91%");

        javax.swing.GroupLayout areaEnergiaAquarioLayout = new javax.swing.GroupLayout(areaEnergiaAquario);
        areaEnergiaAquario.setLayout(areaEnergiaAquarioLayout);
        areaEnergiaAquarioLayout.setHorizontalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amorAquario)
                            .addComponent(trabalhoAquario)
                            .addComponent(saudeAquario)
                            .addComponent(sorteAquario))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaEnergiaAquarioLayout.createSequentialGroup()
                        .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfSorteAquario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSaudeAquario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTrabalhoAquario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAmorAquario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(tituloEnergiaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))))
        );
        areaEnergiaAquarioLayout.setVerticalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloEnergiaAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(trabalhoAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTrabalhoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(saudeAquario)
                .addGap(11, 11, 11)
                .addComponent(tfSaudeAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        aquario.add(areaEnergiaAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 370, 350));

        previsaoAquario.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        previsaoAquario.setText("Previsão do Dia");

        btnPrevisaoAquario.setBackground(new java.awt.Color(0, 51, 102));
        btnPrevisaoAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPrevisaoAquario.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevisaoAquario.setText("Atualizar Previsão");
        btnPrevisaoAquario.addActionListener(this::btnPrevisaoAquarioActionPerformed);

        txPrevisaoAquario.setColumns(20);
        txPrevisaoAquario.setRows(5);
        txtPrevisaoAquario.setViewportView(txPrevisaoAquario);

        javax.swing.GroupLayout areaPrevisoesAquarioLayout = new javax.swing.GroupLayout(areaPrevisoesAquario);
        areaPrevisoesAquario.setLayout(areaPrevisoesAquarioLayout);
        areaPrevisoesAquarioLayout.setHorizontalGroup(
            areaPrevisoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesAquarioLayout.createSequentialGroup()
                .addGroup(areaPrevisoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesAquarioLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtPrevisaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisoesAquarioLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(previsaoAquario))
                    .addGroup(areaPrevisoesAquarioLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnPrevisaoAquario)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoesAquarioLayout.setVerticalGroup(
            areaPrevisoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesAquarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrevisaoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevisaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        aquario.add(areaPrevisoesAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 370, 290));

        tituloMensagemAquario.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloMensagemAquario.setText("Mensagem do Dia");

        txMensagemAquario.setColumns(20);
        txMensagemAquario.setRows(5);
        txtMensagemAquario.setViewportView(txMensagemAquario);

        btnCopiarMsgAquario.setBackground(new java.awt.Color(0, 51, 102));
        btnCopiarMsgAquario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgAquario.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgAquario.setText("Copiar Mensagem");
        btnCopiarMsgAquario.addActionListener(this::btnCopiarMsgAquarioActionPerformed);

        javax.swing.GroupLayout areaMensagemAquarioLayout = new javax.swing.GroupLayout(areaMensagemAquario);
        areaMensagemAquario.setLayout(areaMensagemAquarioLayout);
        areaMensagemAquarioLayout.setHorizontalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addGroup(areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnCopiarMsgAquario))
                    .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(tituloMensagemAquario)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        areaMensagemAquarioLayout.setVerticalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloMensagemAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        aquario.add(areaMensagemAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 370, 290));

        fundoInicio12.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\plano de fundo.png")); // NOI18N
        aquario.add(fundoInicio12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Aquário", aquario);

        peixes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoPeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\peixes.png")); // NOI18N

        tituloPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloPeixes.setText("PEIXES");

        periodoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        periodoPeixes.setText("PERÍODO:");

        elementoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        elementoPeixes.setText("ELEMENTO:");

        planetaPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        planetaPeixes.setText("PLANETA REGENTE:");

        corPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        corPeixes.setText("COR:");

        numeroPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numeroPeixes.setText("NÚMERO DA SORTE:");

        tfPeriodoPeixes.setText("19/02 a 20/03");
        tfPeriodoPeixes.addActionListener(this::tfPeriodoPeixesActionPerformed);

        tfElementoPeixes.setText("Água");

        tfPlanetaPeixes.setText("Netuno");

        tfCorPeixes.setText("Lilás");
        tfCorPeixes.addActionListener(this::tfCorPeixesActionPerformed);

        tfNumeroPeixes.setText("7");
        tfNumeroPeixes.addActionListener(this::tfNumeroPeixesActionPerformed);

        javax.swing.GroupLayout areaInformacoesPeixesLayout = new javax.swing.GroupLayout(areaInformacoesPeixes);
        areaInformacoesPeixes.setLayout(areaInformacoesPeixesLayout);
        areaInformacoesPeixesLayout.setHorizontalGroup(
            areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                        .addComponent(tituloPeixes)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                        .addComponent(elementoPeixes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfElementoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                        .addComponent(planetaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPlanetaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesPeixesLayout.createSequentialGroup()
                            .addComponent(numeroPeixes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNumeroPeixes))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesPeixesLayout.createSequentialGroup()
                            .addComponent(corPeixes)
                            .addGap(18, 18, 18)
                            .addComponent(tfCorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                        .addComponent(periodoPeixes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPeriodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        areaInformacoesPeixesLayout.setVerticalGroup(
            areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoPeixes)
                    .addComponent(tfPeriodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoPeixes)
                    .addComponent(tfElementoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaPeixes)
                    .addComponent(tfPlanetaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corPeixes)
                    .addComponent(tfCorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroPeixes)
                    .addComponent(tfNumeroPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        peixes.add(areaInformacoesPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 270, 730));

        tituloCaracteristicasPeixes.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloCaracteristicasPeixes.setText("Características");

        pfortesPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pfortesPeixes.setText("Pontos Fortes:");

        pMelhorarPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pMelhorarPeixes.setText("Pontos a Melhorar:");

        txFortesPeixes.setColumns(20);
        txFortesPeixes.setRows(5);
        txFortesPeixes.setText("Empatia, criatividade e sensibilidade. Possui imaginação fértil e costuma compreender facilmente os sentimentos das pessoas.");
        txtFortesPeixes.setViewportView(txFortesPeixes);

        txMelhorarPeixes.setColumns(20);
        txMelhorarPeixes.setRows(5);
        txMelhorarPeixes.setText("Evitar absorver excessivamente os problemas dos outros e fugir da realidade. Estabelecer limites ajuda a preservar sua energia.");
        txtMelhorarPeixes.setViewportView(txMelhorarPeixes);

        javax.swing.GroupLayout areaCaracteristicasPeixesLayout = new javax.swing.GroupLayout(areaCaracteristicasPeixes);
        areaCaracteristicasPeixes.setLayout(areaCaracteristicasPeixesLayout);
        areaCaracteristicasPeixesLayout.setHorizontalGroup(
            areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pfortesPeixes)
                    .addComponent(pMelhorarPeixes)
                    .addComponent(txtFortesPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtMelhorarPeixes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCaracteristicasPeixesLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(tituloCaracteristicasPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        areaCaracteristicasPeixesLayout.setVerticalGroup(
            areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloCaracteristicasPeixes)
                .addGap(18, 18, 18)
                .addComponent(pfortesPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFortesPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMelhorarPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        peixes.add(areaCaracteristicasPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 370, 350));

        tituloEnergiaPeixes.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloEnergiaPeixes.setText("Energia do Dia");

        amorPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amorPeixes.setText("Amor:");

        trabalhoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        trabalhoPeixes.setText("Trabalho:");

        saudePeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saudePeixes.setText("Saúde:");

        sortePeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sortePeixes.setText("Sorte:");

        tfAmorPeixes.setText("95%");
        tfAmorPeixes.addActionListener(this::tfAmorPeixesActionPerformed);

        tfTrabalhoPeixes.setText("75%");
        tfTrabalhoPeixes.addActionListener(this::tfTrabalhoPeixesActionPerformed);

        tfSaudePeixes.setText("82%");

        tfSortePeixes.setText("87%");
        tfSortePeixes.addActionListener(this::tfSortePeixesActionPerformed);

        javax.swing.GroupLayout areaEnergiaPeixesLayout = new javax.swing.GroupLayout(areaEnergiaPeixes);
        areaEnergiaPeixes.setLayout(areaEnergiaPeixesLayout);
        areaEnergiaPeixesLayout.setHorizontalGroup(
            areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                        .addGroup(areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amorPeixes)
                            .addComponent(trabalhoPeixes)
                            .addComponent(saudePeixes)
                            .addComponent(sortePeixes))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaEnergiaPeixesLayout.createSequentialGroup()
                        .addGroup(areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfSortePeixes, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSaudePeixes, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTrabalhoPeixes, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAmorPeixes, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(tituloEnergiaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))))
        );
        areaEnergiaPeixesLayout.setVerticalGroup(
            areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloEnergiaPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amorPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(trabalhoPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTrabalhoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(saudePeixes)
                .addGap(11, 11, 11)
                .addComponent(tfSaudePeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortePeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSortePeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        peixes.add(areaEnergiaPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 370, 350));

        previsaoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        previsaoPeixes.setText("Previsão do Dia");

        btnPrevisaoPeixes.setBackground(new java.awt.Color(0, 51, 102));
        btnPrevisaoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPrevisaoPeixes.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevisaoPeixes.setText("Atualizar Previsão");
        btnPrevisaoPeixes.addActionListener(this::btnPrevisaoPeixesActionPerformed);

        txPrevisaoPeixes.setColumns(20);
        txPrevisaoPeixes.setRows(5);
        txtPrevisaoPeixes.setViewportView(txPrevisaoPeixes);

        javax.swing.GroupLayout areaPrevisoesPeixesLayout = new javax.swing.GroupLayout(areaPrevisoesPeixes);
        areaPrevisoesPeixes.setLayout(areaPrevisoesPeixesLayout);
        areaPrevisoesPeixesLayout.setHorizontalGroup(
            areaPrevisoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesPeixesLayout.createSequentialGroup()
                .addGroup(areaPrevisoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesPeixesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtPrevisaoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisoesPeixesLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(previsaoPeixes))
                    .addGroup(areaPrevisoesPeixesLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnPrevisaoPeixes)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisoesPeixesLayout.setVerticalGroup(
            areaPrevisoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesPeixesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrevisaoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevisaoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        peixes.add(areaPrevisoesPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 370, 290));

        tituloMensagemAries11.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        tituloMensagemAries11.setText("Mensagem do Dia");

        txMensagemPeixes.setColumns(20);
        txMensagemPeixes.setRows(5);
        txtMensagemPeixes.setViewportView(txMensagemPeixes);

        btnCopiarMsgPeixes.setBackground(new java.awt.Color(0, 51, 102));
        btnCopiarMsgPeixes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCopiarMsgPeixes.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMsgPeixes.setText("Copiar Mensagem");
        btnCopiarMsgPeixes.addActionListener(this::btnCopiarMsgPeixesActionPerformed);

        javax.swing.GroupLayout areaMensagemPeixesLayout = new javax.swing.GroupLayout(areaMensagemPeixes);
        areaMensagemPeixes.setLayout(areaMensagemPeixesLayout);
        areaMensagemPeixesLayout.setHorizontalGroup(
            areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                .addGroup(areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnCopiarMsgPeixes))
                    .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(tituloMensagemAries11)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        areaMensagemPeixesLayout.setVerticalGroup(
            areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloMensagemAries11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMsgPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        peixes.add(areaMensagemPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 370, 290));

        fundoInicio13.setIcon(new javax.swing.ImageIcon("C:\\Users\\IsraelSantos\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\plano de fundo.png")); // NOI18N
        peixes.add(fundoInicio13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Peixes", peixes);

        getContentPane().add(areaAbas);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDiaActionPerformed

    private void btnDescobrirSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescobrirSignoActionPerformed
        // TODO add your handling code here:
        CalcularSigno();
    }//GEN-LAST:event_btnDescobrirSignoActionPerformed

    private void tfCompatibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCompatibilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCompatibilidadeActionPerformed

    private void btnSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignoActionPerformed

    private void tfPeriodoAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoAriesActionPerformed

    private void tfNumeroAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroAriesActionPerformed

    private void tfCorAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorAriesActionPerformed

    private void btnPrevisaoAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevisaoAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevisaoAriesActionPerformed

    private void tfAmorAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorAriesActionPerformed

    private void btnCopiarMsgAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarMsgAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiarMsgAriesActionPerformed

    private void tfPeriodoTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoTouroActionPerformed

    private void tfCorTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorTouroActionPerformed

    private void tfNumeroTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroTouroActionPerformed

    private void tfAmorTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorTouroActionPerformed

    private void btnPrevisaoTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevisaoTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevisaoTouroActionPerformed

    private void btnCopiarMsgTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarMsgTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiarMsgTouroActionPerformed

    private void tfPeriodoGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoGemeosActionPerformed

    private void tfCorGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorGemeosActionPerformed

    private void tfNumeroGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroGemeosActionPerformed

    private void tfAmorGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorGemeosActionPerformed

    private void btnPrevisaoGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevisaoGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevisaoGemeosActionPerformed

    private void btnCopiarMsgGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarMsgGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiarMsgGemeosActionPerformed

    private void tfPeriodoCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoCancerActionPerformed

    private void tfCorCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorCancerActionPerformed

    private void tfNumeroCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroCancerActionPerformed

    private void tfAmorCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorCancerActionPerformed

    private void btnPrevisaoCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevisaoCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevisaoCancerActionPerformed

    private void btnCopiarMsgCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarMsgCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiarMsgCancerActionPerformed

    private void tfPeriodoLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoLeaoActionPerformed

    private void tfCorLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorLeaoActionPerformed

    private void tfNumeroLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroLeaoActionPerformed

    private void tfAmorLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorLeaoActionPerformed

    private void btnPrevisaoLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevisaoLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevisaoLeaoActionPerformed

    private void btnCopiarMsgLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarMsgLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiarMsgLeaoActionPerformed

    private void tfPeriodoVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoVirgemActionPerformed

    private void tfCorVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorVirgemActionPerformed

    private void tfNumeroVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroVirgemActionPerformed

    private void tfAmorVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorVirgemActionPerformed

    private void btnPrevisaoVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevisaoVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevisaoVirgemActionPerformed

    private void btnCopiarMsgVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarMsgVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiarMsgVirgemActionPerformed

    private void tfPeriodoLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoLibraActionPerformed

    private void tfCorLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorLibraActionPerformed

    private void tfNumeroLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroLibraActionPerformed

    private void tfAmorLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorLibraActionPerformed

    private void btnPrevisaoLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevisaoLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevisaoLibraActionPerformed

    private void btnCopiarMsgLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarMsgLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiarMsgLibraActionPerformed

    private void tfPeriodoEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoEscorpiaoActionPerformed

    private void tfCorEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorEscorpiaoActionPerformed

    private void tfNumeroEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroEscorpiaoActionPerformed

    private void tfAmorEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorEscorpiaoActionPerformed

    private void btnPrevisaoEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevisaoEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevisaoEscorpiaoActionPerformed

    private void btnCopiarMsgEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarMsgEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiarMsgEscorpiaoActionPerformed

    private void tfPeriodoSagitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoSagitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoSagitarioActionPerformed

    private void tfCorSagitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorSagitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorSagitarioActionPerformed

    private void tfNumeroSagitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroSagitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroSagitarioActionPerformed

    private void tfAmorSagitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorSagitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorSagitarioActionPerformed

    private void btnPrevisaoSagitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevisaoSagitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevisaoSagitarioActionPerformed

    private void btnCopiarMsgSagitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarMsgSagitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiarMsgSagitarioActionPerformed

    private void tfPeriodoCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoCapricornioActionPerformed

    private void tfCorCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorCapricornioActionPerformed

    private void tfNumeroCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroCapricornioActionPerformed

    private void tfAmorCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorCapricornioActionPerformed

    private void btnPrevisaoCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevisaoCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevisaoCapricornioActionPerformed

    private void btnCopiarMsgCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarMsgCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiarMsgCapricornioActionPerformed

    private void tfPeriodoAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoAquarioActionPerformed

    private void tfCorAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorAquarioActionPerformed

    private void tfNumeroAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroAquarioActionPerformed

    private void tfAmorAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorAquarioActionPerformed

    private void btnPrevisaoAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevisaoAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevisaoAquarioActionPerformed

    private void btnCopiarMsgAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarMsgAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiarMsgAquarioActionPerformed

    private void tfPeriodoPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoPeixesActionPerformed

    private void tfCorPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorPeixesActionPerformed

    private void tfNumeroPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroPeixesActionPerformed

    private void tfAmorPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorPeixesActionPerformed

    private void btnPrevisaoPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevisaoPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevisaoPeixesActionPerformed

    private void btnCopiarMsgPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarMsgPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiarMsgPeixesActionPerformed

    private void tfPlanetaLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaLibraActionPerformed

    private void tfElementoEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoEscorpiaoActionPerformed

    private void tfSorteSagitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSorteSagitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSorteSagitarioActionPerformed

    private void tfTrabalhoCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTrabalhoCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTrabalhoCapricornioActionPerformed

    private void tfTrabalhoPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTrabalhoPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTrabalhoPeixesActionPerformed

    private void tfSortePeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSortePeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSortePeixesActionPerformed

    private void cbSigno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSigno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSigno2ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        CalcularCompatibilidade();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        // TODO add your handling code here:
        TocarMusica();
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        // TODO add your handling code here:
        PausarMusica();
    }//GEN-LAST:event_btnPauseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Signos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Signo1;
    private javax.swing.JLabel Signo2;
    private javax.swing.JLabel amorAquario;
    private javax.swing.JLabel amorAries;
    private javax.swing.JLabel amorCancer;
    private javax.swing.JLabel amorCapricornio;
    private javax.swing.JLabel amorEscorpiao;
    private javax.swing.JLabel amorGemeos;
    private javax.swing.JLabel amorLeao;
    private javax.swing.JLabel amorLibra;
    private javax.swing.JLabel amorPeixes;
    private javax.swing.JLabel amorSagitario;
    private javax.swing.JLabel amorTouro;
    private javax.swing.JLabel amorVirgem;
    private javax.swing.JPanel aquario;
    private javax.swing.JTabbedPane areaAbas;
    private javax.swing.JPanel areaCaracteristicasAquario;
    private javax.swing.JPanel areaCaracteristicasAries;
    private javax.swing.JPanel areaCaracteristicasCancer;
    private javax.swing.JPanel areaCaracteristicasCapricornio;
    private javax.swing.JPanel areaCaracteristicasEscorpiao;
    private javax.swing.JPanel areaCaracteristicasGemeos;
    private javax.swing.JPanel areaCaracteristicasLeao;
    private javax.swing.JPanel areaCaracteristicasLibra;
    private javax.swing.JPanel areaCaracteristicasPeixes;
    private javax.swing.JPanel areaCaracteristicasSagitario;
    private javax.swing.JPanel areaCaracteristicasTouro;
    private javax.swing.JPanel areaCaracteristicasVirgem;
    private javax.swing.JPanel areaDescobrirSigno;
    private javax.swing.JPanel areaDescobrirSigno1;
    private javax.swing.JPanel areaEnergiaAquario;
    private javax.swing.JPanel areaEnergiaAries;
    private javax.swing.JPanel areaEnergiaCancer;
    private javax.swing.JPanel areaEnergiaCapricornio;
    private javax.swing.JPanel areaEnergiaEscorpiao;
    private javax.swing.JPanel areaEnergiaGemeos;
    private javax.swing.JPanel areaEnergiaLeao;
    private javax.swing.JPanel areaEnergiaLibra;
    private javax.swing.JPanel areaEnergiaPeixes;
    private javax.swing.JPanel areaEnergiaSagitario;
    private javax.swing.JPanel areaEnergiaTouro;
    private javax.swing.JPanel areaEnergiaVirgem;
    private javax.swing.JPanel areaInformacoesAquario;
    private javax.swing.JPanel areaInformacoesAries;
    private javax.swing.JPanel areaInformacoesCancer;
    private javax.swing.JPanel areaInformacoesCapricornio;
    private javax.swing.JPanel areaInformacoesEscorpiao;
    private javax.swing.JPanel areaInformacoesGemeos;
    private javax.swing.JPanel areaInformacoesLeao;
    private javax.swing.JPanel areaInformacoesLibra;
    private javax.swing.JPanel areaInformacoesPeixes;
    private javax.swing.JPanel areaInformacoesSagitario;
    private javax.swing.JPanel areaInformacoesTouro;
    private javax.swing.JPanel areaInformacoesVirgem;
    private javax.swing.JPanel areaMensagemAquario;
    private javax.swing.JPanel areaMensagemAries;
    private javax.swing.JPanel areaMensagemCancer;
    private javax.swing.JPanel areaMensagemCapricornio;
    private javax.swing.JPanel areaMensagemEscorpiao;
    private javax.swing.JPanel areaMensagemGemeos;
    private javax.swing.JPanel areaMensagemLeao;
    private javax.swing.JPanel areaMensagemLibra;
    private javax.swing.JPanel areaMensagemPeixes;
    private javax.swing.JPanel areaMensagemSagitario;
    private javax.swing.JPanel areaMensagemTouro;
    private javax.swing.JPanel areaMensagemVirgem;
    private javax.swing.JPanel areaPrevisoesAquario;
    private javax.swing.JPanel areaPrevisoesAries;
    private javax.swing.JPanel areaPrevisoesCancer;
    private javax.swing.JPanel areaPrevisoesCapricornio;
    private javax.swing.JPanel areaPrevisoesEscorpiao;
    private javax.swing.JPanel areaPrevisoesGemeos;
    private javax.swing.JPanel areaPrevisoesLeao;
    private javax.swing.JPanel areaPrevisoesLibra;
    private javax.swing.JPanel areaPrevisoesPeixes;
    private javax.swing.JPanel areaPrevisoesSagitario;
    private javax.swing.JPanel areaPrevisoesTouro;
    private javax.swing.JPanel areaPrevisoesVirgem;
    private javax.swing.JPanel areaResultado;
    private javax.swing.JPanel aries;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCopiarMsgAquario;
    private javax.swing.JButton btnCopiarMsgAries;
    private javax.swing.JButton btnCopiarMsgCancer;
    private javax.swing.JButton btnCopiarMsgCapricornio;
    private javax.swing.JButton btnCopiarMsgEscorpiao;
    private javax.swing.JButton btnCopiarMsgGemeos;
    private javax.swing.JButton btnCopiarMsgLeao;
    private javax.swing.JButton btnCopiarMsgLibra;
    private javax.swing.JButton btnCopiarMsgPeixes;
    private javax.swing.JButton btnCopiarMsgSagitario;
    private javax.swing.JButton btnCopiarMsgTouro;
    private javax.swing.JButton btnCopiarMsgVirgem;
    private javax.swing.JButton btnDescobrirSigno;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnPrevisaoAquario;
    private javax.swing.JButton btnPrevisaoAries;
    private javax.swing.JButton btnPrevisaoCancer;
    private javax.swing.JButton btnPrevisaoCapricornio;
    private javax.swing.JButton btnPrevisaoEscorpiao;
    private javax.swing.JButton btnPrevisaoGemeos;
    private javax.swing.JButton btnPrevisaoLeao;
    private javax.swing.JButton btnPrevisaoLibra;
    private javax.swing.JButton btnPrevisaoPeixes;
    private javax.swing.JButton btnPrevisaoSagitario;
    private javax.swing.JButton btnPrevisaoTouro;
    private javax.swing.JButton btnPrevisaoVirgem;
    private javax.swing.JButton btnSigno;
    private javax.swing.JPanel cancer;
    private javax.swing.JPanel capricornio;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbSigno1;
    private javax.swing.JComboBox<String> cbSigno2;
    private javax.swing.JLabel compatibilidade;
    private javax.swing.JLabel corAquario;
    private javax.swing.JLabel corAries;
    private javax.swing.JLabel corCancer;
    private javax.swing.JLabel corCapricornio;
    private javax.swing.JLabel corEscorpiao;
    private javax.swing.JLabel corGemeos;
    private javax.swing.JLabel corLeao;
    private javax.swing.JLabel corLibra;
    private javax.swing.JLabel corPeixes;
    private javax.swing.JLabel corSagitario;
    private javax.swing.JLabel corTouro;
    private javax.swing.JLabel corVirgem;
    private javax.swing.JLabel diaNascimento;
    private javax.swing.JLabel elementoAquario;
    private javax.swing.JLabel elementoAries;
    private javax.swing.JLabel elementoAries5;
    private javax.swing.JLabel elementoCancer;
    private javax.swing.JLabel elementoCapricornio;
    private javax.swing.JLabel elementoEscorpiao;
    private javax.swing.JLabel elementoGemeos;
    private javax.swing.JLabel elementoLeao;
    private javax.swing.JLabel elementoLibra;
    private javax.swing.JLabel elementoPeixes;
    private javax.swing.JLabel elementoSagitario;
    private javax.swing.JLabel elementoTouro;
    private javax.swing.JPanel escorpiao;
    private javax.swing.JLabel fundoInicio;
    private javax.swing.JLabel fundoInicio10;
    private javax.swing.JLabel fundoInicio11;
    private javax.swing.JLabel fundoInicio12;
    private javax.swing.JLabel fundoInicio13;
    private javax.swing.JLabel fundoInicio2;
    private javax.swing.JLabel fundoInicio3;
    private javax.swing.JLabel fundoInicio4;
    private javax.swing.JLabel fundoInicio5;
    private javax.swing.JLabel fundoInicio6;
    private javax.swing.JLabel fundoInicio7;
    private javax.swing.JLabel fundoInicio8;
    private javax.swing.JLabel fundoInicio9;
    private javax.swing.JPanel gemeos;
    private javax.swing.JLabel imgSignoAquario;
    private javax.swing.JLabel imgSignoAries;
    private javax.swing.JLabel imgSignoCancer;
    private javax.swing.JLabel imgSignoCapricornio;
    private javax.swing.JLabel imgSignoEscorpiao;
    private javax.swing.JLabel imgSignoGemeos;
    private javax.swing.JLabel imgSignoLeao;
    private javax.swing.JLabel imgSignoLibra;
    private javax.swing.JLabel imgSignoPeixes;
    private javax.swing.JLabel imgSignoSagitario;
    private javax.swing.JLabel imgSignoTouro;
    private javax.swing.JLabel imgSignoVirgem;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel leao;
    private javax.swing.JPanel libra;
    private javax.swing.JLabel mesNascimento;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numeroAquario;
    private javax.swing.JLabel numeroAries;
    private javax.swing.JLabel numeroCancer;
    private javax.swing.JLabel numeroCapricornio;
    private javax.swing.JLabel numeroEscorpiao;
    private javax.swing.JLabel numeroGemeos;
    private javax.swing.JLabel numeroLeao;
    private javax.swing.JLabel numeroLibra;
    private javax.swing.JLabel numeroPeixes;
    private javax.swing.JLabel numeroSagitario;
    private javax.swing.JLabel numeroTouro;
    private javax.swing.JLabel numeroVirgem;
    private javax.swing.JLabel pMelhorarAquario;
    private javax.swing.JLabel pMelhorarAries;
    private javax.swing.JLabel pMelhorarCancer;
    private javax.swing.JLabel pMelhorarCapricornio;
    private javax.swing.JLabel pMelhorarEscorpiao;
    private javax.swing.JLabel pMelhorarGemeos;
    private javax.swing.JLabel pMelhorarLeao;
    private javax.swing.JLabel pMelhorarLibra;
    private javax.swing.JLabel pMelhorarPeixes;
    private javax.swing.JLabel pMelhorarSagitario;
    private javax.swing.JLabel pMelhorarTouro;
    private javax.swing.JLabel pMelhorarVirgem;
    private javax.swing.JPanel peixes;
    private javax.swing.JLabel periodoAquario;
    private javax.swing.JLabel periodoAries;
    private javax.swing.JLabel periodoCancer;
    private javax.swing.JLabel periodoCapricornio;
    private javax.swing.JLabel periodoEscorpiao;
    private javax.swing.JLabel periodoGemeos;
    private javax.swing.JLabel periodoLeao;
    private javax.swing.JLabel periodoLibra;
    private javax.swing.JLabel periodoPeixes;
    private javax.swing.JLabel periodoSagitario;
    private javax.swing.JLabel periodoTouro;
    private javax.swing.JLabel periodoVirgem;
    private javax.swing.JLabel pfortesAquario;
    private javax.swing.JLabel pfortesAries;
    private javax.swing.JLabel pfortesCancer;
    private javax.swing.JLabel pfortesCapricornio;
    private javax.swing.JLabel pfortesEscorpiao;
    private javax.swing.JLabel pfortesGemeos;
    private javax.swing.JLabel pfortesLeao;
    private javax.swing.JLabel pfortesLibra;
    private javax.swing.JLabel pfortesPeixes;
    private javax.swing.JLabel pfortesSagitario;
    private javax.swing.JLabel pfortesTouro;
    private javax.swing.JLabel pfortesVirgem;
    private javax.swing.JLabel planetaAquario;
    private javax.swing.JLabel planetaAries;
    private javax.swing.JLabel planetaCancer;
    private javax.swing.JLabel planetaCapricornio;
    private javax.swing.JLabel planetaEscorpiao;
    private javax.swing.JLabel planetaGemeos;
    private javax.swing.JLabel planetaLeao;
    private javax.swing.JLabel planetaLibra;
    private javax.swing.JLabel planetaPeixes;
    private javax.swing.JLabel planetaSagitario;
    private javax.swing.JLabel planetaTouro;
    private javax.swing.JLabel planetaVirgem;
    private javax.swing.JLabel previsaoAquario;
    private javax.swing.JLabel previsaoAries;
    private javax.swing.JLabel previsaoCancer;
    private javax.swing.JLabel previsaoCapricornio;
    private javax.swing.JLabel previsaoEscorpiao;
    private javax.swing.JLabel previsaoGemeos;
    private javax.swing.JLabel previsaoLeao;
    private javax.swing.JLabel previsaoLibra;
    private javax.swing.JLabel previsaoPeixes;
    private javax.swing.JLabel previsaoSagitario;
    private javax.swing.JLabel previsaoTouro;
    private javax.swing.JLabel previsaoVirgem;
    private javax.swing.JPanel sagitario;
    private javax.swing.JLabel saudeAquario;
    private javax.swing.JLabel saudeAries;
    private javax.swing.JLabel saudeCancer;
    private javax.swing.JLabel saudeCapricornio;
    private javax.swing.JLabel saudeEscorpiao;
    private javax.swing.JLabel saudeGemeos;
    private javax.swing.JLabel saudeLeao;
    private javax.swing.JLabel saudeLibra;
    private javax.swing.JLabel saudePeixes;
    private javax.swing.JLabel saudeSagitario;
    private javax.swing.JLabel saudeTouro;
    private javax.swing.JLabel saudeVirgem;
    private javax.swing.JLabel signo;
    private javax.swing.JLabel sorteAquario;
    private javax.swing.JLabel sorteAries;
    private javax.swing.JLabel sorteCancer;
    private javax.swing.JLabel sorteCapricornio;
    private javax.swing.JLabel sorteEscorpiao;
    private javax.swing.JLabel sorteGemeos;
    private javax.swing.JLabel sorteLeao;
    private javax.swing.JLabel sorteLibra;
    private javax.swing.JLabel sortePeixes;
    private javax.swing.JLabel sorteSagitario;
    private javax.swing.JLabel sorteTouro;
    private javax.swing.JLabel sorteVirgem;
    private javax.swing.JTextField tfAmorAquario;
    private javax.swing.JTextField tfAmorAries;
    private javax.swing.JTextField tfAmorCancer;
    private javax.swing.JTextField tfAmorCapricornio;
    private javax.swing.JTextField tfAmorEscorpiao;
    private javax.swing.JTextField tfAmorGemeos;
    private javax.swing.JTextField tfAmorLeao;
    private javax.swing.JTextField tfAmorLibra;
    private javax.swing.JTextField tfAmorPeixes;
    private javax.swing.JTextField tfAmorSagitario;
    private javax.swing.JTextField tfAmorTouro;
    private javax.swing.JTextField tfAmorVirgem;
    private javax.swing.JTextField tfCompatibilidade;
    private javax.swing.JTextField tfCorAquario;
    private javax.swing.JTextField tfCorAries;
    private javax.swing.JTextField tfCorCancer;
    private javax.swing.JTextField tfCorCapricornio;
    private javax.swing.JTextField tfCorEscorpiao;
    private javax.swing.JTextField tfCorGemeos;
    private javax.swing.JTextField tfCorLeao;
    private javax.swing.JTextField tfCorLibra;
    private javax.swing.JTextField tfCorPeixes;
    private javax.swing.JTextField tfCorSagitario;
    private javax.swing.JTextField tfCorTouro;
    private javax.swing.JTextField tfCorVirgem;
    private javax.swing.JTextField tfElementoAquario;
    private javax.swing.JTextField tfElementoAries;
    private javax.swing.JTextField tfElementoCancer;
    private javax.swing.JTextField tfElementoCapricornio;
    private javax.swing.JTextField tfElementoEscorpiao;
    private javax.swing.JTextField tfElementoGemeos;
    private javax.swing.JTextField tfElementoLeao;
    private javax.swing.JTextField tfElementoLibra;
    private javax.swing.JTextField tfElementoPeixes;
    private javax.swing.JTextField tfElementoSagitario;
    private javax.swing.JTextField tfElementoTouro;
    private javax.swing.JTextField tfElementoVirgem;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumeroAquario;
    private javax.swing.JTextField tfNumeroAries;
    private javax.swing.JTextField tfNumeroCancer;
    private javax.swing.JTextField tfNumeroCapricornio;
    private javax.swing.JTextField tfNumeroEscorpiao;
    private javax.swing.JTextField tfNumeroGemeos;
    private javax.swing.JTextField tfNumeroLeao;
    private javax.swing.JTextField tfNumeroLibra;
    private javax.swing.JTextField tfNumeroPeixes;
    private javax.swing.JTextField tfNumeroSagitario;
    private javax.swing.JTextField tfNumeroTouro;
    private javax.swing.JTextField tfNumeroVirgem;
    private javax.swing.JTextField tfPeriodoAquario;
    private javax.swing.JTextField tfPeriodoAries;
    private javax.swing.JTextField tfPeriodoCancer;
    private javax.swing.JTextField tfPeriodoCapricornio;
    private javax.swing.JTextField tfPeriodoEscorpiao;
    private javax.swing.JTextField tfPeriodoGemeos;
    private javax.swing.JTextField tfPeriodoLeao;
    private javax.swing.JTextField tfPeriodoLibra;
    private javax.swing.JTextField tfPeriodoPeixes;
    private javax.swing.JTextField tfPeriodoSagitario;
    private javax.swing.JTextField tfPeriodoTouro;
    private javax.swing.JTextField tfPeriodoVirgem;
    private javax.swing.JTextField tfPlanetaAquario;
    private javax.swing.JTextField tfPlanetaAries;
    private javax.swing.JTextField tfPlanetaCancer;
    private javax.swing.JTextField tfPlanetaCapricornio;
    private javax.swing.JTextField tfPlanetaEscorpiao;
    private javax.swing.JTextField tfPlanetaGemeos;
    private javax.swing.JTextField tfPlanetaLeao;
    private javax.swing.JTextField tfPlanetaLibra;
    private javax.swing.JTextField tfPlanetaPeixes;
    private javax.swing.JTextField tfPlanetaSagitario;
    private javax.swing.JTextField tfPlanetaTouro;
    private javax.swing.JTextField tfPlanetaVirgem;
    private javax.swing.JTextField tfSaudeAquario;
    private javax.swing.JTextField tfSaudeAries;
    private javax.swing.JTextField tfSaudeCancer;
    private javax.swing.JTextField tfSaudeCapricornio;
    private javax.swing.JTextField tfSaudeEscorpiao;
    private javax.swing.JTextField tfSaudeGemeos;
    private javax.swing.JTextField tfSaudeLeao;
    private javax.swing.JTextField tfSaudeLibra;
    private javax.swing.JTextField tfSaudePeixes;
    private javax.swing.JTextField tfSaudeSagitario;
    private javax.swing.JTextField tfSaudeTouro;
    private javax.swing.JTextField tfSaudeVirgem;
    private javax.swing.JTextField tfSorteAquario;
    private javax.swing.JTextField tfSorteAries;
    private javax.swing.JTextField tfSorteCancer;
    private javax.swing.JTextField tfSorteCapricornio;
    private javax.swing.JTextField tfSorteEscorpiao;
    private javax.swing.JTextField tfSorteGemeos;
    private javax.swing.JTextField tfSorteLeao;
    private javax.swing.JTextField tfSorteLibra;
    private javax.swing.JTextField tfSortePeixes;
    private javax.swing.JTextField tfSorteSagitario;
    private javax.swing.JTextField tfSorteTouro;
    private javax.swing.JTextField tfSorteVirgem;
    private javax.swing.JTextField tfTrabalhoAquario;
    private javax.swing.JTextField tfTrabalhoAries;
    private javax.swing.JTextField tfTrabalhoCancer;
    private javax.swing.JTextField tfTrabalhoCapricornio;
    private javax.swing.JTextField tfTrabalhoEscorpiao;
    private javax.swing.JTextField tfTrabalhoGemeos;
    private javax.swing.JTextField tfTrabalhoLeao;
    private javax.swing.JTextField tfTrabalhoLibra;
    private javax.swing.JTextField tfTrabalhoPeixes;
    private javax.swing.JTextField tfTrabalhoSagitario;
    private javax.swing.JTextField tfTrabalhoTouro;
    private javax.swing.JTextField tfTrabalhoVirgem;
    private javax.swing.JLabel tituloAquario;
    private javax.swing.JLabel tituloAries;
    private javax.swing.JLabel tituloCancer;
    private javax.swing.JLabel tituloCapricornio;
    private javax.swing.JLabel tituloCaracteristicasAquario;
    private javax.swing.JLabel tituloCaracteristicasAries;
    private javax.swing.JLabel tituloCaracteristicasCancer;
    private javax.swing.JLabel tituloCaracteristicasCapricornio;
    private javax.swing.JLabel tituloCaracteristicasEscorpiao;
    private javax.swing.JLabel tituloCaracteristicasGemeos;
    private javax.swing.JLabel tituloCaracteristicasLeao;
    private javax.swing.JLabel tituloCaracteristicasLibra;
    private javax.swing.JLabel tituloCaracteristicasPeixes;
    private javax.swing.JLabel tituloCaracteristicasSagitario;
    private javax.swing.JLabel tituloCaracteristicasTouro;
    private javax.swing.JLabel tituloCaracteristicasVirgem;
    private javax.swing.JLabel tituloCompatibilidade1;
    private javax.swing.JLabel tituloEnergiaAquario;
    private javax.swing.JLabel tituloEnergiaAries;
    private javax.swing.JLabel tituloEnergiaCancer;
    private javax.swing.JLabel tituloEnergiaCapricornio;
    private javax.swing.JLabel tituloEnergiaEscorpiao;
    private javax.swing.JLabel tituloEnergiaGemeos;
    private javax.swing.JLabel tituloEnergiaLeao;
    private javax.swing.JLabel tituloEnergiaLibra;
    private javax.swing.JLabel tituloEnergiaPeixes;
    private javax.swing.JLabel tituloEnergiaSagitario;
    private javax.swing.JLabel tituloEnergiaTouro;
    private javax.swing.JLabel tituloEnergiaVirgem;
    private javax.swing.JLabel tituloEscorpiao;
    private javax.swing.JLabel tituloGemeos;
    private javax.swing.JLabel tituloLeao;
    private javax.swing.JLabel tituloLibra;
    private javax.swing.JLabel tituloMensagemAquario;
    private javax.swing.JLabel tituloMensagemAries;
    private javax.swing.JLabel tituloMensagemAries11;
    private javax.swing.JLabel tituloMensagemCancer;
    private javax.swing.JLabel tituloMensagemCapricornio;
    private javax.swing.JLabel tituloMensagemEscorpiao;
    private javax.swing.JLabel tituloMensagemGemeos;
    private javax.swing.JLabel tituloMensagemLeao;
    private javax.swing.JLabel tituloMensagemLibra;
    private javax.swing.JLabel tituloMensagemSagitario;
    private javax.swing.JLabel tituloMensagemTouro;
    private javax.swing.JLabel tituloMensagemVirgem;
    private javax.swing.JLabel tituloPeixes;
    private javax.swing.JLabel tituloSagitario;
    private javax.swing.JLabel tituloTouro;
    private javax.swing.JLabel tituloVirgem;
    private javax.swing.JPanel touro;
    private javax.swing.JLabel trabalhoAquario;
    private javax.swing.JLabel trabalhoAries;
    private javax.swing.JLabel trabalhoCancer;
    private javax.swing.JLabel trabalhoCapricornio;
    private javax.swing.JLabel trabalhoEscorpiao;
    private javax.swing.JLabel trabalhoGemeos;
    private javax.swing.JLabel trabalhoLeao;
    private javax.swing.JLabel trabalhoLibra;
    private javax.swing.JLabel trabalhoPeixes;
    private javax.swing.JLabel trabalhoSagitario;
    private javax.swing.JLabel trabalhoTouro;
    private javax.swing.JLabel trabalhoVirgem;
    private javax.swing.JTextArea txFortesAquario;
    private javax.swing.JTextArea txFortesAries;
    private javax.swing.JTextArea txFortesCancer;
    private javax.swing.JTextArea txFortesCapricornio;
    private javax.swing.JTextArea txFortesEscorpiao;
    private javax.swing.JTextArea txFortesGemeos;
    private javax.swing.JTextArea txFortesLeao;
    private javax.swing.JTextArea txFortesLibra;
    private javax.swing.JTextArea txFortesPeixes;
    private javax.swing.JTextArea txFortesSagitario;
    private javax.swing.JTextArea txFortesTouro;
    private javax.swing.JTextArea txFortesVirgem;
    private javax.swing.JTextArea txMelhorarAquario;
    private javax.swing.JTextArea txMelhorarAries;
    private javax.swing.JTextArea txMelhorarCancer;
    private javax.swing.JTextArea txMelhorarCapricornio;
    private javax.swing.JTextArea txMelhorarEscorpiao;
    private javax.swing.JTextArea txMelhorarGemeos;
    private javax.swing.JTextArea txMelhorarLeao;
    private javax.swing.JTextArea txMelhorarLibra;
    private javax.swing.JTextArea txMelhorarPeixes;
    private javax.swing.JTextArea txMelhorarSagitario;
    private javax.swing.JTextArea txMelhorarTouro;
    private javax.swing.JTextArea txMelhorarVirgem;
    private javax.swing.JTextArea txMensagemAquario;
    private javax.swing.JTextArea txMensagemAries;
    private javax.swing.JTextArea txMensagemCancer;
    private javax.swing.JTextArea txMensagemCapricornio;
    private javax.swing.JTextArea txMensagemEscorpiao;
    private javax.swing.JTextArea txMensagemGemeos;
    private javax.swing.JTextArea txMensagemLeao;
    private javax.swing.JTextArea txMensagemLibra;
    private javax.swing.JTextArea txMensagemPeixes;
    private javax.swing.JTextArea txMensagemSagitario;
    private javax.swing.JTextArea txMensagemTouro;
    private javax.swing.JTextArea txMensagemVirgem;
    private javax.swing.JTextArea txPrevisaoAquario;
    private javax.swing.JTextArea txPrevisaoAries;
    private javax.swing.JTextArea txPrevisaoCancer;
    private javax.swing.JTextArea txPrevisaoCapricornio;
    private javax.swing.JTextArea txPrevisaoEscorpiao;
    private javax.swing.JTextArea txPrevisaoGemeos;
    private javax.swing.JTextArea txPrevisaoLeao;
    private javax.swing.JTextArea txPrevisaoLibra;
    private javax.swing.JTextArea txPrevisaoPeixes;
    private javax.swing.JTextArea txPrevisaoSagitario;
    private javax.swing.JTextArea txPrevisaoTouro;
    private javax.swing.JTextArea txPrevisaoVirgem;
    private javax.swing.JScrollPane txtFortesAquario;
    private javax.swing.JScrollPane txtFortesAries;
    private javax.swing.JScrollPane txtFortesCancer;
    private javax.swing.JScrollPane txtFortesCapricornio;
    private javax.swing.JScrollPane txtFortesEscorpiao;
    private javax.swing.JScrollPane txtFortesGemeos;
    private javax.swing.JScrollPane txtFortesLeao;
    private javax.swing.JScrollPane txtFortesLibra;
    private javax.swing.JScrollPane txtFortesPeixes;
    private javax.swing.JScrollPane txtFortesSagitario;
    private javax.swing.JScrollPane txtFortesTouro;
    private javax.swing.JScrollPane txtFortesVirgem;
    private javax.swing.JScrollPane txtMelhorarAquario;
    private javax.swing.JScrollPane txtMelhorarAries;
    private javax.swing.JScrollPane txtMelhorarCancer;
    private javax.swing.JScrollPane txtMelhorarCapricornio;
    private javax.swing.JScrollPane txtMelhorarEscorpiao;
    private javax.swing.JScrollPane txtMelhorarGemeos;
    private javax.swing.JScrollPane txtMelhorarLeao;
    private javax.swing.JScrollPane txtMelhorarLibra;
    private javax.swing.JScrollPane txtMelhorarPeixes;
    private javax.swing.JScrollPane txtMelhorarSagitario;
    private javax.swing.JScrollPane txtMelhorarTouro;
    private javax.swing.JScrollPane txtMelhorarVirgem;
    private javax.swing.JScrollPane txtMensagemAquario;
    private javax.swing.JScrollPane txtMensagemAries;
    private javax.swing.JScrollPane txtMensagemCancer;
    private javax.swing.JScrollPane txtMensagemCapricornio;
    private javax.swing.JScrollPane txtMensagemEscorpiao;
    private javax.swing.JScrollPane txtMensagemGemeos;
    private javax.swing.JScrollPane txtMensagemLeao;
    private javax.swing.JScrollPane txtMensagemLibra;
    private javax.swing.JScrollPane txtMensagemPeixes;
    private javax.swing.JScrollPane txtMensagemSagitario;
    private javax.swing.JScrollPane txtMensagemTouro;
    private javax.swing.JScrollPane txtMensagemVirgem;
    private javax.swing.JScrollPane txtPrevisaoAquario;
    private javax.swing.JScrollPane txtPrevisaoAries;
    private javax.swing.JScrollPane txtPrevisaoCancer;
    private javax.swing.JScrollPane txtPrevisaoCapricornio;
    private javax.swing.JScrollPane txtPrevisaoEscorpiao;
    private javax.swing.JScrollPane txtPrevisaoGemeos;
    private javax.swing.JScrollPane txtPrevisaoLeao;
    private javax.swing.JScrollPane txtPrevisaoLibra;
    private javax.swing.JScrollPane txtPrevisaoPeixes;
    private javax.swing.JScrollPane txtPrevisaoSagitario;
    private javax.swing.JScrollPane txtPrevisaoTouro;
    private javax.swing.JScrollPane txtPrevisaoVirgem;
    private javax.swing.JPanel virgem;
    // End of variables declaration//GEN-END:variables
}
