/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author raven
 */
public final class DB
{
    private static volatile DB instance = null;
    
    // Conexion con la BD
    Connection c = null;
    
    // Variable general para consultas
    Statement query = null, query1 = null;
    
    // Variable general para resultados
    ResultSet res = null;
    
    private DB () {
               
        try {
            Class.forName("org.sqlite.JDBC");
            //c = DriverManager.getConnection("jdbc:sqlite:"+this.getClass().getResource("/app.bd"));
            c = DriverManager.getConnection("jdbc:sqlite:src/app.bd");
            query = c.createStatement();
        } catch (Exception e) { imprimirExcepcion(e); System.exit(0); }
        finally {}
    }
    
    public int insertGeneral (String table, String... values) {
        String strQuery, con;
        con = "'";
        
        if (values[0].equals("null")) con = "";
        
        strQuery = "INSERT INTO "+table+" VALUES ("+con;
        strQuery += values[0];
        
        for(int i=1; i < values.length ; i++) {
            strQuery += con+", '"+values[i];
        }
        strQuery += "');";
        try {
            query.executeUpdate(strQuery);
            return query.getGeneratedKeys().getInt(1);
        } catch (Exception e) { imprimirExcepcion(e, strQuery); return -1; }
    }
    
    public void guardarDatos (String idSemana, String cargadopor, String dateCarga, String semana, String dateInicio, String dateFinal, String nDiasLaborables, String nTrabajadores, String nHorasJornada, String totalHorasHombre, String jornadaEmpieza, String jornadaTermina, ArrayList datosTrabajos) {
        if(!semana.isEmpty()){
            if(notExistSemana(semana).equals("null")){
                try {
                    query.executeQuery("INSERT INTO `semanas` (cargado_por, "
                            + "fecha_carga_datos,"
                            + "fecha_inicio,"
                            + "fecha_fin, "
                            + "num_semana, "
                            + "jornada_empieza, "
                            + "jornada_termina, "
                            + "dias_laborables,"
                            + "trabajadores_disponibles, "
                            + "horas_laborables_jornada, "
                            + "total_horas_hombre_dispon, "
                            + "manpred_trabprog_orden, "
                            + "manprev_trabprog_orden, "
                            + "mancorrp_trabprog_orden, "
                            + "mancorre_trabprog_orden, " 
                            + "manpred_trabprog_horas, "
                            + "manprev_trabprog_horas, "
                            + "mancorrp_trabprog_horas, "
                            + "mancorre_trabprog_horas, "
                            + "manpred_trabrec_orden, "
                            + "manprev_trabrec_orden, "
                            + "mancorrp_trabrec_orden, "
                            + "mancorre_trabrec_orden, "
                            + "manpred_trabrec_horas, "
                            + "manprev_trabrec_horas, "
                            + "mancorrp_trabrec_horas, "
                            + "mancorre_trabrec_horas, "
                            + "manpred_trabejec_orden, "
                            + "manprev_trabejec_orden, "
                            + "mancorrp_trabejec_orden, "
                            + "mancorre_trabejec_orden, "
                            + "manpred_trabejec_horas, "
                            + "manprev_trabejec_horas, "
                            + "mancorrp_trabejec_horas, "
                            + "mancorre_trabejec_horas, "
                            + "manpred_trabejec_horas_normales, "
                            + "manprev_trabejec_horas_normales, "
                            + "mancorrp_trabejec_horas_normales, "
                            + "mancorre_trabejec_horas_normales, "
                            + "manpred_trabejec_horas_extras, "
                            + "manprev_trabejec_horas_extras, "
                            + "mancorrp_trabejec_horas_extras, "
                            + "mancorre_trabejec_horas_extras, "
                            + "manpred_trabejec_total, "
                            + "manprev_trabejec_total, "
                            + "mancorrp_trabejec_total, "
                            + "mancorre_trabejec_total, "
                            + "manpred_trabejec_ot, "
                            + "manprev_trabejec_ot, "
                            + "mancorrp_trabejec_ot, "
                            + "mancorre_trabejec_ot, "
                            + "manpred_prodsex_orden, "
                            + "manprev_prodsex_orden, "
                            + "mancorrp_prodsex_orden, "
                            + "mancorre_prodsex_orden, "
                            + "manpred_prodsex_horas, "
                            + "manprev_prodsex_horas, "
                            + "mancorrp_prodsex_horas, "
                            + "mancorre_prodsex_horas"
                            + ") "
                            + "VALUES ('"+cargadopor+"', "
                                    + "'"+dateCarga+"', "
                                    + "'"+dateInicio+"', "
                                    + "'"+dateFinal+"', "
                                    + "'"+semana+"', "
                                    + "'"+jornadaEmpieza+"', "
                                    + "'"+jornadaTermina+"', "
                                    + "'"+nDiasLaborables+"', "
                                    + "'"+nTrabajadores+"', "
                                    + "'"+nHorasJornada+"', "
                                    + "'"+totalHorasHombre+"', "
                                    + "'"+datosTrabajos.get(0)+"', "
                                    + "'"+datosTrabajos.get(1)+"', "
                                    + "'"+datosTrabajos.get(2)+"', "
                                    + "'"+datosTrabajos.get(3)+"', "
                                    + "'"+datosTrabajos.get(4)+"', "
                                    + "'"+datosTrabajos.get(5)+"', "
                                    + "'"+datosTrabajos.get(6)+"', "
                                    + "'"+datosTrabajos.get(7)+"', "
                                    + "'"+datosTrabajos.get(8)+"', "
                                    + "'"+datosTrabajos.get(9)+"', "
                                    + "'"+datosTrabajos.get(10)+"', "
                                    + "'"+datosTrabajos.get(11)+"', "
                                    + "'"+datosTrabajos.get(12)+"', "
                                    + "'"+datosTrabajos.get(13)+"', "
                                    + "'"+datosTrabajos.get(14)+"', "
                                    + "'"+datosTrabajos.get(15)+"', "
                                    + "'"+datosTrabajos.get(16)+"', "
                                    + "'"+datosTrabajos.get(17)+"', "
                                    + "'"+datosTrabajos.get(18)+"', "
                                    + "'"+datosTrabajos.get(19)+"', "
                                    + "'"+datosTrabajos.get(20)+"', "
                                    + "'"+datosTrabajos.get(21)+"', "
                                    + "'"+datosTrabajos.get(22)+"', "
                                    + "'"+datosTrabajos.get(23)+"', "
                                    + "'"+datosTrabajos.get(24)+"', "
                                    + "'"+datosTrabajos.get(25)+"', "
                                    + "'"+datosTrabajos.get(26)+"', "
                                    + "'"+datosTrabajos.get(27)+"', "
                                    + "'"+datosTrabajos.get(28)+"', "
                                    + "'"+datosTrabajos.get(29)+"', "
                                    + "'"+datosTrabajos.get(30)+"', "
                                    + "'"+datosTrabajos.get(31)+"', "
                                    + "'"+datosTrabajos.get(32)+"', "
                                    + "'"+datosTrabajos.get(33)+"', "
                                    + "'"+datosTrabajos.get(34)+"', "
                                    + "'"+datosTrabajos.get(35)+"', "
                                    + "'"+datosTrabajos.get(36)+"', "
                                    + "'"+datosTrabajos.get(37)+"', "
                                    + "'"+datosTrabajos.get(38)+"', "
                                    + "'"+datosTrabajos.get(39)+"', "
                                    + "'"+datosTrabajos.get(40)+"', "
                                    + "'"+datosTrabajos.get(41)+"', "
                                    + "'"+datosTrabajos.get(42)+"', "
                                    + "'"+datosTrabajos.get(43)+"', "
                                    + "'"+datosTrabajos.get(44)+"', "
                                    + "'"+datosTrabajos.get(45)+"', "
                                    + "'"+datosTrabajos.get(46)+"', "
                                    + "'"+datosTrabajos.get(47)+"' "
                                            + ")");                 
                } catch (Exception e) {imprimirExcepcion(e); }
            }
            else{
                try {
                    query.executeQuery("UPDATE `semanas` "
                            + "SET cargado_por = '"+cargadopor+"', "
                            + "jornada_empieza = '"+jornadaEmpieza+"', "
                            + "jornada_termina = '"+jornadaTermina+"',"        
                            // TRABAJOS
                            + "manpred_trabprog_orden = '"+datosTrabajos.get(0)+"', "
                            + "manprev_trabprog_orden = '"+datosTrabajos.get(1)+"', "
                            + "mancorrp_trabprog_orden = '"+datosTrabajos.get(2)+"', "
                            + "mancorre_trabprog_orden = '"+datosTrabajos.get(3)+"', " 
                            + "manpred_trabprog_horas = '"+datosTrabajos.get(4)+"', "
                            + "manprev_trabprog_horas = '"+datosTrabajos.get(5)+"', "
                            + "mancorrp_trabprog_horas = '"+datosTrabajos.get(6)+"', "
                            + "mancorre_trabprog_horas = '"+datosTrabajos.get(7)+"', "
                            + "manpred_trabrec_orden = '"+datosTrabajos.get(8)+"', "
                            + "manprev_trabrec_orden = '"+datosTrabajos.get(9)+"', "
                            + "mancorrp_trabrec_orden = '"+datosTrabajos.get(10)+"', "
                            + "mancorre_trabrec_orden = '"+datosTrabajos.get(11)+"', "
                            + "manpred_trabrec_horas = '"+datosTrabajos.get(12)+"', "
                            + "manprev_trabrec_horas = '"+datosTrabajos.get(13)+"', "
                            + "mancorrp_trabrec_horas = '"+datosTrabajos.get(14)+"', "
                            + "mancorre_trabrec_horas = '"+datosTrabajos.get(15)+"', "
                            + "manpred_trabejec_orden = '"+datosTrabajos.get(16)+"', "
                            + "manprev_trabejec_orden = '"+datosTrabajos.get(17)+"', "
                            + "mancorrp_trabejec_orden = '"+datosTrabajos.get(18)+"', "
                            + "mancorre_trabejec_orden = '"+datosTrabajos.get(19)+"', "
                            + "manpred_trabejec_horas = '"+datosTrabajos.get(20)+"', "
                            + "manprev_trabejec_horas = '"+datosTrabajos.get(21)+"', "
                            + "mancorrp_trabejec_horas = '"+datosTrabajos.get(22)+"', "
                            + "mancorre_trabejec_horas = '"+datosTrabajos.get(23)+"', "
                            + "manpred_trabejec_horas_normales = '"+datosTrabajos.get(24)+"', "
                            + "manprev_trabejec_horas_normales = '"+datosTrabajos.get(25)+"', "
                            + "mancorrp_trabejec_horas_normales = '"+datosTrabajos.get(26)+"', "
                            + "mancorre_trabejec_horas_normales = '"+datosTrabajos.get(27)+"', "
                            + "manpred_trabejec_horas_extras = '"+datosTrabajos.get(28)+"', "
                            + "manprev_trabejec_horas_extras = '"+datosTrabajos.get(29)+"', "
                            + "mancorrp_trabejec_horas_extras = '"+datosTrabajos.get(30)+"', "
                            + "mancorre_trabejec_horas_extras = '"+datosTrabajos.get(31)+"', "
                            + "manpred_trabejec_total = '"+datosTrabajos.get(32)+"', "
                            + "manprev_trabejec_total = '"+datosTrabajos.get(33)+"', "
                            + "mancorrp_trabejec_total = '"+datosTrabajos.get(34)+"', "
                            + "mancorre_trabejec_total = '"+datosTrabajos.get(35)+"', "
                            + "manpred_trabejec_ot = '"+datosTrabajos.get(36)+"', "
                            + "manprev_trabejec_ot = '"+datosTrabajos.get(37)+"', "
                            + "mancorrp_trabejec_ot = '"+datosTrabajos.get(38)+"', "
                            + "mancorre_trabejec_ot = '"+datosTrabajos.get(39)+"', "
                            + "manpred_prodsex_orden = '"+datosTrabajos.get(40)+"', "
                            + "manprev_prodsex_orden = '"+datosTrabajos.get(41)+"', "
                            + "mancorrp_prodsex_orden = '"+datosTrabajos.get(42)+"', "
                            + "mancorre_prodsex_orden = '"+datosTrabajos.get(43)+"', "
                            + "manpred_prodsex_horas = '"+datosTrabajos.get(44)+"', "
                            + "manprev_prodsex_horas = '"+datosTrabajos.get(45)+"', "
                            + "mancorrp_prodsex_horas = '"+datosTrabajos.get(46)+"', "
                            + "mancorre_prodsex_horas = '"+datosTrabajos.get(47)+"' "
                            + " WHERE id = '"+idSemana+"'" 
                            + " ");
                    
                } catch (Exception e) {imprimirExcepcion(e); }
            }
        } 
    }
    
