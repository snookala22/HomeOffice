@belly
Feature: Belly and cukes
As a Belly user
I want to know when I am hungry
So that I can eat

	Scenario Outline: Growl when I am hungry
		Given I have <CukeNum> cukes in my belly
		When I wait <WaitTime> hour
		Then my belly should <Noise>

		Examples:
		| CukeNum 	| WaitTime 	| Noise  	|
		| 40       	| 1			| silent    |
		| 20		| 1			| growl	 	|