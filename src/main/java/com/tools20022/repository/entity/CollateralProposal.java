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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CollateralProposalResponseCode;
import com.tools20022.repository.codeset.ProposalTypeCode;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies collateral proposed to the counterparty.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CollateralProposal" src="doc-files/CollateralProposal.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralProposal#ProposedCollateralMovement
 * CollateralProposal.ProposedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralProposal#ResponseType
 * CollateralProposal.ResponseType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralProposal#Type
 * CollateralProposal.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralProposal#RelatedManagementProcess
 * CollateralProposal.RelatedManagementProcess}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#RelatedCollateralProposal
 * CollateralMovement.RelatedCollateralProposal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#CollateralProposal
 * CollateralManagement.CollateralProposal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal1#ProposalDetails
 * Proposal1.ProposalDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal2#ProposalDetails
 * Proposal2.ProposalDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal3#CollateralProposal
 * Proposal3.CollateralProposal}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal4#CollateralProposal
 * Proposal4.CollateralProposal}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal5#CollateralProposal
 * Proposal5.CollateralProposal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralProposalResponse1
 * CollateralProposalResponse1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse1Choice
 * CollateralProposalResponse1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProposalType1Choice
 * ProposalType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement2
 * CollateralMovement2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CollateralMovement1Choice
 * CollateralMovement1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement1
 * CollateralMovement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralProposal2
 * CollateralProposal2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CollateralProposal1Choice
 * CollateralProposal1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal1 Proposal1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement3
 * CollateralMovement3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CollateralMovement2Choice
 * CollateralMovement2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement4
 * CollateralMovement4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralProposal3
 * CollateralProposal3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CollateralProposal2Choice
 * CollateralProposal2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal2 Proposal2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal3 Proposal3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CollateralProposal3Choice
 * CollateralProposal3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement6
 * CollateralMovement6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement5
 * CollateralMovement5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CollateralMovement3Choice
 * CollateralMovement3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralProposal4
 * CollateralProposal4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse2Choice
 * CollateralProposalResponse2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralResponse1
 * CollateralResponse1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2
 * CollateralProposalResponseType2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralProposalResponse2
 * CollateralProposalResponse2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal4 Proposal4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CollateralProposal4Choice
 * CollateralProposal4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralProposal5
 * CollateralProposal5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement7
 * CollateralMovement7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CollateralMovement4Choice
 * CollateralMovement4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement8
 * CollateralMovement8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal5 Proposal5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse3Choice
 * CollateralProposalResponse3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3
 * CollateralProposalResponseType3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralResponse2
 * CollateralResponse2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CollateralProposal5Choice
 * CollateralProposal5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralProposalResponse3
 * CollateralProposalResponse3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement10
 * CollateralMovement10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CollateralMovement5Choice
 * CollateralMovement5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralProposal6
 * CollateralProposal6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement11
 * CollateralMovement11}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralProposal"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies collateral proposed to the counterparty."</li>
 * </ul>
 */
