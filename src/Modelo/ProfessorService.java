/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author hochforce
 */
public class ProfessorService {

    private ArrayList<ProfessorModel> professores;

    public void loadProfessores() {
        professores = new ArrayList<ProfessorModel>();

        try {
            File inputFile = new File(".//src/professor.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("professor");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    ProfessorModel professor = new ProfessorModel();

                    Integer id = Integer.parseInt(eElement.getAttribute("id"));
                    professor.setId(id);

                    String nome = eElement.getElementsByTagName("nome").item(0).getTextContent();
                    professor.setNome(nome);

                    Integer idade = Integer.parseInt(eElement.getElementsByTagName("idade").item(0).getTextContent());
                    professor.setIdade(idade);

                    String sobrenome = eElement.getElementsByTagName("sobrenome").item(0).getTextContent();
                    professor.setSobrenome(sobrenome);

                    //Adiciona o professor na lista
                    professores.add(professor);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ProfessorModel getProfessor(Integer id) {
        return null;
    }

    public void adicionaNovoProfessor(ProfessorModel professor) {

    }

    public void gravarProfessorNaBaseXML() {

    }

    public ArrayList<ProfessorModel> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<ProfessorModel> professores) {
        this.professores = professores;
    }

    public void limparProfessores() {
        if (professores != null) {
            professores.clear();
        }
    }

}
