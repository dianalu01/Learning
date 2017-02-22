#include <string.h>
#include <vector>
#include <iostream>
using namespace std;
class Relation;
class Nodes
{
private:
	string id;
	string contactName;
	vector<Relation*> friends;
public:
	~Nodes();
	Nodes();
	Nodes(string ID, string Name);	// crea un usuario
	string getName();
	void deleteAllFriends();
	bool sameId(string ID);
	void addFriendship(Nodes *c);
	bool existFriendship(Nodes *ID);
	void showFriends();
	int positionFriendship(Nodes *ID);
	void deleteFriendship(Nodes *ID);
};
