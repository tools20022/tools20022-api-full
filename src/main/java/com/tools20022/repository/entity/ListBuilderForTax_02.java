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

import com.tools20022.repository.msg.CorporateActionAmounts47;
import com.tools20022.repository.msg.OtherAmounts42;
import com.tools20022.repository.msg.OtherAmounts43;
import com.tools20022.repository.msg.OtherAmounts44;
import java.util.List;

class ListBuilderForTax_02 {

	@SuppressWarnings("unchecked")
	static <T> List<T> addElems(List<T> list) {
		list.add((T) CorporateActionAmounts47.mmStockExchangeTax);
		list.add((T) CorporateActionAmounts47.mmEUTaxRetentionAmount);
		list.add((T) CorporateActionAmounts47.mmFATCATaxAmount);
		list.add((T) CorporateActionAmounts47.mmNRATaxAmount);
		list.add((T) CorporateActionAmounts47.mmBackUpWithholdingTaxAmount);
		list.add((T) CorporateActionAmounts47.mmTaxOnIncomeAmount);
		list.add((T) CorporateActionAmounts47.mmTransactionTax);
		list.add((T) OtherAmounts42.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts42.mmPaymentLevyTax);
		list.add((T) OtherAmounts42.mmLocalTax);
		list.add((T) OtherAmounts42.mmStampDuty);
		list.add((T) OtherAmounts42.mmStockExchangeTax);
		list.add((T) OtherAmounts42.mmTransactionTax);
		list.add((T) OtherAmounts42.mmValueAddedTax);
		list.add((T) OtherAmounts42.mmWithholdingTax);
		list.add((T) OtherAmounts42.mmConsumptionTax);
		list.add((T) OtherAmounts43.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts43.mmPaymentLevyTax);
		list.add((T) OtherAmounts43.mmLocalTax);
		list.add((T) OtherAmounts43.mmLocalTaxCountrySpecific);
		list.add((T) OtherAmounts43.mmStampDuty);
		list.add((T) OtherAmounts43.mmStockExchangeTax);
		list.add((T) OtherAmounts43.mmTransactionTax);
		list.add((T) OtherAmounts43.mmValueAddedTax);
		list.add((T) OtherAmounts43.mmWithholdingTax);
		list.add((T) OtherAmounts43.mmConsumptionTax);
		list.add((T) OtherAmounts44.mmCountryNationalFederalTax);
		list.add((T) OtherAmounts44.mmPaymentLevyTax);
		list.add((T) OtherAmounts44.mmLocalTax);
		list.add((T) OtherAmounts44.mmLocalTaxCountrySpecific);
		list.add((T) OtherAmounts44.mmStampDuty);
		list.add((T) OtherAmounts44.mmStockExchangeTax);
		list.add((T) OtherAmounts44.mmTransactionTax);
		list.add((T) OtherAmounts44.mmValueAddedTax);
		list.add((T) OtherAmounts44.mmWithholdingTax);
		list.add((T) OtherAmounts44.mmConsumptionTax);
		return list;
	}
}