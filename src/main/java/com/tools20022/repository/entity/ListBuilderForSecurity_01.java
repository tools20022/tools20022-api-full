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

import java.util.List;

class ListBuilderForSecurity_01 {

	@SuppressWarnings("unchecked")
	static <T> List<T> addElems(List<T> list) {
		list.add((T) com.tools20022.repository.msg.CorporateActionGeneralInformation120.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.CorporateActionOption134.SecurityIdentification);
		list.add((T) com.tools20022.repository.msg.SecuritiesTradeDetails69.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.CorporateActionGeneralInformation118.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.FinancialInstrumentDetails27.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.IntraPositionDetails42.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.AdditionalInformation14.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.CorporateActionGeneralInformation121.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.CorporateActionGeneralInformation123.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.CorporateActionOption135.SecurityIdentification);
		list.add((T) com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.CorporateActionOption133.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.FinancialInstrumentAttributes85.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.FinancialInstrumentAttributes84.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.SecuritiesOption63.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.FinancialInstrumentDetails26.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.TransactionDetails100.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.TransactionDetails99.FinancialInstrumentIdentification);
		list.add((T) com.tools20022.repository.msg.FinancialInstrumentAttributes83.FinancialInstrumentIdentification);
		return list;
	}
}