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
import com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV03;
import com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04;
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
 * CollateralProposalResponse message, the CollateralSubstitutionRequest
 * message, the CollateralSubstitutionResponse message, the
 * CollateralSubstitutionConfirmation message, the InterestPaymentRequest
 * message, the InterestPaymentResponse message, the InterestPaymentStatement
 * message or the MarginCallDisputeNotification message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference2Choice#mmMarginCallRequestIdentification
 * Reference2Choice.mmMarginCallRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference2Choice#mmMarginCallResponseIdentification
 * Reference2Choice.mmMarginCallResponseIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference2Choice#mmCollateralProposalIdentification
 * Reference2Choice.mmCollateralProposalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference2Choice#mmCollateralProposalResponseIdentification
 * Reference2Choice.mmCollateralProposalResponseIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference2Choice#mmDisputeNotificationIdentification
 * Reference2Choice.mmDisputeNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference2Choice#mmCollateralSubstitutionRequestIdentification
 * Reference2Choice.mmCollateralSubstitutionRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference2Choice#mmCollateralSubstitutionResponseIdentification
 * Reference2Choice.mmCollateralSubstitutionResponseIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference2Choice#mmCollateralSubstitutionConfirmationIdentification
 * Reference2Choice.mmCollateralSubstitutionConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference2Choice#mmInterestPaymentRequestIdentification
 * Reference2Choice.mmInterestPaymentRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference2Choice#mmInterestPaymentResponseIdentification
 * Reference2Choice.mmInterestPaymentResponseIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reference2Choice#mmInterestPaymentStatementIdentification
 * Reference2Choice.mmInterestPaymentStatementIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV03#mmReference
 * CollateralManagementCancellationRequestV03.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationRequestV04#mmReference
 * CollateralManagementCancellationRequestV04.mmReference}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Reference2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between the identification of the MarginCallRequest message, the MarginCallResponse message, the CollateralProposal message, the CollateralProposalResponse message, the CollateralSubstitutionRequest message, the CollateralSubstitutionResponse message, the CollateralSubstitutionConfirmation message, the InterestPaymentRequest message, the InterestPaymentResponse message, the InterestPaymentStatement message or the MarginCallDisputeNotification message."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Reference2Choice", propOrder = {"marginCallRequestIdentification", "marginCallResponseIdentification", "collateralProposalIdentification", "collateralProposalResponseIdentification", "disputeNotificationIdentification",
		"collateralSubstitutionRequestIdentification", "collateralSubstitutionResponseIdentification", "collateralSubstitutionConfirmationIdentification", "interestPaymentRequestIdentification", "interestPaymentResponseIdentification",
		"interestPaymentStatementIdentification"})
