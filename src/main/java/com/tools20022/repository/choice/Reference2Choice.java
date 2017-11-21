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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Reference2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between the identification of the MarginCallRequest message, the MarginCallResponse message, the CollateralProposal message, the CollateralProposalResponse message, the CollateralSubstitutionRequest message, the CollateralSubstitutionResponse message, the CollateralSubstitutionConfirmation message, the InterestPaymentRequest message, the InterestPaymentResponse message, the InterestPaymentStatement message or the MarginCallDisputeNotification message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Reference2Choice", propOrder = {"marginCallRequestIdentification", "marginCallResponseIdentification", "collateralProposalIdentification", "collateralProposalResponseIdentification", "disputeNotificationIdentification",
		"collateralSubstitutionRequestIdentification", "collateralSubstitutionResponseIdentification", "collateralSubstitutionConfirmationIdentification", "interestPaymentRequestIdentification", "interestPaymentResponseIdentification",
		"interestPaymentStatementIdentification"})
public class Reference2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text marginCallRequestIdentification;
	/**
	 * Unique identifier of the margin call request.
	 * <p>
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
	public static final MMMessageAttribute mmMarginCallRequestIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "MrgnCallReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallRequestIdentification";
			definition = "Unique identifier of the margin call request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text marginCallResponseIdentification;
	/**
	 * Unique identifier of the margin call response.
	 * <p>
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
	public static final MMMessageAttribute mmMarginCallResponseIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "MrgnCallRspnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallResponseIdentification";
			definition = "Unique identifier of the margin call response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text collateralProposalIdentification;
	/**
	 * Unique identifier of the collateral proposal.
	 * <p>
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
	public static final MMMessageAttribute mmCollateralProposalIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "CollPrpslId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralProposalIdentification";
			definition = "Unique identifier of the collateral proposal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text collateralProposalResponseIdentification;
	/**
	 * Unique identifier of the collateral proposal response.
	 * <p>
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
	public static final MMMessageAttribute mmCollateralProposalResponseIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "CollPrpslRspnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralProposalResponseIdentification";
			definition = "Unique identifier of the collateral proposal response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text disputeNotificationIdentification;
	/**
	 * Unique identifier of the dispute notification.
	 * <p>
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
	public static final MMMessageAttribute mmDisputeNotificationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "DsptNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeNotificationIdentification";
			definition = "Unique identifier of the dispute notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text collateralSubstitutionRequestIdentification;
	/**
	 * Choice between the identification of the MarginCallRequest message, the
	 * MarginCallResponse message, the CollateralProposal message, the
	 * CollateralProposalResponse message, the CollateralSubstitutionRequest
	 * message, the CollateralSubstitutionResponse message, the
	 * CollateralSubstitutionConfirmation message, the InterestPaymentRequest
	 * message, the InterestPaymentResponse message, the
	 * InterestPaymentStatement message or the MarginCallDisputeNotification
	 * message.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Choice between the identification of the MarginCallRequest message, the MarginCallResponse message, the CollateralProposal message, the CollateralProposalResponse message, the CollateralSubstitutionRequest message, the CollateralSubstitutionResponse message, the CollateralSubstitutionConfirmation message, the InterestPaymentRequest message, the InterestPaymentResponse message, the InterestPaymentStatement message or the MarginCallDisputeNotification message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralSubstitutionRequestIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionRequestIdentification";
			definition = "Choice between the identification of the MarginCallRequest message, the MarginCallResponse message, the CollateralProposal message, the CollateralProposalResponse message, the CollateralSubstitutionRequest message, the CollateralSubstitutionResponse message, the CollateralSubstitutionConfirmation message, the InterestPaymentRequest message, the InterestPaymentResponse message, the InterestPaymentStatement message or the MarginCallDisputeNotification message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text collateralSubstitutionResponseIdentification;
	/**
	 * Unique identifier of the collateral substitution response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionResponseIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier of the collateral substitution response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralSubstitutionResponseIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnRspnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionResponseIdentification";
			definition = "Unique identifier of the collateral substitution response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text collateralSubstitutionConfirmationIdentification;
	/**
	 * Unique identifier of the collateral substitution confirmation.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier of the collateral substitution confirmation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralSubstitutionConfirmationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionConfirmationIdentification";
			definition = "Unique identifier of the collateral substitution confirmation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text interestPaymentRequestIdentification;
	/**
	 * Unique identifier of the interest payment request.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the interest payment request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestPaymentRequestIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmtReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentRequestIdentification";
			definition = "Unique identifier of the interest payment request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text interestPaymentResponseIdentification;
	/**
	 * Unique identifier of the interest payment response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentResponseIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the interest payment response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestPaymentResponseIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmtRspnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentResponseIdentification";
			definition = "Unique identifier of the interest payment response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text interestPaymentStatementIdentification;
	/**
	 * Unique identifier of the interest payment statement.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentStatementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier of the interest payment statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestPaymentStatementIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Reference2Choice.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmtStmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentStatementIdentification";
			definition = "Unique identifier of the interest payment statement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Reference2Choice.mmMarginCallRequestIdentification, Reference2Choice.mmMarginCallResponseIdentification, Reference2Choice.mmCollateralProposalIdentification,
						Reference2Choice.mmCollateralProposalResponseIdentification, Reference2Choice.mmDisputeNotificationIdentification, Reference2Choice.mmCollateralSubstitutionRequestIdentification,
						Reference2Choice.mmCollateralSubstitutionResponseIdentification, Reference2Choice.mmCollateralSubstitutionConfirmationIdentification, Reference2Choice.mmInterestPaymentRequestIdentification,
						Reference2Choice.mmInterestPaymentResponseIdentification, Reference2Choice.mmInterestPaymentStatementIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(CollateralManagementCancellationRequestV03.mmReference, CollateralManagementCancellationRequestV04.mmReference);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reference2Choice";
				definition = "Choice between the identification of the MarginCallRequest message, the MarginCallResponse message, the CollateralProposal message, the CollateralProposalResponse message, the CollateralSubstitutionRequest message, the CollateralSubstitutionResponse message, the CollateralSubstitutionConfirmation message, the InterestPaymentRequest message, the InterestPaymentResponse message, the InterestPaymentStatement message or the MarginCallDisputeNotification message.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MrgnCallReqId", required = true)
	public Max35Text getMarginCallRequestIdentification() {
		return marginCallRequestIdentification;
	}

	public void setMarginCallRequestIdentification(Max35Text marginCallRequestIdentification) {
		this.marginCallRequestIdentification = marginCallRequestIdentification;
	}

	@XmlElement(name = "MrgnCallRspnId", required = true)
	public Max35Text getMarginCallResponseIdentification() {
		return marginCallResponseIdentification;
	}

	public void setMarginCallResponseIdentification(Max35Text marginCallResponseIdentification) {
		this.marginCallResponseIdentification = marginCallResponseIdentification;
	}

	@XmlElement(name = "CollPrpslId", required = true)
	public Max35Text getCollateralProposalIdentification() {
		return collateralProposalIdentification;
	}

	public void setCollateralProposalIdentification(Max35Text collateralProposalIdentification) {
		this.collateralProposalIdentification = collateralProposalIdentification;
	}

	@XmlElement(name = "CollPrpslRspnId", required = true)
	public Max35Text getCollateralProposalResponseIdentification() {
		return collateralProposalResponseIdentification;
	}

	public void setCollateralProposalResponseIdentification(Max35Text collateralProposalResponseIdentification) {
		this.collateralProposalResponseIdentification = collateralProposalResponseIdentification;
	}

	@XmlElement(name = "DsptNtfctnId", required = true)
	public Max35Text getDisputeNotificationIdentification() {
		return disputeNotificationIdentification;
	}

	public void setDisputeNotificationIdentification(Max35Text disputeNotificationIdentification) {
		this.disputeNotificationIdentification = disputeNotificationIdentification;
	}

	@XmlElement(name = "CollSbstitnReqId", required = true)
	public Max35Text getCollateralSubstitutionRequestIdentification() {
		return collateralSubstitutionRequestIdentification;
	}

	public void setCollateralSubstitutionRequestIdentification(Max35Text collateralSubstitutionRequestIdentification) {
		this.collateralSubstitutionRequestIdentification = collateralSubstitutionRequestIdentification;
	}

	@XmlElement(name = "CollSbstitnRspnId", required = true)
	public Max35Text getCollateralSubstitutionResponseIdentification() {
		return collateralSubstitutionResponseIdentification;
	}

	public void setCollateralSubstitutionResponseIdentification(Max35Text collateralSubstitutionResponseIdentification) {
		this.collateralSubstitutionResponseIdentification = collateralSubstitutionResponseIdentification;
	}

	@XmlElement(name = "CollSbstitnConfId", required = true)
	public Max35Text getCollateralSubstitutionConfirmationIdentification() {
		return collateralSubstitutionConfirmationIdentification;
	}

	public void setCollateralSubstitutionConfirmationIdentification(Max35Text collateralSubstitutionConfirmationIdentification) {
		this.collateralSubstitutionConfirmationIdentification = collateralSubstitutionConfirmationIdentification;
	}

	@XmlElement(name = "IntrstPmtReqId", required = true)
	public Max35Text getInterestPaymentRequestIdentification() {
		return interestPaymentRequestIdentification;
	}

	public void setInterestPaymentRequestIdentification(Max35Text interestPaymentRequestIdentification) {
		this.interestPaymentRequestIdentification = interestPaymentRequestIdentification;
	}

	@XmlElement(name = "IntrstPmtRspnId", required = true)
	public Max35Text getInterestPaymentResponseIdentification() {
		return interestPaymentResponseIdentification;
	}

	public void setInterestPaymentResponseIdentification(Max35Text interestPaymentResponseIdentification) {
		this.interestPaymentResponseIdentification = interestPaymentResponseIdentification;
	}

	@XmlElement(name = "IntrstPmtStmtId", required = true)
	public Max35Text getInterestPaymentStatementIdentification() {
		return interestPaymentStatementIdentification;
	}

	public void setInterestPaymentStatementIdentification(Max35Text interestPaymentStatementIdentification) {
		this.interestPaymentStatementIdentification = interestPaymentStatementIdentification;
	}
}