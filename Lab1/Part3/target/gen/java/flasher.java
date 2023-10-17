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


public class flasher extends ASTRAClass {
	public flasher() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"flasher", new int[] {16,9,16,51},
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
				"flasher", new int[] {16,50,19,5},
				new Statement[] {
					new BeliefUpdate('-',
						"flasher", new int[] {17,8,19,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("off")
						})
					),
					new BeliefUpdate('+',
						"flasher", new int[] {18,8,19,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("on")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"flasher", new int[] {22,9,22,51},
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
				"flasher", new int[] {22,50,25,5},
				new Statement[] {
					new BeliefUpdate('-',
						"flasher", new int[] {23,8,25,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("on")
						})
					),
					new BeliefUpdate('+',
						"flasher", new int[] {24,8,25,5},
						new Predicate("light", new Term[] {
							Primitive.newPrimitive("l1"),
							Primitive.newPrimitive("off")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"flasher", new int[] {27,9,27,39},
			new BeliefEvent('+',
				new Predicate("light", new Term[] {
					new Variable(Type.STRING, "Lt",false),
					new Variable(Type.STRING, "St",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"flasher", new int[] {27,38,29,5},
				new Statement[] {
					new ModuleCall("console",
						"flasher", new int[] {28,8,28,62},
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
								return ((astra.lang.Console) intention.getModule("flasher","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"flasher", new int[] {32,9,32,46},
			new GoalEvent('+',
				new Goal(
					new Predicate("flipSwitch", new Term[] {})
				)
			),
			new Predicate("switch", new Term[] {
				Primitive.newPrimitive("s1"),
				Primitive.newPrimitive("on")
			}),
			new Block(
				"flasher", new int[] {32,45,35,5},
				new Statement[] {
					new BeliefUpdate('-',
						"flasher", new int[] {33,8,35,5},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("s1"),
							Primitive.newPrimitive("on")
						})
					),
					new BeliefUpdate('+',
						"flasher", new int[] {34,8,35,5},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("s1"),
							Primitive.newPrimitive("off")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"flasher", new int[] {38,9,38,47},
			new GoalEvent('+',
				new Goal(
					new Predicate("flipSwitch", new Term[] {})
				)
			),
			new Predicate("switch", new Term[] {
				Primitive.newPrimitive("s1"),
				Primitive.newPrimitive("off")
			}),
			new Block(
				"flasher", new int[] {38,46,41,5},
				new Statement[] {
					new BeliefUpdate('-',
						"flasher", new int[] {39,8,41,5},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("s1"),
							Primitive.newPrimitive("off")
						})
					),
					new BeliefUpdate('+',
						"flasher", new int[] {40,8,41,5},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("s1"),
							Primitive.newPrimitive("on")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"flasher", new int[] {45,9,45,31},
			new GoalEvent('+',
				new Goal(
					new Predicate("flash", new Term[] {
						new Variable(Type.INTEGER, "X",false)
					})
				)
			),
			new Comparison(">",
				new Variable(Type.INTEGER, "X"),
				Primitive.newPrimitive(0)
			),
			new Block(
				"flasher", new int[] {45,30,49,5},
				new Statement[] {
					new Subgoal(
						"flasher", new int[] {46,8,49,5},
						new Goal(
							new Predicate("flipSwitch", new Term[] {})
						)
					),
					new ModuleCall("system",
						"flasher", new int[] {47,8,47,24},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(500)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("flasher","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"flasher", new int[] {48,8,49,5},
						new Goal(
							new Predicate("flash", new Term[] {
								Operator.newOperator('-',
									new Variable(Type.INTEGER, "X"),
									Primitive.newPrimitive(1)
								)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"flasher", new int[] {52,9,52,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("flash", new Term[] {
						new Variable(Type.INTEGER, "X",false)
					})
				)
			),
			new Comparison("==",
				new Variable(Type.INTEGER, "X"),
				Primitive.newPrimitive(0)
			),
			new Block(
				"flasher", new int[] {52,31,52,33},
				new Statement[] {
				}
			)
		));
		addRule(new Rule(
			"flasher", new int[] {54,9,54,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"flasher", new int[] {54,27,57,5},
				new Statement[] {
					new Subgoal(
						"flasher", new int[] {55,8,57,5},
						new Goal(
							new Predicate("flash", new Term[] {
								Primitive.newPrimitive(10)
							})
						)
					),
					new ModuleCall("system",
						"flasher", new int[] {56,8,56,21},
						new Predicate("exit", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("flasher","system")).exit(
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
				Primitive.newPrimitive("off")
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
			astra.core.Agent agent = new flasher().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
