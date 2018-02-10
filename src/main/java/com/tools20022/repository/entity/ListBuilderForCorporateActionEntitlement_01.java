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

import com.tools20022.repository.msg.CorporateActionBalanceDetails38;
import java.util.List;

class ListBuilderForCorporateActionEntitlement_01 {

	@SuppressWarnings("unchecked")
	static <T> List<T> addElems(List<T> list) {
		list.add((T) CorporateActionBalanceDetails38.mmOnLoanBalance);
		list.add((T) CorporateActionBalanceDetails38.mmOutForRegistrationBalance);
		list.add((T) CorporateActionBalanceDetails38.mmSettlementPositionBalance);
		list.add((T) CorporateActionBalanceDetails38.mmStreetPositionBalance);
		list.add((T) CorporateActionBalanceDetails38.mmTradeDatePositionBalance);
		list.add((T) CorporateActionBalanceDetails38.mmInTransshipmentBalance);
		list.add((T) CorporateActionBalanceDetails38.mmRegisteredBalance);
		list.add((T) CorporateActionBalanceDetails38.mmObligatedBalance);
		list.add((T) CorporateActionBalanceDetails38.mmPendingDeliveryBalance);
		list.add((T) CorporateActionBalanceDetails38.mmPendingReceiptBalance);
		return list;
	}
}