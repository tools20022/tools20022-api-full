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

class ListBuilderForAccount_01 {

	@SuppressWarnings("unchecked")
	static <T> List<T> addElems(List<T> list) {
		list.add((T) CashOption61.mmCashAccountIdentification);
		list.add((T) CashOption63.mmCashAccountIdentification);
		list.add((T) QuantityAndAccount69.mmCashAccount);
		list.add((T) QuantityAndAccount70.mmCashAccount);
		list.add((T) QuantityAndAccount71.mmCashAccount);
		list.add((T) QuantityAndAccount72.mmCashAccount);
		list.add((T) QuantityAndAccount75.mmCashAccount);
		list.add((T) QuantityAndAccount76.mmCashAccount);
		list.add((T) Debtor3.mmAccountIdentification);
		list.add((T) CardAccount14.mmAccountIdentifier);
		return list;
	}
}