from dataclasses import dataclass, field


@dataclass
class HorseFixedParameterDto:
    "one field of data about a horse"
    property: str
    value: object


@dataclass
class HorseTableRowDataDto:
    "Each row represents an individual horse. The rowData list is of type HorseFixedParameterDto."
    rowData: list = field(default_factory=list)

