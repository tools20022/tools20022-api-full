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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Rights entitled to the account owner based on the terms of the corporate
 * action event and the balance of underlying securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionEntitlement"
 * src="doc-files/CorporateActionEntitlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#EligibleBalance
 * CorporateActionEntitlement.EligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#SecuritiesBalance
 * CorporateActionEntitlement.SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#InstructedBalance
 * CorporateActionEntitlement.InstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#UninstructedBalance
 * CorporateActionEntitlement.UninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#EligibleBalanceIndicator
 * CorporateActionEntitlement.EligibleBalanceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#RelatedServicing
 * CorporateActionEntitlement.RelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#NotEligibleBalance
 * CorporateActionEntitlement.NotEligibleBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#EligibleBalanceRelatedEntitlement
 * SecuritiesBalance.EligibleBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#CorporateActionEntitlement
 * SecuritiesBalance.CorporateActionEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#InstructedBalanceRelatedEntitlement
 * SecuritiesBalance.InstructedBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#UninstructedBalanceRelatedEntitlement
 * SecuritiesBalance.UninstructedBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#NotEligibleBalanceRelatedEntitlement
 * SecuritiesBalance.NotEligibleBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#CorporateActionEntitlement
 * CorporateActionServicing.CorporateActionEntitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#AccountAndDistributionDetails
 * EntitlementAdvice1.AccountAndDistributionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
 * CorporateActionCashEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement
 * CorporateActionSecuritiesEntitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3
 * CorporateActionBalanceDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5
 * CorporateActionBalanceDetails5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12
 * CorporateActionBalanceDetails12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15
 * CorporateActionBalanceDetails15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4
 * CorporateActionBalanceDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8
 * CorporateActionBalanceDetails8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9
 * CorporateActionBalanceDetails9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16
 * CorporateActionBalanceDetails16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2
 * CorporateActionBalanceDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6
 * CorporateActionBalanceDetails6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11
 * CorporateActionBalanceDetails11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14
 * CorporateActionBalanceDetails14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18
 * CorporateActionBalanceDetails18}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19
 * CorporateActionBalanceDetails19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1
 * CorporateActionBalanceDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7
 * CorporateActionBalanceDetails7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10
 * CorporateActionBalanceDetails10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13
 * CorporateActionBalanceDetails13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17
 * CorporateActionBalanceDetails17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20
 * CorporateActionBalanceDetails20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Entitlement1 Entitlement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EntitlementAdvice1
 * EntitlementAdvice1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21
 * CorporateActionBalanceDetails21}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22
 * CorporateActionBalanceDetails22}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25
 * CorporateActionBalanceDetails25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28
 * CorporateActionBalanceDetails28}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32
 * CorporateActionBalanceDetails32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31
 * CorporateActionBalanceDetails31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30
 * CorporateActionBalanceDetails30}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29
 * CorporateActionBalanceDetails29}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33
 * CorporateActionBalanceDetails33}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35
 * CorporateActionBalanceDetails35}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34
 * CorporateActionBalanceDetails34}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36
 * CorporateActionBalanceDetails36}</li>
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
 * "CorporateActionEntitlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Rights entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities."
 * </li>
 * </ul>
 */
