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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.InstructedOrQuantityToReceive1Choice;
import com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CorporateActionServicing;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalance
 * CorporateActionEntitlement.mmEligibleBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmSecuritiesBalance
 * CorporateActionEntitlement.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
 * CorporateActionEntitlement.mmInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmUninstructedBalance
 * CorporateActionEntitlement.mmUninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmEligibleBalanceIndicator
 * CorporateActionEntitlement.mmEligibleBalanceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmRelatedServicing
 * CorporateActionEntitlement.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmNotEligibleBalance
 * CorporateActionEntitlement.mmNotEligibleBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmEligibleBalanceRelatedEntitlement
 * SecuritiesBalance.mmEligibleBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmCorporateActionEntitlement
 * SecuritiesBalance.mmCorporateActionEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmInstructedBalanceRelatedEntitlement
 * SecuritiesBalance.mmInstructedBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmUninstructedBalanceRelatedEntitlement
 * SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmNotEligibleBalanceRelatedEntitlement
 * SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionEntitlement
 * CorporateActionServicing.mmCorporateActionEntitlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntitlementAdvice1#mmAccountAndDistributionDetails
 * EntitlementAdvice1.mmAccountAndDistributionDetails}</li>
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37
 * CorporateActionBalanceDetails37}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails38
 * CorporateActionBalanceDetails38}</li>
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
	protected List<SecuritiesBalance> eligibleBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmEligibleBalanceRelatedEntitlement
	 * SecuritiesBalance.mmEligibleBalanceRelatedEntitlement}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails3#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails3.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails5#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails5.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails12#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails12.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails15#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails15.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#mmTotalEligibleBalance
	 * CorporateActionOption9.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#mmTotalEligibleBalance
	 * CorporateActionOption18.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#mmTotalEligibleBalance
	 * CorporateActionOption22.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmTotalEligibleBalance
	 * CorporateActionOption27.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#mmTotalEligibleBalance
	 * CorporateActionOption26.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#mmTotalEligibleBalance
	 * CorporateActionOption41.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#mmTotalEligibleBalance
	 * CorporateActionOption50.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails4.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails8.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails9.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails16.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#mmTotalEligibleBalance
	 * CorporateActionOption29.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails2#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails2.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails6#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails6.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails11#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails11.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails14#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails14.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails18#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails18.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails19#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails19.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails1.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails7.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails10.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails13.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails17.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails20.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption8#mmTotalEligibleBalance
	 * CorporateActionOption8.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails21.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails22#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails22.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails25.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails28#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails28.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmTotalEligibleBalance
	 * CorporateActionOption116.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails32#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails32.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails31#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails31.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails30.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails29.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#mmTotalEligibleBalance
	 * CorporateActionOption121.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails33.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails35#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails35.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails34#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails34.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails36.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141#mmTotalEligibleBalance
	 * CorporateActionOption141.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails37.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption144#mmTotalEligibleBalance
	 * CorporateActionOption144.mmTotalEligibleBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails38#mmTotalEligibleBalance
	 * CorporateActionBalanceDetails38.mmTotalEligibleBalance}</li>
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
	public static final MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>> mmEligibleBalance = new MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionBalanceDetails3.mmTotalEligibleBalance, CorporateActionBalanceDetails5.mmTotalEligibleBalance, CorporateActionBalanceDetails12.mmTotalEligibleBalance,
					CorporateActionBalanceDetails15.mmTotalEligibleBalance, CorporateActionOption9.mmTotalEligibleBalance, CorporateActionOption18.mmTotalEligibleBalance, CorporateActionOption22.mmTotalEligibleBalance,
					CorporateActionOption27.mmTotalEligibleBalance, CorporateActionOption26.mmTotalEligibleBalance, CorporateActionOption41.mmTotalEligibleBalance, CorporateActionOption50.mmTotalEligibleBalance,
					CorporateActionBalanceDetails4.mmTotalEligibleBalance, CorporateActionBalanceDetails8.mmTotalEligibleBalance, CorporateActionBalanceDetails9.mmTotalEligibleBalance,
					CorporateActionBalanceDetails16.mmTotalEligibleBalance, CorporateActionOption29.mmTotalEligibleBalance, CorporateActionBalanceDetails2.mmTotalEligibleBalance, CorporateActionBalanceDetails6.mmTotalEligibleBalance,
					CorporateActionBalanceDetails11.mmTotalEligibleBalance, CorporateActionBalanceDetails14.mmTotalEligibleBalance, CorporateActionBalanceDetails18.mmTotalEligibleBalance,
					CorporateActionBalanceDetails19.mmTotalEligibleBalance, CorporateActionBalanceDetails1.mmTotalEligibleBalance, CorporateActionBalanceDetails7.mmTotalEligibleBalance,
					CorporateActionBalanceDetails10.mmTotalEligibleBalance, CorporateActionBalanceDetails13.mmTotalEligibleBalance, CorporateActionBalanceDetails17.mmTotalEligibleBalance,
					CorporateActionBalanceDetails20.mmTotalEligibleBalance, CorporateActionOption8.mmTotalEligibleBalance, CorporateActionBalanceDetails21.mmTotalEligibleBalance, CorporateActionBalanceDetails22.mmTotalEligibleBalance,
					CorporateActionBalanceDetails25.mmTotalEligibleBalance, CorporateActionBalanceDetails28.mmTotalEligibleBalance, CorporateActionOption116.mmTotalEligibleBalance, CorporateActionBalanceDetails32.mmTotalEligibleBalance,
					CorporateActionBalanceDetails31.mmTotalEligibleBalance, CorporateActionBalanceDetails30.mmTotalEligibleBalance, CorporateActionBalanceDetails29.mmTotalEligibleBalance, CorporateActionOption121.mmTotalEligibleBalance,
					CorporateActionBalanceDetails33.mmTotalEligibleBalance, CorporateActionBalanceDetails35.mmTotalEligibleBalance, CorporateActionBalanceDetails34.mmTotalEligibleBalance,
					CorporateActionBalanceDetails36.mmTotalEligibleBalance, CorporateActionOption141.mmTotalEligibleBalance, CorporateActionBalanceDetails37.mmTotalEligibleBalance, CorporateActionOption144.mmTotalEligibleBalance,
					CorporateActionBalanceDetails38.mmTotalEligibleBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligibleBalance";
			definition = "Total balance of securities eligible for this corporate action event. The entitlement calculation is based on this balance.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesBalance.mmEligibleBalanceRelatedEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}

		@Override
		public List<SecuritiesBalance> getValue(CorporateActionEntitlement obj) {
			return obj.getEligibleBalance();
		}

		@Override
		public void setValue(CorporateActionEntitlement obj, List<SecuritiesBalance> value) {
			obj.setEligibleBalance(value);
		}
	};
	protected List<SecuritiesBalance> securitiesBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmCorporateActionEntitlement
	 * SecuritiesBalance.mmCorporateActionEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} = List of 510 elements</li>
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
	public static final MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>> mmSecuritiesBalance = new MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>>() {
		{
			derivation_lazy = () -> ListBuilderForCorporateActionEntitlement_00.addElems(new ArrayList<>());
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Specifies any type of balance related to a corporate action entitlement.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesBalance.mmCorporateActionEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}

		@Override
		public List<SecuritiesBalance> getValue(CorporateActionEntitlement obj) {
			return obj.getSecuritiesBalance();
		}

		@Override
		public void setValue(CorporateActionEntitlement obj, List<SecuritiesBalance> value) {
			obj.setSecuritiesBalance(value);
		}
	};
	protected List<SecuritiesBalance> instructedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmInstructedBalanceRelatedEntitlement
	 * SecuritiesBalance.mmInstructedBalanceRelatedEntitlement}</li>
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
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive1Choice#mmInstructedQuantity
	 * InstructedOrQuantityToReceive1Choice.mmInstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructedOrQuantityToReceive2Choice#mmInstructedQuantity
	 * InstructedOrQuantityToReceive2Choice.mmInstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption6#mmInstructedOrQuantityToReceive
	 * CorporateActionOption6.mmInstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption21#mmInstructedOrQuantityToReceive
	 * CorporateActionOption21.mmInstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption42#mmInstructedOrQuantityToReceive
	 * CorporateActionOption42.mmInstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption28#mmInstructedOrQuantityToReceive
	 * CorporateActionOption28.mmInstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption43#mmInstructedOrQuantityToReceive
	 * CorporateActionOption43.mmInstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#mmInstructedBalance
	 * CorporateActionOption9.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#mmInstructedBalance
	 * CorporateActionOption18.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#mmInstructedBalance
	 * CorporateActionOption22.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmInstructedBalance
	 * CorporateActionOption27.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#mmInstructedBalance
	 * CorporateActionOption26.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#mmInstructedBalance
	 * CorporateActionOption41.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#mmInstructedBalance
	 * CorporateActionOption50.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption1#mmInstructedBalance
	 * InstructedCorporateActionOption1.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails1#mmTotalInstructedBalance
	 * InstructedBalanceDetails1.mmTotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails4.mmTotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption2#mmInstructedBalance
	 * InstructedCorporateActionOption2.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails2#mmTotalInstructedBalance
	 * InstructedBalanceDetails2.mmTotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails8.mmTotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption4#mmInstructedBalance
	 * InstructedCorporateActionOption4.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails3#mmTotalInstructedBalance
	 * InstructedBalanceDetails3.mmTotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails9.mmTotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption5#mmInstructedBalance
	 * InstructedCorporateActionOption5.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails4#mmTotalInstructedBalance
	 * InstructedBalanceDetails4.mmTotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails16.mmTotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#mmInstructedBalance
	 * CorporateActionOption29.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmInstructedBalance
	 * CorporateActionBalanceDetails1.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmInstructedBalance
	 * CorporateActionBalanceDetails7.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmInstructedBalance
	 * CorporateActionBalanceDetails10.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmInstructedBalance
	 * CorporateActionBalanceDetails13.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmInstructedBalance
	 * CorporateActionBalanceDetails17.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmInstructedBalance
	 * CorporateActionBalanceDetails20.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#mmInstructedBalance
	 * FinancialInstrumentAttributes3.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#mmInstructedBalance
	 * FinancialInstrumentAttributes12.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#mmInstructedBalance
	 * FinancialInstrumentAttributes17.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#mmInstructedBalance
	 * FinancialInstrumentAttributes25.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#mmInstructedBalance
	 * FinancialInstrumentAttributes46.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#mmInstructedBalance
	 * FinancialInstrumentAttributes47.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption7#mmInstructedOrQuantityToReceive
	 * CorporateActionOption7.mmInstructedOrQuantityToReceive}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption8#mmInstructedBalance
	 * CorporateActionOption8.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmInstructedBalance
	 * CorporateActionBalanceDetails21.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmInstructedBalance
	 * CorporateActionBalanceDetails25.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmInstructedBalance
	 * CorporateActionOption116.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmInstructedBalance
	 * FinancialInstrumentAttributes68.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption120#mmInstructedQuantity
	 * CorporateActionOption120.mmInstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6#mmInstructedBalance
	 * InstructedCorporateActionOption6.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption52#mmInstructedQuantity
	 * SecuritiesOption52.mmInstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails30.mmTotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmInstructedBalance
	 * CorporateActionBalanceDetails29.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails5#mmTotalInstructedBalance
	 * InstructedBalanceDetails5.mmTotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#mmInstructedBalance
	 * CorporateActionOption121.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#mmInstructedBalance
	 * FinancialInstrumentAttributes73.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption7#mmInstructedBalance
	 * InstructedCorporateActionOption7.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails33.mmTotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails6#mmTotalInstructedBalance
	 * InstructedBalanceDetails6.mmTotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption54#mmInstructedQuantity
	 * SecuritiesOption54.mmInstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmInstructedBalance
	 * CorporateActionBalanceDetails36.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption128#mmInstructedQuantity
	 * CorporateActionOption128.mmInstructedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141#mmInstructedBalance
	 * CorporateActionOption141.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails37.mmTotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption8#mmInstructedBalance
	 * InstructedCorporateActionOption8.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails7#mmTotalInstructedBalance
	 * InstructedBalanceDetails7.mmTotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmInstructedBalance
	 * FinancialInstrumentAttributes93.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption144#mmInstructedBalance
	 * CorporateActionOption144.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails38#mmTotalInstructedBalanceDetails
	 * CorporateActionBalanceDetails38.mmTotalInstructedBalanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails8#mmTotalInstructedBalance
	 * InstructedBalanceDetails8.mmTotalInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption9#mmInstructedBalance
	 * InstructedCorporateActionOption9.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes94#mmInstructedBalance
	 * FinancialInstrumentAttributes94.mmInstructedBalance}</li>
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
	public static final MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>> mmInstructedBalance = new MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>>() {
		{
			derivation_lazy = () -> Arrays.asList(InstructedOrQuantityToReceive1Choice.mmInstructedQuantity, InstructedOrQuantityToReceive2Choice.mmInstructedQuantity, CorporateActionOption6.mmInstructedOrQuantityToReceive,
					CorporateActionOption21.mmInstructedOrQuantityToReceive, CorporateActionOption42.mmInstructedOrQuantityToReceive, CorporateActionOption28.mmInstructedOrQuantityToReceive,
					CorporateActionOption43.mmInstructedOrQuantityToReceive, CorporateActionOption9.mmInstructedBalance, CorporateActionOption18.mmInstructedBalance, CorporateActionOption22.mmInstructedBalance,
					CorporateActionOption27.mmInstructedBalance, CorporateActionOption26.mmInstructedBalance, CorporateActionOption41.mmInstructedBalance, CorporateActionOption50.mmInstructedBalance,
					InstructedCorporateActionOption1.mmInstructedBalance, InstructedBalanceDetails1.mmTotalInstructedBalance, CorporateActionBalanceDetails4.mmTotalInstructedBalanceDetails,
					InstructedCorporateActionOption2.mmInstructedBalance, InstructedBalanceDetails2.mmTotalInstructedBalance, CorporateActionBalanceDetails8.mmTotalInstructedBalanceDetails,
					InstructedCorporateActionOption4.mmInstructedBalance, InstructedBalanceDetails3.mmTotalInstructedBalance, CorporateActionBalanceDetails9.mmTotalInstructedBalanceDetails,
					InstructedCorporateActionOption5.mmInstructedBalance, InstructedBalanceDetails4.mmTotalInstructedBalance, CorporateActionBalanceDetails16.mmTotalInstructedBalanceDetails, CorporateActionOption29.mmInstructedBalance,
					CorporateActionBalanceDetails1.mmInstructedBalance, CorporateActionBalanceDetails7.mmInstructedBalance, CorporateActionBalanceDetails10.mmInstructedBalance, CorporateActionBalanceDetails13.mmInstructedBalance,
					CorporateActionBalanceDetails17.mmInstructedBalance, CorporateActionBalanceDetails20.mmInstructedBalance, FinancialInstrumentAttributes3.mmInstructedBalance, FinancialInstrumentAttributes12.mmInstructedBalance,
					FinancialInstrumentAttributes17.mmInstructedBalance, FinancialInstrumentAttributes25.mmInstructedBalance, FinancialInstrumentAttributes46.mmInstructedBalance, FinancialInstrumentAttributes47.mmInstructedBalance,
					CorporateActionOption7.mmInstructedOrQuantityToReceive, CorporateActionOption8.mmInstructedBalance, CorporateActionBalanceDetails21.mmInstructedBalance, CorporateActionBalanceDetails25.mmInstructedBalance,
					CorporateActionOption116.mmInstructedBalance, FinancialInstrumentAttributes68.mmInstructedBalance, CorporateActionOption120.mmInstructedQuantity, InstructedCorporateActionOption6.mmInstructedBalance,
					SecuritiesOption52.mmInstructedQuantity, CorporateActionBalanceDetails30.mmTotalInstructedBalanceDetails, CorporateActionBalanceDetails29.mmInstructedBalance, InstructedBalanceDetails5.mmTotalInstructedBalance,
					CorporateActionOption121.mmInstructedBalance, FinancialInstrumentAttributes73.mmInstructedBalance, InstructedCorporateActionOption7.mmInstructedBalance, CorporateActionBalanceDetails33.mmTotalInstructedBalanceDetails,
					InstructedBalanceDetails6.mmTotalInstructedBalance, SecuritiesOption54.mmInstructedQuantity, CorporateActionBalanceDetails36.mmInstructedBalance, CorporateActionOption128.mmInstructedQuantity,
					CorporateActionOption141.mmInstructedBalance, CorporateActionBalanceDetails37.mmTotalInstructedBalanceDetails, InstructedCorporateActionOption8.mmInstructedBalance, InstructedBalanceDetails7.mmTotalInstructedBalance,
					FinancialInstrumentAttributes93.mmInstructedBalance, CorporateActionOption144.mmInstructedBalance, CorporateActionBalanceDetails38.mmTotalInstructedBalanceDetails, InstructedBalanceDetails8.mmTotalInstructedBalance,
					InstructedCorporateActionOption9.mmInstructedBalance, FinancialInstrumentAttributes94.mmInstructedBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructedBalance";
			definition = "Balance of  instructed position.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesBalance.mmInstructedBalanceRelatedEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}

		@Override
		public List<SecuritiesBalance> getValue(CorporateActionEntitlement obj) {
			return obj.getInstructedBalance();
		}

		@Override
		public void setValue(CorporateActionEntitlement obj, List<SecuritiesBalance> value) {
			obj.setInstructedBalance(value);
		}
	};
	protected List<SecuritiesBalance> uninstructedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmUninstructedBalanceRelatedEntitlement
	 * SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#mmUninstructedBalance
	 * CorporateActionOption9.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#mmUninstructedBalance
	 * CorporateActionOption18.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#mmUninstructedBalance
	 * CorporateActionOption22.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmUninstructedBalance
	 * CorporateActionOption27.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#mmUninstructedBalance
	 * CorporateActionOption26.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#mmUninstructedBalance
	 * CorporateActionOption41.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#mmUninstructedBalance
	 * CorporateActionOption50.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails4#mmUninstructedBalance
	 * CorporateActionBalanceDetails4.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails8#mmUninstructedBalance
	 * CorporateActionBalanceDetails8.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails9#mmUninstructedBalance
	 * CorporateActionBalanceDetails9.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails16#mmUninstructedBalance
	 * CorporateActionBalanceDetails16.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#mmUninstructedBalance
	 * CorporateActionOption29.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails1#mmUninstructedBalance
	 * CorporateActionBalanceDetails1.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails7#mmUninstructedBalance
	 * CorporateActionBalanceDetails7.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails10#mmUninstructedBalance
	 * CorporateActionBalanceDetails10.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails13#mmUninstructedBalance
	 * CorporateActionBalanceDetails13.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails17#mmUninstructedBalance
	 * CorporateActionBalanceDetails17.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails20#mmUninstructedBalance
	 * CorporateActionBalanceDetails20.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#mmUninstructedBalance
	 * FinancialInstrumentAttributes3.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#mmUninstructedBalance
	 * FinancialInstrumentAttributes12.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#mmUninstructedBalance
	 * FinancialInstrumentAttributes17.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#mmUninstructedBalance
	 * FinancialInstrumentAttributes25.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#mmUninstructedBalance
	 * FinancialInstrumentAttributes46.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#mmUninstructedBalance
	 * FinancialInstrumentAttributes47.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption8#mmUninstructedBalance
	 * CorporateActionOption8.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails21#mmUninstructedBalance
	 * CorporateActionBalanceDetails21.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails25#mmUninstructedBalance
	 * CorporateActionBalanceDetails25.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmUninstructedBalance
	 * CorporateActionOption116.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmUninstructedBalance
	 * FinancialInstrumentAttributes68.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails30#mmUninstructedBalance
	 * CorporateActionBalanceDetails30.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails29#mmUninstructedBalance
	 * CorporateActionBalanceDetails29.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#mmUninstructedBalance
	 * CorporateActionOption121.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#mmUninstructedBalance
	 * FinancialInstrumentAttributes73.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails33#mmUninstructedBalance
	 * CorporateActionBalanceDetails33.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails36#mmUninstructedBalance
	 * CorporateActionBalanceDetails36.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141#mmUninstructedBalance
	 * CorporateActionOption141.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails37#mmUninstructedBalance
	 * CorporateActionBalanceDetails37.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmUninstructedBalance
	 * FinancialInstrumentAttributes93.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption144#mmUninstructedBalance
	 * CorporateActionOption144.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionBalanceDetails38#mmUninstructedBalance
	 * CorporateActionBalanceDetails38.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes94#mmUninstructedBalance
	 * FinancialInstrumentAttributes94.mmUninstructedBalance}</li>
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
	public static final MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>> mmUninstructedBalance = new MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption9.mmUninstructedBalance, CorporateActionOption18.mmUninstructedBalance, CorporateActionOption22.mmUninstructedBalance, CorporateActionOption27.mmUninstructedBalance,
					CorporateActionOption26.mmUninstructedBalance, CorporateActionOption41.mmUninstructedBalance, CorporateActionOption50.mmUninstructedBalance, CorporateActionBalanceDetails4.mmUninstructedBalance,
					CorporateActionBalanceDetails8.mmUninstructedBalance, CorporateActionBalanceDetails9.mmUninstructedBalance, CorporateActionBalanceDetails16.mmUninstructedBalance, CorporateActionOption29.mmUninstructedBalance,
					CorporateActionBalanceDetails1.mmUninstructedBalance, CorporateActionBalanceDetails7.mmUninstructedBalance, CorporateActionBalanceDetails10.mmUninstructedBalance, CorporateActionBalanceDetails13.mmUninstructedBalance,
					CorporateActionBalanceDetails17.mmUninstructedBalance, CorporateActionBalanceDetails20.mmUninstructedBalance, FinancialInstrumentAttributes3.mmUninstructedBalance, FinancialInstrumentAttributes12.mmUninstructedBalance,
					FinancialInstrumentAttributes17.mmUninstructedBalance, FinancialInstrumentAttributes25.mmUninstructedBalance, FinancialInstrumentAttributes46.mmUninstructedBalance, FinancialInstrumentAttributes47.mmUninstructedBalance,
					CorporateActionOption8.mmUninstructedBalance, CorporateActionBalanceDetails21.mmUninstructedBalance, CorporateActionBalanceDetails25.mmUninstructedBalance, CorporateActionOption116.mmUninstructedBalance,
					FinancialInstrumentAttributes68.mmUninstructedBalance, CorporateActionBalanceDetails30.mmUninstructedBalance, CorporateActionBalanceDetails29.mmUninstructedBalance, CorporateActionOption121.mmUninstructedBalance,
					FinancialInstrumentAttributes73.mmUninstructedBalance, CorporateActionBalanceDetails33.mmUninstructedBalance, CorporateActionBalanceDetails36.mmUninstructedBalance, CorporateActionOption141.mmUninstructedBalance,
					CorporateActionBalanceDetails37.mmUninstructedBalance, FinancialInstrumentAttributes93.mmUninstructedBalance, CorporateActionOption144.mmUninstructedBalance, CorporateActionBalanceDetails38.mmUninstructedBalance,
					FinancialInstrumentAttributes94.mmUninstructedBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UninstructedBalance";
			definition = "Balance of uninstructed position.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}

		@Override
		public List<SecuritiesBalance> getValue(CorporateActionEntitlement obj) {
			return obj.getUninstructedBalance();
		}

		@Override
		public void setValue(CorporateActionEntitlement obj, List<SecuritiesBalance> value) {
			obj.setUninstructedBalance(value);
		}
	};
	protected YesNoIndicator eligibleBalanceIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification2#mmEligibleBalanceIndicator
	 * CorporateActionNotification2.mmEligibleBalanceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification3#mmEligibleBalanceIndicator
	 * CorporateActionNotification3.mmEligibleBalanceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4#mmEligibleBalanceIndicator
	 * CorporateActionNotification4.mmEligibleBalanceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5#mmEligibleBalanceIndicator
	 * CorporateActionNotification5.mmEligibleBalanceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification6#mmEligibleBalanceIndicator
	 * CorporateActionNotification6.mmEligibleBalanceIndicator}</li>
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
	public static final MMBusinessAttribute<CorporateActionEntitlement, YesNoIndicator> mmEligibleBalanceIndicator = new MMBusinessAttribute<CorporateActionEntitlement, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNotification2.mmEligibleBalanceIndicator, CorporateActionNotification3.mmEligibleBalanceIndicator, CorporateActionNotification4.mmEligibleBalanceIndicator,
					CorporateActionNotification5.mmEligibleBalanceIndicator, CorporateActionNotification6.mmEligibleBalanceIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligibleBalanceIndicator";
			definition = "Indicates whether the eligible balance is final except for a voluntary corporate action event where it can represent the current eligible balance when communicated before expiration date of that event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CorporateActionEntitlement obj) {
			return obj.getEligibleBalanceIndicator();
		}

		@Override
		public void setValue(CorporateActionEntitlement obj, YesNoIndicator value) {
			obj.setEligibleBalanceIndicator(value);
		}
	};
	protected CorporateActionServicing relatedServicing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionEntitlement
	 * CorporateActionServicing.mmCorporateActionEntitlement}</li>
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
	public static final MMBusinessAssociationEnd<CorporateActionEntitlement, Optional<CorporateActionServicing>> mmRelatedServicing = new MMBusinessAssociationEnd<CorporateActionEntitlement, Optional<CorporateActionServicing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Process which groups the activities related to corporate action servicing.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionServicing.mmCorporateActionEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionServicing.mmObject();
		}

		@Override
		public Optional<CorporateActionServicing> getValue(CorporateActionEntitlement obj) {
			return obj.getRelatedServicing();
		}

		@Override
		public void setValue(CorporateActionEntitlement obj, Optional<CorporateActionServicing> value) {
			obj.setRelatedServicing(value.orElse(null));
		}
	};
	protected List<SecuritiesBalance> notEligibleBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmNotEligibleBalanceRelatedEntitlement
	 * SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement}</li>
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
	public static final MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>> mmNotEligibleBalance = new MMBusinessAssociationEnd<CorporateActionEntitlement, List<SecuritiesBalance>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEntitlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotEligibleBalance";
			definition = "Total balance of securities which are not eligible for this corporate action event.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesBalance.mmObject();
		}

		@Override
		public List<SecuritiesBalance> getValue(CorporateActionEntitlement obj) {
			return obj.getNotEligibleBalance();
		}

		@Override
		public void setValue(CorporateActionEntitlement obj, List<SecuritiesBalance> value) {
			obj.setNotEligibleBalance(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEntitlement";
				definition = "Rights entitled to the account owner based on the terms of the corporate action event and the balance of underlying securities.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesBalance.mmEligibleBalanceRelatedEntitlement, SecuritiesBalance.mmCorporateActionEntitlement, SecuritiesBalance.mmInstructedBalanceRelatedEntitlement,
						SecuritiesBalance.mmUninstructedBalanceRelatedEntitlement, SecuritiesBalance.mmNotEligibleBalanceRelatedEntitlement, CorporateActionServicing.mmCorporateActionEntitlement);
				derivationElement_lazy = () -> Arrays.asList(EntitlementAdvice1.mmAccountAndDistributionDetails);
				subType_lazy = () -> Arrays.asList(CorporateActionCashEntitlement.mmObject(), CorporateActionSecuritiesEntitlement.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEntitlement.mmEligibleBalance, com.tools20022.repository.entity.CorporateActionEntitlement.mmSecuritiesBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmInstructedBalance, com.tools20022.repository.entity.CorporateActionEntitlement.mmUninstructedBalance,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmEligibleBalanceIndicator, com.tools20022.repository.entity.CorporateActionEntitlement.mmRelatedServicing,
						com.tools20022.repository.entity.CorporateActionEntitlement.mmNotEligibleBalance);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionBalanceDetails3.mmObject(), CorporateActionBalanceDetails5.mmObject(), CorporateActionBalanceDetails12.mmObject(), CorporateActionBalanceDetails15.mmObject(),
						CorporateActionBalanceDetails4.mmObject(), CorporateActionBalanceDetails8.mmObject(), CorporateActionBalanceDetails9.mmObject(), CorporateActionBalanceDetails16.mmObject(), CorporateActionBalanceDetails2.mmObject(),
						CorporateActionBalanceDetails6.mmObject(), CorporateActionBalanceDetails11.mmObject(), CorporateActionBalanceDetails14.mmObject(), CorporateActionBalanceDetails18.mmObject(),
						CorporateActionBalanceDetails19.mmObject(), CorporateActionBalanceDetails1.mmObject(), CorporateActionBalanceDetails7.mmObject(), CorporateActionBalanceDetails10.mmObject(),
						CorporateActionBalanceDetails13.mmObject(), CorporateActionBalanceDetails17.mmObject(), CorporateActionBalanceDetails20.mmObject(), Entitlement1.mmObject(), EntitlementAdvice1.mmObject(),
						CorporateActionBalanceDetails21.mmObject(), CorporateActionBalanceDetails22.mmObject(), CorporateActionBalanceDetails25.mmObject(), CorporateActionBalanceDetails28.mmObject(),
						CorporateActionBalanceDetails32.mmObject(), CorporateActionBalanceDetails31.mmObject(), CorporateActionBalanceDetails30.mmObject(), CorporateActionBalanceDetails29.mmObject(),
						CorporateActionBalanceDetails33.mmObject(), CorporateActionBalanceDetails35.mmObject(), CorporateActionBalanceDetails34.mmObject(), CorporateActionBalanceDetails36.mmObject(),
						CorporateActionBalanceDetails37.mmObject(), CorporateActionBalanceDetails38.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionEntitlement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesBalance> getEligibleBalance() {
		return eligibleBalance == null ? eligibleBalance = new ArrayList<>() : eligibleBalance;
	}

	public CorporateActionEntitlement setEligibleBalance(List<SecuritiesBalance> eligibleBalance) {
		this.eligibleBalance = Objects.requireNonNull(eligibleBalance);
		return this;
	}

	public List<SecuritiesBalance> getSecuritiesBalance() {
		return securitiesBalance == null ? securitiesBalance = new ArrayList<>() : securitiesBalance;
	}

	public CorporateActionEntitlement setSecuritiesBalance(List<SecuritiesBalance> securitiesBalance) {
		this.securitiesBalance = Objects.requireNonNull(securitiesBalance);
		return this;
	}

	public List<SecuritiesBalance> getInstructedBalance() {
		return instructedBalance == null ? instructedBalance = new ArrayList<>() : instructedBalance;
	}

	public CorporateActionEntitlement setInstructedBalance(List<SecuritiesBalance> instructedBalance) {
		this.instructedBalance = Objects.requireNonNull(instructedBalance);
		return this;
	}

	public List<SecuritiesBalance> getUninstructedBalance() {
		return uninstructedBalance == null ? uninstructedBalance = new ArrayList<>() : uninstructedBalance;
	}

	public CorporateActionEntitlement setUninstructedBalance(List<SecuritiesBalance> uninstructedBalance) {
		this.uninstructedBalance = Objects.requireNonNull(uninstructedBalance);
		return this;
	}

	public YesNoIndicator getEligibleBalanceIndicator() {
		return eligibleBalanceIndicator;
	}

	public CorporateActionEntitlement setEligibleBalanceIndicator(YesNoIndicator eligibleBalanceIndicator) {
		this.eligibleBalanceIndicator = Objects.requireNonNull(eligibleBalanceIndicator);
		return this;
	}

	public Optional<CorporateActionServicing> getRelatedServicing() {
		return relatedServicing == null ? Optional.empty() : Optional.of(relatedServicing);
	}

	public CorporateActionEntitlement setRelatedServicing(CorporateActionServicing relatedServicing) {
		this.relatedServicing = relatedServicing;
		return this;
	}

	public List<SecuritiesBalance> getNotEligibleBalance() {
		return notEligibleBalance == null ? notEligibleBalance = new ArrayList<>() : notEligibleBalance;
	}

	public CorporateActionEntitlement setNotEligibleBalance(List<SecuritiesBalance> notEligibleBalance) {
		this.notEligibleBalance = Objects.requireNonNull(notEligibleBalance);
		return this;
	}
}