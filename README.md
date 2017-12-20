# Hack your Domain-Specific Language (DSL) - Project

The goal of this project is to develop a domain-specific language (DSL) for modeling variability. By designing and building a DSL for elaborating two flavors of variability models (basic and attributed feature models) 
the goal of the project is to be able to :

* Specify the abstract syntax of your DSL (with a metamodel)
* Specify the concrete syntax of your DSL (with a grammar)
* Develop model transformations for building different tools for your DSL
* Master some solvers for automatically reasoning about the semantics of your program/models written in your DSL
* Reuse and extend an abstract/concrete syntax and model transformations for a family of DSLs
* Re-engineer and manage variability of a real-world software project with your DSL
* Read and understand the scientific literature related to DSL

## 1. Basic Feature Model and Xtext

The grammar of the Feature Modeling DSL can be found [here](https://github.com/said026/dsl-project/blob/master/dslProject/src/org/xtext/FM.xtext)
 
Few examples using that grammar are given [here](https://github.com/said026/dsl-project/tree/master/dslProject/src/examples) (files with *.fm extension)

## 2. Transformation of Feature Models

A procedure for generating random feature models is available [here](https://github.com/said026/dsl-project/blob/master/dslProject/src/org/xtext/FMGenerator.xtend)

### DIMACS transformation :
The transformation into DIMACS format for interoperating with SAT4J solver (http://www.sat4j.org) can be found [here](https://github.com/said026/dsl-project/blob/master/dslProject/src/org/transform/DimacsTransform.xtend)

### Minizinc transformation :
The transformation into Minizinc format (http://www.minizinc.org) for interoperating with some CSP solvers e.g. Choco (http://www.choco-solver.org) is available [here](https://github.com/said026/dsl-project/blob/master/dslProject/src/org/transform/MiniZincTransform.xtend) 	
