package PadroesCriacao.Builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBuilder {

    @Test
    void retornarProdutoSemNome() {
        try {
            ProdutoBuilder produtoBuilder = new ProdutoBuilder();
            Produto produto = produtoBuilder
                    .setPreco(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void retornarProdutoSemPreco(){
        try{
            ProdutoBuilder produtoBuilder = new ProdutoBuilder();
            Produto produto = produtoBuilder
                    .setNome("Detergente")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preco inválido", e.getMessage());
        }

    }

    @Test
    void retornarProdutoValido(){
        ProdutoBuilder produtoBuilder = new ProdutoBuilder();
        Produto produto = produtoBuilder
                .setNome("Detergente")
                .setDescricao("Detergente Ype")
                .setPreco(4)
                .build();

        assertEquals("Detergente",produto.getNome());
        assertEquals("Detergente Ype",produto.getDescricao());
        assertEquals(4,produto.getPreco());
        assertNotNull(produto);
    }
}
