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
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmCorporateAction
 * CorporateActionFeesAndCharges.mmCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmSolicitationFee
 * CorporateActionFeesAndCharges.mmSolicitationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmEarlySolicitationFeeRate
 * CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmCommission
 * CorporateActionFeesAndCharges.mmCommission}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Commission#mmCorporateActionFeesAndCharges
 * Commission.mmCorporateActionFeesAndCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionCharge
 * CorporateActionEvent.mmCorporateActionCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmSolicitationFeeCorporateActionParameters
 * RateAndAmount.mmSolicitationFeeCorporateActionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmEarlySolicitationFeeCorporateActionParameters
 * RateAndAmount.mmEarlySolicitationFeeCorporateActionParameters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
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
 * "CorporateActionFeesAndCharges"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The definition of all the charges related to a corporate action event."</li>
 * </ul>
 */
public class CorporateActionFeesAndCharges extends Charges {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionEvent corporateAction;
	/**
	 * Corporate action for which fees and charges are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionCharge
	 * CorporateActionEvent.mmCorporateActionCharge}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateAction";
			definition = "Corporate action for which fees and charges are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionCharge;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected RateAndAmount solicitationFee;
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
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmSolicitationFeeCorporateActionParameters
	 * RateAndAmount.mmSolicitationFeeCorporateActionParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmSolicitationFeeRate
	 * CorporateActionRate4.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmSolicitationFees
	 * CorporateActionAmounts2.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmSolicitationFeeRate
	 * CorporateActionRate10.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmSolicitationFees
	 * CorporateActionAmounts5.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmSolicitationFees
	 * CorporateActionAmounts11.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmSolicitationFeeRate
	 * RateDetails2.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmSolicitationFees
	 * CorporateActionAmounts12.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#mmSolicitationFeeRate
	 * RateDetails4.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmSolicitationFees
	 * CorporateActionAmounts17.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmSolicitationFeeRate
	 * RateDetails7.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmSolicitationFees
	 * CorporateActionAmounts20.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmSolicitationFeeRate
	 * RateDetails9.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmSolicitationFees
	 * CorporateActionAmounts23.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmSolicitationFeeRate
	 * RateDetails11.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmSolicitationFees
	 * CorporateActionAmounts24.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmSolicitationFeeRate
	 * RateDetails12.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmSolicitationFeeRate
	 * CorporateActionRate5.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmSolicitationFees
	 * CorporateActionAmounts3.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmSolicitationFeeRate
	 * CorporateActionRate12.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmSolicitationFees
	 * CorporateActionAmounts6.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmSolicitationFees
	 * CorporateActionAmounts9.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmSolicitationFeeRate
	 * RateDetails3.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmSolicitationFees
	 * CorporateActionAmounts13.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmSolicitationFeeRate
	 * RateDetails5.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmSolicitationFees
	 * CorporateActionAmounts16.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmSolicitationFees
	 * CorporateActionAmounts19.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmSolicitationFees
	 * CorporateActionAmounts22.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmSolicitationFeeRate
	 * RateDetails10.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmSolicitationFees
	 * CorporateActionAmounts25.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmSolicitationFeeRate
	 * RateDetails13.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmSolicitationFees
	 * CorporateActionAmounts4.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmSolicitationFees
	 * CorporateActionAmounts7.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmSolicitationFees
	 * CorporateActionAmounts10.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmSolicitationFees
	 * CorporateActionAmounts14.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmSolicitationFees
	 * CorporateActionAmounts15.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmSolicitationFees
	 * CorporateActionAmounts18.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmSolicitationFees
	 * CorporateActionAmounts21.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmSolicitationFees
	 * CorporateActionAmounts26.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmSolicitationFee
	 * CorporateActionRate2.mmSolicitationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmSolicitationFees
	 * CorporateActionAmounts1.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmSolicitationFees
	 * CorporateActionAmounts29.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmSolicitationFeeRate
	 * RateDetails15.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmSolicitationFees
	 * CorporateActionAmounts27.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmSolicitationFees
	 * CorporateActionAmounts28.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmSolicitationFeeRate
	 * RateDetails14.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmSolicitationFees
	 * CorporateActionAmounts33.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmSolicitationFees
	 * CorporateActionAmounts32.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmSolicitationFeeRate
	 * RateDetails18.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmSolicitationFeeRate
	 * RateDetails21.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmSolicitationFees
	 * CorporateActionAmounts35.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmSolicitationFees
	 * CorporateActionAmounts37.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmSolicitationFeeRate
	 * RateDetails23.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmSolicitationFees
	 * CorporateActionAmounts36.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmSolicitationFeeRate
	 * RateDetails22.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmSolicitationFees
	 * CorporateActionAmounts38.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmSolicitationFeeRate
	 * RateDetails24.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmSolicitationFees
	 * CorporateActionAmounts39.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmSolicitationFees
	 * CorporateActionAmounts41.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmSolicitationFeeRate
	 * RateDetails25.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmSolicitationFees
	 * CorporateActionAmounts40.mmSolicitationFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmSolicitationFeeRate
	 * RateDetails26.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmSolicitationFeeRate
	 * RateDetails27.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmSolicitationFeeRate
	 * RateDetails28.mmSolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmSolicitationFeeRate
	 * RateDetails30.mmSolicitationFeeRate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmSolicitationFee = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts2.mmSolicitationFees,
					com.tools20022.repository.msg.CorporateActionRate10.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts5.mmSolicitationFees,
					com.tools20022.repository.msg.CorporateActionAmounts11.mmSolicitationFees, com.tools20022.repository.msg.RateDetails2.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts12.mmSolicitationFees,
					com.tools20022.repository.msg.RateDetails4.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts17.mmSolicitationFees, com.tools20022.repository.msg.RateDetails7.mmSolicitationFeeRate,
					com.tools20022.repository.msg.CorporateActionAmounts20.mmSolicitationFees, com.tools20022.repository.msg.RateDetails9.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts23.mmSolicitationFees,
					com.tools20022.repository.msg.RateDetails11.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts24.mmSolicitationFees, com.tools20022.repository.msg.RateDetails12.mmSolicitationFeeRate,
					com.tools20022.repository.msg.CorporateActionRate5.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts3.mmSolicitationFees,
					com.tools20022.repository.msg.CorporateActionRate12.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts6.mmSolicitationFees,
					com.tools20022.repository.msg.CorporateActionAmounts9.mmSolicitationFees, com.tools20022.repository.msg.RateDetails3.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts13.mmSolicitationFees,
					com.tools20022.repository.msg.RateDetails5.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts16.mmSolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts19.mmSolicitationFees,
					com.tools20022.repository.msg.CorporateActionAmounts22.mmSolicitationFees, com.tools20022.repository.msg.RateDetails10.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts25.mmSolicitationFees,
					com.tools20022.repository.msg.RateDetails13.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts4.mmSolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts7.mmSolicitationFees,
					com.tools20022.repository.msg.CorporateActionAmounts10.mmSolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts14.mmSolicitationFees,
					com.tools20022.repository.msg.CorporateActionAmounts15.mmSolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts18.mmSolicitationFees,
					com.tools20022.repository.msg.CorporateActionAmounts21.mmSolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts26.mmSolicitationFees, com.tools20022.repository.msg.CorporateActionRate2.mmSolicitationFee,
					com.tools20022.repository.msg.CorporateActionAmounts1.mmSolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts29.mmSolicitationFees, com.tools20022.repository.msg.RateDetails15.mmSolicitationFeeRate,
					com.tools20022.repository.msg.CorporateActionAmounts27.mmSolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts28.mmSolicitationFees, com.tools20022.repository.msg.RateDetails14.mmSolicitationFeeRate,
					com.tools20022.repository.msg.CorporateActionAmounts33.mmSolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts32.mmSolicitationFees, com.tools20022.repository.msg.RateDetails18.mmSolicitationFeeRate,
					com.tools20022.repository.msg.RateDetails21.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts35.mmSolicitationFees, com.tools20022.repository.msg.CorporateActionAmounts37.mmSolicitationFees,
					com.tools20022.repository.msg.RateDetails23.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts36.mmSolicitationFees, com.tools20022.repository.msg.RateDetails22.mmSolicitationFeeRate,
					com.tools20022.repository.msg.CorporateActionAmounts38.mmSolicitationFees, com.tools20022.repository.msg.RateDetails24.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts39.mmSolicitationFees,
					com.tools20022.repository.msg.CorporateActionAmounts41.mmSolicitationFees, com.tools20022.repository.msg.RateDetails25.mmSolicitationFeeRate, com.tools20022.repository.msg.CorporateActionAmounts40.mmSolicitationFees,
					com.tools20022.repository.msg.RateDetails26.mmSolicitationFeeRate, com.tools20022.repository.msg.RateDetails27.mmSolicitationFeeRate, com.tools20022.repository.msg.RateDetails28.mmSolicitationFeeRate,
					com.tools20022.repository.msg.RateDetails30.mmSolicitationFeeRate);
			elementContext_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SolicitationFee";
			definition = "Cash amount made available in a corporate event in order to encourage participation in the event or to vote with management's position. Payment is made to a third party who has solicited an entity to take part in the offer.\r\nAlso called consent fee.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmSolicitationFeeCorporateActionParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected RateAndAmount earlySolicitationFeeRate;
	/**
	 * Cash rate made available, as an incentive, in addition to the
	 * solicitation fee, in order to encourage early participation in an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmEarlySolicitationFeeCorporateActionParameters
	 * RateAndAmount.mmEarlySolicitationFeeCorporateActionParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmEarlySolicitationFeeRate
	 * RateDetails7.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmEarlySolicitationFeeRate
	 * RateDetails9.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmEarlySolicitationFeeRate
	 * RateDetails11.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmEarlySolicitationFeeRate
	 * RateDetails12.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmEarlySolicitationFeeRate
	 * CorporateActionRate5.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmEarlySolicitationFeeRate
	 * CorporateActionRate12.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmEarlySolicitationFeeRate
	 * RateDetails3.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmEarlySolicitationFeeRate
	 * RateDetails5.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmEarlySolicitationFeeRate
	 * RateDetails10.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmEarlySolicitationFeeRate
	 * RateDetails13.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmEarlySolicitationFeeRate
	 * RateDetails15.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmEarlySolicitationFeeRate
	 * RateDetails14.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmEarlySolicitationFeeRate
	 * RateDetails18.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmEarlySolicitationFeeRate
	 * RateDetails21.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmEarlySolicitationFeeRate
	 * RateDetails23.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmEarlySolicitationFeeRate
	 * RateDetails22.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmEarlySolicitationFeeRate
	 * RateDetails24.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmEarlySolicitationFeeRate
	 * RateDetails25.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmEarlySolicitationFeeRate
	 * RateDetails26.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmEarlySolicitationFeeRate
	 * RateDetails27.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmEarlySolicitationFeeRate
	 * RateDetails28.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmEarlySolicitationFeeRate
	 * RateDetails30.mmEarlySolicitationFeeRate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmEarlySolicitationFeeRate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RateDetails7.mmEarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails9.mmEarlySolicitationFeeRate,
					com.tools20022.repository.msg.RateDetails11.mmEarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails12.mmEarlySolicitationFeeRate,
					com.tools20022.repository.msg.CorporateActionRate5.mmEarlySolicitationFeeRate, com.tools20022.repository.msg.CorporateActionRate12.mmEarlySolicitationFeeRate,
					com.tools20022.repository.msg.RateDetails3.mmEarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails5.mmEarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails10.mmEarlySolicitationFeeRate,
					com.tools20022.repository.msg.RateDetails13.mmEarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails15.mmEarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails14.mmEarlySolicitationFeeRate,
					com.tools20022.repository.msg.RateDetails18.mmEarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails21.mmEarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails23.mmEarlySolicitationFeeRate,
					com.tools20022.repository.msg.RateDetails22.mmEarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails24.mmEarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails25.mmEarlySolicitationFeeRate,
					com.tools20022.repository.msg.RateDetails26.mmEarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails27.mmEarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails28.mmEarlySolicitationFeeRate,
					com.tools20022.repository.msg.RateDetails30.mmEarlySolicitationFeeRate);
			elementContext_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarlySolicitationFeeRate";
			definition = "Cash rate made available, as an incentive, in addition to the solicitation fee, in order to encourage early participation in an offer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmEarlySolicitationFeeCorporateActionParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected Commission commission;
	/**
	 * Commission associated with a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCorporateActionFeesAndCharges
	 * Commission.mmCorporateActionFeesAndCharges}</li>
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
	public static final MMBusinessAssociationEnd mmCommission = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Commission associated with a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.mmCorporateActionFeesAndCharges;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionFeesAndCharges";
				definition = "The definition of all the charges related to a corporate action event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Commission.mmCorporateActionFeesAndCharges, com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionCharge,
						com.tools20022.repository.entity.RateAndAmount.mmSolicitationFeeCorporateActionParameters, com.tools20022.repository.entity.RateAndAmount.mmEarlySolicitationFeeCorporateActionParameters);
				superType_lazy = () -> Charges.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmCorporateAction, com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmSolicitationFee,
						com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate, com.tools20022.repository.entity.CorporateActionFeesAndCharges.mmCommission);
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionEvent getCorporateAction() {
		return corporateAction;
	}

	public void setCorporateAction(com.tools20022.repository.entity.CorporateActionEvent corporateAction) {
		this.corporateAction = corporateAction;
	}

	public RateAndAmount getSolicitationFee() {
		return solicitationFee;
	}

	public void setSolicitationFee(com.tools20022.repository.entity.RateAndAmount solicitationFee) {
		this.solicitationFee = solicitationFee;
	}

	public RateAndAmount getEarlySolicitationFeeRate() {
		return earlySolicitationFeeRate;
	}

	public void setEarlySolicitationFeeRate(com.tools20022.repository.entity.RateAndAmount earlySolicitationFeeRate) {
		this.earlySolicitationFeeRate = earlySolicitationFeeRate;
	}

	public Commission getCommission() {
		return commission;
	}

	public void setCommission(com.tools20022.repository.entity.Commission commission) {
		this.commission = commission;
	}
}