public class Reference2Choice {

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
	 * {@linkplain com.tools20022.repository.choice.Reference2Choice
	 * Reference2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallReqId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the margin call request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference2Choice, Max35Text> mmMarginCallRequestIdentification = new MMMessageAttribute<Reference2Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference2Choice.mmObject();
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
		public Max35Text getValue(Reference2Choice obj) {
			return obj.getMarginCallRequestIdentification();
		}

		@Override
		public void setValue(Reference2Choice obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.choice.Reference2Choice
	 * Reference2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallRspnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallResponseIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the margin call response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference2Choice, Max35Text> mmMarginCallResponseIdentification = new MMMessageAttribute<Reference2Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference2Choice.mmObject();
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
		public Max35Text getValue(Reference2Choice obj) {
			return obj.getMarginCallResponseIdentification();
		}

		@Override
		public void setValue(Reference2Choice obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.choice.Reference2Choice
	 * Reference2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollPrpslId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralProposalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the collateral proposal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference2Choice, Max35Text> mmCollateralProposalIdentification = new MMMessageAttribute<Reference2Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference2Choice.mmObject();
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
		public Max35Text getValue(Reference2Choice obj) {
			return obj.getCollateralProposalIdentification();
		}

		@Override
		public void setValue(Reference2Choice obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.choice.Reference2Choice
	 * Reference2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollPrpslRspnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralProposalResponseIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the collateral proposal response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference2Choice, Max35Text> mmCollateralProposalResponseIdentification = new MMMessageAttribute<Reference2Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference2Choice.mmObject();
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
		public Max35Text getValue(Reference2Choice obj) {
			return obj.getCollateralProposalResponseIdentification();
		}

		@Override
		public void setValue(Reference2Choice obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.choice.Reference2Choice
	 * Reference2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DsptNtfctnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputeNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the dispute notification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference2Choice, Max35Text> mmDisputeNotificationIdentification = new MMMessageAttribute<Reference2Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference2Choice.mmObject();
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
		public Max35Text getValue(Reference2Choice obj) {
			return obj.getDisputeNotificationIdentification();
		}

		@Override
		public void setValue(Reference2Choice obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.choice.Reference2Choice
	 * Reference2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollSbstitnReqId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Choice between the identification of the MarginCallRequest message, the MarginCallResponse message, the CollateralProposal message, the CollateralProposalResponse message, the CollateralSubstitutionRequest message, the CollateralSubstitutionResponse message, the CollateralSubstitutionConfirmation message, the InterestPaymentRequest message, the InterestPaymentResponse message, the InterestPaymentStatement message or the MarginCallDisputeNotification message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference2Choice, Max35Text> mmCollateralSubstitutionRequestIdentification = new MMMessageAttribute<Reference2Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionRequestIdentification";
			definition = "Choice between the identification of the MarginCallRequest message, the MarginCallResponse message, the CollateralProposal message, the CollateralProposalResponse message, the CollateralSubstitutionRequest message, the CollateralSubstitutionResponse message, the CollateralSubstitutionConfirmation message, the InterestPaymentRequest message, the InterestPaymentResponse message, the InterestPaymentStatement message or the MarginCallDisputeNotification message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reference2Choice obj) {
			return obj.getCollateralSubstitutionRequestIdentification();
		}

		@Override
		public void setValue(Reference2Choice obj, Max35Text value) {
			obj.setCollateralSubstitutionRequestIdentification(value);
		}
	};
	@XmlElement(name = "CollSbstitnRspnId", required = true)
	protected Max35Text collateralSubstitutionResponseIdentification;
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
	 * {@linkplain com.tools20022.repository.choice.Reference2Choice
	 * Reference2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollSbstitnRspnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionResponseIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier of the collateral substitution response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference2Choice, Max35Text> mmCollateralSubstitutionResponseIdentification = new MMMessageAttribute<Reference2Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnRspnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionResponseIdentification";
			definition = "Unique identifier of the collateral substitution response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reference2Choice obj) {
			return obj.getCollateralSubstitutionResponseIdentification();
		}

		@Override
		public void setValue(Reference2Choice obj, Max35Text value) {
			obj.setCollateralSubstitutionResponseIdentification(value);
		}
	};
	@XmlElement(name = "CollSbstitnConfId", required = true)
	protected Max35Text collateralSubstitutionConfirmationIdentification;
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
	 * {@linkplain com.tools20022.repository.choice.Reference2Choice
	 * Reference2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollSbstitnConfId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier of the collateral substitution confirmation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference2Choice, Max35Text> mmCollateralSubstitutionConfirmationIdentification = new MMMessageAttribute<Reference2Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionConfirmationIdentification";
			definition = "Unique identifier of the collateral substitution confirmation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reference2Choice obj) {
			return obj.getCollateralSubstitutionConfirmationIdentification();
		}

		@Override
		public void setValue(Reference2Choice obj, Max35Text value) {
			obj.setCollateralSubstitutionConfirmationIdentification(value);
		}
	};
	@XmlElement(name = "IntrstPmtReqId", required = true)
	protected Max35Text interestPaymentRequestIdentification;
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
	 * {@linkplain com.tools20022.repository.choice.Reference2Choice
	 * Reference2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPmtReqId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the interest payment request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference2Choice, Max35Text> mmInterestPaymentRequestIdentification = new MMMessageAttribute<Reference2Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmtReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentRequestIdentification";
			definition = "Unique identifier of the interest payment request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reference2Choice obj) {
			return obj.getInterestPaymentRequestIdentification();
		}

		@Override
		public void setValue(Reference2Choice obj, Max35Text value) {
			obj.setInterestPaymentRequestIdentification(value);
		}
	};
	@XmlElement(name = "IntrstPmtRspnId", required = true)
	protected Max35Text interestPaymentResponseIdentification;
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
	 * {@linkplain com.tools20022.repository.choice.Reference2Choice
	 * Reference2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPmtRspnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentResponseIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the interest payment response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference2Choice, Max35Text> mmInterestPaymentResponseIdentification = new MMMessageAttribute<Reference2Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmtRspnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentResponseIdentification";
			definition = "Unique identifier of the interest payment response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reference2Choice obj) {
			return obj.getInterestPaymentResponseIdentification();
		}

		@Override
		public void setValue(Reference2Choice obj, Max35Text value) {
			obj.setInterestPaymentResponseIdentification(value);
		}
	};
	@XmlElement(name = "IntrstPmtStmtId", required = true)
	protected Max35Text interestPaymentStatementIdentification;
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
	 * {@linkplain com.tools20022.repository.choice.Reference2Choice
	 * Reference2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPmtStmtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentStatementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the interest payment statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reference2Choice, Max35Text> mmInterestPaymentStatementIdentification = new MMMessageAttribute<Reference2Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmtStmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentStatementIdentification";
			definition = "Unique identifier of the interest payment statement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Reference2Choice obj) {
			return obj.getInterestPaymentStatementIdentification();
		}

