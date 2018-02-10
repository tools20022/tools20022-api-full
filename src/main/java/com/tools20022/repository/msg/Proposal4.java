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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.colr.CollateralProposalV04;
import com.tools20022.repository.choice.CollateralProposal4Choice;
import com.tools20022.repository.codeset.ProposalType1Code;
import com.tools20022.repository.entity.CollateralProposal;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Indicates the type of proposal and if the proposal is for the variation
 * margin and the segregated independent amount, or the segregated independent
 * amount only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Proposal4#mmCollateralProposalType
 * Proposal4.mmCollateralProposalType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal4#mmCollateralProposal
 * Proposal4.mmCollateralProposal}</li>
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
 * {@linkplain com.tools20022.repository.area.colr.CollateralProposalV04#mmTypeAndDetails
 * CollateralProposalV04.mmTypeAndDetails}</li>
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
 * "Proposal4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the type of proposal and if the proposal is for the variation margin and the segregated independent amount, or the segregated independent amount only."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Proposal5 Proposal5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Proposal3
 * Proposal3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Proposal4", propOrder = {"collateralProposalType", "collateralProposal"})
public class Proposal4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CollPrpslTp", required = true)
	protected ProposalType1Code collateralProposalType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProposalType1Code
	 * ProposalType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmType
	 * CollateralProposal.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Proposal4
	 * Proposal4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollPrpslTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralProposalType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether this is an initial or counter proposal."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Proposal5#mmCollateralProposalType
	 * Proposal5.mmCollateralProposalType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Proposal3#mmCollateralProposalType
	 * Proposal3.mmCollateralProposalType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralProposalType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralProposal.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Proposal4.mmObject();
			isDerived = false;
			xmlTag = "CollPrpslTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralProposalType";
			definition = "Indicates whether this is an initial or counter proposal.";
			nextVersions_lazy = () -> Arrays.asList(Proposal5.mmCollateralProposalType);
			previousVersion_lazy = () -> Proposal3.mmCollateralProposalType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProposalType1Code.mmObject();
		}
	};
	@XmlElement(name = "CollPrpsl", required = true)
	protected CollateralProposal4Choice collateralProposal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CollateralProposal4Choice
	 * CollateralProposal4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal
	 * CollateralProposal}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Proposal4
	 * Proposal4}</li>
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
	 * "Provides details about the proposal for the variation margin and the segregated independent amount, or the segregated independent amount only."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Proposal5#mmCollateralProposal
	 * Proposal5.mmCollateralProposal}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Proposal3#mmCollateralProposal
	 * Proposal3.mmCollateralProposal}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCollateralProposal = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CollateralProposal.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Proposal4.mmObject();
			isDerived = false;
			xmlTag = "CollPrpsl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralProposal";
			definition = "Provides details about the proposal for the variation margin and the segregated independent amount, or the segregated independent amount only.";
			nextVersions_lazy = () -> Arrays.asList(Proposal5.mmCollateralProposal);
			previousVersion_lazy = () -> Proposal3.mmCollateralProposal;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralProposal4Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Proposal4.mmCollateralProposalType, com.tools20022.repository.msg.Proposal4.mmCollateralProposal);
				messageBuildingBlock_lazy = () -> Arrays.asList(CollateralProposalV04.mmTypeAndDetails);
				trace_lazy = () -> CollateralProposal.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Proposal4";
				definition = "Indicates the type of proposal and if the proposal is for the variation margin and the segregated independent amount, or the segregated independent amount only.";
				nextVersions_lazy = () -> Arrays.asList(Proposal5.mmObject());
				previousVersion_lazy = () -> Proposal3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ProposalType1Code getCollateralProposalType() {
		return collateralProposalType;
	}

	public Proposal4 setCollateralProposalType(ProposalType1Code collateralProposalType) {
		this.collateralProposalType = Objects.requireNonNull(collateralProposalType);
		return this;
	}

	public CollateralProposal4Choice getCollateralProposal() {
		return collateralProposal;
	}

	public Proposal4 setCollateralProposal(CollateralProposal4Choice collateralProposal) {
		this.collateralProposal = Objects.requireNonNull(collateralProposal);
		return this;
	}
}