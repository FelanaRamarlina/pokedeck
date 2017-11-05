// Copyright 2017 Pierre Talbot (IRCAM)

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

//     http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package upmc.pcg;

import java.util.ArrayList;
import upmc.pcg.ui.GameUI;

public class Pokedeck
{
    private String pokedeckOwner;
    //private Owner pockedeckOwner; (Classe Owner à créer?)
    private ArrayList<Card> pokedeckContent;
    
    public Pokedeck(String Owner, ArrayList<Card> content)
    {
        this.pokedeckOwner = Owner;
        this.pokedeckContent = content;
    }
    public static void main(String[] args)
    {
        GameUI game_ui = new GameUI();
        game_ui.start();
    }
    
    public void displayCollection()
    {
        System.out.println("Collection");
        for(int i=0;i<this.pokedeckContent.size();i++)
        {
            System.out.println(this.pokedeckContent.get(i).toString());
        } 
    }
    
    public void searchCardByName(String name)
    {
        for(int i=0;i<this.pokedeckContent.size();i++)
        {
            if(this.pokedeckContent.get(i).getCardName() == name)
                System.out.println(this.pokedeckContent.get(i).toString());
        }
    }
    
    public void searchCardByNumber(int number)
    {
        for(int i=0;i<this.pokedeckContent.size();i++)
        {
            if(this.pokedeckContent.get(i).getCardNumber() == number)
                System.out.println(this.pokedeckContent.get(i).toString());
        }
    }
    
    public void add_card(Card newCard){
        this.pokedeckContent.add(newCard);
    }
    
    public void delete_card(int index){
        String confirm;
        confirm = GameUI.confirm_delete(this.pokedeckContent.get(index).getCardName());
        if(confirm.equals("y")){
            this.pokedeckContent.remove(index);
        }
        else if(confirm.equals("n")){
            System.out.println("Alright, we won't delete this card then");
        }
    }


}
