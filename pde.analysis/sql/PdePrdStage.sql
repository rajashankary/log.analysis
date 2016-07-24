DROP TABLE IF EXISTS pde.pde_stage;
DROP TABLE IF EXISTS pde.pde_session_stage;
DROP TABLE IF EXISTS pde.pde_fix_ses;


CREATE TABLE pde.pde_stage(
	MeasTime FLOAT,
	Valid BOOLEAN,
	Lat FLOAT,
	Lon FLOAT,
	HAE FLOAT,
	RawEast FLOAT,
	RawNorth FLOAT,
	RawUp FLOAT,
	dSFT FLOAT,
	Measurements int,
	NavResult int,
	UnitFault float,
	EEast float,
	ENorth float,
	EUp float,
	Hepe float,
	Fix int,
	FixesRequested int, 
	SmoothFixes int, 
	ReferencePN varchar(10),
	ServingBSID varchar(10),
	Session varchar(15) not null,
	TSource int,
	MeasBandFreq varchar(10),
	Differential boolean,
	Aided boolean,
	Checked boolean,
	PltPower int,
	GPS int,
	TUncertainty float,
	ClockOffset float,
	ClockDrift float,
	VisibleSVs int,
	StrongMeas int,
	RawSource int,
	InitSource int,
	Cov0 float,
	Cov1 float,
	Cov2 float,
	Cov3 float,
	Cov4 float,
	Cov5 float,
	SM_A float,
	SM_B float,
	SM_V float,
	SM_Theta float,
	TrueClock float,
	OutputSource int,
	EDOP float,
	NDOP float,
	VDOP float,
	SMMode float,
	SMLat float,
	SMLon float,
	SMHgt float,
	VNavResult float,
	Vmeas int,
	VUnitFault float,
	Ve float,
	Vn float,
	Vu float,
	NavEngine int,   
	Pilots int, 
	IniLat float,
	IniLon float,
	IHgt float,
	PrimaryID varchar(20) not null,
	Week int,
	YMD date,
	HMS time,
	SmEast float,
	SmNorth float,
	SmUp float,
	Final boolean,
	FlagH varchar(10),
	FlagO varchar(10),
	File varchar(10),
	RecordSize int,
	MarketID varchar(10),
	SwitchNo varchar(10),
	ServingCellID varchar(10),
	StbUsed boolean,
	StbCalced float,
	StbCalcedSigma float,
	StbConsUsed boolean,
	StbConsValue float,
	StbConsSigma float,
	NID varchar(10),
	SID varchar(10),
	HandsetCapability varchar(20),
	PosAidUsed int,
	GLONASS float,
	VEEast float,
	VENorth float,
	VEup float,
	HEVE float,
	ValidPosTruth float,
	TruthLat float,
	TruthLong float,
	TruthHAE float,
	TruthHEPE float,
	ValidVelTruth float,
	TruthVe float,
	TruthVn float,
	TruthVup float,
	TruthHEVE float,
	DeltaVe float,
	DeltaVn float,
	DeltaVup float,
	TruthSpeed float, 
	MeasSpeed float,
	DeltaSpeed float, 
	TruthAz float, 
	MeasAz float, 
	DeltaAz float,
	mdn varchar(20),
	sitename varchar(50),
	CREATED_TIME TIMESTAMP DEFAULT SYSDATE NOT NULL
);
--app varchar(15),

CREATE TABLE pde.pde_session_stage(
session_id varchar(50),
session_start_time timestamp,
session_end_time timestamp,
duration float,
isAlmanac boolean,
isEph boolean,
sitename varchar(30),
CREATED_TIME TIMESTAMP DEFAULT SYSDATE NOT NULL);


create table if not exists pde.pde_fix_ses (
    dt timestamp,
    uncertainty numeric(10,3),
    source varchar(20),
    primaryid varchar(20),
    fixtype varchar(20),
    sessionid varchar(20),
    appid varchar(15)
);
