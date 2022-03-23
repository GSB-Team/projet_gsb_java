/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import Entity.Graph2Simon;
import Entity.Graph3Dumitru;
import Entity.Laboratoire;
import Entity.Region;
import Entity.Secteur;
import Entity.Travailler;
import Entity.User;
import Entity.Visiteur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dimmi
 */
public class FonctionsMetier implements IMetier
{

    @Override
    public User GetUnUser(String login, String mdp) {
        User unUser = null;
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select idUser, userName from users where loginUser = '"+login+"' and pwdUser = '"+mdp+"'");
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                unUser = new User(rs.getInt("idUser"), rs.getString("userName"));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unUser;
    }

    @Override
    public ArrayList<Region> GetAllRegions() 
    {
        ArrayList<Region> lesRegions = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select reg_code, reg_nom, sec_code from region");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Region regs = new Region(rs.getInt("reg_code"), rs.getString("reg_nom"), rs.getInt("sec_code"));
                lesRegions.add(regs);
            }
            ps.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesRegions;
    }

    @Override
    public ArrayList<Secteur> GetAllSecteurs() 
    {
        ArrayList<Secteur> lesSecteurs = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select sec_code, sec_libelle from secteur");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Secteur sec = new Secteur(rs.getInt("sec_code"), rs.getString("sec_libelle"));
                lesSecteurs.add(sec);
            }
            ps.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesSecteurs;
    }

    @Override
    public ArrayList<Visiteur> GetAllVisiteurs() 
    {
        ArrayList<Visiteur> lesVisiteurs = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select vis_matricule, vis_nom, vis_prenom, vis_adresse, vis_cp, vis_ville, vis_dateembauche, sec_code, lab_code from visiteur");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Visiteur vis = new Visiteur(rs.getInt("vis_matricule"), rs.getString("vis_nom"), rs.getString("vis_prenom"), rs.getString("vis_adresse"), rs.getInt("vis_cp"), rs.getString("vis_ville"), rs.getString("vis_dateembauche"), rs.getInt("sec_code"), rs.getInt("lab_code"));
                lesVisiteurs.add(vis);
            }
            ps.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesVisiteurs;
    }

    @Override
    public ArrayList<Laboratoire> GetAllLaboratoires() 
    {
        ArrayList<Laboratoire> lesLaboratoires = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select lab_code, lab_nom, lab_chefvente from labo");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Laboratoire lab = new Laboratoire(rs.getInt("lab_code"), rs.getString("lab_nom"), rs.getString("lab_chefvente"));
                lesLaboratoires.add(lab);
            }
            ps.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesLaboratoires;
    }

    @Override
    public ArrayList<Travailler> GetListTravail() {
        ArrayList<Travailler> lesTravailleurs = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select vis_matricule, reg_code, aaaammjj, tra_role from travailler");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Travailler tra = new Travailler(rs.getInt("vis_matricule"), rs.getInt("reg_code"), rs.getString("aaaammjj") , rs.getString("tra_role"));
                lesTravailleurs.add(tra);
            }
            ps.close();
        } catch (SQLException ex) 
        {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesTravailleurs;
    }

    @Override
    public void InsererRegion(int regCode, String regNom, int secCode) {
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("insert into region values('"+regCode+"', '"+regNom+"', '"+secCode+"')");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void InsererVisiteur(int visMatricule, String visNom, String visPrenom, String visAdresse, int visCodePostal, String visVille, String visDateEmbauche, int secCode, int labCode) {
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("insert into visiteur values("+visMatricule+", '"+visNom+"', '"+visPrenom+"', '"+visAdresse+"', "+visCodePostal+", '"+visVille+"', '"+visDateEmbauche+"', "+secCode+", "+labCode+" )");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int GetLastRegCode() {
        int CodeRegion = 0;
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select max(reg_code) as num from region");
            ResultSet rs = ps.executeQuery();
            rs.next();
            CodeRegion = rs.getInt("num") + 1;
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CodeRegion;
    }

    @Override
    public int GetLastMatriculeCode() {
        int Matricule = 0;
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select max(vis_matricule) as num from visiteur");
            ResultSet rs = ps.executeQuery();
            rs.next();
            Matricule = rs.getInt("num") + 1;
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Matricule;
    }
    
    @Override
    public String GetNomVille(int codePostal) {
        String nomVille = "";
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("SELECT vis_ville FROM visiteur WHERE vis_cp = "+codePostal+" LIMIT 1");
            ResultSet rs = ps.executeQuery();
            rs.next();
            nomVille = rs.getString("vis_ville");
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nomVille;
    }

    @Override
    public void InsererTravailleur(int visMatricule, String regCode, String date, String role) {
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("insert into travailler values("+visMatricule+", "+regCode+", '"+date+"', '"+role+"' )");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Region GetUnRegion(int unCode) {
        Region unRegion = null;
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select reg_code, reg_nom, sec_code from region where reg_code =  " + unCode + "");
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                unRegion = new Region(rs.getInt("reg_code"), rs.getString("reg_nom"), rs.getInt("sec_code"));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unRegion;
    }

    @Override
    public void ModifierRegion(int regCode, String regNom, int secCode) {
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("UPDATE region SET region.reg_code = "+regCode+", region.reg_nom = '"+regNom+"', region.sec_code = "+secCode+" WHERE region.reg_code = "+regCode+";");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public Visiteur GetUnVisiteur(int uneMatricule) {
        Visiteur unVisiteur = null;
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select vis_matricule, vis_nom, vis_prenom, vis_adresse, vis_cp, vis_ville, vis_dateembauche, sec_code, lab_code from visiteur where vis_matricule =  " + uneMatricule + "");
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                unVisiteur = new Visiteur(rs.getInt("vis_matricule"), rs.getString("vis_nom"), rs.getString("vis_prenom"), rs.getString("vis_adresse"), rs.getInt("vis_cp"), rs.getString("vis_ville"), rs.getString("vis_dateembauche"), rs.getInt("sec_code"), rs.getInt("lab_code"));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unVisiteur;
    }

    @Override
    public void ModifierVisiteur(int visMatricule, String visNom, String visPrenom, String visAdresse, int visCodePostal, String visVille, String visDateEmbauche, int secCode, int labCode) {
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("UPDATE visiteur SET visiteur.vis_matricule = '"+visMatricule+"', visiteur.vis_nom = '"+visNom+"', visiteur.vis_prenom = '"+visPrenom+"', visiteur.vis_adresse = '"+visAdresse+"', visiteur.vis_cp = "+visCodePostal+", visiteur.vis_ville = '"+visVille+"', visiteur.vis_dateembauche = '"+visDateEmbauche+"', visiteur.sec_code = '"+secCode+"', visiteur.lab_code = "+labCode+" WHERE visiteur.vis_matricule = "+visMatricule+";");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Graph3Dumitru> getGraph3()
    {
        ArrayList<Graph3Dumitru> dataGraph3 = new ArrayList<>();
        
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("SELECT COUNT(visiteur.vis_matricule), visiteur.vis_dateembauche FROM `visiteur` GROUP BY visiteur.vis_dateembauche;");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Graph3Dumitru gra3 = new Graph3Dumitru(rs.getString("visiteur.vis_dateembauche"), rs.getInt("COUNT(visiteur.vis_matricule)"));
                dataGraph3.add(gra3);
            }
            ps.close();
        } catch (Exception e) {
        }    
        return dataGraph3;
    }
    
    public ArrayList<Graph2Simon> getGraph2()
    {
        ArrayList<Graph2Simon> datas = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("SELECT region.reg_nom, count(vis_matricule) as nbVisiteur\n" +
                                                        "FROM `travailler`\n" +
                                                        "INNER JOIN region on travailler.reg_code = region.reg_code \n" +
                                                        "GROUP BY reg_nom \n" +
                                                        "ORDER BY nbVisiteur  DESC LIMIT 0,10");
            ResultSet rs = ps.executeQuery();
        
            while(rs.next())
            {
                Graph2Simon dgs = new Graph2Simon(rs.getString(1), rs.getInt(2));
                datas.add(dgs);
               
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return datas;
    }
    
}