public class CorporateActionEntitlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Total balance of securities eligible for this corporate action event. The
	 * entitlement calculation is based on this balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#EligibleBalanceRelatedEntitlement
	 * SecuritiesBalance.EligibleBalanceRelatedEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#TotalEligibleBalance
	 * CorporateActionBalanceDetails3.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#TotalEligibleBalance
	 * CorporateActionBalanceDetails5.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#TotalEligibleBalance
	 * CorporateActionBalanceDetails12.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#TotalEligibleBalance
	 * CorporateActionBalanceDetails15.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#TotalEligibleBalance
	 * CorporateActionOption9.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#TotalEligibleBalance
	 * CorporateActionOption18.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#TotalEligibleBalance
	 * CorporateActionOption22.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#TotalEligibleBalance
	 * CorporateActionOption27.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#TotalEligibleBalance
	 * CorporateActionOption26.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#TotalEligibleBalance
	 * CorporateActionOption41.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#TotalEligibleBalance
	 * CorporateActionOption50.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#TotalEligibleBalance
	 * CorporateActionBalanceDetails4.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#TotalEligibleBalance
	 * CorporateActionBalanceDetails8.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#TotalEligibleBalance
	 * CorporateActionBalanceDetails9.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#TotalEligibleBalance
	 * CorporateActionBalanceDetails16.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#TotalEligibleBalance
	 * CorporateActionOption29.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#TotalEligibleBalance
	 * CorporateActionBalanceDetails2.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#TotalEligibleBalance
	 * CorporateActionBalanceDetails6.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#TotalEligibleBalance
	 * CorporateActionBalanceDetails11.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#TotalEligibleBalance
	 * CorporateActionBalanceDetails14.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#TotalEligibleBalance
	 * CorporateActionBalanceDetails18.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#TotalEligibleBalance
	 * CorporateActionBalanceDetails19.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#TotalEligibleBalance
	 * CorporateActionBalanceDetails1.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#TotalEligibleBalance
	 * CorporateActionBalanceDetails7.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#TotalEligibleBalance
	 * CorporateActionBalanceDetails10.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#TotalEligibleBalance
	 * CorporateActionBalanceDetails13.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#TotalEligibleBalance
	 * CorporateActionBalanceDetails17.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#TotalEligibleBalance
	 * CorporateActionBalanceDetails20.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption8#TotalEligibleBalance
	 * CorporateActionOption8.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#TotalEligibleBalance
	 * CorporateActionBalanceDetails21.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#TotalEligibleBalance
	 * CorporateActionBalanceDetails22.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#TotalEligibleBalance
	 * CorporateActionBalanceDetails25.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#TotalEligibleBalance
	 * CorporateActionBalanceDetails28.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#TotalEligibleBalance
	 * CorporateActionOption116.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#TotalEligibleBalance
	 * CorporateActionBalanceDetails32.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#TotalEligibleBalance
	 * CorporateActionBalanceDetails31.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#TotalEligibleBalance
	 * CorporateActionBalanceDetails30.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#TotalEligibleBalance
	 * CorporateActionBalanceDetails29.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#TotalEligibleBalance
	 * CorporateActionOption121.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#TotalEligibleBalance
	 * CorporateActionBalanceDetails33.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#TotalEligibleBalance
	 * CorporateActionBalanceDetails35.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#TotalEligibleBalance
	 * CorporateActionBalanceDetails34.TotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#TotalEligibleBalance
	 * CorporateActionBalanceDetails36.TotalEligibleBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd EligibleBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails3.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails5.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails12.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails15.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionOption9.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionOption18.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionOption22.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionOption27.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionOption26.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionOption41.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionOption50.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionOption29.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionOption8.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionOption116.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails32.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionOption121.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.TotalEligibleBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.TotalEligibleBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.TotalEligibleBalance);
			elementContext_lazy = () -> CorporateActionEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligibleBalance";
			definition = "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.EligibleBalanceRelatedEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies any type of balance related to a corporate action entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#CorporateActionEntitlement
	 * SecuritiesBalance.CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#BlockedBalance
	 * CorporateActionBalanceDetails3.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#BorrowedBalance
	 * CorporateActionBalanceDetails3.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#CollateralInBalance
	 * CorporateActionBalanceDetails3.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#CollateralOutBalance
	 * CorporateActionBalanceDetails3.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#OnLoanBalance
	 * CorporateActionBalanceDetails3.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#PendingDeliveryBalance
	 * CorporateActionBalanceDetails3.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#PendingReceiptBalance
	 * CorporateActionBalanceDetails3.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#OutForRegistrationBalance
	 * CorporateActionBalanceDetails3.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#SettlementPositionBalance
	 * CorporateActionBalanceDetails3.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#StreetPositionBalance
	 * CorporateActionBalanceDetails3.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#TradeDatePositionBalance
	 * CorporateActionBalanceDetails3.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#InTransshipmentBalance
	 * CorporateActionBalanceDetails3.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#RegisteredBalance
	 * CorporateActionBalanceDetails3.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#BlockedBalance
	 * CorporateActionBalanceDetails5.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#BorrowedBalance
	 * CorporateActionBalanceDetails5.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#CollateralInBalance
	 * CorporateActionBalanceDetails5.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#CollateralOutBalance
	 * CorporateActionBalanceDetails5.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#OnLoanBalance
	 * CorporateActionBalanceDetails5.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#PendingDeliveryBalance
	 * CorporateActionBalanceDetails5.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#PendingReceiptBalance
	 * CorporateActionBalanceDetails5.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#OutForRegistrationBalance
	 * CorporateActionBalanceDetails5.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#SettlementPositionBalance
	 * CorporateActionBalanceDetails5.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#StreetPositionBalance
	 * CorporateActionBalanceDetails5.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#TradeDatePositionBalance
	 * CorporateActionBalanceDetails5.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#InTransshipmentBalance
	 * CorporateActionBalanceDetails5.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#RegisteredBalance
	 * CorporateActionBalanceDetails5.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#BlockedBalance
	 * CorporateActionBalanceDetails12.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#BorrowedBalance
	 * CorporateActionBalanceDetails12.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#CollateralInBalance
	 * CorporateActionBalanceDetails12.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#CollateralOutBalance
	 * CorporateActionBalanceDetails12.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#OnLoanBalance
	 * CorporateActionBalanceDetails12.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#PendingDeliveryBalance
	 * CorporateActionBalanceDetails12.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#PendingReceiptBalance
	 * CorporateActionBalanceDetails12.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#OutForRegistrationBalance
	 * CorporateActionBalanceDetails12.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#SettlementPositionBalance
	 * CorporateActionBalanceDetails12.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#StreetPositionBalance
	 * CorporateActionBalanceDetails12.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#TradeDatePositionBalance
	 * CorporateActionBalanceDetails12.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#InTransshipmentBalance
	 * CorporateActionBalanceDetails12.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#RegisteredBalance
	 * CorporateActionBalanceDetails12.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#BlockedBalance
	 * CorporateActionBalanceDetails15.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#BorrowedBalance
	 * CorporateActionBalanceDetails15.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#CollateralInBalance
	 * CorporateActionBalanceDetails15.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#CollateralOutBalance
	 * CorporateActionBalanceDetails15.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#OnLoanBalance
	 * CorporateActionBalanceDetails15.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#PendingDeliveryBalance
	 * CorporateActionBalanceDetails15.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#PendingReceiptBalance
	 * CorporateActionBalanceDetails15.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#OutForRegistrationBalance
	 * CorporateActionBalanceDetails15.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#SettlementPositionBalance
	 * CorporateActionBalanceDetails15.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#StreetPositionBalance
	 * CorporateActionBalanceDetails15.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#TradeDatePositionBalance
	 * CorporateActionBalanceDetails15.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#InTransshipmentBalance
	 * CorporateActionBalanceDetails15.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#RegisteredBalance
	 * CorporateActionBalanceDetails15.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#BlockedBalance
	 * CorporateActionBalanceDetails4.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#BorrowedBalance
	 * CorporateActionBalanceDetails4.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#CollateralInBalance
	 * CorporateActionBalanceDetails4.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#CollateralOutBalance
	 * CorporateActionBalanceDetails4.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#OnLoanBalance
	 * CorporateActionBalanceDetails4.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#OutForRegistrationBalance
	 * CorporateActionBalanceDetails4.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#SettlementPositionBalance
	 * CorporateActionBalanceDetails4.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#StreetPositionBalance
	 * CorporateActionBalanceDetails4.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#TradeDatePositionBalance
	 * CorporateActionBalanceDetails4.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#InTransshipmentBalance
	 * CorporateActionBalanceDetails4.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#RegisteredBalance
	 * CorporateActionBalanceDetails4.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#ObligatedBalance
	 * CorporateActionBalanceDetails4.ObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#PendingDeliveryBalance
	 * CorporateActionBalanceDetails4.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#PendingReceiptBalance
	 * CorporateActionBalanceDetails4.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#BlockedBalance
	 * CorporateActionBalanceDetails8.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#BorrowedBalance
	 * CorporateActionBalanceDetails8.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#CollateralInBalance
	 * CorporateActionBalanceDetails8.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#CollateralOutBalance
	 * CorporateActionBalanceDetails8.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#OnLoanBalance
	 * CorporateActionBalanceDetails8.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#OutForRegistrationBalance
	 * CorporateActionBalanceDetails8.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#SettlementPositionBalance
	 * CorporateActionBalanceDetails8.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#StreetPositionBalance
	 * CorporateActionBalanceDetails8.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#TradeDatePositionBalance
	 * CorporateActionBalanceDetails8.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#InTransshipmentBalance
	 * CorporateActionBalanceDetails8.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#RegisteredBalance
	 * CorporateActionBalanceDetails8.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#ObligatedBalance
	 * CorporateActionBalanceDetails8.ObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#PendingDeliveryBalance
	 * CorporateActionBalanceDetails8.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#PendingReceiptBalance
	 * CorporateActionBalanceDetails8.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#BlockedBalance
	 * CorporateActionBalanceDetails9.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#BorrowedBalance
	 * CorporateActionBalanceDetails9.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#CollateralInBalance
	 * CorporateActionBalanceDetails9.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#CollateralOutBalance
	 * CorporateActionBalanceDetails9.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#OnLoanBalance
	 * CorporateActionBalanceDetails9.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#OutForRegistrationBalance
	 * CorporateActionBalanceDetails9.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#SettlementPositionBalance
	 * CorporateActionBalanceDetails9.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#StreetPositionBalance
	 * CorporateActionBalanceDetails9.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#TradeDatePositionBalance
	 * CorporateActionBalanceDetails9.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#InTransshipmentBalance
	 * CorporateActionBalanceDetails9.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#RegisteredBalance
	 * CorporateActionBalanceDetails9.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#ObligatedBalance
	 * CorporateActionBalanceDetails9.ObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#PendingDeliveryBalance
	 * CorporateActionBalanceDetails9.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#PendingReceiptBalance
	 * CorporateActionBalanceDetails9.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#BlockedBalance
	 * CorporateActionBalanceDetails16.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#BorrowedBalance
	 * CorporateActionBalanceDetails16.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#CollateralInBalance
	 * CorporateActionBalanceDetails16.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#CollateralOutBalance
	 * CorporateActionBalanceDetails16.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#OnLoanBalance
	 * CorporateActionBalanceDetails16.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#OutForRegistrationBalance
	 * CorporateActionBalanceDetails16.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#SettlementPositionBalance
	 * CorporateActionBalanceDetails16.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#StreetPositionBalance
	 * CorporateActionBalanceDetails16.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#TradeDatePositionBalance
	 * CorporateActionBalanceDetails16.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#InTransshipmentBalance
	 * CorporateActionBalanceDetails16.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#RegisteredBalance
	 * CorporateActionBalanceDetails16.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#ObligatedBalance
	 * CorporateActionBalanceDetails16.ObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#PendingDeliveryBalance
	 * CorporateActionBalanceDetails16.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#PendingReceiptBalance
	 * CorporateActionBalanceDetails16.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#ConfirmedBalance
	 * CorporateActionBalanceDetails2.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#BlockedBalance
	 * CorporateActionBalanceDetails2.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#BorrowedBalance
	 * CorporateActionBalanceDetails2.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#CollateralInBalance
	 * CorporateActionBalanceDetails2.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#CollateralOutBalance
	 * CorporateActionBalanceDetails2.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#OnLoanBalance
	 * CorporateActionBalanceDetails2.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#PendingDeliveryBalance
	 * CorporateActionBalanceDetails2.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#PendingReceiptBalance
	 * CorporateActionBalanceDetails2.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#OutForRegistrationBalance
	 * CorporateActionBalanceDetails2.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#SettlementPositionBalance
	 * CorporateActionBalanceDetails2.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#StreetPositionBalance
	 * CorporateActionBalanceDetails2.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#TradeDatePositionBalance
	 * CorporateActionBalanceDetails2.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#InTransshipmentBalance
	 * CorporateActionBalanceDetails2.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#RegisteredBalance
	 * CorporateActionBalanceDetails2.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#AffectedBalance
	 * CorporateActionBalanceDetails2.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#UnaffectedBalance
	 * CorporateActionBalanceDetails2.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#ConfirmedBalance
	 * CorporateActionBalanceDetails6.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#BlockedBalance
	 * CorporateActionBalanceDetails6.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#BorrowedBalance
	 * CorporateActionBalanceDetails6.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#CollateralInBalance
	 * CorporateActionBalanceDetails6.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#CollateralOutBalance
	 * CorporateActionBalanceDetails6.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#OnLoanBalance
	 * CorporateActionBalanceDetails6.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#PendingDeliveryBalance
	 * CorporateActionBalanceDetails6.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#PendingReceiptBalance
	 * CorporateActionBalanceDetails6.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#OutForRegistrationBalance
	 * CorporateActionBalanceDetails6.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#SettlementPositionBalance
	 * CorporateActionBalanceDetails6.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#StreetPositionBalance
	 * CorporateActionBalanceDetails6.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#TradeDatePositionBalance
	 * CorporateActionBalanceDetails6.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#InTransshipmentBalance
	 * CorporateActionBalanceDetails6.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#RegisteredBalance
	 * CorporateActionBalanceDetails6.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#AffectedBalance
	 * CorporateActionBalanceDetails6.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#UnaffectedBalance
	 * CorporateActionBalanceDetails6.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#ConfirmedBalance
	 * CorporateActionBalanceDetails11.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#BlockedBalance
	 * CorporateActionBalanceDetails11.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#BorrowedBalance
	 * CorporateActionBalanceDetails11.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#CollateralInBalance
	 * CorporateActionBalanceDetails11.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#CollateralOutBalance
	 * CorporateActionBalanceDetails11.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#OnLoanBalance
	 * CorporateActionBalanceDetails11.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#PendingDeliveryBalance
	 * CorporateActionBalanceDetails11.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#PendingReceiptBalance
	 * CorporateActionBalanceDetails11.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#OutForRegistrationBalance
	 * CorporateActionBalanceDetails11.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#SettlementPositionBalance
	 * CorporateActionBalanceDetails11.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#StreetPositionBalance
	 * CorporateActionBalanceDetails11.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#TradeDatePositionBalance
	 * CorporateActionBalanceDetails11.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#InTransshipmentBalance
	 * CorporateActionBalanceDetails11.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#RegisteredBalance
	 * CorporateActionBalanceDetails11.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#AffectedBalance
	 * CorporateActionBalanceDetails11.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#UnaffectedBalance
	 * CorporateActionBalanceDetails11.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#ConfirmedBalance
	 * CorporateActionBalanceDetails14.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#BlockedBalance
	 * CorporateActionBalanceDetails14.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#BorrowedBalance
	 * CorporateActionBalanceDetails14.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#CollateralInBalance
	 * CorporateActionBalanceDetails14.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#CollateralOutBalance
	 * CorporateActionBalanceDetails14.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#OnLoanBalance
	 * CorporateActionBalanceDetails14.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#PendingDeliveryBalance
	 * CorporateActionBalanceDetails14.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#PendingReceiptBalance
	 * CorporateActionBalanceDetails14.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#OutForRegistrationBalance
	 * CorporateActionBalanceDetails14.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#SettlementPositionBalance
	 * CorporateActionBalanceDetails14.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#StreetPositionBalance
	 * CorporateActionBalanceDetails14.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#TradeDatePositionBalance
	 * CorporateActionBalanceDetails14.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#InTransshipmentBalance
	 * CorporateActionBalanceDetails14.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#RegisteredBalance
	 * CorporateActionBalanceDetails14.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#AffectedBalance
	 * CorporateActionBalanceDetails14.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#UnaffectedBalance
	 * CorporateActionBalanceDetails14.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#ConfirmedBalance
	 * CorporateActionBalanceDetails18.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#BlockedBalance
	 * CorporateActionBalanceDetails18.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#BorrowedBalance
	 * CorporateActionBalanceDetails18.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#CollateralInBalance
	 * CorporateActionBalanceDetails18.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#CollateralOutBalance
	 * CorporateActionBalanceDetails18.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#OnLoanBalance
	 * CorporateActionBalanceDetails18.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#PendingDeliveryBalance
	 * CorporateActionBalanceDetails18.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#PendingReceiptBalance
	 * CorporateActionBalanceDetails18.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#OutForRegistrationBalance
	 * CorporateActionBalanceDetails18.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#SettlementPositionBalance
	 * CorporateActionBalanceDetails18.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#StreetPositionBalance
	 * CorporateActionBalanceDetails18.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#TradeDatePositionBalance
	 * CorporateActionBalanceDetails18.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#InTransshipmentBalance
	 * CorporateActionBalanceDetails18.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#RegisteredBalance
	 * CorporateActionBalanceDetails18.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#AffectedBalance
	 * CorporateActionBalanceDetails18.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#UnaffectedBalance
	 * CorporateActionBalanceDetails18.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#ConfirmedBalance
	 * CorporateActionBalanceDetails19.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#BlockedBalance
	 * CorporateActionBalanceDetails19.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#BorrowedBalance
	 * CorporateActionBalanceDetails19.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#CollateralInBalance
	 * CorporateActionBalanceDetails19.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#CollateralOutBalance
	 * CorporateActionBalanceDetails19.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#OnLoanBalance
	 * CorporateActionBalanceDetails19.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#PendingDeliveryBalance
	 * CorporateActionBalanceDetails19.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#PendingReceiptBalance
	 * CorporateActionBalanceDetails19.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#OutForRegistrationBalance
	 * CorporateActionBalanceDetails19.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#SettlementPositionBalance
	 * CorporateActionBalanceDetails19.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#StreetPositionBalance
	 * CorporateActionBalanceDetails19.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#TradeDatePositionBalance
	 * CorporateActionBalanceDetails19.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#InTransshipmentBalance
	 * CorporateActionBalanceDetails19.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#RegisteredBalance
	 * CorporateActionBalanceDetails19.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#AffectedBalance
	 * CorporateActionBalanceDetails19.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#UnaffectedBalance
	 * CorporateActionBalanceDetails19.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#BlockedBalance
	 * CorporateActionBalanceDetails1.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#BorrowedBalance
	 * CorporateActionBalanceDetails1.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#CollateralInBalance
	 * CorporateActionBalanceDetails1.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#CollateralOutBalance
	 * CorporateActionBalanceDetails1.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#OnLoanBalance
	 * CorporateActionBalanceDetails1.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#PendingDeliveryBalance
	 * CorporateActionBalanceDetails1.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#PendingReceiptBalance
	 * CorporateActionBalanceDetails1.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#OutForRegistrationBalance
	 * CorporateActionBalanceDetails1.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#SettlementPositionBalance
	 * CorporateActionBalanceDetails1.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#StreetPositionBalance
	 * CorporateActionBalanceDetails1.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#TradeDatePositionBalance
	 * CorporateActionBalanceDetails1.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#InTransshipmentBalance
	 * CorporateActionBalanceDetails1.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#RegisteredBalance
	 * CorporateActionBalanceDetails1.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#ObligatedBalance
	 * CorporateActionBalanceDetails1.ObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#AffectedBalance
	 * CorporateActionBalanceDetails1.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#UnaffectedBalance
	 * CorporateActionBalanceDetails1.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#BlockedBalance
	 * CorporateActionBalanceDetails7.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#BorrowedBalance
	 * CorporateActionBalanceDetails7.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#CollateralInBalance
	 * CorporateActionBalanceDetails7.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#CollateralOutBalance
	 * CorporateActionBalanceDetails7.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#OnLoanBalance
	 * CorporateActionBalanceDetails7.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#PendingDeliveryBalance
	 * CorporateActionBalanceDetails7.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#PendingReceiptBalance
	 * CorporateActionBalanceDetails7.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#OutForRegistrationBalance
	 * CorporateActionBalanceDetails7.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#SettlementPositionBalance
	 * CorporateActionBalanceDetails7.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#StreetPositionBalance
	 * CorporateActionBalanceDetails7.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#TradeDatePositionBalance
	 * CorporateActionBalanceDetails7.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#InTransshipmentBalance
	 * CorporateActionBalanceDetails7.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#RegisteredBalance
	 * CorporateActionBalanceDetails7.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#ObligatedBalance
	 * CorporateActionBalanceDetails7.ObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#AffectedBalance
	 * CorporateActionBalanceDetails7.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#UnaffectedBalance
	 * CorporateActionBalanceDetails7.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#BlockedBalance
	 * CorporateActionBalanceDetails10.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#BorrowedBalance
	 * CorporateActionBalanceDetails10.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#CollateralInBalance
	 * CorporateActionBalanceDetails10.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#CollateralOutBalance
	 * CorporateActionBalanceDetails10.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#OnLoanBalance
	 * CorporateActionBalanceDetails10.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#PendingDeliveryBalance
	 * CorporateActionBalanceDetails10.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#PendingReceiptBalance
	 * CorporateActionBalanceDetails10.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#OutForRegistrationBalance
	 * CorporateActionBalanceDetails10.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#SettlementPositionBalance
	 * CorporateActionBalanceDetails10.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#StreetPositionBalance
	 * CorporateActionBalanceDetails10.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#TradeDatePositionBalance
	 * CorporateActionBalanceDetails10.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#InTransshipmentBalance
	 * CorporateActionBalanceDetails10.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#RegisteredBalance
	 * CorporateActionBalanceDetails10.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#ObligatedBalance
	 * CorporateActionBalanceDetails10.ObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#AffectedBalance
	 * CorporateActionBalanceDetails10.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#UnaffectedBalance
	 * CorporateActionBalanceDetails10.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#BlockedBalance
	 * CorporateActionBalanceDetails13.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#BorrowedBalance
	 * CorporateActionBalanceDetails13.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#CollateralInBalance
	 * CorporateActionBalanceDetails13.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#CollateralOutBalance
	 * CorporateActionBalanceDetails13.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#OnLoanBalance
	 * CorporateActionBalanceDetails13.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#PendingDeliveryBalance
	 * CorporateActionBalanceDetails13.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#PendingReceiptBalance
	 * CorporateActionBalanceDetails13.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#OutForRegistrationBalance
	 * CorporateActionBalanceDetails13.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#SettlementPositionBalance
	 * CorporateActionBalanceDetails13.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#StreetPositionBalance
	 * CorporateActionBalanceDetails13.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#TradeDatePositionBalance
	 * CorporateActionBalanceDetails13.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#InTransshipmentBalance
	 * CorporateActionBalanceDetails13.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#RegisteredBalance
	 * CorporateActionBalanceDetails13.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#ObligatedBalance
	 * CorporateActionBalanceDetails13.ObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#AffectedBalance
	 * CorporateActionBalanceDetails13.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#UnaffectedBalance
	 * CorporateActionBalanceDetails13.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#BlockedBalance
	 * CorporateActionBalanceDetails17.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#BorrowedBalance
	 * CorporateActionBalanceDetails17.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#CollateralInBalance
	 * CorporateActionBalanceDetails17.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#CollateralOutBalance
	 * CorporateActionBalanceDetails17.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#OnLoanBalance
	 * CorporateActionBalanceDetails17.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#PendingDeliveryBalance
	 * CorporateActionBalanceDetails17.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#PendingReceiptBalance
	 * CorporateActionBalanceDetails17.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#OutForRegistrationBalance
	 * CorporateActionBalanceDetails17.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#SettlementPositionBalance
	 * CorporateActionBalanceDetails17.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#StreetPositionBalance
	 * CorporateActionBalanceDetails17.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#TradeDatePositionBalance
	 * CorporateActionBalanceDetails17.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#InTransshipmentBalance
	 * CorporateActionBalanceDetails17.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#RegisteredBalance
	 * CorporateActionBalanceDetails17.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#ObligatedBalance
	 * CorporateActionBalanceDetails17.ObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#AffectedBalance
	 * CorporateActionBalanceDetails17.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#UnaffectedBalance
	 * CorporateActionBalanceDetails17.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#BlockedBalance
	 * CorporateActionBalanceDetails20.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#BorrowedBalance
	 * CorporateActionBalanceDetails20.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#CollateralInBalance
	 * CorporateActionBalanceDetails20.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#CollateralOutBalance
	 * CorporateActionBalanceDetails20.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#OnLoanBalance
	 * CorporateActionBalanceDetails20.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#PendingDeliveryBalance
	 * CorporateActionBalanceDetails20.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#PendingReceiptBalance
	 * CorporateActionBalanceDetails20.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#OutForRegistrationBalance
	 * CorporateActionBalanceDetails20.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#SettlementPositionBalance
	 * CorporateActionBalanceDetails20.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#StreetPositionBalance
	 * CorporateActionBalanceDetails20.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#TradeDatePositionBalance
	 * CorporateActionBalanceDetails20.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#InTransshipmentBalance
	 * CorporateActionBalanceDetails20.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#RegisteredBalance
	 * CorporateActionBalanceDetails20.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#ObligatedBalance
	 * CorporateActionBalanceDetails20.ObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#AffectedBalance
	 * CorporateActionBalanceDetails20.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#UnaffectedBalance
	 * CorporateActionBalanceDetails20.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#BlockedBalance
	 * CorporateActionBalanceDetails21.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#BorrowedBalance
	 * CorporateActionBalanceDetails21.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#CollateralInBalance
	 * CorporateActionBalanceDetails21.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#CollateralOutBalance
	 * CorporateActionBalanceDetails21.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#OnLoanBalance
	 * CorporateActionBalanceDetails21.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#PendingDeliveryBalance
	 * CorporateActionBalanceDetails21.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#PendingReceiptBalance
	 * CorporateActionBalanceDetails21.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#OutForRegistrationBalance
	 * CorporateActionBalanceDetails21.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#SettlementPositionBalance
	 * CorporateActionBalanceDetails21.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#StreetPositionBalance
	 * CorporateActionBalanceDetails21.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#TradeDatePositionBalance
	 * CorporateActionBalanceDetails21.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#InTransshipmentBalance
	 * CorporateActionBalanceDetails21.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#RegisteredBalance
	 * CorporateActionBalanceDetails21.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#ObligatedBalance
	 * CorporateActionBalanceDetails21.ObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#AffectedBalance
	 * CorporateActionBalanceDetails21.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#UnaffectedBalance
	 * CorporateActionBalanceDetails21.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#ConfirmedBalance
	 * CorporateActionBalanceDetails22.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#BlockedBalance
	 * CorporateActionBalanceDetails22.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#BorrowedBalance
	 * CorporateActionBalanceDetails22.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#CollateralInBalance
	 * CorporateActionBalanceDetails22.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#CollateralOutBalance
	 * CorporateActionBalanceDetails22.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#OnLoanBalance
	 * CorporateActionBalanceDetails22.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#PendingDeliveryBalance
	 * CorporateActionBalanceDetails22.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#PendingReceiptBalance
	 * CorporateActionBalanceDetails22.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#OutForRegistrationBalance
	 * CorporateActionBalanceDetails22.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#SettlementPositionBalance
	 * CorporateActionBalanceDetails22.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#StreetPositionBalance
	 * CorporateActionBalanceDetails22.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#TradeDatePositionBalance
	 * CorporateActionBalanceDetails22.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#InTransshipmentBalance
	 * CorporateActionBalanceDetails22.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#RegisteredBalance
	 * CorporateActionBalanceDetails22.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#AffectedBalance
	 * CorporateActionBalanceDetails22.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#UnaffectedBalance
	 * CorporateActionBalanceDetails22.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#BlockedBalance
	 * CorporateActionBalanceDetails25.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#BorrowedBalance
	 * CorporateActionBalanceDetails25.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#CollateralInBalance
	 * CorporateActionBalanceDetails25.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#CollateralOutBalance
	 * CorporateActionBalanceDetails25.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#OnLoanBalance
	 * CorporateActionBalanceDetails25.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#PendingDeliveryBalance
	 * CorporateActionBalanceDetails25.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#PendingReceiptBalance
	 * CorporateActionBalanceDetails25.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#OutForRegistrationBalance
	 * CorporateActionBalanceDetails25.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#SettlementPositionBalance
	 * CorporateActionBalanceDetails25.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#StreetPositionBalance
	 * CorporateActionBalanceDetails25.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#TradeDatePositionBalance
	 * CorporateActionBalanceDetails25.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#InTransshipmentBalance
	 * CorporateActionBalanceDetails25.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#RegisteredBalance
	 * CorporateActionBalanceDetails25.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#ObligatedBalance
	 * CorporateActionBalanceDetails25.ObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#AffectedBalance
	 * CorporateActionBalanceDetails25.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#UnaffectedBalance
	 * CorporateActionBalanceDetails25.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#ConfirmedBalance
	 * CorporateActionBalanceDetails28.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#BlockedBalance
	 * CorporateActionBalanceDetails28.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#BorrowedBalance
	 * CorporateActionBalanceDetails28.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#CollateralInBalance
	 * CorporateActionBalanceDetails28.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#CollateralOutBalance
	 * CorporateActionBalanceDetails28.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#OnLoanBalance
	 * CorporateActionBalanceDetails28.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#PendingDeliveryBalance
	 * CorporateActionBalanceDetails28.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#PendingReceiptBalance
	 * CorporateActionBalanceDetails28.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#OutForRegistrationBalance
	 * CorporateActionBalanceDetails28.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#SettlementPositionBalance
	 * CorporateActionBalanceDetails28.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#StreetPositionBalance
	 * CorporateActionBalanceDetails28.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#TradeDatePositionBalance
	 * CorporateActionBalanceDetails28.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#InTransshipmentBalance
	 * CorporateActionBalanceDetails28.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#RegisteredBalance
	 * CorporateActionBalanceDetails28.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#AffectedBalance
	 * CorporateActionBalanceDetails28.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#UnaffectedBalance
	 * CorporateActionBalanceDetails28.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#BlockedBalance
	 * CorporateActionBalanceDetails32.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#BorrowedBalance
	 * CorporateActionBalanceDetails32.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#CollateralInBalance
	 * CorporateActionBalanceDetails32.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#CollateralOutBalance
	 * CorporateActionBalanceDetails32.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#OnLoanBalance
	 * CorporateActionBalanceDetails32.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#PendingDeliveryBalance
	 * CorporateActionBalanceDetails32.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#PendingReceiptBalance
	 * CorporateActionBalanceDetails32.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#OutForRegistrationBalance
	 * CorporateActionBalanceDetails32.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#SettlementPositionBalance
	 * CorporateActionBalanceDetails32.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#StreetPositionBalance
	 * CorporateActionBalanceDetails32.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#TradeDatePositionBalance
	 * CorporateActionBalanceDetails32.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#InTransshipmentBalance
	 * CorporateActionBalanceDetails32.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#RegisteredBalance
	 * CorporateActionBalanceDetails32.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#ConfirmedBalance
	 * CorporateActionBalanceDetails31.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#BlockedBalance
	 * CorporateActionBalanceDetails31.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#BorrowedBalance
	 * CorporateActionBalanceDetails31.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#CollateralInBalance
	 * CorporateActionBalanceDetails31.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#CollateralOutBalance
	 * CorporateActionBalanceDetails31.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#OnLoanBalance
	 * CorporateActionBalanceDetails31.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#PendingDeliveryBalance
	 * CorporateActionBalanceDetails31.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#PendingReceiptBalance
	 * CorporateActionBalanceDetails31.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#OutForRegistrationBalance
	 * CorporateActionBalanceDetails31.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#SettlementPositionBalance
	 * CorporateActionBalanceDetails31.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#StreetPositionBalance
	 * CorporateActionBalanceDetails31.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#TradeDatePositionBalance
	 * CorporateActionBalanceDetails31.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#InTransshipmentBalance
	 * CorporateActionBalanceDetails31.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#RegisteredBalance
	 * CorporateActionBalanceDetails31.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#AffectedBalance
	 * CorporateActionBalanceDetails31.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#UnaffectedBalance
	 * CorporateActionBalanceDetails31.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#BlockedBalance
	 * CorporateActionBalanceDetails30.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#BorrowedBalance
	 * CorporateActionBalanceDetails30.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#CollateralInBalance
	 * CorporateActionBalanceDetails30.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#CollateralOutBalance
	 * CorporateActionBalanceDetails30.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#OnLoanBalance
	 * CorporateActionBalanceDetails30.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#OutForRegistrationBalance
	 * CorporateActionBalanceDetails30.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#SettlementPositionBalance
	 * CorporateActionBalanceDetails30.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#StreetPositionBalance
	 * CorporateActionBalanceDetails30.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#TradeDatePositionBalance
	 * CorporateActionBalanceDetails30.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#InTransshipmentBalance
	 * CorporateActionBalanceDetails30.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#RegisteredBalance
	 * CorporateActionBalanceDetails30.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#ObligatedBalance
	 * CorporateActionBalanceDetails30.ObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#PendingDeliveryBalance
	 * CorporateActionBalanceDetails30.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#PendingReceiptBalance
	 * CorporateActionBalanceDetails30.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#BlockedBalance
	 * CorporateActionBalanceDetails29.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#BorrowedBalance
	 * CorporateActionBalanceDetails29.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#CollateralInBalance
	 * CorporateActionBalanceDetails29.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#CollateralOutBalance
	 * CorporateActionBalanceDetails29.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#OnLoanBalance
	 * CorporateActionBalanceDetails29.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#PendingDeliveryBalance
	 * CorporateActionBalanceDetails29.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#PendingReceiptBalance
	 * CorporateActionBalanceDetails29.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#OutForRegistrationBalance
	 * CorporateActionBalanceDetails29.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#SettlementPositionBalance
	 * CorporateActionBalanceDetails29.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#StreetPositionBalance
	 * CorporateActionBalanceDetails29.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#TradeDatePositionBalance
	 * CorporateActionBalanceDetails29.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#InTransshipmentBalance
	 * CorporateActionBalanceDetails29.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#RegisteredBalance
	 * CorporateActionBalanceDetails29.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#ObligatedBalance
	 * CorporateActionBalanceDetails29.ObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#AffectedBalance
	 * CorporateActionBalanceDetails29.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#UnaffectedBalance
	 * CorporateActionBalanceDetails29.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#BlockedBalance
	 * CorporateActionBalanceDetails33.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#BorrowedBalance
	 * CorporateActionBalanceDetails33.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#CollateralInBalance
	 * CorporateActionBalanceDetails33.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#CollateralOutBalance
	 * CorporateActionBalanceDetails33.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#OnLoanBalance
	 * CorporateActionBalanceDetails33.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#OutForRegistrationBalance
	 * CorporateActionBalanceDetails33.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#SettlementPositionBalance
	 * CorporateActionBalanceDetails33.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#StreetPositionBalance
	 * CorporateActionBalanceDetails33.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#TradeDatePositionBalance
	 * CorporateActionBalanceDetails33.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#InTransshipmentBalance
	 * CorporateActionBalanceDetails33.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#RegisteredBalance
	 * CorporateActionBalanceDetails33.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#ObligatedBalance
	 * CorporateActionBalanceDetails33.ObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#PendingDeliveryBalance
	 * CorporateActionBalanceDetails33.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#PendingReceiptBalance
	 * CorporateActionBalanceDetails33.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#ConfirmedBalance
	 * CorporateActionBalanceDetails35.ConfirmedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#BlockedBalance
	 * CorporateActionBalanceDetails35.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#BorrowedBalance
	 * CorporateActionBalanceDetails35.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#CollateralInBalance
	 * CorporateActionBalanceDetails35.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#CollateralOutBalance
	 * CorporateActionBalanceDetails35.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#OnLoanBalance
	 * CorporateActionBalanceDetails35.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#PendingDeliveryBalance
	 * CorporateActionBalanceDetails35.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#PendingReceiptBalance
	 * CorporateActionBalanceDetails35.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#OutForRegistrationBalance
	 * CorporateActionBalanceDetails35.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#SettlementPositionBalance
	 * CorporateActionBalanceDetails35.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#StreetPositionBalance
	 * CorporateActionBalanceDetails35.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#TradeDatePositionBalance
	 * CorporateActionBalanceDetails35.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#InTransshipmentBalance
	 * CorporateActionBalanceDetails35.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#RegisteredBalance
	 * CorporateActionBalanceDetails35.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#AffectedBalance
	 * CorporateActionBalanceDetails35.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#UnaffectedBalance
	 * CorporateActionBalanceDetails35.UnaffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#BlockedBalance
	 * CorporateActionBalanceDetails34.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#BorrowedBalance
	 * CorporateActionBalanceDetails34.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#CollateralInBalance
	 * CorporateActionBalanceDetails34.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#CollateralOutBalance
	 * CorporateActionBalanceDetails34.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#OnLoanBalance
	 * CorporateActionBalanceDetails34.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#PendingDeliveryBalance
	 * CorporateActionBalanceDetails34.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#PendingReceiptBalance
	 * CorporateActionBalanceDetails34.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#OutForRegistrationBalance
	 * CorporateActionBalanceDetails34.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#SettlementPositionBalance
	 * CorporateActionBalanceDetails34.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#StreetPositionBalance
	 * CorporateActionBalanceDetails34.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#TradeDatePositionBalance
	 * CorporateActionBalanceDetails34.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#InTransshipmentBalance
	 * CorporateActionBalanceDetails34.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#RegisteredBalance
	 * CorporateActionBalanceDetails34.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#BlockedBalance
	 * CorporateActionBalanceDetails36.BlockedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#BorrowedBalance
	 * CorporateActionBalanceDetails36.BorrowedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#CollateralInBalance
	 * CorporateActionBalanceDetails36.CollateralInBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#CollateralOutBalance
	 * CorporateActionBalanceDetails36.CollateralOutBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#OnLoanBalance
	 * CorporateActionBalanceDetails36.OnLoanBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#PendingDeliveryBalance
	 * CorporateActionBalanceDetails36.PendingDeliveryBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#PendingReceiptBalance
	 * CorporateActionBalanceDetails36.PendingReceiptBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#OutForRegistrationBalance
	 * CorporateActionBalanceDetails36.OutForRegistrationBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#SettlementPositionBalance
	 * CorporateActionBalanceDetails36.SettlementPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#StreetPositionBalance
	 * CorporateActionBalanceDetails36.StreetPositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#TradeDatePositionBalance
	 * CorporateActionBalanceDetails36.TradeDatePositionBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#InTransshipmentBalance
	 * CorporateActionBalanceDetails36.InTransshipmentBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#RegisteredBalance
	 * CorporateActionBalanceDetails36.RegisteredBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#ObligatedBalance
	 * CorporateActionBalanceDetails36.ObligatedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#AffectedBalance
	 * CorporateActionBalanceDetails36.AffectedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#UnaffectedBalance
	 * CorporateActionBalanceDetails36.UnaffectedBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies any type of balance related to a corporate action entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionBalanceDetails3.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails3.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails3.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails3.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails3.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails3.PendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails3.PendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails3.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails3.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails3.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails3.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails3.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails3.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails5.BlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails5.BorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails5.CollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails5.CollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails5.OnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails5.PendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails5.PendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails5.OutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails5.SettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails5.StreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails5.TradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails5.InTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails5.RegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails12.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails12.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails12.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails12.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails12.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails12.PendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails12.PendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails12.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails12.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails12.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails12.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails12.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails12.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails15.BlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails15.BorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails15.CollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails15.CollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails15.OnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails15.PendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails15.PendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails15.OutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails15.SettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails15.StreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails15.TradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails15.InTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails15.RegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails4.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails4.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails4.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails4.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails4.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails4.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.ObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails4.PendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.PendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails8.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails8.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails8.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails8.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails8.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails8.ObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.PendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails8.PendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails9.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails9.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails9.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails9.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails9.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails9.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.ObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails9.PendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.PendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails16.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails16.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails16.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails16.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails16.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails16.ObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.PendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails16.PendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.ConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails2.BlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.BorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails2.CollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.CollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails2.OnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.PendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails2.PendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.OutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails2.SettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.StreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails2.TradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.InTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails2.RegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails2.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails2.UnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails6.ConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.BlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails6.BorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.CollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails6.CollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.OnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails6.PendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.PendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails6.OutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.SettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails6.StreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.TradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails6.InTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.RegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails6.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails6.UnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.ConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails11.BlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.BorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails11.CollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.CollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails11.OnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.PendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails11.PendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.OutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails11.SettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.StreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails11.TradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.InTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails11.RegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails11.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails11.UnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails14.ConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.BlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails14.BorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.CollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails14.CollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.OnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails14.PendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.PendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails14.OutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.SettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails14.StreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.TradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails14.InTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.RegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails14.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails14.UnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.ConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails18.BlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.BorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails18.CollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.CollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails18.OnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.PendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails18.PendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.OutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails18.SettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.StreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails18.TradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.InTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails18.RegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails18.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails18.UnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails19.ConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.BlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails19.BorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.CollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails19.CollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.OnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails19.PendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.PendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails19.OutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.SettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails19.StreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.TradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails19.InTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.RegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails19.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails19.UnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.PendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.PendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.ObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.UnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.PendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.PendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.ObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.UnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.PendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.PendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.ObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.UnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.PendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.PendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.ObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.UnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.PendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.PendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.ObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.UnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.PendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.PendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.ObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.UnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails21.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails21.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails21.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.PendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails21.PendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails21.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails21.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails21.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.ObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails21.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.UnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.ConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails22.BlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.BorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails22.CollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.CollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails22.OnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.PendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails22.PendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.OutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails22.SettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.StreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails22.TradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.InTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails22.RegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails22.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails22.UnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.PendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.PendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.ObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails25.UnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.ConfirmedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails28.BlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.BorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails28.CollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.CollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails28.OnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.PendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails28.PendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.OutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails28.SettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.StreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails28.TradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.InTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails28.RegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails28.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails28.UnaffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails32.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails32.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails32.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails32.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails32.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails32.PendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails32.PendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails32.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails32.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails32.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails32.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails32.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails32.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.ConfirmedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails31.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails31.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails31.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.PendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails31.PendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails31.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails31.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails31.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails31.AffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails31.UnaffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.BlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.BorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.CollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.CollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.OnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.OutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.SettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.StreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.TradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.InTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.RegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.ObligatedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.PendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.PendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.BlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.BorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.CollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.CollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.OnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.PendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.PendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.OutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.SettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.StreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.TradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.InTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.RegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.ObligatedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails29.AffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.UnaffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.BlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails33.BorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.CollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails33.CollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.OnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails33.OutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.SettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails33.StreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.TradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails33.InTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.RegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails33.ObligatedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.PendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails33.PendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.ConfirmedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.PendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.PendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails35.AffectedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails35.UnaffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.BlockedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails34.BorrowedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.CollateralInBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails34.CollateralOutBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.OnLoanBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails34.PendingDeliveryBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.PendingReceiptBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails34.OutForRegistrationBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.SettlementPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails34.StreetPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.TradeDatePositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails34.InTransshipmentBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails34.RegisteredBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.BlockedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails36.BorrowedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.CollateralInBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails36.CollateralOutBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.OnLoanBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails36.PendingDeliveryBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.PendingReceiptBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails36.OutForRegistrationBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.SettlementPositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails36.StreetPositionBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.TradeDatePositionBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails36.InTransshipmentBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.RegisteredBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails36.ObligatedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.AffectedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails36.UnaffectedBalance);
			elementContext_lazy = () -> CorporateActionEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Specifies any type of balance related to a corporate action entitlement.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.CorporateActionEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Balance of instructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#InstructedBalanceRelatedEntitlement
	 * SecuritiesBalance.InstructedBalanceRelatedEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive1Choice#InstructedQuantity
	 * InstructedOrQuantityToReceive1Choice.InstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice#InstructedQuantity
	 * InstructedOrQuantityToReceive2Choice.InstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption6#InstructedOrQuantityToReceive
	 * CorporateActionOption6.InstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption21#InstructedOrQuantityToReceive
	 * CorporateActionOption21.InstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption42#InstructedOrQuantityToReceive
	 * CorporateActionOption42.InstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption28#InstructedOrQuantityToReceive
	 * CorporateActionOption28.InstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption43#InstructedOrQuantityToReceive
	 * CorporateActionOption43.InstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#InstructedBalance
	 * CorporateActionOption9.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#InstructedBalance
	 * CorporateActionOption18.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#InstructedBalance
	 * CorporateActionOption22.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#InstructedBalance
	 * CorporateActionOption27.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#InstructedBalance
	 * CorporateActionOption26.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#InstructedBalance
	 * CorporateActionOption41.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#InstructedBalance
	 * CorporateActionOption50.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption1#InstructedBalance
	 * InstructedCorporateActionOption1.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails1#TotalInstructedBalance
	 * InstructedBalanceDetails1.TotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#TotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails4.TotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption2#InstructedBalance
	 * InstructedCorporateActionOption2.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails2#TotalInstructedBalance
	 * InstructedBalanceDetails2.TotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#TotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails8.TotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#InstructedBalance
	 * InstructedCorporateActionOption4.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails3#TotalInstructedBalance
	 * InstructedBalanceDetails3.TotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#TotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails9.TotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#InstructedBalance
	 * InstructedCorporateActionOption5.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails4#TotalInstructedBalance
	 * InstructedBalanceDetails4.TotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#TotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails16.TotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#InstructedBalance
	 * CorporateActionOption29.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#InstructedBalance
	 * CorporateActionBalanceDetails1.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#InstructedBalance
	 * CorporateActionBalanceDetails7.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#InstructedBalance
	 * CorporateActionBalanceDetails10.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#InstructedBalance
	 * CorporateActionBalanceDetails13.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#InstructedBalance
	 * CorporateActionBalanceDetails17.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#InstructedBalance
	 * CorporateActionBalanceDetails20.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#InstructedBalance
	 * FinancialInstrumentAttributes3.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#InstructedBalance
	 * FinancialInstrumentAttributes12.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#InstructedBalance
	 * FinancialInstrumentAttributes17.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#InstructedBalance
	 * FinancialInstrumentAttributes25.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#InstructedBalance
	 * FinancialInstrumentAttributes46.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#InstructedBalance
	 * FinancialInstrumentAttributes47.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption7#InstructedOrQuantityToReceive
	 * CorporateActionOption7.InstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption8#InstructedBalance
	 * CorporateActionOption8.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#InstructedBalance
	 * CorporateActionBalanceDetails21.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#InstructedBalance
	 * CorporateActionBalanceDetails25.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#InstructedBalance
	 * CorporateActionOption116.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#InstructedBalance
	 * FinancialInstrumentAttributes68.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120#InstructedQuantity
	 * CorporateActionOption120.InstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#InstructedBalance
	 * InstructedCorporateActionOption6.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption52#InstructedQuantity
	 * SecuritiesOption52.InstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#TotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails30.TotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#InstructedBalance
	 * CorporateActionBalanceDetails29.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails5#TotalInstructedBalance
	 * InstructedBalanceDetails5.TotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#InstructedBalance
	 * CorporateActionOption121.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#InstructedBalance
	 * FinancialInstrumentAttributes73.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption7#InstructedBalance
	 * InstructedCorporateActionOption7.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#TotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails33.TotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails6#TotalInstructedBalance
	 * InstructedBalanceDetails6.TotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption54#InstructedQuantity
	 * SecuritiesOption54.InstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#InstructedBalance
	 * CorporateActionBalanceDetails36.InstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption128#InstructedQuantity
	 * CorporateActionOption128.InstructedQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of  instructed position."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InstructedBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstructedOrQuantityToReceive1Choice.InstructedQuantity, com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice.InstructedQuantity,
					com.tools20022.repository.msg.CorporateActionOption6.InstructedOrQuantityToReceive, com.tools20022.repository.msg.CorporateActionOption21.InstructedOrQuantityToReceive,
					com.tools20022.repository.msg.CorporateActionOption42.InstructedOrQuantityToReceive, com.tools20022.repository.msg.CorporateActionOption28.InstructedOrQuantityToReceive,
					com.tools20022.repository.msg.CorporateActionOption43.InstructedOrQuantityToReceive, com.tools20022.repository.msg.CorporateActionOption9.InstructedBalance,
					com.tools20022.repository.msg.CorporateActionOption18.InstructedBalance, com.tools20022.repository.msg.CorporateActionOption22.InstructedBalance, com.tools20022.repository.msg.CorporateActionOption27.InstructedBalance,
					com.tools20022.repository.msg.CorporateActionOption26.InstructedBalance, com.tools20022.repository.msg.CorporateActionOption41.InstructedBalance, com.tools20022.repository.msg.CorporateActionOption50.InstructedBalance,
					com.tools20022.repository.msg.InstructedCorporateActionOption1.InstructedBalance, com.tools20022.repository.msg.InstructedBalanceDetails1.TotalInstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails4.TotalInstructedBalanceDetails, com.tools20022.repository.msg.InstructedCorporateActionOption2.InstructedBalance,
					com.tools20022.repository.msg.InstructedBalanceDetails2.TotalInstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails8.TotalInstructedBalanceDetails,
					com.tools20022.repository.msg.InstructedCorporateActionOption4.InstructedBalance, com.tools20022.repository.msg.InstructedBalanceDetails3.TotalInstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails9.TotalInstructedBalanceDetails, com.tools20022.repository.msg.InstructedCorporateActionOption5.InstructedBalance,
					com.tools20022.repository.msg.InstructedBalanceDetails4.TotalInstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails16.TotalInstructedBalanceDetails,
					com.tools20022.repository.msg.CorporateActionOption29.InstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails1.InstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails7.InstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails10.InstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails13.InstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails17.InstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails20.InstructedBalance, com.tools20022.repository.msg.FinancialInstrumentAttributes3.InstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes12.InstructedBalance, com.tools20022.repository.msg.FinancialInstrumentAttributes17.InstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes25.InstructedBalance, com.tools20022.repository.msg.FinancialInstrumentAttributes46.InstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes47.InstructedBalance, com.tools20022.repository.msg.CorporateActionOption7.InstructedOrQuantityToReceive,
					com.tools20022.repository.msg.CorporateActionOption8.InstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.InstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.InstructedBalance, com.tools20022.repository.msg.CorporateActionOption116.InstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes68.InstructedBalance, com.tools20022.repository.msg.CorporateActionOption120.InstructedQuantity,
					com.tools20022.repository.msg.InstructedCorporateActionOption6.InstructedBalance, com.tools20022.repository.msg.SecuritiesOption52.InstructedQuantity,
					com.tools20022.repository.msg.CorporateActionBalanceDetails30.TotalInstructedBalanceDetails, com.tools20022.repository.msg.CorporateActionBalanceDetails29.InstructedBalance,
					com.tools20022.repository.msg.InstructedBalanceDetails5.TotalInstructedBalance, com.tools20022.repository.msg.CorporateActionOption121.InstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes73.InstructedBalance, com.tools20022.repository.msg.InstructedCorporateActionOption7.InstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails33.TotalInstructedBalanceDetails, com.tools20022.repository.msg.InstructedBalanceDetails6.TotalInstructedBalance,
					com.tools20022.repository.msg.SecuritiesOption54.InstructedQuantity, com.tools20022.repository.msg.CorporateActionBalanceDetails36.InstructedBalance,
					com.tools20022.repository.msg.CorporateActionOption128.InstructedQuantity);
			elementContext_lazy = () -> CorporateActionEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InstructedBalance";
			definition = "Balance of  instructed position.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.InstructedBalanceRelatedEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Balance of uninstructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#UninstructedBalanceRelatedEntitlement
	 * SecuritiesBalance.UninstructedBalanceRelatedEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#UninstructedBalance
	 * CorporateActionOption9.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#UninstructedBalance
	 * CorporateActionOption18.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#UninstructedBalance
	 * CorporateActionOption22.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#UninstructedBalance
	 * CorporateActionOption27.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#UninstructedBalance
	 * CorporateActionOption26.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#UninstructedBalance
	 * CorporateActionOption41.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#UninstructedBalance
	 * CorporateActionOption50.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#UninstructedBalance
	 * CorporateActionBalanceDetails4.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#UninstructedBalance
	 * CorporateActionBalanceDetails8.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#UninstructedBalance
	 * CorporateActionBalanceDetails9.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#UninstructedBalance
	 * CorporateActionBalanceDetails16.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#UninstructedBalance
	 * CorporateActionOption29.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#UninstructedBalance
	 * CorporateActionBalanceDetails1.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#UninstructedBalance
	 * CorporateActionBalanceDetails7.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#UninstructedBalance
	 * CorporateActionBalanceDetails10.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#UninstructedBalance
	 * CorporateActionBalanceDetails13.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#UninstructedBalance
	 * CorporateActionBalanceDetails17.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#UninstructedBalance
	 * CorporateActionBalanceDetails20.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#UninstructedBalance
	 * FinancialInstrumentAttributes3.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#UninstructedBalance
	 * FinancialInstrumentAttributes12.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#UninstructedBalance
	 * FinancialInstrumentAttributes17.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#UninstructedBalance
	 * FinancialInstrumentAttributes25.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#UninstructedBalance
	 * FinancialInstrumentAttributes46.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#UninstructedBalance
	 * FinancialInstrumentAttributes47.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption8#UninstructedBalance
	 * CorporateActionOption8.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#UninstructedBalance
	 * CorporateActionBalanceDetails21.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#UninstructedBalance
	 * CorporateActionBalanceDetails25.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#UninstructedBalance
	 * CorporateActionOption116.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#UninstructedBalance
	 * FinancialInstrumentAttributes68.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#UninstructedBalance
	 * CorporateActionBalanceDetails30.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#UninstructedBalance
	 * CorporateActionBalanceDetails29.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#UninstructedBalance
	 * CorporateActionOption121.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#UninstructedBalance
	 * FinancialInstrumentAttributes73.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#UninstructedBalance
	 * CorporateActionBalanceDetails33.UninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#UninstructedBalance
	 * CorporateActionBalanceDetails36.UninstructedBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of uninstructed position."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UninstructedBalance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption9.UninstructedBalance, com.tools20022.repository.msg.CorporateActionOption18.UninstructedBalance,
					com.tools20022.repository.msg.CorporateActionOption22.UninstructedBalance, com.tools20022.repository.msg.CorporateActionOption27.UninstructedBalance,
					com.tools20022.repository.msg.CorporateActionOption26.UninstructedBalance, com.tools20022.repository.msg.CorporateActionOption41.UninstructedBalance,
					com.tools20022.repository.msg.CorporateActionOption50.UninstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails4.UninstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails8.UninstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails9.UninstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails16.UninstructedBalance, com.tools20022.repository.msg.CorporateActionOption29.UninstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails1.UninstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails7.UninstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails10.UninstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails13.UninstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails17.UninstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails20.UninstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes3.UninstructedBalance, com.tools20022.repository.msg.FinancialInstrumentAttributes12.UninstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes17.UninstructedBalance, com.tools20022.repository.msg.FinancialInstrumentAttributes25.UninstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes46.UninstructedBalance, com.tools20022.repository.msg.FinancialInstrumentAttributes47.UninstructedBalance,
					com.tools20022.repository.msg.CorporateActionOption8.UninstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails21.UninstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails25.UninstructedBalance, com.tools20022.repository.msg.CorporateActionOption116.UninstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes68.UninstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails30.UninstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails29.UninstructedBalance, com.tools20022.repository.msg.CorporateActionOption121.UninstructedBalance,
					com.tools20022.repository.msg.FinancialInstrumentAttributes73.UninstructedBalance, com.tools20022.repository.msg.CorporateActionBalanceDetails33.UninstructedBalance,
					com.tools20022.repository.msg.CorporateActionBalanceDetails36.UninstructedBalance);
			elementContext_lazy = () -> CorporateActionEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UninstructedBalance";
			definition = "Balance of uninstructed position.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.UninstructedBalanceRelatedEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the eligible balance is final except for a voluntary
	 * corporate action event where it can represent the current eligible
	 * balance when communicated before expiration date of that event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification2#EligibleBalanceIndicator
	 * CorporateActionNotification2.EligibleBalanceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification3#EligibleBalanceIndicator
	 * CorporateActionNotification3.EligibleBalanceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4#EligibleBalanceIndicator
	 * CorporateActionNotification4.EligibleBalanceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5#EligibleBalanceIndicator
	 * CorporateActionNotification5.EligibleBalanceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification6#EligibleBalanceIndicator
	 * CorporateActionNotification6.EligibleBalanceIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleBalanceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the eligible balance is final except for a voluntary corporate action event where it can represent the current eligible balance when communicated before expiration date of that event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EligibleBalanceIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNotification2.EligibleBalanceIndicator, com.tools20022.repository.msg.CorporateActionNotification3.EligibleBalanceIndicator,
					com.tools20022.repository.msg.CorporateActionNotification4.EligibleBalanceIndicator, com.tools20022.repository.msg.CorporateActionNotification5.EligibleBalanceIndicator,
					com.tools20022.repository.msg.CorporateActionNotification6.EligibleBalanceIndicator);
			elementContext_lazy = () -> CorporateActionEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligibleBalanceIndicator";
			definition = "Indicates whether the eligible balance is final except for a voluntary corporate action event where it can represent the current eligible balance when communicated before expiration date of that event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Process which groups the activities related to corporate action
	 * servicing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#CorporateActionEntitlement
	 * CorporateActionServicing.CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to corporate action servicing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Process which groups the activities related to corporate action servicing.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.CorporateActionEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Total balance of securities which are not eligible for this corporate
	 * action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#NotEligibleBalanceRelatedEntitlement
	 * SecuritiesBalance.NotEligibleBalanceRelatedEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement
	 * CorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEligibleBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total balance of securities which are not eligible for this corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NotEligibleBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionEntitlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotEligibleBalance";
			definition = "Total balance of securities which are not eligible for this corporate action event.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.NotEligibleBalanceRelatedEntitlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEntitlement";
				definition = "Rights entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesBalance.EligibleBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.CorporateActionEntitlement,
						com.tools20022.repository.entity.SecuritiesBalance.InstructedBalanceRelatedEntitlement, com.tools20022.repository.entity.SecuritiesBalance.UninstructedBalanceRelatedEntitlement,
						com.tools20022.repository.entity.SecuritiesBalance.NotEligibleBalanceRelatedEntitlement, com.tools20022.repository.entity.CorporateActionServicing.CorporateActionEntitlement);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntitlementAdvice1.AccountAndDistributionDetails);
				subType_lazy = () -> Arrays.asList(CorporateActionCashEntitlement.mmObject(), CorporateActionSecuritiesEntitlement.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEntitlement.EligibleBalance, com.tools20022.repository.entity.CorporateActionEntitlement.SecuritiesBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.InstructedBalance, com.tools20022.repository.entity.CorporateActionEntitlement.UninstructedBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.EligibleBalanceIndicator, com.tools20022.repository.entity.CorporateActionEntitlement.RelatedServicing,
						com.tools20022.repository.entity.CorporateActionEntitlement.NotEligibleBalance);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionBalanceDetails3.mmObject(), CorporateActionBalanceDetails5.mmObject(), CorporateActionBalanceDetails12.mmObject(), CorporateActionBalanceDetails15.mmObject(),
						CorporateActionBalanceDetails4.mmObject(), CorporateActionBalanceDetails8.mmObject(), CorporateActionBalanceDetails9.mmObject(), CorporateActionBalanceDetails16.mmObject(), CorporateActionBalanceDetails2.mmObject(),
						CorporateActionBalanceDetails6.mmObject(), CorporateActionBalanceDetails11.mmObject(), CorporateActionBalanceDetails14.mmObject(), CorporateActionBalanceDetails18.mmObject(),
						CorporateActionBalanceDetails19.mmObject(), CorporateActionBalanceDetails1.mmObject(), CorporateActionBalanceDetails7.mmObject(), CorporateActionBalanceDetails10.mmObject(),
						CorporateActionBalanceDetails13.mmObject(), CorporateActionBalanceDetails17.mmObject(), CorporateActionBalanceDetails20.mmObject(), Entitlement1.mmObject(), EntitlementAdvice1.mmObject(),
						CorporateActionBalanceDetails21.mmObject(), CorporateActionBalanceDetails22.mmObject(), CorporateActionBalanceDetails25.mmObject(), CorporateActionBalanceDetails28.mmObject(),
						CorporateActionBalanceDetails32.mmObject(), CorporateActionBalanceDetails31.mmObject(), CorporateActionBalanceDetails30.mmObject(), CorporateActionBalanceDetails29.mmObject(),
						CorporateActionBalanceDetails33.mmObject(), CorporateActionBalanceDetails35.mmObject(), CorporateActionBalanceDetails34.mmObject(), CorporateActionBalanceDetails36.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}