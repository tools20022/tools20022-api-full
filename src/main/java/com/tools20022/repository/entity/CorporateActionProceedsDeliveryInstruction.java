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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmRelatedDistribution
 * CorporateActionProceedsDeliveryInstruction.mmRelatedDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSecuritiesProceedsMovement
 * CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmCashProceedsMovement
 * CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmSettlementAccount
 * CorporateActionProceedsDeliveryInstruction.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#mmCorporateActionStandingInstruction
 * CorporateActionProceedsDeliveryInstruction.
 * mmCorporateActionStandingInstruction}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedProceedsDelivery
 * Account.mmRelatedProceedsDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedCorporateAction
 * PaymentObligation.mmRelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmRelatedCorporateAction
 * SecuritiesDeliveryObligation.mmRelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmCorporateActionProceedsDeliveryInstruction
 * CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#mmRelatedDeliveryInstructions
 * AgentCorporateActionStandingInstruction.mmRelatedDeliveryInstructions}</li>
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
 * "CorporateActionProceedsDeliveryInstruction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the delivery instructions for the securities and cash proceeds at any stage of the Corporate Action process."
 * </li>
 * </ul>
 */
public class CorporateActionProceedsDeliveryInstruction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionDistribution relatedDistribution;
	/**
	 * Parameters of the distribution of the proceeds of a CA event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmCorporateActionProceedsDeliveryInstruction
	 * CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction}
	 * </li>
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
	public static final MMBusinessAssociationEnd mmRelatedDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDistribution";
			definition = "Parameters of the distribution of the proceeds of a CA event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesProceedsMovement;
	/**
	 * Instructions for the movement of securities related to a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmRelatedCorporateAction
	 * SecuritiesDeliveryObligation.mmRelatedCorporateAction}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4#mmSecuritiesMovementDetails
	 * CorporateActionOption4.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14#mmSecuritiesMovementDetails
	 * CorporateActionOption14.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption23#mmSecuritiesMovementDetails
	 * CorporateActionOption23.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption31#mmSecuritiesMovementDetails
	 * CorporateActionOption31.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption37#mmSecuritiesMovementDetails
	 * CorporateActionOption37.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption46#mmSecuritiesMovementDetails
	 * CorporateActionOption46.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption53#mmSecuritiesMovementDetails
	 * CorporateActionOption53.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption54#mmSecuritiesMovementDetails
	 * CorporateActionOption54.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10#mmSecuritiesMovementDetails
	 * CorporateActionOption10.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15#mmSecuritiesMovementDetails
	 * CorporateActionOption15.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption20#mmSecuritiesMovementDetails
	 * CorporateActionOption20.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption32#mmSecuritiesMovementDetails
	 * CorporateActionOption32.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption35#mmSecuritiesMovementDetails
	 * CorporateActionOption35.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption44#mmSecuritiesMovementDetails
	 * CorporateActionOption44.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption52#mmSecuritiesMovementDetails
	 * CorporateActionOption52.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption55#mmSecuritiesMovementDetails
	 * CorporateActionOption55.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption12#mmSecuritiesMovementDetails
	 * CorporateActionOption12.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption16#mmSecuritiesMovementDetails
	 * CorporateActionOption16.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption24#mmSecuritiesMovementDetails
	 * CorporateActionOption24.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption33#mmSecuritiesMovementDetails
	 * CorporateActionOption33.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption39#mmSecuritiesMovementDetails
	 * CorporateActionOption39.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption48#mmSecuritiesMovementDetails
	 * CorporateActionOption48.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3#mmSecuritiesMovementDetails
	 * CorporateActionOption3.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17#mmSecuritiesMovementDetails
	 * CorporateActionOption17.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption19#mmSecuritiesMovementDetails
	 * CorporateActionOption19.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption34#mmSecuritiesMovementDetails
	 * CorporateActionOption34.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption36#mmSecuritiesMovementDetails
	 * CorporateActionOption36.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption45#mmSecuritiesMovementDetails
	 * CorporateActionOption45.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption51#mmSecuritiesMovementDetails
	 * CorporateActionOption51.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption56#mmSecuritiesMovementDetails
	 * CorporateActionOption56.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption1#mmSecuritiesMovementDetails
	 * CorporateActionOption1.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#mmSecuritiesMovement
	 * GlobalDistributionRequest1.mmSecuritiesMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption100#mmSecuritiesMovementDetails
	 * CorporateActionOption100.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption101#mmSecuritiesMovementDetails
	 * CorporateActionOption101.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption102#mmSecuritiesMovementDetails
	 * CorporateActionOption102.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption110#mmSecuritiesMovementDetails
	 * CorporateActionOption110.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption108#mmSecuritiesMovementDetails
	 * CorporateActionOption108.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption106#mmSecuritiesMovementDetails
	 * CorporateActionOption106.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption111#mmSecuritiesMovementDetails
	 * CorporateActionOption111.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption113#mmSecuritiesMovementDetails
	 * CorporateActionOption113.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption117#mmSecuritiesMovementDetails
	 * CorporateActionOption117.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption119#mmSecuritiesMovementDetails
	 * CorporateActionOption119.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption115#mmSecuritiesMovementDetails
	 * CorporateActionOption115.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption114#mmSecuritiesMovementDetails
	 * CorporateActionOption114.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption126#mmSecuritiesMovementDetails
	 * CorporateActionOption126.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption124#mmSecuritiesMovementDetails
	 * CorporateActionOption124.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption125#mmSecuritiesMovementDetails
	 * CorporateActionOption125.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption127#mmSecuritiesMovementDetails
	 * CorporateActionOption127.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption132#mmSecuritiesMovementDetails
	 * CorporateActionOption132.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption130#mmSecuritiesMovementDetails
	 * CorporateActionOption130.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption129#mmSecuritiesMovementDetails
	 * CorporateActionOption129.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption136#mmSecuritiesMovementDetails
	 * CorporateActionOption136.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption135#mmSecuritiesMovementDetails
	 * CorporateActionOption135.mmSecuritiesMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption133#mmSecuritiesMovementDetails
	 * CorporateActionOption133.mmSecuritiesMovementDetails}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesProceedsMovement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionOption4.mmSecuritiesMovementDetails, CorporateActionOption14.mmSecuritiesMovementDetails, CorporateActionOption23.mmSecuritiesMovementDetails,
					CorporateActionOption31.mmSecuritiesMovementDetails, CorporateActionOption37.mmSecuritiesMovementDetails, CorporateActionOption46.mmSecuritiesMovementDetails, CorporateActionOption53.mmSecuritiesMovementDetails,
					CorporateActionOption54.mmSecuritiesMovementDetails, CorporateActionOption10.mmSecuritiesMovementDetails, CorporateActionOption15.mmSecuritiesMovementDetails, CorporateActionOption20.mmSecuritiesMovementDetails,
					CorporateActionOption32.mmSecuritiesMovementDetails, CorporateActionOption35.mmSecuritiesMovementDetails, CorporateActionOption44.mmSecuritiesMovementDetails, CorporateActionOption52.mmSecuritiesMovementDetails,
					CorporateActionOption55.mmSecuritiesMovementDetails, CorporateActionOption12.mmSecuritiesMovementDetails, CorporateActionOption16.mmSecuritiesMovementDetails, CorporateActionOption24.mmSecuritiesMovementDetails,
					CorporateActionOption33.mmSecuritiesMovementDetails, CorporateActionOption39.mmSecuritiesMovementDetails, CorporateActionOption48.mmSecuritiesMovementDetails, CorporateActionOption3.mmSecuritiesMovementDetails,
					CorporateActionOption17.mmSecuritiesMovementDetails, CorporateActionOption19.mmSecuritiesMovementDetails, CorporateActionOption34.mmSecuritiesMovementDetails, CorporateActionOption36.mmSecuritiesMovementDetails,
					CorporateActionOption45.mmSecuritiesMovementDetails, CorporateActionOption51.mmSecuritiesMovementDetails, CorporateActionOption56.mmSecuritiesMovementDetails, CorporateActionOption1.mmSecuritiesMovementDetails,
					GlobalDistributionRequest1.mmSecuritiesMovement, CorporateActionOption100.mmSecuritiesMovementDetails, CorporateActionOption101.mmSecuritiesMovementDetails, CorporateActionOption102.mmSecuritiesMovementDetails,
					CorporateActionOption110.mmSecuritiesMovementDetails, CorporateActionOption108.mmSecuritiesMovementDetails, CorporateActionOption106.mmSecuritiesMovementDetails, CorporateActionOption111.mmSecuritiesMovementDetails,
					CorporateActionOption113.mmSecuritiesMovementDetails, CorporateActionOption117.mmSecuritiesMovementDetails, CorporateActionOption119.mmSecuritiesMovementDetails, CorporateActionOption115.mmSecuritiesMovementDetails,
					CorporateActionOption114.mmSecuritiesMovementDetails, CorporateActionOption126.mmSecuritiesMovementDetails, CorporateActionOption124.mmSecuritiesMovementDetails, CorporateActionOption125.mmSecuritiesMovementDetails,
					CorporateActionOption127.mmSecuritiesMovementDetails, CorporateActionOption132.mmSecuritiesMovementDetails, CorporateActionOption130.mmSecuritiesMovementDetails, CorporateActionOption129.mmSecuritiesMovementDetails,
					CorporateActionOption136.mmSecuritiesMovementDetails, CorporateActionOption135.mmSecuritiesMovementDetails, CorporateActionOption133.mmSecuritiesMovementDetails);
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesProceedsMovement";
			definition = "Instructions for the movement of securities related to a corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmRelatedCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentObligation> cashProceedsMovement;
	/**
	 * Instructions for the movement of cash related to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRelatedCorporateAction
	 * PaymentObligation.mmRelatedCorporateAction}</li>
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
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1#mmCashMovement
	 * GlobalDistributionRequest1.mmCashMovement}</li>
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
	public static final MMBusinessAssociationEnd mmCashProceedsMovement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(GlobalDistributionRequest1.mmCashMovement);
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashProceedsMovement";
			definition = "Instructions for the movement of cash related to a corporate action.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmRelatedCorporateAction;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Account> settlementAccount;
	/**
	 * Information relative to the account(s) to be used for the delivery of the
	 * proceeds (cash or securities)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedProceedsDelivery
	 * Account.mmRelatedProceedsDelivery}</li>
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
	public static final MMBusinessAssociationEnd mmSettlementAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "Information relative to the account(s) to be used for the delivery of the proceeds (cash or securities)";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmRelatedProceedsDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected AgentCorporateActionStandingInstruction corporateActionStandingInstruction;
	/**
	 * Standing instruction related to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AgentCorporateActionStandingInstruction#mmRelatedDeliveryInstructions
	 * AgentCorporateActionStandingInstruction.mmRelatedDeliveryInstructions}</li>
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
	public static final MMBusinessAssociationEnd mmCorporateActionStandingInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionStandingInstruction";
			definition = "Standing instruction related to a corporate action.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmRelatedDeliveryInstructions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionProceedsDeliveryInstruction";
				definition = "Specifies the delivery instructions for the securities and cash proceeds at any stage of the Corporate Action process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmRelatedProceedsDelivery, com.tools20022.repository.entity.PaymentObligation.mmRelatedCorporateAction,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmRelatedCorporateAction, com.tools20022.repository.entity.CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction,
						com.tools20022.repository.entity.AgentCorporateActionStandingInstruction.mmRelatedDeliveryInstructions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmRelatedDistribution,
						com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmSecuritiesProceedsMovement, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmCashProceedsMovement,
						com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmSettlementAccount, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.mmCorporateActionStandingInstruction);
				derivationComponent_lazy = () -> Arrays.asList(ProceedsDelivery1.mmObject(), SecurityMovement1.mmObject(), SecuritiesProceeds1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionProceedsDeliveryInstruction.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionDistribution getRelatedDistribution() {
		return relatedDistribution;
	}

	public void setRelatedDistribution(com.tools20022.repository.entity.CorporateActionDistribution relatedDistribution) {
		this.relatedDistribution = relatedDistribution;
	}

	public List<SecuritiesDeliveryObligation> getSecuritiesProceedsMovement() {
		return securitiesProceedsMovement;
	}

	public void setSecuritiesProceedsMovement(List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesProceedsMovement) {
		this.securitiesProceedsMovement = securitiesProceedsMovement;
	}

	public List<PaymentObligation> getCashProceedsMovement() {
		return cashProceedsMovement;
	}

	public void setCashProceedsMovement(List<com.tools20022.repository.entity.PaymentObligation> cashProceedsMovement) {
		this.cashProceedsMovement = cashProceedsMovement;
	}

	public List<Account> getSettlementAccount() {
		return settlementAccount;
	}

	public void setSettlementAccount(List<com.tools20022.repository.entity.Account> settlementAccount) {
		this.settlementAccount = settlementAccount;
	}

	public AgentCorporateActionStandingInstruction getCorporateActionStandingInstruction() {
		return corporateActionStandingInstruction;
	}

	public void setCorporateActionStandingInstruction(com.tools20022.repository.entity.AgentCorporateActionStandingInstruction corporateActionStandingInstruction) {
		this.corporateActionStandingInstruction = corporateActionStandingInstruction;
	}
}