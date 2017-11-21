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
import com.tools20022.repository.entity.CollateralMovement;
import com.tools20022.repository.entity.CollateralProposal;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CollateralMovement10;
import com.tools20022.repository.msg.CollateralProposal6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the proposal for the variation margin and optionally
 * the segregated independent amount, or the segregated independent amount only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralProposal5Choice#mmCollateralProposalDetails
 * CollateralProposal5Choice.mmCollateralProposalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralProposal5Choice#mmSegregatedIndependentAmount
 * CollateralProposal5Choice.mmSegregatedIndependentAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralProposal
 * CollateralProposal}</li>
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
 * "CollateralProposal5Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the proposal for the variation margin and optionally the segregated independent amount, or the segregated independent amount only."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.CollateralProposal4Choice
 * CollateralProposal4Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CollateralProposal5Choice", propOrder = {"collateralProposalDetails", "segregatedIndependentAmount"})
public class CollateralProposal5Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CollateralProposal6 collateralProposalDetails;
	/**
	 * Provides details about the proposal for the variation margin and
	 * optionally the segregated independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralProposal6
	 * CollateralProposal6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmProposedCollateralMovement
	 * CollateralProposal.mmProposedCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal5Choice
	 * CollateralProposal5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollPrpslDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralProposalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the proposal for the variation margin and optionally the segregated independent amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal4Choice#mmCollateralProposalDetails
	 * CollateralProposal4Choice.mmCollateralProposalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCollateralProposalDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CollateralProposal.mmProposedCollateralMovement;
			componentContext_lazy = () -> CollateralProposal5Choice.mmObject();
			isDerived = false;
			xmlTag = "CollPrpslDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralProposalDetails";
			definition = "Provides details about the proposal for the variation margin and optionally the segregated independent amount.";
			previousVersion_lazy = () -> CollateralProposal4Choice.mmCollateralProposalDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralProposal6.mmObject();
		}
	};
	protected CollateralMovement10 segregatedIndependentAmount;
	/**
	 * Provides details about the proposal for the segregated independent
	 * amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralMovement10
	 * CollateralMovement10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#mmSegregatedIndependentAmount
	 * CollateralMovement.mmSegregatedIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal5Choice
	 * CollateralProposal5Choice}</li>
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
	 * "Provides details about the proposal for the segregated independent amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal4Choice#mmSegregatedIndependentAmount
	 * CollateralProposal4Choice.mmSegregatedIndependentAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSegregatedIndependentAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CollateralMovement.mmSegregatedIndependentAmount;
			componentContext_lazy = () -> CollateralProposal5Choice.mmObject();
			isDerived = false;
			xmlTag = "SgrtdIndpdntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SegregatedIndependentAmount";
			definition = "Provides details about the proposal for the segregated independent amount.";
			previousVersion_lazy = () -> CollateralProposal4Choice.mmSegregatedIndependentAmount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralMovement10.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CollateralProposal5Choice.mmCollateralProposalDetails, CollateralProposal5Choice.mmSegregatedIndependentAmount);
				trace_lazy = () -> CollateralProposal.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralProposal5Choice";
				definition = "Provides details about the proposal for the variation margin and optionally the segregated independent amount, or the segregated independent amount only.";
				previousVersion_lazy = () -> CollateralProposal4Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CollPrpslDtls", required = true)
	public CollateralProposal6 getCollateralProposalDetails() {
		return collateralProposalDetails;
	}

	public void setCollateralProposalDetails(CollateralProposal6 collateralProposalDetails) {
		this.collateralProposalDetails = collateralProposalDetails;
	}

	@XmlElement(name = "SgrtdIndpdntAmt", required = true)
	public CollateralMovement10 getSegregatedIndependentAmount() {
		return segregatedIndependentAmount;
	}

	public void setSegregatedIndependentAmount(CollateralMovement10 segregatedIndependentAmount) {
		this.segregatedIndependentAmount = segregatedIndependentAmount;
	}
}