public class CollateralProposal {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Details the movement of collateral that is proposed to be delivered or
	 * returned by one of the collateral parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#RelatedCollateralProposal
	 * CollateralMovement.RelatedCollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse1Choice#CollateralProposalDetails
	 * CollateralProposalResponse1Choice.CollateralProposalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement2#Deliver
	 * CollateralMovement2.Deliver}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement2#Return
	 * CollateralMovement2.Return}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement1Choice#CollateralMovementDetails
	 * CollateralMovement1Choice.CollateralMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement1Choice#Return
	 * CollateralMovement1Choice.Return}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement1#MovementDetails
	 * CollateralMovement1.MovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal1Choice#CollateralProposalDetails
	 * CollateralProposal1Choice.CollateralProposalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement3#Deliver
	 * CollateralMovement3.Deliver}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement3#Return
	 * CollateralMovement3.Return}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement2Choice#CollateralMovementDetails
	 * CollateralMovement2Choice.CollateralMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement2Choice#Return
	 * CollateralMovement2Choice.Return}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement4#MovementDetails
	 * CollateralMovement4.MovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal2Choice#CollateralProposalDetails
	 * CollateralProposal2Choice.CollateralProposalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal3Choice#CollateralProposalDetails
	 * CollateralProposal3Choice.CollateralProposalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement6#Deliver
	 * CollateralMovement6.Deliver}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement6#Return
	 * CollateralMovement6.Return}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement5#MovementDirection
	 * CollateralMovement5.MovementDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement3Choice#CollateralMovementDirection
	 * CollateralMovement3Choice.CollateralMovementDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement3Choice#Return
	 * CollateralMovement3Choice.Return}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse2Choice#CollateralProposal
	 * CollateralProposalResponse2Choice.CollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2#Response
	 * CollateralProposalResponseType2.Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal4Choice#CollateralProposalDetails
	 * CollateralProposal4Choice.CollateralProposalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement7#MovementDirection
	 * CollateralMovement7.MovementDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement4Choice#CollateralMovementDirection
	 * CollateralMovement4Choice.CollateralMovementDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement4Choice#Return
	 * CollateralMovement4Choice.Return}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement8#Deliver
	 * CollateralMovement8.Deliver}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralMovement8#Return
	 * CollateralMovement8.Return}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse3Choice#CollateralProposal
	 * CollateralProposalResponse3Choice.CollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3#Response
	 * CollateralProposalResponseType3.Response}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal5Choice#CollateralProposalDetails
	 * CollateralProposal5Choice.CollateralProposalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement10#MovementDirection
	 * CollateralMovement10.MovementDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement5Choice#CollateralMovementDirection
	 * CollateralMovement5Choice.CollateralMovementDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement5Choice#Return
	 * CollateralMovement5Choice.Return}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement11#Deliver
	 * CollateralMovement11.Deliver}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement11#Return
	 * CollateralMovement11.Return}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal
	 * CollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedCollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details the movement of collateral that is proposed to be delivered or returned by one of the collateral parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProposedCollateralMovement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CollateralProposalResponse1Choice.CollateralProposalDetails, com.tools20022.repository.msg.CollateralMovement2.Deliver,
					com.tools20022.repository.msg.CollateralMovement2.Return, com.tools20022.repository.choice.CollateralMovement1Choice.CollateralMovementDetails, com.tools20022.repository.choice.CollateralMovement1Choice.Return,
					com.tools20022.repository.msg.CollateralMovement1.MovementDetails, com.tools20022.repository.choice.CollateralProposal1Choice.CollateralProposalDetails, com.tools20022.repository.msg.CollateralMovement3.Deliver,
					com.tools20022.repository.msg.CollateralMovement3.Return, com.tools20022.repository.choice.CollateralMovement2Choice.CollateralMovementDetails, com.tools20022.repository.choice.CollateralMovement2Choice.Return,
					com.tools20022.repository.msg.CollateralMovement4.MovementDetails, com.tools20022.repository.choice.CollateralProposal2Choice.CollateralProposalDetails,
					com.tools20022.repository.choice.CollateralProposal3Choice.CollateralProposalDetails, com.tools20022.repository.msg.CollateralMovement6.Deliver, com.tools20022.repository.msg.CollateralMovement6.Return,
					com.tools20022.repository.msg.CollateralMovement5.MovementDirection, com.tools20022.repository.choice.CollateralMovement3Choice.CollateralMovementDirection,
					com.tools20022.repository.choice.CollateralMovement3Choice.Return, com.tools20022.repository.choice.CollateralProposalResponse2Choice.CollateralProposal,
					com.tools20022.repository.msg.CollateralProposalResponseType2.Response, com.tools20022.repository.choice.CollateralProposal4Choice.CollateralProposalDetails,
					com.tools20022.repository.msg.CollateralMovement7.MovementDirection, com.tools20022.repository.choice.CollateralMovement4Choice.CollateralMovementDirection,
					com.tools20022.repository.choice.CollateralMovement4Choice.Return, com.tools20022.repository.msg.CollateralMovement8.Deliver, com.tools20022.repository.msg.CollateralMovement8.Return,
					com.tools20022.repository.choice.CollateralProposalResponse3Choice.CollateralProposal, com.tools20022.repository.msg.CollateralProposalResponseType3.Response,
					com.tools20022.repository.choice.CollateralProposal5Choice.CollateralProposalDetails, com.tools20022.repository.msg.CollateralMovement10.MovementDirection,
					com.tools20022.repository.choice.CollateralMovement5Choice.CollateralMovementDirection, com.tools20022.repository.choice.CollateralMovement5Choice.Return, com.tools20022.repository.msg.CollateralMovement11.Deliver,
					com.tools20022.repository.msg.CollateralMovement11.Return);
			elementContext_lazy = () -> CollateralProposal.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedCollateralMovement";
			definition = "Details the movement of collateral that is proposed to be delivered or returned by one of the collateral parties.";
			minOccurs = 0;
			type_lazy = () -> CollateralMovement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.RelatedCollateralProposal;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the collateral proposal is an initial or a counter
	 * proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralProposalResponseCode
	 * CollateralProposalResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1#Type
	 * CollateralProposalResponseType1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2#Type
	 * CollateralProposalResponseType2.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3#Type
	 * CollateralProposalResponseType3.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal
	 * CollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the collateral proposal is an initial or a counter proposal."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ResponseType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralProposalResponseType1.Type, com.tools20022.repository.msg.CollateralProposalResponseType2.Type,
					com.tools20022.repository.msg.CollateralProposalResponseType3.Type);
			elementContext_lazy = () -> CollateralProposal.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseType";
			definition = "Indicates whether the collateral proposal is an initial or a counter proposal.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CollateralProposalResponseCode.mmObject();
		}
	};
	/**
	 * Indicates whether this is an initial or counter proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProposalTypeCode
	 * ProposalTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Proposal1#ProposalType
	 * Proposal1.ProposalType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Proposal2#ProposalType
	 * Proposal2.ProposalType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Proposal3#CollateralProposalType
	 * Proposal3.CollateralProposalType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Proposal4#CollateralProposalType
	 * Proposal4.CollateralProposalType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Proposal5#CollateralProposalType
	 * Proposal5.CollateralProposalType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal
	 * CollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether this is an initial or counter proposal."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Proposal1.ProposalType, com.tools20022.repository.msg.Proposal2.ProposalType, com.tools20022.repository.msg.Proposal3.CollateralProposalType,
					com.tools20022.repository.msg.Proposal4.CollateralProposalType, com.tools20022.repository.msg.Proposal5.CollateralProposalType);
			elementContext_lazy = () -> CollateralProposal.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates whether this is an initial or counter proposal.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ProposalTypeCode.mmObject();
		}
	};
	/**
	 * Process which groups the activities related to collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#CollateralProposal
	 * CollateralManagement.CollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal
	 * CollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedManagementProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedManagementProcess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CollateralProposal.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CollateralManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.CollateralProposal;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralProposal";
				definition = "Specifies collateral proposed to the counterparty.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralMovement.RelatedCollateralProposal, com.tools20022.repository.entity.CollateralManagement.CollateralProposal);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Proposal1.ProposalDetails, com.tools20022.repository.msg.Proposal2.ProposalDetails, com.tools20022.repository.msg.Proposal3.CollateralProposal,
						com.tools20022.repository.msg.Proposal4.CollateralProposal, com.tools20022.repository.msg.Proposal5.CollateralProposal);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralProposal.ProposedCollateralMovement, com.tools20022.repository.entity.CollateralProposal.ResponseType,
						com.tools20022.repository.entity.CollateralProposal.Type, com.tools20022.repository.entity.CollateralProposal.RelatedManagementProcess);
				derivationComponent_lazy = () -> Arrays.asList(CollateralProposalResponse1.mmObject(), CollateralProposalResponse1Choice.mmObject(), ProposalType1Choice.mmObject(), CollateralMovement2.mmObject(),
						CollateralMovement1Choice.mmObject(), CollateralMovement1.mmObject(), CollateralProposal2.mmObject(), CollateralProposal1Choice.mmObject(), Proposal1.mmObject(), CollateralMovement3.mmObject(),
						CollateralMovement2Choice.mmObject(), CollateralMovement4.mmObject(), CollateralProposal3.mmObject(), CollateralProposal2Choice.mmObject(), Proposal2.mmObject(), Proposal3.mmObject(),
						CollateralProposal3Choice.mmObject(), CollateralMovement6.mmObject(), CollateralMovement5.mmObject(), CollateralMovement3Choice.mmObject(), CollateralProposal4.mmObject(),
						CollateralProposalResponse2Choice.mmObject(), CollateralResponse1.mmObject(), CollateralProposalResponseType2.mmObject(), CollateralProposalResponse2.mmObject(), Proposal4.mmObject(),
						CollateralProposal4Choice.mmObject(), CollateralProposal5.mmObject(), CollateralMovement7.mmObject(), CollateralMovement4Choice.mmObject(), CollateralMovement8.mmObject(), Proposal5.mmObject(),
						CollateralProposalResponse3Choice.mmObject(), CollateralProposalResponseType3.mmObject(), CollateralResponse2.mmObject(), CollateralProposal5Choice.mmObject(), CollateralProposalResponse3.mmObject(),
						CollateralMovement10.mmObject(), CollateralMovement5Choice.mmObject(), CollateralProposal6.mmObject(), CollateralMovement11.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}