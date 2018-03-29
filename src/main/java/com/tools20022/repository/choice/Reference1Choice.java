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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between the identification of the MarginCallRequest message, the
 * MarginCallResponse message, the CollateralProposal message, the
 * CollateralProposalResponse message, the CollateralSubstitutionRequest message
 * or the MarginCallDisputeNotification message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference1Choice#mmMarginCallRequestIdentification
 * Reference1Choice.mmMarginCallRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference1Choice#mmMarginCallResponseIdentification
 * Reference1Choice.mmMarginCallResponseIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference1Choice#mmCollateralProposalIdentification
 * Reference1Choice.mmCollateralProposalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference1Choice#mmCollateralProposalResponseIdentification
 * Reference1Choice.mmCollateralProposalResponseIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference1Choice#mmDisputeNotificationIdentification
 * Reference1Choice.mmDisputeNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference1Choice#mmCollateralSubstitutionRequestIdentification
 * Reference1Choice.mmCollateralSubstitutionRequestIdentification}</li>
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
 * "Reference1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between the identification of the MarginCallRequest message, the MarginCallResponse message, the CollateralProposal message, the CollateralProposalResponse message, the CollateralSubstitutionRequest message or the MarginCallDisputeNotification message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Reference1Choice", propOrder = {"marginCallRequestIdentification", "marginCallResponseIdentification", "collateralProposalIdentification", "collateralProposalResponseIdentification", "disputeNotificationIdentification",
		"collateralSubstitutionRequestIdentification"})
