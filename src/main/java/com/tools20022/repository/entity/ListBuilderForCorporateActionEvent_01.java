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

import com.tools20022.repository.choice.*;
import com.tools20022.repository.msg.*;
import java.util.List;

class ListBuilderForCorporateActionEvent_01 {

	@SuppressWarnings("unchecked")
	static <T> List<T> addElems(List<T> list) {
		list.add((T) CorporateActionGeneralInformation118.mmObject());
		list.add((T) CorporateActionGeneralInformation121.mmObject());
		list.add((T) CorporateActionGeneralInformation123.mmObject());
		list.add((T) CorporateActionGeneralInformation117.mmObject());
		list.add((T) CorporateActionGeneralInformation113.mmObject());
		list.add((T) CorporateActionRate83.mmObject());
		list.add((T) CorporateActionEventType62Choice.mmObject());
		list.add((T) CorporateActionEventType61Choice.mmObject());
		list.add((T) CorporateActionRate84.mmObject());
		list.add((T) EventInformation10.mmObject());
		list.add((T) CorporateActionEventType71Choice.mmObject());
		list.add((T) CorporateActionRate85.mmObject());
		list.add((T) CorporateActionEventAndBalance12.mmObject());
		list.add((T) CorporateActionEventType69Choice.mmObject());
		list.add((T) RateDetails28.mmObject());
		list.add((T) CorporateActionEventType57Choice.mmObject());
		list.add((T) CorporateActionEventType58Choice.mmObject());
		list.add((T) RateDetails30.mmObject());
		list.add((T) CorporateActionQuantitySD2.mmObject());
		return list;
	}
}