		@Override
		public void setValue(Reference2Choice obj, Max35Text value) {
			obj.setInterestPaymentStatementIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Reference2Choice.mmMarginCallRequestIdentification, com.tools20022.repository.choice.Reference2Choice.mmMarginCallResponseIdentification,
						com.tools20022.repository.choice.Reference2Choice.mmCollateralProposalIdentification, com.tools20022.repository.choice.Reference2Choice.mmCollateralProposalResponseIdentification,
						com.tools20022.repository.choice.Reference2Choice.mmDisputeNotificationIdentification, com.tools20022.repository.choice.Reference2Choice.mmCollateralSubstitutionRequestIdentification,
						com.tools20022.repository.choice.Reference2Choice.mmCollateralSubstitutionResponseIdentification, com.tools20022.repository.choice.Reference2Choice.mmCollateralSubstitutionConfirmationIdentification,
						com.tools20022.repository.choice.Reference2Choice.mmInterestPaymentRequestIdentification, com.tools20022.repository.choice.Reference2Choice.mmInterestPaymentResponseIdentification,
						com.tools20022.repository.choice.Reference2Choice.mmInterestPaymentStatementIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(CollateralManagementCancellationRequestV03.mmReference, CollateralManagementCancellationRequestV04.mmReference);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reference2Choice";
				definition = "Choice between the identification of the MarginCallRequest message, the MarginCallResponse message, the CollateralProposal message, the CollateralProposalResponse message, the CollateralSubstitutionRequest message, the CollateralSubstitutionResponse message, the CollateralSubstitutionConfirmation message, the InterestPaymentRequest message, the InterestPaymentResponse message, the InterestPaymentStatement message or the MarginCallDisputeNotification message.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMarginCallRequestIdentification() {
		return marginCallRequestIdentification;
	}

	public Reference2Choice setMarginCallRequestIdentification(Max35Text marginCallRequestIdentification) {
		this.marginCallRequestIdentification = Objects.requireNonNull(marginCallRequestIdentification);
		return this;
	}

	public Max35Text getMarginCallResponseIdentification() {
		return marginCallResponseIdentification;
	}

	public Reference2Choice setMarginCallResponseIdentification(Max35Text marginCallResponseIdentification) {
		this.marginCallResponseIdentification = Objects.requireNonNull(marginCallResponseIdentification);
		return this;
	}

	public Max35Text getCollateralProposalIdentification() {
		return collateralProposalIdentification;
	}

	public Reference2Choice setCollateralProposalIdentification(Max35Text collateralProposalIdentification) {
		this.collateralProposalIdentification = Objects.requireNonNull(collateralProposalIdentification);
		return this;
	}

	public Max35Text getCollateralProposalResponseIdentification() {
		return collateralProposalResponseIdentification;
	}

	public Reference2Choice setCollateralProposalResponseIdentification(Max35Text collateralProposalResponseIdentification) {
		this.collateralProposalResponseIdentification = Objects.requireNonNull(collateralProposalResponseIdentification);
		return this;
	}

	public Max35Text getDisputeNotificationIdentification() {
		return disputeNotificationIdentification;
	}

	public Reference2Choice setDisputeNotificationIdentification(Max35Text disputeNotificationIdentification) {
		this.disputeNotificationIdentification = Objects.requireNonNull(disputeNotificationIdentification);
		return this;
	}

	public Max35Text getCollateralSubstitutionRequestIdentification() {
		return collateralSubstitutionRequestIdentification;
	}

	public Reference2Choice setCollateralSubstitutionRequestIdentification(Max35Text collateralSubstitutionRequestIdentification) {
		this.collateralSubstitutionRequestIdentification = Objects.requireNonNull(collateralSubstitutionRequestIdentification);
		return this;
	}

	public Max35Text getCollateralSubstitutionResponseIdentification() {
		return collateralSubstitutionResponseIdentification;
	}

	public Reference2Choice setCollateralSubstitutionResponseIdentification(Max35Text collateralSubstitutionResponseIdentification) {
		this.collateralSubstitutionResponseIdentification = Objects.requireNonNull(collateralSubstitutionResponseIdentification);
		return this;
	}

	public Max35Text getCollateralSubstitutionConfirmationIdentification() {
		return collateralSubstitutionConfirmationIdentification;
	}

	public Reference2Choice setCollateralSubstitutionConfirmationIdentification(Max35Text collateralSubstitutionConfirmationIdentification) {
		this.collateralSubstitutionConfirmationIdentification = Objects.requireNonNull(collateralSubstitutionConfirmationIdentification);
		return this;
	}

	public Max35Text getInterestPaymentRequestIdentification() {
		return interestPaymentRequestIdentification;
	}

	public Reference2Choice setInterestPaymentRequestIdentification(Max35Text interestPaymentRequestIdentification) {
		this.interestPaymentRequestIdentification = Objects.requireNonNull(interestPaymentRequestIdentification);
		return this;
	}

	public Max35Text getInterestPaymentResponseIdentification() {
		return interestPaymentResponseIdentification;
	}

	public Reference2Choice setInterestPaymentResponseIdentification(Max35Text interestPaymentResponseIdentification) {
		this.interestPaymentResponseIdentification = Objects.requireNonNull(interestPaymentResponseIdentification);
		return this;
	}

	public Max35Text getInterestPaymentStatementIdentification() {
		return interestPaymentStatementIdentification;
	}

	public Reference2Choice setInterestPaymentStatementIdentification(Max35Text interestPaymentStatementIdentification) {
		this.interestPaymentStatementIdentification = Objects.requireNonNull(interestPaymentStatementIdentification);
		return this;
	}
}