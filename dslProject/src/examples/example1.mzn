var bool: CarEquipment;
var bool: Healthning;
var bool: Comfort;
var bool: DrivingAndSafety;
var bool: AitConditioningFrontAndRear;
var bool: AirConditioning;
var bool: AutomaticHeadLights;
var bool: FrontFogLights;

constraint Healthning -> AitConditioningFrontAndRear xor AirConditioning;
constraint CarEquipment -> Healthning;
constraint Healthning -> CarEquipment;
constraint AutomaticHeadLights -> Comfort;
constraint CarEquipment -> Comfort;
constraint Comfort -> CarEquipment;
constraint FrontFogLights -> DrivingAndSafety;
constraint CarEquipment -> DrivingAndSafety;
constraint DrivingAndSafety -> CarEquipment;
constraint AutomaticHeadLights -> FrontFogLights;
constraint CarEquipment;

solve satisfy;
