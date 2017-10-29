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
import com.tools20022.repository.msg.ProceedsDelivery1;
import com.tools20022.repository.msg.SecuritiesProceeds1;
import com.tools20022.repository.msg.SecurityMovement1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the delivery instructions for the securities and cash proceeds at
 * any stage of the Corporate Action process.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionProceedsDeliveryInstruction"
 * src="doc-files/CorporateActionProceedsDeliveryInstruction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#RelatedDistribution
 * CorporateActionProceedsDeliveryInstruction.RelatedDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#SecuritiesProceedsMovement
 * CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#CashProceedsMovement
 * CorporateActionProceedsDeliveryInstruction.CashProceedsMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#SettlementAccount
 * CorporateActionProceedsDeliveryInstruction.SettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#CorporateActionStandingInstruction
 * CorporateActionProceedsDeliveryInstruction.CorporateActionStandingInstruction
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#RelatedProceedsDelivery
 * Account.RelatedProceedsDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RelatedCorporateAction
 * PaymentObligation.RelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#RelatedCorporateAction
 * SecuritiesDeliveryObligation.RelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#CorporateActionProceedsDeliveryInstruction
 * CorporateActionDistribution.CorporateActionProceedsDeliveryInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#RelatedDeliveryInstructions
 * AgentCorporateActionStandingInstruction.RelatedDeliveryInstructions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProceedsDelivery1
 * ProceedsDelivery1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityMovement1
 * SecurityMovement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesProceeds1
 * SecuritiesProceeds1}</li>
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
 * "CorporateActionProceedsDeliveryInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the delivery instructions for the securities and cash proceeds at any stage of the Corporate Action process."
 * </li>
 * </ul>
 */
public class CorporateActionProceedsDeliveryInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Parameters of the distribution of the proceeds of a CA event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#CorporateActionProceedsDeliveryInstruction
	 * CorporateActionDistribution.CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters of the distribution of the proceeds of a CA event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDistribution";
			definition = "Parameters of the distribution of the proceeds of a CA event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.CorporateActionProceedsDeliveryInstruction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Instructions for the movement of securities related to a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#RelatedCorporateAction
	 * SecuritiesDeliveryObligation.RelatedCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#SecuritiesMovementDetails
	 * CorporateActionOption4.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#SecuritiesMovementDetails
	 * CorporateActionOption14.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#SecuritiesMovementDetails
	 * CorporateActionOption23.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#SecuritiesMovementDetails
	 * CorporateActionOption31.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#SecuritiesMovementDetails
	 * CorporateActionOption37.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#SecuritiesMovementDetails
	 * CorporateActionOption46.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#SecuritiesMovementDetails
	 * CorporateActionOption53.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#SecuritiesMovementDetails
	 * CorporateActionOption54.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#SecuritiesMovementDetails
	 * CorporateActionOption10.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#SecuritiesMovementDetails
	 * CorporateActionOption15.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#SecuritiesMovementDetails
	 * CorporateActionOption20.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#SecuritiesMovementDetails
	 * CorporateActionOption32.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#SecuritiesMovementDetails
	 * CorporateActionOption35.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#SecuritiesMovementDetails
	 * CorporateActionOption44.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#SecuritiesMovementDetails
	 * CorporateActionOption52.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#SecuritiesMovementDetails
	 * CorporateActionOption55.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption12#SecuritiesMovementDetails
	 * CorporateActionOption12.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption16#SecuritiesMovementDetails
	 * CorporateActionOption16.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption24#SecuritiesMovementDetails
	 * CorporateActionOption24.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption33#SecuritiesMovementDetails
	 * CorporateActionOption33.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption39#SecuritiesMovementDetails
	 * CorporateActionOption39.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption48#SecuritiesMovementDetails
	 * CorporateActionOption48.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#SecuritiesMovementDetails
	 * CorporateActionOption3.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#SecuritiesMovementDetails
	 * CorporateActionOption17.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#SecuritiesMovementDetails
	 * CorporateActionOption19.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#SecuritiesMovementDetails
	 * CorporateActionOption34.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#SecuritiesMovementDetails
	 * CorporateActionOption36.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#SecuritiesMovementDetails
	 * CorporateActionOption45.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#SecuritiesMovementDetails
	 * CorporateActionOption51.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#SecuritiesMovementDetails
	 * CorporateActionOption56.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#SecuritiesMovementDetails
	 * CorporateActionOption1.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#SecuritiesMovement
	 * GlobalDistributionRequest1.SecuritiesMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#SecuritiesMovementDetails
	 * CorporateActionOption100.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#SecuritiesMovementDetails
	 * CorporateActionOption101.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#SecuritiesMovementDetails
	 * CorporateActionOption102.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#SecuritiesMovementDetails
	 * CorporateActionOption110.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#SecuritiesMovementDetails
	 * CorporateActionOption108.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#SecuritiesMovementDetails
	 * CorporateActionOption106.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#SecuritiesMovementDetails
	 * CorporateActionOption111.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#SecuritiesMovementDetails
	 * CorporateActionOption113.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#SecuritiesMovementDetails
	 * CorporateActionOption117.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption119#SecuritiesMovementDetails
	 * CorporateActionOption119.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#SecuritiesMovementDetails
	 * CorporateActionOption115.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#SecuritiesMovementDetails
	 * CorporateActionOption114.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption126#SecuritiesMovementDetails
	 * CorporateActionOption126.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#SecuritiesMovementDetails
	 * CorporateActionOption124.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#SecuritiesMovementDetails
	 * CorporateActionOption125.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#SecuritiesMovementDetails
	 * CorporateActionOption127.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#SecuritiesMovementDetails
	 * CorporateActionOption132.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#SecuritiesMovementDetails
	 * CorporateActionOption130.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#SecuritiesMovementDetails
	 * CorporateActionOption129.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#SecuritiesMovementDetails
	 * CorporateActionOption136.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#SecuritiesMovementDetails
	 * CorporateActionOption135.SecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#SecuritiesMovementDetails
	 * CorporateActionOption133.SecuritiesMovementDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesProceedsMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructions for the movement of securities related to a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesProceedsMovement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionOption4.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption14.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption23.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption31.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption37.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption46.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption53.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption54.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption10.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption15.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption20.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption32.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption35.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption44.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption52.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption55.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption12.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption16.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption24.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption33.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption39.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption48.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption3.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption17.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption19.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption34.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption36.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption45.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption51.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption56.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption1.SecuritiesMovementDetails, com.tools20022.repository.msg.GlobalDistributionRequest1.SecuritiesMovement,
					com.tools20022.repository.msg.CorporateActionOption100.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption101.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption102.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption110.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption108.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption106.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption111.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption113.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption117.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption119.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption115.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption114.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption126.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption124.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption125.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption127.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption132.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption130.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption129.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption136.SecuritiesMovementDetails,
					com.tools20022.repository.msg.CorporateActionOption135.SecuritiesMovementDetails, com.tools20022.repository.msg.CorporateActionOption133.SecuritiesMovementDetails);
			elementContext_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesProceedsMovement";
			definition = "Instructions for the movement of securities related to a corporate action.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Instructions for the movement of cash related to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#RelatedCorporateAction
	 * PaymentObligation.RelatedCorporateAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#CashMovement
	 * GlobalDistributionRequest1.CashMovement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashProceedsMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructions for the movement of cash related to a corporate action."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CashProceedsMovement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GlobalDistributionRequest1.CashMovement);
			elementContext_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashProceedsMovement";
			definition = "Instructions for the movement of cash related to a corporate action.";
			minOccurs = 0;
			type_lazy = () -> PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.RelatedCorporateAction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information relative to the account(s) to be used for the delivery of the
	 * proceeds (cash or securities)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#RelatedProceedsDelivery
	 * Account.RelatedProceedsDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information relative to the account(s) to be used for the delivery of the proceeds (cash or securities)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "Information relative to the account(s) to be used for the delivery of the proceeds (cash or securities)";
			minOccurs = 0;
			type_lazy = () -> Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.RelatedProceedsDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Standing instruction related to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#RelatedDeliveryInstructions
	 * AgentCorporateActionStandingInstruction.RelatedDeliveryInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction
	 * AgentCorporateActionStandingInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionStandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standing instruction related to a corporate action."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionStandingInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStandingInstruction";
			definition = "Standing instruction related to a corporate action.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AgentCorporateActionStandingInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.RelatedDeliveryInstructions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionProceedsDeliveryInstruction";
				definition = "Specifies the delivery instructions for the securities and cash proceeds at any stage of the Corporate Action process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.RelatedProceedsDelivery, com.tools20022.repository.entity.PaymentObligation.RelatedCorporateAction,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedCorporateAction, com.tools20022.repository.entity.CorporateActionDistribution.CorporateActionProceedsDeliveryInstruction,
						com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.RelatedDeliveryInstructions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.RelatedDistribution,
						com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.CashProceedsMovement,
						com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SettlementAccount, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.CorporateActionStandingInstruction);
				derivationComponent_lazy = () -> Arrays.asList(ProceedsDelivery1.mmObject(), SecurityMovement1.mmObject(), SecuritiesProceeds1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}