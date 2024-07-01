/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package SistemaHospitalar;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.Date;

import modelo.Paciente;

/**
 *
 * @author Daniel
 */
public class PacientTest {

    private Paciente paciente;
    private Date dataNascimento;

    @Before
    public void setUp() {
        dataNascimento = new Date();
        paciente = new Paciente(1, "João", "Rua 1, 200", dataNascimento, "1234567890", "12345678909", "1234567890", "joao.rua1@email.com", 101);
    }

    @Test
    public void testPacienteConstrutorVazio() {
        Paciente p = new Paciente();
        assertNotNull(p);
    }

    @Test
    public void testPacienteConstrutorCompleto() {
        assertEquals(1, paciente.getIdPaciente());
        assertEquals("João", paciente.getNome());
        assertEquals("Rua 1, 200", paciente.getEndereco());
        assertEquals(dataNascimento, paciente.getDataNascimento());
        assertEquals("1234567890", paciente.getTelefone());
        assertEquals("12345678909", paciente.getCpf());
        assertEquals("1234567890", paciente.getRg());
        assertEquals("joao.teste@email.com", paciente.getEmail());
        assertEquals(101, paciente.getConvenio());
    }

    @Test
    public void testSetIdPaciente() {
        paciente.setIdPaciente(2);
        assertEquals(2, paciente.getIdPaciente());
    }

    @Test
    public void testSetNome() {
        paciente.setNome("Jane");
        assertEquals("Jane", paciente.getNome());
    }

    @Test
    public void testSetEndereco() {
        paciente.setEndereco("Rua A");
        assertEquals("Rua A", paciente.getEndereco());
    }

    @Test
    public void testSetDataNascimento() {
        Date newDate = new Date();
        paciente.setDataNascimento(newDate);
        assertEquals(newDate, paciente.getDataNascimento());
    }

    @Test
    public void testSetTelefone() {
        paciente.setTelefone("999999999");
        assertEquals("999999999", paciente.getTelefone());
    }

    @Test
    public void testSetCpf() {
        paciente.setCpf("12345678901");
        assertEquals("12345678901", paciente.getCpf());
    }

    @Test
    public void testSetRg() {
        paciente.setRg("1234567");
        assertEquals("1234567", paciente.getRg());
    }

    @Test
    public void testSetEmail() {
        paciente.setEmail("jane.teste@teste.com");
        assertEquals("jane.teste@teste.com", paciente.getEmail());
    }

    @Test
    public void testSetConvenio() {
        paciente.setConvenio(202);
        assertEquals(202, paciente.getConvenio());
    }
}
