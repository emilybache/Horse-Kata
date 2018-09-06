from dataclasses import dataclass, field


@dataclass
class HorseFixedParameterDto:
    property: str
    value: object


@dataclass
class HorseTableRowDataDto:
    rowData: list = field(default_factory=list)


@dataclass
class HorseTable:
    headers: list = field(default_factory=list)
    table_data: list = field(default_factory=list)

