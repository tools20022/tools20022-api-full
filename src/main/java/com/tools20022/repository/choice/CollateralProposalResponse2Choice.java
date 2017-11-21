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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.colr.CollateralProposalResponseV03;
import com.tools20022.repository.area.colr.CollateralProposalResponseV04;
import com.tools20022.repository.entity.CollateralMovement;
import com.tools20022.repository.entity.CollateralProposal;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CollateralProposalResponse2;
import com.tools20022.repository.msg.CollateralProposalResponseType2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the collateral proposal response for the variation margin and the
 * segregated independent amount, or the segregated independent amount only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse2Choice#mmCollateralProposal
 * CollateralProposalResponse2Choice.mmCollateralProposal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse2Choice#mmSegregatedIndependentAmount
 * CollateralProposalResponse2Choice.mmSegregatedIndependentAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralProposal
 * CollateralProposal}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalResponseV03#mmProposalResponse
 * CollateralProposalResponseV03.mmProposalResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalResponseV04#mmProposalResponse
 * CollateralProposalResponseV04.mmProposalResponse}</li>
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
 * "CollateralProposalResponse2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the collateral proposal response for the variation margin and the segregated independent amount, or the segregated independent amount only."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse3Choice
 * CollateralProposalResponse3Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse1Choice
 * CollateralProposalResponse1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CollateralProposalResponse2Choice", propOrder = {"collateralProposal", "segregatedIndependentAmount"})
public class CollateralProposalResponse2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CollateralProposalResponse2 collateralProposal;
	/**
	 * Provides the collateral proposal response for the variation margin and
	 * optionaly the segregated independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponse2
	 * CollateralProposalResponse2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmProposedCollateralMovement
	 * CollateralProposal.mmProposedCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse2Choice
	 * CollateralProposalResponse2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollPrpsl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralProposal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the collateral proposal response for the variation margin and optionaly the segregated independent amount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse3Choice#mmCollateralProposal
	 * CollateralProposalResponse3Choice.mmCollateralProposal}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse1Choice#mmCollateralProposalDetails
	 * CollateralProposalResponse1Choice.mmCollateralProposalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCollateralProposal = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CollateralProposal.mmProposedCollateralMovement;
			componentContext_lazy = () -> CollateralProposalResponse2Choice.mmObject();
			isDerived = false;
			xmlTag = "CollPrpsl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralProposal";
			definition = "Provides the collateral proposal response for the variation margin and optionaly the segregated independent amount.";
			nextVersions_lazy = () -> Arrays.asList(CollateralProposalResponse3Choice.mmCollateralProposal);
			previousVersion_lazy = () -> CollateralProposalResponse1Choice.mmCollateralProposalDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralProposalResponse2.mmObject();
		}
	};
	protected CollateralProposalResponseType2 segregatedIndependentAmount;
	/**
	 * Provides the collateral proposal response for the segregated independent
	 * amount only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2
	 * CollateralProposalResponseType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmSegregatedIndependentAmount
	 * CollateralMovement.mmSegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse2Choice
	 * CollateralProposalResponse2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgrtdIndpdntAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the collateral proposal response for the segregated independent amount only."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse3Choice#mmSegregatedIndependentAmount
	 * CollateralProposalResponse3Choice.mmSegregatedIndependentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CollateralProposalResponse1Choice#mmSegregatedIndependentAmount
	 * CollateralProposalResponse1Choice.mmSegregatedIndependentAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSegregatedIndependentAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CollateralMovement.mmSegregatedIndependentAmount;
			componentContext_lazy = () -> CollateralProposalResponse2Choice.mmObject();
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Provides the collateral proposal response for the segregated independent amount only.";
			nextVersions_lazy = () -> Arrays.asList(CollateralProposalResponse3Choice.mmSegregatedIndependentAmount);
			previousVersion_lazy = () -> CollateralProposalResponse1Choice.mmSegregatedIndependentAmount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralProposalResponseType2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CollateralProposalResponse2Choice.mmCollateralProposal, CollateralProposalResponse2Choice.mmSegregatedIndependentAmount);
				messageBuildingBlock_lazy = () -> Arrays.asList(CollateralProposalResponseV03.mmProposalResponse, CollateralProposalResponseV04.mmProposalResponse);
				trace_lazy = () -> CollateralProposal.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralProposalResponse2Choice";
				definition = "Provides the collateral proposal response for the variation margin and the segregated independent amount, or the segregated independent amount only.";
				nextVersions_lazy = () -> Arrays.asList(CollateralProposalResponse3Choice.mmObject());
				previousVersion_lazy = () -> CollateralProposalResponse1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CollPrpsl", required = true)
	public CollateralProposalResponse2 getCollateralProposal() {
		return collateralProposal;
	}

	public void setCollateralProposal(CollateralProposalResponse2 collateralProposal) {
		this.collateralProposal = collateralProposal;
	}

	@XmlElement(name = "SgrtdIndpdntAmt", required = true)
	public CollateralProposalResponseType2 getSegregatedIndependentAmount() {
		return segregatedIndependentAmount;
	}

	public void setSegregatedIndependentAmount(CollateralProposalResponseType2 segregatedIndependentAmount) {
		this.segregatedIndependentAmount = segregatedIndependentAmount;
	}
}