    public String notExistSemana(String numsemana){
        String valor = "null";

        try {
            res = query.executeQuery("SELECT * FROM `semanas` WHERE num_semana = '"+numsemana+"'");
            if(res.next()) {valor = res.getString(1);}
        } catch (Exception e) { imprimirExcepcion(e); }
        
        return valor;
    }
    
    public int numSemanas(){
        int num = 0;
        try {
            res = query.executeQuery("SELECT count(*) as total FROM `semanas`");
            if(res.next()) num = Integer.parseInt(res.getString(1)); 
        } catch (Exception e) { imprimirExcepcion(e); }
        
        return num;
    }
    
    public ResultSet allSemanas(){
        try {
            res = query.executeQuery("SELECT count(*) as total FROM `semanas`");
            
        } catch (Exception e) { imprimirExcepcion(e); }
        
        return res;
    }
    
    public ResultSet searchSemana(String inicio, String fin, String numsemana){
        try {
            res = query.executeQuery("SELECT * FROM `semanas` WHERE fecha_inicio  = '"+inicio+"' AND fecha_fin = '"+fin+"' AND num_semana = '"+numsemana+"' ");
                   
        } catch (Exception e) { imprimirExcepcion(e); }
       
        return res;
    }
    
    public ResultSet lastSemana(String inicio){
        try {
            res = query.executeQuery("SELECT * FROM semanas WHERE fecha_inicio < '"+inicio+"' ORDER BY fecha_inicio desc limit 1");
                   
        } catch (Exception e) { imprimirExcepcion(e); }
       
        return res;
    }
    
    public ResultSet searchDatosGestionDesdeHasta(String desde, String hasta){
        try {
            res = query.executeQuery("SELECT * FROM semanas WHERE fecha_inicio >= "+ desde +" AND fecha_fin <=" + hasta);
        } catch (Exception e) { imprimirExcepcion(e); }
        
        return res;
    }
    
    public ResultSet getValor (String tabla, String columna, String valor){ //throws SQLException{
        try {
            res = query.executeQuery("SELECT * FROM "+ tabla +" WHERE "+ columna +"='"+valor+"'");
        } catch (Exception e) { imprimirExcepcion(e); }
        return res;
    }
    
    public ResultSet getTablas() {
        try {
            res = query.executeQuery("SELECT name FROM sqlite_master WHERE type='table'");
        } catch (Exception e) { imprimirExcepcion(e); }
        return res;
    }
    
    private void imprimirExcepcion(Exception e) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.out.println();
    }
    
    private void imprimirExcepcion(Exception e, String q) {
        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        System.out.println(q);
        System.out.println();
        
    }
    
    public static synchronized DB getInstance() {
        if (instance == null) instance = new DB();
        return instance;
    }
}