/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.repository.msg.*;
import java.util.List;

class ListBuilderForSecurity_01 {

	@SuppressWarnings("unchecked")
	static <T> List<T> addElems(List<T> list) {
		list.add((T) CorporateActionGeneralInformation120.mmFinancialInstrumentIdentification);
		list.add((T) CorporateActionOption134.mmSecurityIdentification);
		list.add((T) SecuritiesTradeDetails69.mmFinancialInstrumentIdentification);
		list.add((T) CorporateActionGeneralInformation118.mmFinancialInstrumentIdentification);
		list.add((T) FinancialInstrumentDetails27.mmFinancialInstrumentIdentification);
		list.add((T) IntraPositionDetails42.mmFinancialInstrumentIdentification);
		list.add((T) AdditionalInformation14.mmFinancialInstrumentIdentification);
		list.add((T) CorporateActionGeneralInformation121.mmFinancialInstrumentIdentification);
		list.add((T) CorporateActionGeneralInformation123.mmFinancialInstrumentIdentification);
		list.add((T) CorporateActionOption135.mmSecurityIdentification);
		list.add((T) SecuritiesFinancingTransactionDetails36.mmFinancialInstrumentIdentification);
		list.add((T) CorporateActionOption133.mmFinancialInstrumentIdentification);
		list.add((T) FinancialInstrumentAttributes85.mmFinancialInstrumentIdentification);
		list.add((T) FinancialInstrumentAttributes84.mmFinancialInstrumentIdentification);
		list.add((T) SecuritiesOption63.mmFinancialInstrumentIdentification);
		list.add((T) SecuritiesSettlementTransactionDetails31.mmFinancialInstrumentIdentification);
		list.add((T) FinancialInstrumentDetails26.mmFinancialInstrumentIdentification);
		list.add((T) TransactionDetails100.mmFinancialInstrumentIdentification);
		list.add((T) TransactionDetails99.mmFinancialInstrumentIdentification);
		list.add((T) FinancialInstrumentAttributes83.mmFinancialInstrumentIdentification);
		return list;
	}
}