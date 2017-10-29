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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Group of investment funds under the same fund management company.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundFamily" src="doc-files/InvestmentFundFamily.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundFamily#FundFamilyName
 * InvestmentFundFamily.FundFamilyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundFamily#InvestmentFund
 * InvestmentFundFamily.InvestmentFund}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#Family
 * InvestmentFund.Family}</li>
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
 * "InvestmentFundFamily"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Group of investment funds under the same fund management company."</li>
 * </ul>
 */
public class InvestmentFundFamily {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name of the investment fund family.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#FundFamilyName
	 * InvestmentAccount17.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#FundFamilyName
	 * InvestmentAccount27.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#FundFamilyName
	 * InvestmentAccount35.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount19#FundFamilyName
	 * InvestmentAccount19.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#FundFamilyName
	 * InvestmentAccount18.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#FundFamilyName
	 * InvestmentAccount29.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#FundFamilyName
	 * InvestmentAccount28.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#FundFamilyName
	 * InvestmentAccount36.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#FundFamilyName
	 * InvestmentAccount16.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#FundFamilyName
	 * InvestmentAccount26.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#FundFamilyName
	 * InvestmentAccount34.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#FundFamilyName
	 * InvestmentAccount38.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#FundFamilyName
	 * InvestmentAccount37.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#FundFamilyName
	 * InvestmentAccount39.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount44#FundFamilyName
	 * InvestmentAccount44.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#FundFamilyName
	 * InvestmentAccount46.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#FundFamilyName
	 * InvestmentAccount47.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#FundFamilyName
	 * InvestmentAccount49.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#FundFamilyName
	 * InvestmentAccount51.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#FundFamilyName
	 * InvestmentAccount50.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount52#FundFamilyName
	 * InvestmentAccount52.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#FundFamilyName
	 * InvestmentAccount61.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#FundFamilyName
	 * InvestmentAccount63.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#FundFamilyName
	 * InvestmentAccount62.FundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount64#FundFamilyName
	 * InvestmentAccount64.FundFamilyName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundFamily
	 * InvestmentFundFamily}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundFamilyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the investment fund family."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FundFamilyName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.FundFamilyName, com.tools20022.repository.msg.InvestmentAccount27.FundFamilyName,
					com.tools20022.repository.msg.InvestmentAccount35.FundFamilyName, com.tools20022.repository.msg.InvestmentAccount19.FundFamilyName, com.tools20022.repository.msg.InvestmentAccount18.FundFamilyName,
					com.tools20022.repository.msg.InvestmentAccount29.FundFamilyName, com.tools20022.repository.msg.InvestmentAccount28.FundFamilyName, com.tools20022.repository.msg.InvestmentAccount36.FundFamilyName,
					com.tools20022.repository.msg.InvestmentAccount16.FundFamilyName, com.tools20022.repository.msg.InvestmentAccount26.FundFamilyName, com.tools20022.repository.msg.InvestmentAccount34.FundFamilyName,
					com.tools20022.repository.msg.InvestmentAccount38.FundFamilyName, com.tools20022.repository.msg.InvestmentAccount37.FundFamilyName, com.tools20022.repository.msg.InvestmentAccount39.FundFamilyName,
					com.tools20022.repository.msg.InvestmentAccount44.FundFamilyName, com.tools20022.repository.msg.InvestmentAccount46.FundFamilyName, com.tools20022.repository.msg.InvestmentAccount47.FundFamilyName,
					com.tools20022.repository.msg.InvestmentAccount49.FundFamilyName, com.tools20022.repository.msg.InvestmentAccount51.FundFamilyName, com.tools20022.repository.msg.InvestmentAccount50.FundFamilyName,
					com.tools20022.repository.msg.InvestmentAccount52.FundFamilyName, com.tools20022.repository.msg.InvestmentAccount61.FundFamilyName, com.tools20022.repository.msg.InvestmentAccount63.FundFamilyName,
					com.tools20022.repository.msg.InvestmentAccount62.FundFamilyName, com.tools20022.repository.msg.InvestmentAccount64.FundFamilyName);
			elementContext_lazy = () -> InvestmentFundFamily.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundFamilyName";
			definition = "Name of the investment fund family.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Pool of financial instruments managed by a professional asset manager and
	 * belonging to one or several investment fund families that are part of the
	 * same investment fund network.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#Family
	 * InvestmentFund.Family}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundFamily
	 * InvestmentFundFamily}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pool of financial instruments managed by a professional asset manager and belonging to one or several investment fund families that are part of the same investment fund network."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFund = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundFamily.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFund";
			definition = "Pool of financial instruments managed by a professional asset manager and belonging to one or several investment fund families that are part of the same investment fund network.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFund.Family;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundFamily";
				definition = "Group of investment funds under the same fund management company.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFund.Family);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundFamily.FundFamilyName, com.tools20022.repository.entity.InvestmentFundFamily.InvestmentFund);
			}
		});
		return mmObject_lazy.get();
	}
}