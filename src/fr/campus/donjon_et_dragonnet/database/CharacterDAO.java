package fr.campus.donjon_et_dragonnet.database;

import fr.campus.donjon_et_dragonnet.entity.Character;
import java.sql.*;

public class CharacterDAO {

    //attributs
    //méthodes
    public void saveCharacter(Character character){
        String query = "INSERT INTO Characters (Type, Name, LifePoints, Strength, OffensiveEquipment, DefensiveEquipment) " +
                "VALUE (?, ?, ?, ?, ?, ?)";
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(query);

            // Remplace chaque '?' par sa valeur (1-indexed) :
            statement.setString(1, character.getType());
            statement.setString(2, character.getName());
            statement.setInt(3, character.getHealthLevel());
            statement.setInt(4, character.getAttackStrength());
            statement.setString(5, character.getOffensiveEquipment().getName());
            statement.setString(6, character.getDefensiveEquipment().getName());

            // Exécuter l'insertion !
            statement.executeUpdate();
            System.out.println("Personnage sauvegardé avec succès dans MySQL !");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
