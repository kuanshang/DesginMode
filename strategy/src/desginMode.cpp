// designMode.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

class Coord{
};

class Compositor{
public:
	virtual int Compose(Coord natural[], Coord stretch[], Coord shrink[], int componentCount, int lineWidth, int breaks[]) = 0;

protected:
	Compositor(){};
};

class Composition {
public:
	Composition(Compositor* compositor){
		_compositor = compositor;
	};

	void Repair(){
		printf("Composition Repair().\n");
		Coord* natural = NULL;
		Coord* strectchability = NULL;
		Coord* shrinkability = NULL;
		int componentCount = 0;
		int* breaks = NULL;

		int breakCount;
		breakCount = _compositor->Compose(natural, strectchability, shrinkability, componentCount, _lineWidth, breaks);
	};

private:
	Compositor* _compositor;
	//Component* _componentes;
	int _componentCount;
	int _lineWidth;
	int* _lineBreaks;

	int _lineCount;
};

class SimpleCompositor : public Compositor{
public:
	SimpleCompositor(){};

	virtual int Compose(Coord natural[], Coord stretch[], Coord shrink[], int componentCount, int lineWidth, int breaks[]){
		printf("SimpleCompositor compose.\n");
		return 0;
	}
};

class TexCompositor : public Compositor{
public:
	TexCompositor(){};

	virtual int Compose(Coord natural[], Coord stretch[], Coord shrink[], int componentCount, int lineWidth, int breaks[]){
		printf("TexCompositor compose.\n");
		return 0;
	}
};

class AarrayCompositor : public Compositor{
public:
	AarrayCompositor(){};

	virtual int Compose(Coord natural[], Coord stretch[], Coord shrink[], int componentCount, int lineWidth, int breaks[]){
		printf("AarrayCompositor compose.\n");
		return 0;
	}
};

int _tmain(int argc, _TCHAR* argv[])
{
	printf("Design Mode -- strategy\n");

	Composition* quick = new Composition(new SimpleCompositor);
	Composition* slick = new Composition(new TexCompositor);
	Composition* iconic = new Composition(new AarrayCompositor);

	quick->Repair();
	slick->Repair();
	iconic->Repair();

	int a;
	scanf("%d", &a);
	return 0;
}