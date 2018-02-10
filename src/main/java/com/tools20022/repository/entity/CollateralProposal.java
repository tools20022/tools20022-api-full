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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CollateralProposalResponseCode;
import com.tools20022.repository.codeset.ProposalTypeCode;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmProposedCollateralMovement
 * CollateralProposal.mmProposedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmResponseType
 * CollateralProposal.mmResponseType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CollateralProposal#mmType
 * CollateralProposal.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmRelatedManagementProcess
 * CollateralProposal.mmRelatedManagementProcess}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmRelatedCollateralProposal
 * CollateralMovement.mmRelatedCollateralProposal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateralProposal
 * CollateralManagement.mmCollateralProposal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal1#mmProposalDetails
 * Proposal1.mmProposalDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal2#mmProposalDetails
 * Proposal2.mmProposalDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal3#mmCollateralProposal
 * Proposal3.mmCollateralProposal}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal4#mmCollateralProposal
 * Proposal4.mmCollateralProposal}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal5#mmCollateralProposal
 * Proposal5.mmCollateralProposal}</li>
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
	protected List<com.tools20022.repository.entity.CollateralMovement> proposedCollateralMovement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmRelatedCollateralProposal
	 * CollateralMovement.mmRelatedCollateralProposal}</li>
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
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse1Choice#mmCollateralProposalDetails
	 * CollateralProposalResponse1Choice.mmCollateralProposalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement2#mmDeliver
	 * CollateralMovement2.mmDeliver}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement2#mmReturn
	 * CollateralMovement2.mmReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement1Choice#mmCollateralMovementDetails
	 * CollateralMovement1Choice.mmCollateralMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement1Choice#mmReturn
	 * CollateralMovement1Choice.mmReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement1#mmMovementDetails
	 * CollateralMovement1.mmMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal1Choice#mmCollateralProposalDetails
	 * CollateralProposal1Choice.mmCollateralProposalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement3#mmDeliver
	 * CollateralMovement3.mmDeliver}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement3#mmReturn
	 * CollateralMovement3.mmReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement2Choice#mmCollateralMovementDetails
	 * CollateralMovement2Choice.mmCollateralMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement2Choice#mmReturn
	 * CollateralMovement2Choice.mmReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement4#mmMovementDetails
	 * CollateralMovement4.mmMovementDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal2Choice#mmCollateralProposalDetails
	 * CollateralProposal2Choice.mmCollateralProposalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal3Choice#mmCollateralProposalDetails
	 * CollateralProposal3Choice.mmCollateralProposalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement6#mmDeliver
	 * CollateralMovement6.mmDeliver}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement6#mmReturn
	 * CollateralMovement6.mmReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement5#mmMovementDirection
	 * CollateralMovement5.mmMovementDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement3Choice#mmCollateralMovementDirection
	 * CollateralMovement3Choice.mmCollateralMovementDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement3Choice#mmReturn
	 * CollateralMovement3Choice.mmReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse2Choice#mmCollateralProposal
	 * CollateralProposalResponse2Choice.mmCollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2#mmResponse
	 * CollateralProposalResponseType2.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal4Choice#mmCollateralProposalDetails
	 * CollateralProposal4Choice.mmCollateralProposalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement7#mmMovementDirection
	 * CollateralMovement7.mmMovementDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement4Choice#mmCollateralMovementDirection
	 * CollateralMovement4Choice.mmCollateralMovementDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement4Choice#mmReturn
	 * CollateralMovement4Choice.mmReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement8#mmDeliver
	 * CollateralMovement8.mmDeliver}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement8#mmReturn
	 * CollateralMovement8.mmReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse3Choice#mmCollateralProposal
	 * CollateralProposalResponse3Choice.mmCollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3#mmResponse
	 * CollateralProposalResponseType3.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal5Choice#mmCollateralProposalDetails
	 * CollateralProposal5Choice.mmCollateralProposalDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement10#mmMovementDirection
	 * CollateralMovement10.mmMovementDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement5Choice#mmCollateralMovementDirection
	 * CollateralMovement5Choice.mmCollateralMovementDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralMovement5Choice#mmReturn
	 * CollateralMovement5Choice.mmReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement11#mmDeliver
	 * CollateralMovement11.mmDeliver}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement11#mmReturn
	 * CollateralMovement11.mmReturn}</li>
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
	public static final MMBusinessAssociationEnd mmProposedCollateralMovement = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralProposalResponse1Choice.mmCollateralProposalDetails, CollateralMovement2.mmDeliver, CollateralMovement2.mmReturn, CollateralMovement1Choice.mmCollateralMovementDetails,
					CollateralMovement1Choice.mmReturn, CollateralMovement1.mmMovementDetails, CollateralProposal1Choice.mmCollateralProposalDetails, CollateralMovement3.mmDeliver, CollateralMovement3.mmReturn,
					CollateralMovement2Choice.mmCollateralMovementDetails, CollateralMovement2Choice.mmReturn, CollateralMovement4.mmMovementDetails, CollateralProposal2Choice.mmCollateralProposalDetails,
					CollateralProposal3Choice.mmCollateralProposalDetails, CollateralMovement6.mmDeliver, CollateralMovement6.mmReturn, CollateralMovement5.mmMovementDirection, CollateralMovement3Choice.mmCollateralMovementDirection,
					CollateralMovement3Choice.mmReturn, CollateralProposalResponse2Choice.mmCollateralProposal, CollateralProposalResponseType2.mmResponse, CollateralProposal4Choice.mmCollateralProposalDetails,
					CollateralMovement7.mmMovementDirection, CollateralMovement4Choice.mmCollateralMovementDirection, CollateralMovement4Choice.mmReturn, CollateralMovement8.mmDeliver, CollateralMovement8.mmReturn,
					CollateralProposalResponse3Choice.mmCollateralProposal, CollateralProposalResponseType3.mmResponse, CollateralProposal5Choice.mmCollateralProposalDetails, CollateralMovement10.mmMovementDirection,
					CollateralMovement5Choice.mmCollateralMovementDirection, CollateralMovement5Choice.mmReturn, CollateralMovement11.mmDeliver, CollateralMovement11.mmReturn);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedCollateralMovement";
			definition = "Details the movement of collateral that is proposed to be delivered or returned by one of the collateral parties.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmRelatedCollateralProposal;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
		}
	};
	protected CollateralProposalResponseCode responseType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1#mmType
	 * CollateralProposalResponseType1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2#mmType
	 * CollateralProposalResponseType2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3#mmType
	 * CollateralProposalResponseType3.mmType}</li>
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
	public static final MMBusinessAttribute mmResponseType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CollateralProposalResponseType1.mmType, CollateralProposalResponseType2.mmType, CollateralProposalResponseType3.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseType";
			definition = "Indicates whether the collateral proposal is an initial or a counter proposal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralProposalResponseCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralProposal.class.getMethod("getResponseType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ProposalTypeCode type;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Proposal1#mmProposalType
	 * Proposal1.mmProposalType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Proposal2#mmProposalType
	 * Proposal2.mmProposalType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Proposal3#mmCollateralProposalType
	 * Proposal3.mmCollateralProposalType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Proposal4#mmCollateralProposalType
	 * Proposal4.mmCollateralProposalType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Proposal5#mmCollateralProposalType
	 * Proposal5.mmCollateralProposalType}</li>
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
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Proposal1.mmProposalType, Proposal2.mmProposalType, Proposal3.mmCollateralProposalType, Proposal4.mmCollateralProposalType, Proposal5.mmCollateralProposalType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates whether this is an initial or counter proposal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProposalTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CollateralProposal.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CollateralManagement relatedManagementProcess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateralProposal
	 * CollateralManagement.mmCollateralProposal}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedManagementProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmCollateralProposal;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralProposal";
				definition = "Specifies collateral proposed to the counterparty.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralMovement.mmRelatedCollateralProposal, com.tools20022.repository.entity.CollateralManagement.mmCollateralProposal);
				derivationElement_lazy = () -> Arrays.asList(Proposal1.mmProposalDetails, Proposal2.mmProposalDetails, Proposal3.mmCollateralProposal, Proposal4.mmCollateralProposal, Proposal5.mmCollateralProposal);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralProposal.mmProposedCollateralMovement, com.tools20022.repository.entity.CollateralProposal.mmResponseType,
						com.tools20022.repository.entity.CollateralProposal.mmType, com.tools20022.repository.entity.CollateralProposal.mmRelatedManagementProcess);
				derivationComponent_lazy = () -> Arrays.asList(CollateralProposalResponse1.mmObject(), CollateralProposalResponse1Choice.mmObject(), ProposalType1Choice.mmObject(), CollateralMovement2.mmObject(),
						CollateralMovement1Choice.mmObject(), CollateralMovement1.mmObject(), CollateralProposal2.mmObject(), CollateralProposal1Choice.mmObject(), Proposal1.mmObject(), CollateralMovement3.mmObject(),
						CollateralMovement2Choice.mmObject(), CollateralMovement4.mmObject(), CollateralProposal3.mmObject(), CollateralProposal2Choice.mmObject(), Proposal2.mmObject(), Proposal3.mmObject(),
						CollateralProposal3Choice.mmObject(), CollateralMovement6.mmObject(), CollateralMovement5.mmObject(), CollateralMovement3Choice.mmObject(), CollateralProposal4.mmObject(),
						CollateralProposalResponse2Choice.mmObject(), CollateralResponse1.mmObject(), CollateralProposalResponseType2.mmObject(), CollateralProposalResponse2.mmObject(), Proposal4.mmObject(),
						CollateralProposal4Choice.mmObject(), CollateralProposal5.mmObject(), CollateralMovement7.mmObject(), CollateralMovement4Choice.mmObject(), CollateralMovement8.mmObject(), Proposal5.mmObject(),
						CollateralProposalResponse3Choice.mmObject(), CollateralProposalResponseType3.mmObject(), CollateralResponse2.mmObject(), CollateralProposal5Choice.mmObject(), CollateralProposalResponse3.mmObject(),
						CollateralMovement10.mmObject(), CollateralMovement5Choice.mmObject(), CollateralProposal6.mmObject(), CollateralMovement11.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralProposal.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CollateralMovement> getProposedCollateralMovement() {
		return proposedCollateralMovement == null ? proposedCollateralMovement = new ArrayList<>() : proposedCollateralMovement;
	}

	public CollateralProposal setProposedCollateralMovement(List<com.tools20022.repository.entity.CollateralMovement> proposedCollateralMovement) {
		this.proposedCollateralMovement = Objects.requireNonNull(proposedCollateralMovement);
		return this;
	}

	public CollateralProposalResponseCode getResponseType() {
		return responseType;
	}

	public CollateralProposal setResponseType(CollateralProposalResponseCode responseType) {
		this.responseType = Objects.requireNonNull(responseType);
		return this;
	}

	public ProposalTypeCode getType() {
		return type;
	}

	public CollateralProposal setType(ProposalTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<CollateralManagement> getRelatedManagementProcess() {
		return relatedManagementProcess == null ? Optional.empty() : Optional.of(relatedManagementProcess);
	}

	public CollateralProposal setRelatedManagementProcess(com.tools20022.repository.entity.CollateralManagement relatedManagementProcess) {
		this.relatedManagementProcess = relatedManagementProcess;
		return this;
	}
}