public class Reference1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MrgnCallReqId", required = true)
	protected Max35Text marginCallRequestIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reference1Choice
	 * Reference1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the margin call request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference1Choice, Max35Text> mmMarginCallRequestIdentification = new MMMessageAttribute<Reference1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference1Choice.mmObject();
			isDerived = false;
			xmlTag = "MrgnCallReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallRequestIdentification";
			definition = "Unique identifier of the margin call request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reference1Choice obj) {
			return obj.getMarginCallRequestIdentification();
		}

		@Override
		public void setValue(Reference1Choice obj, Max35Text value) {
			obj.setMarginCallRequestIdentification(value);
		}
	};
	@XmlElement(name = "MrgnCallRspnId", required = true)
	protected Max35Text marginCallResponseIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reference1Choice
	 * Reference1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallRspnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallResponseIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the margin call response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference1Choice, Max35Text> mmMarginCallResponseIdentification = new MMMessageAttribute<Reference1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference1Choice.mmObject();
			isDerived = false;
			xmlTag = "MrgnCallRspnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallResponseIdentification";
			definition = "Unique identifier of the margin call response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reference1Choice obj) {
			return obj.getMarginCallResponseIdentification();
		}

		@Override
		public void setValue(Reference1Choice obj, Max35Text value) {
			obj.setMarginCallResponseIdentification(value);
		}
	};
	@XmlElement(name = "CollPrpslId", required = true)
	protected Max35Text collateralProposalIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reference1Choice
	 * Reference1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollPrpslId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralProposalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the collateral proposal."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference1Choice, Max35Text> mmCollateralProposalIdentification = new MMMessageAttribute<Reference1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference1Choice.mmObject();
			isDerived = false;
			xmlTag = "CollPrpslId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralProposalIdentification";
			definition = "Unique identifier of the collateral proposal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reference1Choice obj) {
			return obj.getCollateralProposalIdentification();
		}

		@Override
		public void setValue(Reference1Choice obj, Max35Text value) {
			obj.setCollateralProposalIdentification(value);
		}
	};
	@XmlElement(name = "CollPrpslRspnId", required = true)
	protected Max35Text collateralProposalResponseIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reference1Choice
	 * Reference1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollPrpslRspnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralProposalResponseIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the collateral proposal response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference1Choice, Max35Text> mmCollateralProposalResponseIdentification = new MMMessageAttribute<Reference1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference1Choice.mmObject();
			isDerived = false;
			xmlTag = "CollPrpslRspnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralProposalResponseIdentification";
			definition = "Unique identifier of the collateral proposal response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reference1Choice obj) {
			return obj.getCollateralProposalResponseIdentification();
		}

		@Override
		public void setValue(Reference1Choice obj, Max35Text value) {
			obj.setCollateralProposalResponseIdentification(value);
		}
	};
	@XmlElement(name = "DsptNtfctnId", required = true)
	protected Max35Text disputeNotificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reference1Choice
	 * Reference1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DsptNtfctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputeNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the dispute notification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference1Choice, Max35Text> mmDisputeNotificationIdentification = new MMMessageAttribute<Reference1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference1Choice.mmObject();
			isDerived = false;
			xmlTag = "DsptNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeNotificationIdentification";
			definition = "Unique identifier of the dispute notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reference1Choice obj) {
			return obj.getDisputeNotificationIdentification();
		}

		@Override
		public void setValue(Reference1Choice obj, Max35Text value) {
			obj.setDisputeNotificationIdentification(value);
		}
	};
	@XmlElement(name = "CollSbstitnReqId", required = true)
	protected Max35Text collateralSubstitutionRequestIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reference1Choice
	 * Reference1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollSbstitnReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the collateral substitution request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference1Choice, Max35Text> mmCollateralSubstitutionRequestIdentification = new MMMessageAttribute<Reference1Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference1Choice.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionRequestIdentification";
			definition = "Unique identifier of the collateral substitution request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reference1Choice obj) {
			return obj.getCollateralSubstitutionRequestIdentification();
		}

		@Override
		public void setValue(Reference1Choice obj, Max35Text value) {
			obj.setCollateralSubstitutionRequestIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Reference1Choice.mmMarginCallRequestIdentification, com.tools20022.repository.choice.Reference1Choice.mmMarginCallResponseIdentification,
						com.tools20022.repository.choice.Reference1Choice.mmCollateralProposalIdentification, com.tools20022.repository.choice.Reference1Choice.mmCollateralProposalResponseIdentification,
						com.tools20022.repository.choice.Reference1Choice.mmDisputeNotificationIdentification, com.tools20022.repository.choice.Reference1Choice.mmCollateralSubstitutionRequestIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Reference1Choice";
				definition = "Choice between the identification of the MarginCallRequest message, the MarginCallResponse message, the CollateralProposal message, the CollateralProposalResponse message, the CollateralSubstitutionRequest message or the MarginCallDisputeNotification message.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMarginCallRequestIdentification() {
		return marginCallRequestIdentification;
	}

	public Reference1Choice setMarginCallRequestIdentification(Max35Text marginCallRequestIdentification) {
		this.marginCallRequestIdentification = Objects.requireNonNull(marginCallRequestIdentification);
		return this;
	}

	public Max35Text getMarginCallResponseIdentification() {
		return marginCallResponseIdentification;
	}

	public Reference1Choice setMarginCallResponseIdentification(Max35Text marginCallResponseIdentification) {
		this.marginCallResponseIdentification = Objects.requireNonNull(marginCallResponseIdentification);
		return this;
	}

	public Max35Text getCollateralProposalIdentification() {
		return collateralProposalIdentification;
	}

	public Reference1Choice setCollateralProposalIdentification(Max35Text collateralProposalIdentification) {
		this.collateralProposalIdentification = Objects.requireNonNull(collateralProposalIdentification);
		return this;
	}

	public Max35Text getCollateralProposalResponseIdentification() {
		return collateralProposalResponseIdentification;
	}

	public Reference1Choice setCollateralProposalResponseIdentification(Max35Text collateralProposalResponseIdentification) {
		this.collateralProposalResponseIdentification = Objects.requireNonNull(collateralProposalResponseIdentification);
		return this;
	}

	public Max35Text getDisputeNotificationIdentification() {
		return disputeNotificationIdentification;
	}

	public Reference1Choice setDisputeNotificationIdentification(Max35Text disputeNotificationIdentification) {
		this.disputeNotificationIdentification = Objects.requireNonNull(disputeNotificationIdentification);
		return this;
	}

	public Max35Text getCollateralSubstitutionRequestIdentification() {
		return collateralSubstitutionRequestIdentification;
	}

	public Reference1Choice setCollateralSubstitutionRequestIdentification(Max35Text collateralSubstitutionRequestIdentification) {
		this.collateralSubstitutionRequestIdentification = Objects.requireNonNull(collateralSubstitutionRequestIdentification);
		return this;
	}
}