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


public class two_lights extends ASTRAClass {
	public two_lights() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"two_lights", new int[] {16,9,16,71},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("s1"),
					Primitive.newPrimitive("on")
				})
			),
			new AND(
				new Predicate("light", new Term[] {
					Primitive.newPrimitive("l1"),
					Primitive.newPrimitive("off")
				}),
				new Predicate("light", new Term[] {
					Primitive.newPrimitive("l2"),
					Primitive.newPrimitive("off")
				})
			),
			new Block(
				"two_lights", new int[] {16,70,19,5},
				new Statement[] {
					new BeliefUpdate('-',
						"two_lights", new int[] {17,8,19,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("off")
						})
					),
					new BeliefUpdate('+',
						"two_lights", new int[] {17,28,19,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("on")
						})
					),
					new BeliefUpdate('-',
						"two_lights", new int[] {18,8,19,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l2"),
							Primitive.newPrimitive("off")
						})
					),
					new BeliefUpdate('+',
						"two_lights", new int[] {18,28,19,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l2"),
							Primitive.newPrimitive("on")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"two_lights", new int[] {22,9,22,70},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("s1"),
					Primitive.newPrimitive("off")
				})
			),
			new AND(
				new Predicate("light", new Term[] {
					Primitive.newPrimitive("l1"),
					Primitive.newPrimitive("on")
				}),
				new Predicate("light", new Term[] {
					Primitive.newPrimitive("l2"),
					Primitive.newPrimitive("on")
				})
			),
			new Block(
				"two_lights", new int[] {22,69,25,5},
				new Statement[] {
					new BeliefUpdate('-',
						"two_lights", new int[] {23,8,25,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("on")
						})
					),
					new BeliefUpdate('+',
						"two_lights", new int[] {23,27,25,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("off")
						})
					),
					new BeliefUpdate('-',
						"two_lights", new int[] {24,8,25,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l2"),
							Primitive.newPrimitive("on")
						})
					),
					new BeliefUpdate('+',
						"two_lights", new int[] {24,27,25,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l2"),
							Primitive.newPrimitive("off")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"two_lights", new int[] {28,9,28,70},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("s1"),
					Primitive.newPrimitive("on")
				})
			),
			new AND(
				new Predicate("light", new Term[] {
					Primitive.newPrimitive("l1"),
					Primitive.newPrimitive("off")
				}),
				new Predicate("light", new Term[] {
					Primitive.newPrimitive("l2"),
					Primitive.newPrimitive("on")
				})
			),
			new Block(
				"two_lights", new int[] {28,69,30,5},
				new Statement[] {
					new BeliefUpdate('-',
						"two_lights", new int[] {29,8,30,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("off")
						})
					),
					new BeliefUpdate('+',
						"two_lights", new int[] {29,28,30,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("on")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"two_lights", new int[] {33,9,33,70},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("s1"),
					Primitive.newPrimitive("on")
				})
			),
			new AND(
				new Predicate("light", new Term[] {
					Primitive.newPrimitive("l1"),
					Primitive.newPrimitive("on")
				}),
				new Predicate("light", new Term[] {
					Primitive.newPrimitive("l2"),
					Primitive.newPrimitive("off")
				})
			),
			new Block(
				"two_lights", new int[] {33,69,35,5},
				new Statement[] {
					new BeliefUpdate('-',
						"two_lights", new int[] {34,8,35,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l2"),
							Primitive.newPrimitive("off")
						})
					),
					new BeliefUpdate('+',
						"two_lights", new int[] {34,28,35,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l2"),
							Primitive.newPrimitive("on")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"two_lights", new int[] {38,9,38,71},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("s1"),
					Primitive.newPrimitive("off")
				})
			),
			new AND(
				new Predicate("light", new Term[] {
					Primitive.newPrimitive("l1"),
					Primitive.newPrimitive("on")
				}),
				new Predicate("light", new Term[] {
					Primitive.newPrimitive("l2"),
					Primitive.newPrimitive("off")
				})
			),
			new Block(
				"two_lights", new int[] {38,70,40,5},
				new Statement[] {
					new BeliefUpdate('-',
						"two_lights", new int[] {39,8,40,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("on")
						})
					),
					new BeliefUpdate('+',
						"two_lights", new int[] {39,27,40,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("off")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"two_lights", new int[] {43,9,43,71},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("s1"),
					Primitive.newPrimitive("off")
				})
			),
			new AND(
				new Predicate("light", new Term[] {
					Primitive.newPrimitive("l1"),
					Primitive.newPrimitive("off")
				}),
				new Predicate("light", new Term[] {
					Primitive.newPrimitive("l2"),
					Primitive.newPrimitive("on")
				})
			),
			new Block(
				"two_lights", new int[] {43,70,45,5},
				new Statement[] {
					new BeliefUpdate('-',
						"two_lights", new int[] {44,8,45,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l2"),
							Primitive.newPrimitive("on")
						})
					),
					new BeliefUpdate('+',
						"two_lights", new int[] {44,27,45,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l2"),
							Primitive.newPrimitive("off")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"two_lights", new int[] {47,9,47,39},
			new BeliefEvent('+',
				new Predicate("light", new Term[] {
					new Variable(Type.STRING, "Lt",false),
					new Variable(Type.STRING, "St",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"two_lights", new int[] {47,38,49,5},
				new Statement[] {
					new ModuleCall("console",
						"two_lights", new int[] {48,8,48,62},
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
								return ((astra.lang.Console) intention.getModule("two_lights","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"two_lights", new int[] {51,9,51,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"two_lights", new int[] {51,27,54,5},
				new Statement[] {
					new ModuleCall("system",
						"two_lights", new int[] {52,8,52,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("two_lights","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("system",
						"two_lights", new int[] {53,8,53,21},
						new Predicate("exit", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("two_lights","system")).exit(
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
				Primitive.newPrimitive("on")
			})
		);
		agent.initialize(
			new Predicate("light", new Term[] {
				Primitive.newPrimitive("l2"),
				Primitive.newPrimitive("off")
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("console",astra.lang.Console.class,agent);
		fragment.addModule("system",astra.lang.System.class,agent);
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
			astra.core.Agent agent = new two_lights().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
