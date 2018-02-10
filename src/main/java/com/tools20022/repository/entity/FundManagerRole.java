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

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.InvestmentFundPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PriceValuation3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Legal entity that sets up a fund, appoints agents, decides and implements an
 * investment strategy. That is, selects portfolio investments in accordance
 * with the objectives and strategy in the fund's prospectus, and places orders
 * to effect or liquidate selected investments in accordance with net flow of
 * capital into or out of the fund. Also called fund promoter or fund sponsor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FundManagerRole" src="doc-files/FundManagerRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole
 * InvestmentFundPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmFundManagementCompany
 * PriceValuation3.mmFundManagementCompany}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.FundPromoter FundPromoter}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundManagerRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Legal entity that sets up a fund, appoints agents, decides and implements an investment strategy. That is, selects portfolio investments in accordance with the objectives and strategy in the fund's prospectus, and places orders to effect or liquidate selected investments in accordance with net flow of capital into or out of the fund. Also called fund promoter or fund sponsor."
 * </li>
 * </ul>
 */
public class FundManagerRole extends InvestmentFundPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundManagerRole";
				definition = "Legal entity that sets up a fund, appoints agents, decides and implements an investment strategy. That is, selects portfolio investments in accordance with the objectives and strategy in the fund's prospectus, and places orders to effect or liquidate selected investments in accordance with net flow of capital into or out of the fund. Also called fund promoter or fund sponsor.";
				derivationElement_lazy = () -> Arrays.asList(PriceValuation3.mmFundManagementCompany);
				subType_lazy = () -> Arrays.asList(FundPromoter.mmObject());
				superType_lazy = () -> InvestmentFundPartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return FundManagerRole.class;
			}
		});
		return mmObject_lazy.get();
	}
}