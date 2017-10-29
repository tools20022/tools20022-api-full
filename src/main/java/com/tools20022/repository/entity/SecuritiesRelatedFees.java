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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Charges;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#Security
 * SecuritiesRelatedFees.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#PostageFeeAmount
 * SecuritiesRelatedFees.PostageFeeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#RegulatoryFeesAmount
 * SecuritiesRelatedFees.RegulatoryFeesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesRelatedFees#ShippingFeesAmount
 * SecuritiesRelatedFees.ShippingFeesAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Fees Security.Fees}
 * </li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
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
 * "SecuritiesRelatedFees"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Fees related to securities trades."</li>
 * </ul>
 */
public class SecuritiesRelatedFees extends Charges {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security for which fees are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Security#Fees
	 * Security.Fees}</li>
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
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesRelatedFees.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which fees are specified.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Fees;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#PostageAmount
	 * OtherAmounts12.PostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#PostageFeeAmount
	 * CorporateActionAmounts2.PostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#PostageFeeAmount
	 * CorporateActionAmounts5.PostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#PostageFeeAmount
	 * CorporateActionAmounts11.PostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#PostageFeeAmount
	 * CorporateActionAmounts12.PostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#PostageFeeAmount
	 * CorporateActionAmounts3.PostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#PostageFeeAmount
	 * CorporateActionAmounts6.PostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#PostageFeeAmount
	 * CorporateActionAmounts9.PostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#PostageFeeAmount
	 * CorporateActionAmounts13.PostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#PostageFeeAmount
	 * CorporateActionAmounts4.PostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#PostageFeeAmount
	 * CorporateActionAmounts7.PostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#PostageFeeAmount
	 * CorporateActionAmounts10.PostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#PostageFeeAmount
	 * CorporateActionAmounts14.PostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#PostageAmount
	 * OtherAmounts4.PostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#PostageAmount
	 * OtherAmounts5.PostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#PostageAmount
	 * OtherAmounts3.PostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#PostageAmount
	 * OtherAmounts7.PostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#PostageAmount
	 * OtherAmounts9.PostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#PostageAmount
	 * OtherAmounts10.PostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#PostageAmount
	 * OtherAmounts13.PostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#PostageAmount
	 * OtherAmounts1.PostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#PostageFeeAmount
	 * CorporateActionAmounts1.PostageFeeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#PostageAmount
	 * OtherAmounts2.PostageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts6#PostageAmount
	 * OtherAmounts6.PostageAmount}</li>
	 * </ul>
	 * </li>
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
	 * name} = "PostageFeeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money paid for delivery by regular post mail."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PostageFeeAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherAmounts12.PostageAmount, com.tools20022.repository.msg.CorporateActionAmounts2.PostageFeeAmount,
					com.tools20022.repository.msg.CorporateActionAmounts5.PostageFeeAmount, com.tools20022.repository.msg.CorporateActionAmounts11.PostageFeeAmount, com.tools20022.repository.msg.CorporateActionAmounts12.PostageFeeAmount,
					com.tools20022.repository.msg.CorporateActionAmounts3.PostageFeeAmount, com.tools20022.repository.msg.CorporateActionAmounts6.PostageFeeAmount, com.tools20022.repository.msg.CorporateActionAmounts9.PostageFeeAmount,
					com.tools20022.repository.msg.CorporateActionAmounts13.PostageFeeAmount, com.tools20022.repository.msg.CorporateActionAmounts4.PostageFeeAmount, com.tools20022.repository.msg.CorporateActionAmounts7.PostageFeeAmount,
					com.tools20022.repository.msg.CorporateActionAmounts10.PostageFeeAmount, com.tools20022.repository.msg.CorporateActionAmounts14.PostageFeeAmount, com.tools20022.repository.msg.OtherAmounts4.PostageAmount,
					com.tools20022.repository.msg.OtherAmounts5.PostageAmount, com.tools20022.repository.msg.OtherAmounts3.PostageAmount, com.tools20022.repository.msg.OtherAmounts7.PostageAmount,
					com.tools20022.repository.msg.OtherAmounts9.PostageAmount, com.tools20022.repository.msg.OtherAmounts10.PostageAmount, com.tools20022.repository.msg.OtherAmounts13.PostageAmount,
					com.tools20022.repository.msg.OtherAmounts1.PostageAmount, com.tools20022.repository.msg.CorporateActionAmounts1.PostageFeeAmount, com.tools20022.repository.msg.OtherAmounts2.PostageAmount,
					com.tools20022.repository.msg.OtherAmounts6.PostageAmount);
			elementContext_lazy = () -> SecuritiesRelatedFees.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostageFeeAmount";
			definition = "Amount of money paid for delivery by regular post mail.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#RegulatoryAmount
	 * OtherAmounts12.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#RegulatoryAmount
	 * OtherAmounts14.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#RegulatoryAmount
	 * OtherAmounts20.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#RegulatoryFeesAmount
	 * CorporateActionAmounts2.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#RegulatoryFeesAmount
	 * CorporateActionAmounts5.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#RegulatoryFeesAmount
	 * CorporateActionAmounts11.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#RegulatoryFeesAmount
	 * CorporateActionAmounts12.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#RegulatoryFeesAmount
	 * CorporateActionAmounts17.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#RegulatoryFeesAmount
	 * CorporateActionAmounts20.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#RegulatoryFeesAmount
	 * CorporateActionAmounts23.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#RegulatoryFeesAmount
	 * CorporateActionAmounts24.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#RegulatoryFeesAmount
	 * CorporateActionAmounts3.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#RegulatoryFeesAmount
	 * CorporateActionAmounts6.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#RegulatoryFeesAmount
	 * CorporateActionAmounts9.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#RegulatoryFeesAmount
	 * CorporateActionAmounts13.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#RegulatoryFeesAmount
	 * CorporateActionAmounts16.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#RegulatoryFeesAmount
	 * CorporateActionAmounts19.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#RegulatoryFeesAmount
	 * CorporateActionAmounts22.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#RegulatoryFeesAmount
	 * CorporateActionAmounts25.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#RegulatoryFeesAmount
	 * CorporateActionAmounts4.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#RegulatoryFeesAmount
	 * CorporateActionAmounts7.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#RegulatoryFeesAmount
	 * CorporateActionAmounts10.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#RegulatoryFeesAmount
	 * CorporateActionAmounts14.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#RegulatoryFeesAmount
	 * CorporateActionAmounts15.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#RegulatoryFeesAmount
	 * CorporateActionAmounts18.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#RegulatoryFeesAmount
	 * CorporateActionAmounts21.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#RegulatoryFeesAmount
	 * CorporateActionAmounts26.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#RegulatoryAmount
	 * OtherAmounts4.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#RegulatoryAmount
	 * OtherAmounts5.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#RegulatoryAmount
	 * OtherAmounts17.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#RegulatoryAmount
	 * OtherAmounts23.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#RegulatoryAmount
	 * OtherAmounts3.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#RegulatoryAmount
	 * OtherAmounts7.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#RegulatoryAmount
	 * OtherAmounts9.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#RegulatoryAmount
	 * OtherAmounts10.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#RegulatoryAmount
	 * OtherAmounts18.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#RegulatoryAmount
	 * OtherAmounts24.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#RegulatoryAmount
	 * OtherAmounts13.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#RegulatoryAmount
	 * OtherAmounts1.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#RegulatoryAmount
	 * OtherAmounts16.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#RegulatoryFeesAmount
	 * CorporateActionAmounts1.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#RegulatoryAmount
	 * OtherAmounts2.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts6#RegulatoryAmount
	 * OtherAmounts6.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#RegulatoryAmount
	 * OtherAmounts15.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts22#RegulatoryAmount
	 * OtherAmounts22.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#RegulatoryFeesAmount
	 * CorporateActionAmounts29.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#RegulatoryFeesAmount
	 * CorporateActionAmounts27.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#RegulatoryFeesAmount
	 * CorporateActionAmounts28.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#RegulatoryFeesAmount
	 * CorporateActionAmounts33.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#RegulatoryFeesAmount
	 * CorporateActionAmounts32.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#RegulatoryFeesAmount
	 * CorporateActionAmounts35.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#RegulatoryAmount
	 * OtherAmounts28.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#RegulatoryAmount
	 * OtherAmounts30.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#RegulatoryAmount
	 * OtherAmounts31.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#RegulatoryAmount
	 * OtherAmounts29.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#RegulatoryFeesAmount
	 * CorporateActionAmounts37.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#RegulatoryFeesAmount
	 * CorporateActionAmounts36.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#RegulatoryFeesAmount
	 * CorporateActionAmounts38.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#RegulatoryFeesAmount
	 * CorporateActionAmounts39.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#RegulatoryFeesAmount
	 * CorporateActionAmounts41.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#RegulatoryFeesAmount
	 * CorporateActionAmounts40.RegulatoryFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#RegulatoryAmount
	 * OtherAmounts35.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#RegulatoryAmount
	 * OtherAmounts34.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#RegulatoryAmount
	 * OtherAmounts38.RegulatoryAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts33#RegulatoryAmount
	 * OtherAmounts33.RegulatoryAmount}</li>
	 * </ul>
	 * </li>
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
	 * name} = "RegulatoryFeesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money charged by a regulatory authority, eg, Securities and Exchange fees."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegulatoryFeesAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherAmounts12.RegulatoryAmount, com.tools20022.repository.msg.OtherAmounts14.RegulatoryAmount, com.tools20022.repository.msg.OtherAmounts20.RegulatoryAmount,
					com.tools20022.repository.msg.CorporateActionAmounts2.RegulatoryFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts5.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.RegulatoryFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts12.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts17.RegulatoryFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts20.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts23.RegulatoryFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts24.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts3.RegulatoryFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts6.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts9.RegulatoryFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts13.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts16.RegulatoryFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts19.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts22.RegulatoryFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts25.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts4.RegulatoryFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts7.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts10.RegulatoryFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts14.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts15.RegulatoryFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts18.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts21.RegulatoryFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts26.RegulatoryFeesAmount, com.tools20022.repository.msg.OtherAmounts4.RegulatoryAmount,
					com.tools20022.repository.msg.OtherAmounts5.RegulatoryAmount, com.tools20022.repository.msg.OtherAmounts17.RegulatoryAmount, com.tools20022.repository.msg.OtherAmounts23.RegulatoryAmount,
					com.tools20022.repository.msg.OtherAmounts3.RegulatoryAmount, com.tools20022.repository.msg.OtherAmounts7.RegulatoryAmount, com.tools20022.repository.msg.OtherAmounts9.RegulatoryAmount,
					com.tools20022.repository.msg.OtherAmounts10.RegulatoryAmount, com.tools20022.repository.msg.OtherAmounts18.RegulatoryAmount, com.tools20022.repository.msg.OtherAmounts24.RegulatoryAmount,
					com.tools20022.repository.msg.OtherAmounts13.RegulatoryAmount, com.tools20022.repository.msg.OtherAmounts1.RegulatoryAmount, com.tools20022.repository.msg.OtherAmounts16.RegulatoryAmount,
					com.tools20022.repository.msg.CorporateActionAmounts1.RegulatoryFeesAmount, com.tools20022.repository.msg.OtherAmounts2.RegulatoryAmount, com.tools20022.repository.msg.OtherAmounts6.RegulatoryAmount,
					com.tools20022.repository.msg.OtherAmounts15.RegulatoryAmount, com.tools20022.repository.msg.OtherAmounts22.RegulatoryAmount, com.tools20022.repository.msg.CorporateActionAmounts29.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts27.RegulatoryFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts28.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts33.RegulatoryFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts32.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts35.RegulatoryFeesAmount, com.tools20022.repository.msg.OtherAmounts28.RegulatoryAmount, com.tools20022.repository.msg.OtherAmounts30.RegulatoryAmount,
					com.tools20022.repository.msg.OtherAmounts31.RegulatoryAmount, com.tools20022.repository.msg.OtherAmounts29.RegulatoryAmount, com.tools20022.repository.msg.CorporateActionAmounts37.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts36.RegulatoryFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts38.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts39.RegulatoryFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts41.RegulatoryFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts40.RegulatoryFeesAmount, com.tools20022.repository.msg.OtherAmounts35.RegulatoryAmount, com.tools20022.repository.msg.OtherAmounts34.RegulatoryAmount,
					com.tools20022.repository.msg.OtherAmounts38.RegulatoryAmount, com.tools20022.repository.msg.OtherAmounts33.RegulatoryAmount);
			elementContext_lazy = () -> SecuritiesRelatedFees.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegulatoryFeesAmount";
			definition = "Amount of money charged by a regulatory authority, eg, Securities and Exchange fees.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#ShippingAmount
	 * OtherAmounts12.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#ShippingAmount
	 * OtherAmounts14.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#ShippingAmount
	 * OtherAmounts20.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#ShippingFeesAmount
	 * CorporateActionAmounts2.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#ShippingFeesAmount
	 * CorporateActionAmounts5.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#ShippingFeesAmount
	 * CorporateActionAmounts11.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#ShippingFeesAmount
	 * CorporateActionAmounts12.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#ShippingFeesAmount
	 * CorporateActionAmounts17.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#ShippingFeesAmount
	 * CorporateActionAmounts20.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#ShippingFeesAmount
	 * CorporateActionAmounts23.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#ShippingFeesAmount
	 * CorporateActionAmounts24.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#ShippingFeesAmount
	 * CorporateActionAmounts3.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#ShippingFeesAmount
	 * CorporateActionAmounts6.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#ShippingFeesAmount
	 * CorporateActionAmounts9.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#ShippingFeesAmount
	 * CorporateActionAmounts13.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#ShippingFeesAmount
	 * CorporateActionAmounts16.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#ShippingFeesAmount
	 * CorporateActionAmounts19.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#ShippingFeesAmount
	 * CorporateActionAmounts22.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#ShippingFeesAmount
	 * CorporateActionAmounts25.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#ShippingFeesAmount
	 * CorporateActionAmounts4.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#ShippingFeesAmount
	 * CorporateActionAmounts7.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#ShippingFeesAmount
	 * CorporateActionAmounts10.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#ShippingFeesAmount
	 * CorporateActionAmounts14.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#ShippingFeesAmount
	 * CorporateActionAmounts15.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#ShippingFeesAmount
	 * CorporateActionAmounts18.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#ShippingFeesAmount
	 * CorporateActionAmounts21.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#ShippingFeesAmount
	 * CorporateActionAmounts26.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#ShippingAmount
	 * OtherAmounts4.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#ShippingAmount
	 * OtherAmounts5.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#ShippingAmount
	 * OtherAmounts17.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#ShippingAmount
	 * OtherAmounts23.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#ShippingAmount
	 * OtherAmounts3.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#ShippingAmount
	 * OtherAmounts7.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#ShippingAmount
	 * OtherAmounts9.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#ShippingAmount
	 * OtherAmounts10.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#ShippingAmount
	 * OtherAmounts18.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#ShippingAmount
	 * OtherAmounts24.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#ShippingAmount
	 * OtherAmounts13.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#ShippingAmount
	 * OtherAmounts1.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#ShippingFeesAmount
	 * CorporateActionAmounts1.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts2#ShippingAmount
	 * OtherAmounts2.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts6#ShippingAmount
	 * OtherAmounts6.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts15#ShippingAmount
	 * OtherAmounts15.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts22#ShippingAmount
	 * OtherAmounts22.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#ShippingFeesAmount
	 * CorporateActionAmounts29.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#ShippingFeesAmount
	 * CorporateActionAmounts27.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#ShippingFeesAmount
	 * CorporateActionAmounts28.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#ShippingFeesAmount
	 * CorporateActionAmounts33.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#ShippingFeesAmount
	 * CorporateActionAmounts32.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#ShippingFeesAmount
	 * CorporateActionAmounts35.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#ShippingAmount
	 * OtherAmounts28.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#ShippingAmount
	 * OtherAmounts30.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#ShippingAmount
	 * OtherAmounts31.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#ShippingAmount
	 * OtherAmounts29.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#ShippingFeesAmount
	 * CorporateActionAmounts37.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#ShippingFeesAmount
	 * CorporateActionAmounts36.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#ShippingFeesAmount
	 * CorporateActionAmounts38.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#ShippingFeesAmount
	 * CorporateActionAmounts39.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#ShippingFeesAmount
	 * CorporateActionAmounts41.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#ShippingFeesAmount
	 * CorporateActionAmounts40.ShippingFeesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#ShippingAmount
	 * OtherAmounts35.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#ShippingAmount
	 * OtherAmounts34.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#ShippingAmount
	 * OtherAmounts38.ShippingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts33#ShippingAmount
	 * OtherAmounts33.ShippingAmount}</li>
	 * </ul>
	 * </li>
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
	 * name} = "ShippingFeesAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money (including insurance) paid for delivery by carrier."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ShippingFeesAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherAmounts12.ShippingAmount, com.tools20022.repository.msg.OtherAmounts14.ShippingAmount, com.tools20022.repository.msg.OtherAmounts20.ShippingAmount,
					com.tools20022.repository.msg.CorporateActionAmounts2.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts5.ShippingFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts12.ShippingFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts17.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts20.ShippingFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts23.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts24.ShippingFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts3.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts6.ShippingFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts9.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts13.ShippingFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts16.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts19.ShippingFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts22.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts25.ShippingFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts4.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts7.ShippingFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts10.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts14.ShippingFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts15.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts18.ShippingFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts21.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts26.ShippingFeesAmount, com.tools20022.repository.msg.OtherAmounts4.ShippingAmount,
					com.tools20022.repository.msg.OtherAmounts5.ShippingAmount, com.tools20022.repository.msg.OtherAmounts17.ShippingAmount, com.tools20022.repository.msg.OtherAmounts23.ShippingAmount,
					com.tools20022.repository.msg.OtherAmounts3.ShippingAmount, com.tools20022.repository.msg.OtherAmounts7.ShippingAmount, com.tools20022.repository.msg.OtherAmounts9.ShippingAmount,
					com.tools20022.repository.msg.OtherAmounts10.ShippingAmount, com.tools20022.repository.msg.OtherAmounts18.ShippingAmount, com.tools20022.repository.msg.OtherAmounts24.ShippingAmount,
					com.tools20022.repository.msg.OtherAmounts13.ShippingAmount, com.tools20022.repository.msg.OtherAmounts1.ShippingAmount, com.tools20022.repository.msg.CorporateActionAmounts1.ShippingFeesAmount,
					com.tools20022.repository.msg.OtherAmounts2.ShippingAmount, com.tools20022.repository.msg.OtherAmounts6.ShippingAmount, com.tools20022.repository.msg.OtherAmounts15.ShippingAmount,
					com.tools20022.repository.msg.OtherAmounts22.ShippingAmount, com.tools20022.repository.msg.CorporateActionAmounts29.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts27.ShippingFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts28.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts33.ShippingFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts32.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts35.ShippingFeesAmount, com.tools20022.repository.msg.OtherAmounts28.ShippingAmount,
					com.tools20022.repository.msg.OtherAmounts30.ShippingAmount, com.tools20022.repository.msg.OtherAmounts31.ShippingAmount, com.tools20022.repository.msg.OtherAmounts29.ShippingAmount,
					com.tools20022.repository.msg.CorporateActionAmounts37.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts36.ShippingFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts38.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts39.ShippingFeesAmount,
					com.tools20022.repository.msg.CorporateActionAmounts41.ShippingFeesAmount, com.tools20022.repository.msg.CorporateActionAmounts40.ShippingFeesAmount, com.tools20022.repository.msg.OtherAmounts35.ShippingAmount,
					com.tools20022.repository.msg.OtherAmounts34.ShippingAmount, com.tools20022.repository.msg.OtherAmounts38.ShippingAmount, com.tools20022.repository.msg.OtherAmounts33.ShippingAmount);
			elementContext_lazy = () -> SecuritiesRelatedFees.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShippingFeesAmount";
			definition = "Amount of money (including insurance) paid for delivery by carrier.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesRelatedFees";
				definition = "Fees related to securities trades.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Fees);
				superType_lazy = () -> Charges.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesRelatedFees.Security, com.tools20022.repository.entity.SecuritiesRelatedFees.PostageFeeAmount,
						com.tools20022.repository.entity.SecuritiesRelatedFees.RegulatoryFeesAmount, com.tools20022.repository.entity.SecuritiesRelatedFees.ShippingFeesAmount);
			}
		});
		return mmObject_lazy.get();
	}
}