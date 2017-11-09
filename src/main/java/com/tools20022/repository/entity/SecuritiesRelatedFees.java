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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Charges;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Fees related to securities trades.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesRelatedFees"
 * src="doc-files/SecuritiesRelatedFees.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmFees
 * Security.mmFees}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmSecurity
 * SecuritiesRelatedFees.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmPostageFeeAmount
 * SecuritiesRelatedFees.mmPostageFeeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmRegulatoryFeesAmount
 * SecuritiesRelatedFees.mmRegulatoryFeesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#mmShippingFeesAmount
 * SecuritiesRelatedFees.mmShippingFeesAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesRelatedFees"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Fees related to securities trades."</li>
 * </ul>
 */
public class SecuritiesRelatedFees extends Charges {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * Security for which fees are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Security#mmFees
	 * Security.mmFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees
	 * SecuritiesRelatedFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which fees are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesRelatedFees.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which fees are specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmFees;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected CurrencyAndAmount postageFeeAmount;
	/**
	 * Amount of money paid for delivery by regular post mail.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees
	 * SecuritiesRelatedFees}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#mmPostageAmount
	 * OtherAmounts12.mmPostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmPostageFeeAmount
	 * CorporateActionAmounts2.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmPostageFeeAmount
	 * CorporateActionAmounts5.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmPostageFeeAmount
	 * CorporateActionAmounts11.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmPostageFeeAmount
	 * CorporateActionAmounts12.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmPostageFeeAmount
	 * CorporateActionAmounts3.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmPostageFeeAmount
	 * CorporateActionAmounts6.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmPostageFeeAmount
	 * CorporateActionAmounts9.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmPostageFeeAmount
	 * CorporateActionAmounts13.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmPostageFeeAmount
	 * CorporateActionAmounts4.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmPostageFeeAmount
	 * CorporateActionAmounts7.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmPostageFeeAmount
	 * CorporateActionAmounts10.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmPostageFeeAmount
	 * CorporateActionAmounts14.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#mmPostageAmount
	 * OtherAmounts4.mmPostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#mmPostageAmount
	 * OtherAmounts5.mmPostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#mmPostageAmount
	 * OtherAmounts3.mmPostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmPostageAmount
	 * OtherAmounts7.mmPostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmPostageAmount
	 * OtherAmounts9.mmPostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#mmPostageAmount
	 * OtherAmounts10.mmPostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#mmPostageAmount
	 * OtherAmounts13.mmPostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#mmPostageAmount
	 * OtherAmounts1.mmPostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmPostageFeeAmount
	 * CorporateActionAmounts1.mmPostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#mmPostageAmount
	 * OtherAmounts2.mmPostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts6#mmPostageAmount
	 * OtherAmounts6.mmPostageAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostageFeeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money paid for delivery by regular post mail."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPostageFeeAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OtherAmounts12.mmPostageAmount, CorporateActionAmounts2.mmPostageFeeAmount, CorporateActionAmounts5.mmPostageFeeAmount, CorporateActionAmounts11.mmPostageFeeAmount,
					CorporateActionAmounts12.mmPostageFeeAmount, CorporateActionAmounts3.mmPostageFeeAmount, CorporateActionAmounts6.mmPostageFeeAmount, CorporateActionAmounts9.mmPostageFeeAmount,
					CorporateActionAmounts13.mmPostageFeeAmount, CorporateActionAmounts4.mmPostageFeeAmount, CorporateActionAmounts7.mmPostageFeeAmount, CorporateActionAmounts10.mmPostageFeeAmount,
					CorporateActionAmounts14.mmPostageFeeAmount, OtherAmounts4.mmPostageAmount, OtherAmounts5.mmPostageAmount, OtherAmounts3.mmPostageAmount, OtherAmounts7.mmPostageAmount, OtherAmounts9.mmPostageAmount,
					OtherAmounts10.mmPostageAmount, OtherAmounts13.mmPostageAmount, OtherAmounts1.mmPostageAmount, CorporateActionAmounts1.mmPostageFeeAmount, OtherAmounts2.mmPostageAmount, OtherAmounts6.mmPostageAmount);
			elementContext_lazy = () -> SecuritiesRelatedFees.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PostageFeeAmount";
			definition = "Amount of money paid for delivery by regular post mail.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount regulatoryFeesAmount;
	/**
	 * Amount of money charged by a regulatory authority, eg, Securities and
	 * Exchange fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees
	 * SecuritiesRelatedFees}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#mmRegulatoryAmount
	 * OtherAmounts12.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#mmRegulatoryAmount
	 * OtherAmounts14.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#mmRegulatoryAmount
	 * OtherAmounts20.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmRegulatoryFeesAmount
	 * CorporateActionAmounts2.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmRegulatoryFeesAmount
	 * CorporateActionAmounts5.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmRegulatoryFeesAmount
	 * CorporateActionAmounts11.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmRegulatoryFeesAmount
	 * CorporateActionAmounts12.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmRegulatoryFeesAmount
	 * CorporateActionAmounts17.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmRegulatoryFeesAmount
	 * CorporateActionAmounts20.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmRegulatoryFeesAmount
	 * CorporateActionAmounts23.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmRegulatoryFeesAmount
	 * CorporateActionAmounts24.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmRegulatoryFeesAmount
	 * CorporateActionAmounts3.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmRegulatoryFeesAmount
	 * CorporateActionAmounts6.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmRegulatoryFeesAmount
	 * CorporateActionAmounts9.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmRegulatoryFeesAmount
	 * CorporateActionAmounts13.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmRegulatoryFeesAmount
	 * CorporateActionAmounts16.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmRegulatoryFeesAmount
	 * CorporateActionAmounts19.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmRegulatoryFeesAmount
	 * CorporateActionAmounts22.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmRegulatoryFeesAmount
	 * CorporateActionAmounts25.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmRegulatoryFeesAmount
	 * CorporateActionAmounts4.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmRegulatoryFeesAmount
	 * CorporateActionAmounts7.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmRegulatoryFeesAmount
	 * CorporateActionAmounts10.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmRegulatoryFeesAmount
	 * CorporateActionAmounts14.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmRegulatoryFeesAmount
	 * CorporateActionAmounts15.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmRegulatoryFeesAmount
	 * CorporateActionAmounts18.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmRegulatoryFeesAmount
	 * CorporateActionAmounts21.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmRegulatoryFeesAmount
	 * CorporateActionAmounts26.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#mmRegulatoryAmount
	 * OtherAmounts4.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#mmRegulatoryAmount
	 * OtherAmounts5.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmRegulatoryAmount
	 * OtherAmounts17.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#mmRegulatoryAmount
	 * OtherAmounts23.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#mmRegulatoryAmount
	 * OtherAmounts3.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmRegulatoryAmount
	 * OtherAmounts7.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmRegulatoryAmount
	 * OtherAmounts9.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#mmRegulatoryAmount
	 * OtherAmounts10.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#mmRegulatoryAmount
	 * OtherAmounts18.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#mmRegulatoryAmount
	 * OtherAmounts24.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#mmRegulatoryAmount
	 * OtherAmounts13.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#mmRegulatoryAmount
	 * OtherAmounts1.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmRegulatoryAmount
	 * OtherAmounts16.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmRegulatoryFeesAmount
	 * CorporateActionAmounts1.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#mmRegulatoryAmount
	 * OtherAmounts2.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts6#mmRegulatoryAmount
	 * OtherAmounts6.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmRegulatoryAmount
	 * OtherAmounts15.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts22#mmRegulatoryAmount
	 * OtherAmounts22.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmRegulatoryFeesAmount
	 * CorporateActionAmounts29.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmRegulatoryFeesAmount
	 * CorporateActionAmounts27.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmRegulatoryFeesAmount
	 * CorporateActionAmounts28.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmRegulatoryFeesAmount
	 * CorporateActionAmounts33.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmRegulatoryFeesAmount
	 * CorporateActionAmounts32.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmRegulatoryFeesAmount
	 * CorporateActionAmounts35.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmRegulatoryAmount
	 * OtherAmounts28.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmRegulatoryAmount
	 * OtherAmounts30.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmRegulatoryAmount
	 * OtherAmounts31.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmRegulatoryAmount
	 * OtherAmounts29.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmRegulatoryFeesAmount
	 * CorporateActionAmounts37.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmRegulatoryFeesAmount
	 * CorporateActionAmounts36.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmRegulatoryFeesAmount
	 * CorporateActionAmounts38.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmRegulatoryFeesAmount
	 * CorporateActionAmounts39.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmRegulatoryFeesAmount
	 * CorporateActionAmounts41.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmRegulatoryFeesAmount
	 * CorporateActionAmounts40.mmRegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#mmRegulatoryAmount
	 * OtherAmounts35.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#mmRegulatoryAmount
	 * OtherAmounts34.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#mmRegulatoryAmount
	 * OtherAmounts38.mmRegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts33#mmRegulatoryAmount
	 * OtherAmounts33.mmRegulatoryAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryFeesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money charged by a regulatory authority, eg, Securities and Exchange fees."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRegulatoryFeesAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OtherAmounts12.mmRegulatoryAmount, OtherAmounts14.mmRegulatoryAmount, OtherAmounts20.mmRegulatoryAmount, CorporateActionAmounts2.mmRegulatoryFeesAmount,
					CorporateActionAmounts5.mmRegulatoryFeesAmount, CorporateActionAmounts11.mmRegulatoryFeesAmount, CorporateActionAmounts12.mmRegulatoryFeesAmount, CorporateActionAmounts17.mmRegulatoryFeesAmount,
					CorporateActionAmounts20.mmRegulatoryFeesAmount, CorporateActionAmounts23.mmRegulatoryFeesAmount, CorporateActionAmounts24.mmRegulatoryFeesAmount, CorporateActionAmounts3.mmRegulatoryFeesAmount,
					CorporateActionAmounts6.mmRegulatoryFeesAmount, CorporateActionAmounts9.mmRegulatoryFeesAmount, CorporateActionAmounts13.mmRegulatoryFeesAmount, CorporateActionAmounts16.mmRegulatoryFeesAmount,
					CorporateActionAmounts19.mmRegulatoryFeesAmount, CorporateActionAmounts22.mmRegulatoryFeesAmount, CorporateActionAmounts25.mmRegulatoryFeesAmount, CorporateActionAmounts4.mmRegulatoryFeesAmount,
					CorporateActionAmounts7.mmRegulatoryFeesAmount, CorporateActionAmounts10.mmRegulatoryFeesAmount, CorporateActionAmounts14.mmRegulatoryFeesAmount, CorporateActionAmounts15.mmRegulatoryFeesAmount,
					CorporateActionAmounts18.mmRegulatoryFeesAmount, CorporateActionAmounts21.mmRegulatoryFeesAmount, CorporateActionAmounts26.mmRegulatoryFeesAmount, OtherAmounts4.mmRegulatoryAmount, OtherAmounts5.mmRegulatoryAmount,
					OtherAmounts17.mmRegulatoryAmount, OtherAmounts23.mmRegulatoryAmount, OtherAmounts3.mmRegulatoryAmount, OtherAmounts7.mmRegulatoryAmount, OtherAmounts9.mmRegulatoryAmount, OtherAmounts10.mmRegulatoryAmount,
					OtherAmounts18.mmRegulatoryAmount, OtherAmounts24.mmRegulatoryAmount, OtherAmounts13.mmRegulatoryAmount, OtherAmounts1.mmRegulatoryAmount, OtherAmounts16.mmRegulatoryAmount,
					CorporateActionAmounts1.mmRegulatoryFeesAmount, OtherAmounts2.mmRegulatoryAmount, OtherAmounts6.mmRegulatoryAmount, OtherAmounts15.mmRegulatoryAmount, OtherAmounts22.mmRegulatoryAmount,
					CorporateActionAmounts29.mmRegulatoryFeesAmount, CorporateActionAmounts27.mmRegulatoryFeesAmount, CorporateActionAmounts28.mmRegulatoryFeesAmount, CorporateActionAmounts33.mmRegulatoryFeesAmount,
					CorporateActionAmounts32.mmRegulatoryFeesAmount, CorporateActionAmounts35.mmRegulatoryFeesAmount, OtherAmounts28.mmRegulatoryAmount, OtherAmounts30.mmRegulatoryAmount, OtherAmounts31.mmRegulatoryAmount,
					OtherAmounts29.mmRegulatoryAmount, CorporateActionAmounts37.mmRegulatoryFeesAmount, CorporateActionAmounts36.mmRegulatoryFeesAmount, CorporateActionAmounts38.mmRegulatoryFeesAmount,
					CorporateActionAmounts39.mmRegulatoryFeesAmount, CorporateActionAmounts41.mmRegulatoryFeesAmount, CorporateActionAmounts40.mmRegulatoryFeesAmount, OtherAmounts35.mmRegulatoryAmount, OtherAmounts34.mmRegulatoryAmount,
					OtherAmounts38.mmRegulatoryAmount, OtherAmounts33.mmRegulatoryAmount);
			elementContext_lazy = () -> SecuritiesRelatedFees.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegulatoryFeesAmount";
			definition = "Amount of money charged by a regulatory authority, eg, Securities and Exchange fees.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount shippingFeesAmount;
	/**
	 * Amount of money (including insurance) paid for delivery by carrier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees
	 * SecuritiesRelatedFees}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#mmShippingAmount
	 * OtherAmounts12.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#mmShippingAmount
	 * OtherAmounts14.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#mmShippingAmount
	 * OtherAmounts20.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmShippingFeesAmount
	 * CorporateActionAmounts2.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmShippingFeesAmount
	 * CorporateActionAmounts5.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmShippingFeesAmount
	 * CorporateActionAmounts11.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmShippingFeesAmount
	 * CorporateActionAmounts12.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmShippingFeesAmount
	 * CorporateActionAmounts17.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmShippingFeesAmount
	 * CorporateActionAmounts20.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmShippingFeesAmount
	 * CorporateActionAmounts23.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmShippingFeesAmount
	 * CorporateActionAmounts24.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmShippingFeesAmount
	 * CorporateActionAmounts3.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmShippingFeesAmount
	 * CorporateActionAmounts6.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmShippingFeesAmount
	 * CorporateActionAmounts9.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmShippingFeesAmount
	 * CorporateActionAmounts13.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmShippingFeesAmount
	 * CorporateActionAmounts16.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmShippingFeesAmount
	 * CorporateActionAmounts19.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmShippingFeesAmount
	 * CorporateActionAmounts22.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmShippingFeesAmount
	 * CorporateActionAmounts25.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmShippingFeesAmount
	 * CorporateActionAmounts4.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmShippingFeesAmount
	 * CorporateActionAmounts7.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmShippingFeesAmount
	 * CorporateActionAmounts10.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmShippingFeesAmount
	 * CorporateActionAmounts14.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmShippingFeesAmount
	 * CorporateActionAmounts15.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmShippingFeesAmount
	 * CorporateActionAmounts18.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmShippingFeesAmount
	 * CorporateActionAmounts21.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmShippingFeesAmount
	 * CorporateActionAmounts26.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#mmShippingAmount
	 * OtherAmounts4.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#mmShippingAmount
	 * OtherAmounts5.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmShippingAmount
	 * OtherAmounts17.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#mmShippingAmount
	 * OtherAmounts23.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#mmShippingAmount
	 * OtherAmounts3.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmShippingAmount
	 * OtherAmounts7.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmShippingAmount
	 * OtherAmounts9.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#mmShippingAmount
	 * OtherAmounts10.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#mmShippingAmount
	 * OtherAmounts18.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#mmShippingAmount
	 * OtherAmounts24.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#mmShippingAmount
	 * OtherAmounts13.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#mmShippingAmount
	 * OtherAmounts1.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmShippingFeesAmount
	 * CorporateActionAmounts1.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#mmShippingAmount
	 * OtherAmounts2.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts6#mmShippingAmount
	 * OtherAmounts6.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#mmShippingAmount
	 * OtherAmounts15.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts22#mmShippingAmount
	 * OtherAmounts22.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmShippingFeesAmount
	 * CorporateActionAmounts29.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmShippingFeesAmount
	 * CorporateActionAmounts27.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmShippingFeesAmount
	 * CorporateActionAmounts28.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmShippingFeesAmount
	 * CorporateActionAmounts33.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmShippingFeesAmount
	 * CorporateActionAmounts32.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmShippingFeesAmount
	 * CorporateActionAmounts35.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmShippingAmount
	 * OtherAmounts28.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmShippingAmount
	 * OtherAmounts30.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmShippingAmount
	 * OtherAmounts31.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmShippingAmount
	 * OtherAmounts29.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmShippingFeesAmount
	 * CorporateActionAmounts37.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmShippingFeesAmount
	 * CorporateActionAmounts36.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmShippingFeesAmount
	 * CorporateActionAmounts38.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmShippingFeesAmount
	 * CorporateActionAmounts39.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmShippingFeesAmount
	 * CorporateActionAmounts41.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmShippingFeesAmount
	 * CorporateActionAmounts40.mmShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#mmShippingAmount
	 * OtherAmounts35.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#mmShippingAmount
	 * OtherAmounts34.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#mmShippingAmount
	 * OtherAmounts38.mmShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts33#mmShippingAmount
	 * OtherAmounts33.mmShippingAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingFeesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money (including insurance) paid for delivery by carrier."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmShippingFeesAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OtherAmounts12.mmShippingAmount, OtherAmounts14.mmShippingAmount, OtherAmounts20.mmShippingAmount, CorporateActionAmounts2.mmShippingFeesAmount,
					CorporateActionAmounts5.mmShippingFeesAmount, CorporateActionAmounts11.mmShippingFeesAmount, CorporateActionAmounts12.mmShippingFeesAmount, CorporateActionAmounts17.mmShippingFeesAmount,
					CorporateActionAmounts20.mmShippingFeesAmount, CorporateActionAmounts23.mmShippingFeesAmount, CorporateActionAmounts24.mmShippingFeesAmount, CorporateActionAmounts3.mmShippingFeesAmount,
					CorporateActionAmounts6.mmShippingFeesAmount, CorporateActionAmounts9.mmShippingFeesAmount, CorporateActionAmounts13.mmShippingFeesAmount, CorporateActionAmounts16.mmShippingFeesAmount,
					CorporateActionAmounts19.mmShippingFeesAmount, CorporateActionAmounts22.mmShippingFeesAmount, CorporateActionAmounts25.mmShippingFeesAmount, CorporateActionAmounts4.mmShippingFeesAmount,
					CorporateActionAmounts7.mmShippingFeesAmount, CorporateActionAmounts10.mmShippingFeesAmount, CorporateActionAmounts14.mmShippingFeesAmount, CorporateActionAmounts15.mmShippingFeesAmount,
					CorporateActionAmounts18.mmShippingFeesAmount, CorporateActionAmounts21.mmShippingFeesAmount, CorporateActionAmounts26.mmShippingFeesAmount, OtherAmounts4.mmShippingAmount, OtherAmounts5.mmShippingAmount,
					OtherAmounts17.mmShippingAmount, OtherAmounts23.mmShippingAmount, OtherAmounts3.mmShippingAmount, OtherAmounts7.mmShippingAmount, OtherAmounts9.mmShippingAmount, OtherAmounts10.mmShippingAmount,
					OtherAmounts18.mmShippingAmount, OtherAmounts24.mmShippingAmount, OtherAmounts13.mmShippingAmount, OtherAmounts1.mmShippingAmount, CorporateActionAmounts1.mmShippingFeesAmount, OtherAmounts2.mmShippingAmount,
					OtherAmounts6.mmShippingAmount, OtherAmounts15.mmShippingAmount, OtherAmounts22.mmShippingAmount, CorporateActionAmounts29.mmShippingFeesAmount, CorporateActionAmounts27.mmShippingFeesAmount,
					CorporateActionAmounts28.mmShippingFeesAmount, CorporateActionAmounts33.mmShippingFeesAmount, CorporateActionAmounts32.mmShippingFeesAmount, CorporateActionAmounts35.mmShippingFeesAmount,
					OtherAmounts28.mmShippingAmount, OtherAmounts30.mmShippingAmount, OtherAmounts31.mmShippingAmount, OtherAmounts29.mmShippingAmount, CorporateActionAmounts37.mmShippingFeesAmount,
					CorporateActionAmounts36.mmShippingFeesAmount, CorporateActionAmounts38.mmShippingFeesAmount, CorporateActionAmounts39.mmShippingFeesAmount, CorporateActionAmounts41.mmShippingFeesAmount,
					CorporateActionAmounts40.mmShippingFeesAmount, OtherAmounts35.mmShippingAmount, OtherAmounts34.mmShippingAmount, OtherAmounts38.mmShippingAmount, OtherAmounts33.mmShippingAmount);
			elementContext_lazy = () -> SecuritiesRelatedFees.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShippingFeesAmount";
			definition = "Amount of money (including insurance) paid for delivery by carrier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesRelatedFees";
				definition = "Fees related to securities trades.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmFees);
				superType_lazy = () -> Charges.mmObject();
				element_lazy = () -> Arrays.asList(SecuritiesRelatedFees.mmSecurity, SecuritiesRelatedFees.mmPostageFeeAmount, SecuritiesRelatedFees.mmRegulatoryFeesAmount, SecuritiesRelatedFees.mmShippingFeesAmount);
			}
		});
		return mmObject_lazy.get();
	}

	public List<Security> getSecurity() {
		return security;
	}

	public void setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = security;
	}

	public CurrencyAndAmount getPostageFeeAmount() {
		return postageFeeAmount;
	}

	public void setPostageFeeAmount(CurrencyAndAmount postageFeeAmount) {
		this.postageFeeAmount = postageFeeAmount;
	}

	public CurrencyAndAmount getRegulatoryFeesAmount() {
		return regulatoryFeesAmount;
	}

	public void setRegulatoryFeesAmount(CurrencyAndAmount regulatoryFeesAmount) {
		this.regulatoryFeesAmount = regulatoryFeesAmount;
	}

	public CurrencyAndAmount getShippingFeesAmount() {
		return shippingFeesAmount;
	}

	public void setShippingFeesAmount(CurrencyAndAmount shippingFeesAmount) {
		this.shippingFeesAmount = shippingFeesAmount;
	}
}