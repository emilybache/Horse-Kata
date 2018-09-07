from dataclasses import dataclass, field


@dataclass
class HorseFixedParameterDto:
    property: str
    value: object


@dataclass
class HorseTableRowDataDto:
    rowData: list = field(default_factory=list)

