/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class p1 extends ASTRAClass {
	public p1() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"p1", new int[] {16,9,16,51},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("s1"),
					Primitive.newPrimitive("on")
				})
			),
			new Predicate("light", new Term[] {
				Primitive.newPrimitive("l1"),
				Primitive.newPrimitive("off")
			}),
			new Block(
				"p1", new int[] {16,50,19,5},
				new Statement[] {
					new BeliefUpdate('-',
						"p1", new int[] {17,8,19,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("off")
						})
					),
					new BeliefUpdate('+',
						"p1", new int[] {18,8,19,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("on")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"p1", new int[] {22,9,22,51},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("s1"),
					Primitive.newPrimitive("off")
				})
			),
			new Predicate("light", new Term[] {
				Primitive.newPrimitive("l1"),
				Primitive.newPrimitive("on")
			}),
			new Block(
				"p1", new int[] {22,50,25,5},
				new Statement[] {
					new BeliefUpdate('-',
						"p1", new int[] {23,8,25,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("on")
						})
					),
					new BeliefUpdate('+',
						"p1", new int[] {24,8,25,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("off")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"p1", new int[] {27,9,27,39},
			new BeliefEvent('+',
				new Predicate("light", new Term[] {
					new Variable(Type.STRING, "Lt",false),
					new Variable(Type.STRING, "St",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"p1", new int[] {27,38,29,5},
				new Statement[] {
					new ModuleCall("console",
						"p1", new int[] {28,8,28,62},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Light "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "Lt"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" is in state: "),
										new Variable(Type.STRING, "St")
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("p1","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"p1", new int[] {31,9,31,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"p1", new int[] {31,27,35,5},
				new Statement[] {
					new BeliefUpdate('+',
						"p1", new int[] {32,8,35,5},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("s1"),
							Primitive.newPrimitive("on")
						})
					),
					new ModuleCall("system",
						"p1", new int[] {33,8,33,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("p1","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("system",
						"p1", new int[] {34,8,34,21},
						new Predicate("exit", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("p1","system")).exit(
								);
							}
						}
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.initialize(
			new Predicate("switch", new Term[] {
				Primitive.newPrimitive("s1"),
				Primitive.newPrimitive("on")
			})
		);
		agent.initialize(
			new Predicate("light", new Term[] {
				Primitive.newPrimitive("l1"),
				Primitive.newPrimitive("off")
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("system",astra.lang.System.class,agent);
		fragment.addModule("console",astra.lang.Console.class,agent);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new TestSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new p1().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
