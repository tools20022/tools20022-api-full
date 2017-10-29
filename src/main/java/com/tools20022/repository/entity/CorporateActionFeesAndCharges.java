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
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Charges;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The definition of all the charges related to a corporate action event.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionFeesAndCharges"
 * src="doc-files/CorporateActionFeesAndCharges.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#CorporateAction
 * CorporateActionFeesAndCharges.CorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#SolicitationFee
 * CorporateActionFeesAndCharges.SolicitationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#EarlySolicitationFeeRate
 * CorporateActionFeesAndCharges.EarlySolicitationFeeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#Commission
 * CorporateActionFeesAndCharges.Commission}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commission#CorporateActionFeesAndCharges
 * Commission.CorporateActionFeesAndCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionCharge
 * CorporateActionEvent.CorporateActionCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#SolicitationFeeCorporateActionParameters
 * RateAndAmount.SolicitationFeeCorporateActionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#EarlySolicitationFeeCorporateActionParameters
 * RateAndAmount.EarlySolicitationFeeCorporateActionParameters}</li>
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
 * "CorporateActionFeesAndCharges"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The definition of all the charges related to a corporate action event."</li>
 * </ul>
 */
public class CorporateActionFeesAndCharges extends Charges {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Corporate action for which fees and charges are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionCharge
	 * CorporateActionEvent.CorporateActionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action for which fees and charges are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateAction";
			definition = "Corporate action for which fees and charges are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.CorporateActionCharge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash amount made available in a corporate event in order to encourage
	 * participation in the event or to vote with management's position. Payment
	 * is made to a third party who has solicited an entity to take part in the
	 * offer.<br>
	 * Also called consent fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#SolicitationFeeCorporateActionParameters
	 * RateAndAmount.SolicitationFeeCorporateActionParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#SolicitationFeeRate
	 * CorporateActionRate4.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#SolicitationFees
	 * CorporateActionAmounts2.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#SolicitationFeeRate
	 * CorporateActionRate10.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#SolicitationFees
	 * CorporateActionAmounts5.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#SolicitationFees
	 * CorporateActionAmounts11.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#SolicitationFeeRate
	 * RateDetails2.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#SolicitationFees
	 * CorporateActionAmounts12.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#SolicitationFeeRate
	 * RateDetails4.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#SolicitationFees
	 * CorporateActionAmounts17.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#SolicitationFeeRate
	 * RateDetails7.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#SolicitationFees
	 * CorporateActionAmounts20.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#SolicitationFeeRate
	 * RateDetails9.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#SolicitationFees
	 * CorporateActionAmounts23.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#SolicitationFeeRate
	 * RateDetails11.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#SolicitationFees
	 * CorporateActionAmounts24.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#SolicitationFeeRate
	 * RateDetails12.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#SolicitationFeeRate
	 * CorporateActionRate5.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#SolicitationFees
	 * CorporateActionAmounts3.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#SolicitationFeeRate
	 * CorporateActionRate12.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#SolicitationFees
	 * CorporateActionAmounts6.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#SolicitationFees
	 * CorporateActionAmounts9.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#SolicitationFeeRate
	 * RateDetails3.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#SolicitationFees
	 * CorporateActionAmounts13.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#SolicitationFeeRate
	 * RateDetails5.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#SolicitationFees
	 * CorporateActionAmounts16.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#SolicitationFees
	 * CorporateActionAmounts19.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#SolicitationFees
	 * CorporateActionAmounts22.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#SolicitationFeeRate
	 * RateDetails10.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#SolicitationFees
	 * CorporateActionAmounts25.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#SolicitationFeeRate
	 * RateDetails13.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#SolicitationFees
	 * CorporateActionAmounts4.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#SolicitationFees
	 * CorporateActionAmounts7.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#SolicitationFees
	 * CorporateActionAmounts10.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#SolicitationFees
	 * CorporateActionAmounts14.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#SolicitationFees
	 * CorporateActionAmounts15.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#SolicitationFees
	 * CorporateActionAmounts18.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#SolicitationFees
	 * CorporateActionAmounts21.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#SolicitationFees
	 * CorporateActionAmounts26.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#SolicitationFee
	 * CorporateActionRate2.SolicitationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#SolicitationFees
	 * CorporateActionAmounts1.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#SolicitationFees
	 * CorporateActionAmounts29.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#SolicitationFeeRate
	 * RateDetails15.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#SolicitationFees
	 * CorporateActionAmounts27.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#SolicitationFees
	 * CorporateActionAmounts28.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#SolicitationFeeRate
	 * RateDetails14.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#SolicitationFees
	 * CorporateActionAmounts33.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#SolicitationFees
	 * CorporateActionAmounts32.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#SolicitationFeeRate
	 * RateDetails18.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#SolicitationFeeRate
	 * RateDetails21.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#SolicitationFees
	 * CorporateActionAmounts35.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#SolicitationFees
	 * CorporateActionAmounts37.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#SolicitationFeeRate
	 * RateDetails23.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#SolicitationFees
	 * CorporateActionAmounts36.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#SolicitationFeeRate
	 * RateDetails22.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#SolicitationFees
	 * CorporateActionAmounts38.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#SolicitationFeeRate
	 * RateDetails24.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#SolicitationFees
	 * CorporateActionAmounts39.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#SolicitationFees
	 * CorporateActionAmounts41.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#SolicitationFeeRate
	 * RateDetails25.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#SolicitationFees
	 * CorporateActionAmounts40.SolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#SolicitationFeeRate
	 * RateDetails26.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#SolicitationFeeRate
	 * RateDetails27.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#SolicitationFeeRate
	 * RateDetails28.SolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#SolicitationFeeRate
	 * RateDetails30.SolicitationFeeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount made available in a corporate event in order to encourage participation in the event or to vote with management's position. Payment is made to a third party who has solicited an entity to take part in the offer.\r\nAlso called consent fee."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SolicitationFee = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.SolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts2.SolicitationFees,
					com.tools20022.repository.msg.CorporateActionRate10.SolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts5.SolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts11.SolicitationFees,
					com.tools20022.repository.msg.RateDetails2.SolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts12.SolicitationFees, com.tools20022.repository.msg.RateDetails4.SolicitationFeeRate,
					com.tools20022.repository.msg.CorporateActionAmounts17.SolicitationFees, com.tools20022.repository.msg.RateDetails7.SolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts20.SolicitationFees,
					com.tools20022.repository.msg.RateDetails9.SolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts23.SolicitationFees, com.tools20022.repository.msg.RateDetails11.SolicitationFeeRate,
					com.tools20022.repository.msg.CorporateActionAmounts24.SolicitationFees, com.tools20022.repository.msg.RateDetails12.SolicitationFeeRate, com.tools20022.repository.msg.CorporateActionRate5.SolicitationFeeRate,
					com.tools20022.repository.msg.CorporateActionAmounts3.SolicitationFees, com.tools20022.repository.msg.CorporateActionRate12.SolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts6.SolicitationFees,
					com.tools20022.repository.msg.CorporateActionAmounts9.SolicitationFees, com.tools20022.repository.msg.RateDetails3.SolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts13.SolicitationFees,
					com.tools20022.repository.msg.RateDetails5.SolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts16.SolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts19.SolicitationFees,
					com.tools20022.repository.msg.CorporateActionAmounts22.SolicitationFees, com.tools20022.repository.msg.RateDetails10.SolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts25.SolicitationFees,
					com.tools20022.repository.msg.RateDetails13.SolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts4.SolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts7.SolicitationFees,
					com.tools20022.repository.msg.CorporateActionAmounts10.SolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts14.SolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts15.SolicitationFees,
					com.tools20022.repository.msg.CorporateActionAmounts18.SolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts21.SolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts26.SolicitationFees,
					com.tools20022.repository.msg.CorporateActionRate2.SolicitationFee, com.tools20022.repository.msg.CorporateActionAmounts1.SolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts29.SolicitationFees,
					com.tools20022.repository.msg.RateDetails15.SolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts27.SolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts28.SolicitationFees,
					com.tools20022.repository.msg.RateDetails14.SolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts33.SolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts32.SolicitationFees,
					com.tools20022.repository.msg.RateDetails18.SolicitationFeeRate, com.tools20022.repository.msg.RateDetails21.SolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts35.SolicitationFees,
					com.tools20022.repository.msg.CorporateActionAmounts37.SolicitationFees, com.tools20022.repository.msg.RateDetails23.SolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts36.SolicitationFees,
					com.tools20022.repository.msg.RateDetails22.SolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts38.SolicitationFees, com.tools20022.repository.msg.RateDetails24.SolicitationFeeRate,
					com.tools20022.repository.msg.CorporateActionAmounts39.SolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts41.SolicitationFees, com.tools20022.repository.msg.RateDetails25.SolicitationFeeRate,
					com.tools20022.repository.msg.CorporateActionAmounts40.SolicitationFees, com.tools20022.repository.msg.RateDetails26.SolicitationFeeRate, com.tools20022.repository.msg.RateDetails27.SolicitationFeeRate,
					com.tools20022.repository.msg.RateDetails28.SolicitationFeeRate, com.tools20022.repository.msg.RateDetails30.SolicitationFeeRate);
			elementContext_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SolicitationFee";
			definition = "Cash amount made available in a corporate event in order to encourage participation in the event or to vote with management's position. Payment is made to a third party who has solicited an entity to take part in the offer.\r\nAlso called consent fee.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.SolicitationFeeCorporateActionParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash rate made available, as an incentive, in addition to the
	 * solicitation fee, in order to encourage early participation in an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#EarlySolicitationFeeCorporateActionParameters
	 * RateAndAmount.EarlySolicitationFeeCorporateActionParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#EarlySolicitationFeeRate
	 * RateDetails7.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#EarlySolicitationFeeRate
	 * RateDetails9.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#EarlySolicitationFeeRate
	 * RateDetails11.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#EarlySolicitationFeeRate
	 * RateDetails12.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#EarlySolicitationFeeRate
	 * CorporateActionRate5.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#EarlySolicitationFeeRate
	 * CorporateActionRate12.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#EarlySolicitationFeeRate
	 * RateDetails3.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#EarlySolicitationFeeRate
	 * RateDetails5.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#EarlySolicitationFeeRate
	 * RateDetails10.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#EarlySolicitationFeeRate
	 * RateDetails13.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#EarlySolicitationFeeRate
	 * RateDetails15.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#EarlySolicitationFeeRate
	 * RateDetails14.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#EarlySolicitationFeeRate
	 * RateDetails18.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#EarlySolicitationFeeRate
	 * RateDetails21.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#EarlySolicitationFeeRate
	 * RateDetails23.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#EarlySolicitationFeeRate
	 * RateDetails22.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#EarlySolicitationFeeRate
	 * RateDetails24.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#EarlySolicitationFeeRate
	 * RateDetails25.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#EarlySolicitationFeeRate
	 * RateDetails26.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#EarlySolicitationFeeRate
	 * RateDetails27.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#EarlySolicitationFeeRate
	 * RateDetails28.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#EarlySolicitationFeeRate
	 * RateDetails30.EarlySolicitationFeeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlySolicitationFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash rate made available, as an incentive, in addition to the solicitation fee, in order to encourage early participation in an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd EarlySolicitationFeeRate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RateDetails7.EarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails9.EarlySolicitationFeeRate,
					com.tools20022.repository.msg.RateDetails11.EarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails12.EarlySolicitationFeeRate, com.tools20022.repository.msg.CorporateActionRate5.EarlySolicitationFeeRate,
					com.tools20022.repository.msg.CorporateActionRate12.EarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails3.EarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails5.EarlySolicitationFeeRate,
					com.tools20022.repository.msg.RateDetails10.EarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails13.EarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails15.EarlySolicitationFeeRate,
					com.tools20022.repository.msg.RateDetails14.EarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails18.EarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails21.EarlySolicitationFeeRate,
					com.tools20022.repository.msg.RateDetails23.EarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails22.EarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails24.EarlySolicitationFeeRate,
					com.tools20022.repository.msg.RateDetails25.EarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails26.EarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails27.EarlySolicitationFeeRate,
					com.tools20022.repository.msg.RateDetails28.EarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails30.EarlySolicitationFeeRate);
			elementContext_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarlySolicitationFeeRate";
			definition = "Cash rate made available, as an incentive, in addition to the solicitation fee, in order to encourage early participation in an offer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.EarlySolicitationFeeCorporateActionParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Commission associated with a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#CorporateActionFeesAndCharges
	 * Commission.CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Commission
	 * Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commission associated with a corporate action."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Commission = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Commission associated with a corporate action.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.CorporateActionFeesAndCharges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionFeesAndCharges";
				definition = "The definition of all the charges related to a corporate action event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Commission.CorporateActionFeesAndCharges, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionCharge,
						com.tools20022.repository.entity.RateAndAmount.SolicitationFeeCorporateActionParameters, com.tools20022.repository.entity.RateAndAmount.EarlySolicitationFeeCorporateActionParameters);
				superType_lazy = () -> Charges.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionFeesAndCharges.CorporateAction, com.tools20022.repository.entity.CorporateActionFeesAndCharges.SolicitationFee,
						com.tools20022.repository.entity.CorporateActionFeesAndCharges.EarlySolicitationFeeRate, com.tools20022.repository.entity.CorporateActionFeesAndCharges.Commission);
			}
		});
		return mmObject_lazy.get();
	}
}