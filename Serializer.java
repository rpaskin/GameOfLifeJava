import java.io.*;
class Serializer implements Serializable{
	void serializeBoard(Board board){
		try{
			FileOutputStream arquivoSalvarBoard = new FileOutputStream("board.ser");
			ObjectOutputStream object = new ObjectOutputStream(arquivoSalvarBoard);
			object.writeObject(board);
			object.flush();
			object.close();
			arquivoSalvarBoard.flush();
			arquivoSalvarBoard.close();

			System.out.println("Salvamos o objeto board");
			System.out.println("~~Miguel lixo~~");

		} catch(Exception ex){
			ex.printStackTrace();
		}
	}

	void deserializeBoard(Board board){
		try{
			FileInputStream arquivoPegaBoard = new FileInputStream("board.ser");
			ObjectInputStream objLeitura = new ObjectInputStream(arquivoPegaBoard);
			System.out.println(objLeitura.readObject());
			arquivoPegaBoard.close();
			objLeitura.close();
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}
}