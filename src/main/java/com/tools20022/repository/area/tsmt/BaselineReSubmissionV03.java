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

package com.tools20022.repository.area.tsmt;

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.TradeServicesManagementArchive;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The BaselineReSubmission message is sent by either the counterparty or the
 * initiator of a transaction (baseline) to the matching application.<br>
 * This message is used by the counterparty to respond on the registration of a
 * push-through transaction in the matching application or by the initiator or
 * counterparty to re-send earlier mis-matched baseline information.<br>
 * <b>Usage</b><br>
 * The BaselineReSubmission message can be sent by the counterparty of a
 * transaction to the matching application in response to a
 * FullPushThroughReport message received from the matching application
 * conveying the details of an InitialBaselineSubmission message. The objective
 * of the BaselineReSubmission message sent in the outlined scenario is to
 * achieve a successful match of two baseline initiation messages in order to
 * establish a transaction in the matching application.<br>
 * or<br>
 * The BaselineReSubmission message can be sent by the initiator of a
 * transaction to the matching application in response to a BaselineMatchReport
 * message indicating mis-matches. The objective of the BaselineReSubmission
 * message sent in the outlined scenario is to correct an
 * InitialBaselineSubmission or BaselineReSubmission message submitted earlier
 * in order to achieve the establishment of a transaction in the matching
 * application.<br>
 * or<br>
 * The BaselineReSubmission message can be sent by the counterparty of a
 * transaction to the matching application in response to a BaselineMatchReport
 * message indicating mis-matches. The objective of the BaselineReSubmission
 * message sent in the outlined scenario is to correct a BaselineReSubmission
 * message submitted earlier in order to achieve the establishment of a
 * transaction in the matching application.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#BuyerBankOrSellerBankContactPersonRule
 * BaselineReSubmissionV03.BuyerBankOrSellerBankContactPersonRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmSubmissionIdentification
 * BaselineReSubmissionV03.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmTransactionIdentification
 * BaselineReSubmissionV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmSubmitterTransactionReference
 * BaselineReSubmissionV03.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmBaseline
 * BaselineReSubmissionV03.mmBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmBuyerContactPerson
 * BaselineReSubmissionV03.mmBuyerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmSellerContactPerson
 * BaselineReSubmissionV03.mmSellerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmBuyerBankContactPerson
 * BaselineReSubmissionV03.mmBuyerBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmSellerBankContactPerson
 * BaselineReSubmissionV03.mmSellerBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmOtherBankContactPerson
 * BaselineReSubmissionV03.mmOtherBankContactPerson}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "BaselnReSubmissn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementArchive
 * TradeServicesManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.012.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BaselineReSubmissionV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe BaselineReSubmission message is sent by either the counterparty or the initiator of a transaction (baseline) to the matching application.\r\nThis message is used by the counterparty to respond on the registration of a push-through transaction in the matching application or by the initiator or counterparty to re-send earlier mis-matched baseline information.\r\nUsage\r\nThe BaselineReSubmission message can be sent by the counterparty of a transaction to the matching application in response to a FullPushThroughReport message received from the matching application conveying the details of an InitialBaselineSubmission message. The objective of the BaselineReSubmission message sent in the outlined scenario is to achieve a successful match of two baseline initiation messages in order to establish a transaction in the matching application.\r\nor\r\nThe BaselineReSubmission message can be sent by the initiator of a transaction to the matching application in response to a BaselineMatchReport message indicating mis-matches. The objective of the BaselineReSubmission message sent in the outlined scenario is to correct an InitialBaselineSubmission or BaselineReSubmission message submitted earlier in order to achieve the establishment of a transaction in the matching application.\r\nor\r\nThe BaselineReSubmission message can be sent by the counterparty of a transaction to the matching application in response to a BaselineMatchReport message indicating mis-matches. The objective of the BaselineReSubmission message sent in the outlined scenario is to correct a BaselineReSubmission message submitted earlier in order to achieve the establishment of a transaction in the matching application."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04
 * BaselineReSubmissionV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BaselineReSubmissionV03", propOrder = {"submissionIdentification", "transactionIdentification", "submitterTransactionReference", "baseline", "buyerContactPerson", "sellerContactPerson", "buyerBankContactPerson",
		"sellerBankContactPerson", "otherBankContactPerson"})
public class BaselineReSubmissionV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * If BuyerBankContactPerson is present, then SellerBankContactPerson may
	 * not be present. If BuyerBankContactPerson is absent, then
	 * SellerBankContactPerson must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03
	 * BaselineReSubmissionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmBuyerBankContactPerson
	 * BaselineReSubmissionV03.mmBuyerBankContactPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV03#mmSellerBankContactPerson
	 * BaselineReSubmissionV03.mmSellerBankContactPerson}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerBankOrSellerBankContactPersonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If BuyerBankContactPerson is present, then SellerBankContactPerson may not be present. If BuyerBankContactPerson is absent, then SellerBankContactPerson must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor BuyerBankOrSellerBankContactPersonRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBankOrSellerBankContactPersonRule";
			definition = "If BuyerBankContactPerson is present, then SellerBankContactPerson may not be present. If BuyerBankContactPerson is absent, then SellerBankContactPerson must be present.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmBuyerBankContactPerson,
					com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmSellerBankContactPerson);
		}
	};
	@XmlElement(name = "SubmissnId", required = true)
	protected MessageIdentification1 submissionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmissnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the submitted information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmSubmissionIdentification
	 * BaselineReSubmissionV04.mmSubmissionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubmissionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubmissnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmissionIdentification";
			definition = "Identifies the submitted information.";
			nextVersions_lazy = () -> Arrays.asList(BaselineReSubmissionV04.mmSubmissionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineReSubmissionV03.class.getMethod("getSubmissionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxId", required = true)
	protected SimpleIdentificationInformation transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation
	 * SimpleIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmTransactionIdentification
	 * BaselineReSubmissionV04.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.";
			nextVersions_lazy = () -> Arrays.asList(BaselineReSubmissionV04.mmTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineReSubmissionV03.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SubmitrTxRef")
	protected SimpleIdentificationInformation submitterTransactionReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation
	 * SimpleIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitrTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitterTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction for the requesting financial institution."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmSubmitterTransactionReference
	 * BaselineReSubmissionV04.mmSubmitterTransactionReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubmitterTransactionReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubmitrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterTransactionReference";
			definition = "Reference to the transaction for the requesting financial institution.";
			nextVersions_lazy = () -> Arrays.asList(BaselineReSubmissionV04.mmSubmitterTransactionReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineReSubmissionV03.class.getMethod("getSubmitterTransactionReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Baseln", required = true)
	protected Baseline3 baseline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Baseline3
	 * Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Baseln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Baseline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the commercial details of the underlying transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmBaseline
	 * BaselineReSubmissionV04.mmBaseline}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBaseline = new MMMessageBuildingBlock() {
		{
			xmlTag = "Baseln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Baseline";
			definition = "Specifies the commercial details of the underlying transaction.";
			nextVersions_lazy = () -> Arrays.asList(BaselineReSubmissionV04.mmBaseline);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Baseline3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineReSubmissionV03.class.getMethod("getBaseline", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "BuyrCtctPrsn")
	protected List<ContactIdentification1> buyerContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in the organisation of the buyer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmBuyerContactPerson
	 * BaselineReSubmissionV04.mmBuyerContactPerson}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBuyerContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "BuyrCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerContactPerson";
			definition = "Person to be contacted in the organisation of the buyer.";
			nextVersions_lazy = () -> Arrays.asList(BaselineReSubmissionV04.mmBuyerContactPerson);
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineReSubmissionV03.class.getMethod("getBuyerContactPerson", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SellrCtctPrsn")
	protected List<ContactIdentification1> sellerContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in the organisation of the seller."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmSellerContactPerson
	 * BaselineReSubmissionV04.mmSellerContactPerson}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSellerContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "SellrCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerContactPerson";
			definition = "Person to be contacted in the organisation of the seller.";
			nextVersions_lazy = () -> Arrays.asList(BaselineReSubmissionV04.mmSellerContactPerson);
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineReSubmissionV03.class.getMethod("getSellerContactPerson", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "BuyrBkCtctPrsn", required = true)
	protected List<ContactIdentification1> buyerBankContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrBkCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerBankContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in the buyer's bank."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBuyerBankContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "BuyrBkCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBankContactPerson";
			definition = "Person to be contacted in the buyer's bank.";
			minOccurs = 1;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineReSubmissionV03.class.getMethod("getBuyerBankContactPerson", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SellrBkCtctPrsn", required = true)
	protected List<ContactIdentification1> sellerBankContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrBkCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerBankContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in the seller's bank."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSellerBankContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "SellrBkCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBankContactPerson";
			definition = "Person to be contacted in the seller's bank.";
			minOccurs = 1;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineReSubmissionV03.class.getMethod("getSellerBankContactPerson", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OthrBkCtctPrsn")
	protected List<ContactIdentification3> otherBankContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3
	 * ContactIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBkCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBankContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person to be contacted in another bank than the seller or buyer's bank."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.BaselineReSubmissionV04#mmOtherBankContactPerson
	 * BaselineReSubmissionV04.mmOtherBankContactPerson}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherBankContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrBkCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBankContactPerson";
			definition = "Person to be contacted in another bank than the seller or buyer's bank.";
			nextVersions_lazy = () -> Arrays.asList(BaselineReSubmissionV04.mmOtherBankContactPerson);
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineReSubmissionV03.class.getMethod("getOtherBankContactPerson", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BaselineReSubmissionV03";
				definition = "Scope\r\nThe BaselineReSubmission message is sent by either the counterparty or the initiator of a transaction (baseline) to the matching application.\r\nThis message is used by the counterparty to respond on the registration of a push-through transaction in the matching application or by the initiator or counterparty to re-send earlier mis-matched baseline information.\r\nUsage\r\nThe BaselineReSubmission message can be sent by the counterparty of a transaction to the matching application in response to a FullPushThroughReport message received from the matching application conveying the details of an InitialBaselineSubmission message. The objective of the BaselineReSubmission message sent in the outlined scenario is to achieve a successful match of two baseline initiation messages in order to establish a transaction in the matching application.\r\nor\r\nThe BaselineReSubmission message can be sent by the initiator of a transaction to the matching application in response to a BaselineMatchReport message indicating mis-matches. The objective of the BaselineReSubmission message sent in the outlined scenario is to correct an InitialBaselineSubmission or BaselineReSubmission message submitted earlier in order to achieve the establishment of a transaction in the matching application.\r\nor\r\nThe BaselineReSubmission message can be sent by the counterparty of a transaction to the matching application in response to a BaselineMatchReport message indicating mis-matches. The objective of the BaselineReSubmission message sent in the outlined scenario is to correct a BaselineReSubmission message submitted earlier in order to achieve the establishment of a transaction in the matching application.";
				nextVersions_lazy = () -> Arrays.asList(BaselineReSubmissionV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.BuyerBankOrSellerBankContactPersonRule);
				rootElement = "Document";
				xmlTag = "BaselnReSubmissn";
				businessArea_lazy = () -> TradeServicesManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmSubmissionIdentification,
						com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmTransactionIdentification, com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmSubmitterTransactionReference,
						com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmBaseline, com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmBuyerContactPerson,
						com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmSellerContactPerson, com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmBuyerBankContactPerson,
						com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmSellerBankContactPerson, com.tools20022.repository.area.tsmt.BaselineReSubmissionV03.mmOtherBankContactPerson);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "012";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return BaselineReSubmissionV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getSubmissionIdentification() {
		return submissionIdentification;
	}

	public BaselineReSubmissionV03 setSubmissionIdentification(MessageIdentification1 submissionIdentification) {
		this.submissionIdentification = Objects.requireNonNull(submissionIdentification);
		return this;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public BaselineReSubmissionV03 setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<SimpleIdentificationInformation> getSubmitterTransactionReference() {
		return submitterTransactionReference == null ? Optional.empty() : Optional.of(submitterTransactionReference);
	}

	public BaselineReSubmissionV03 setSubmitterTransactionReference(SimpleIdentificationInformation submitterTransactionReference) {
		this.submitterTransactionReference = submitterTransactionReference;
		return this;
	}

	public Baseline3 getBaseline() {
		return baseline;
	}

	public BaselineReSubmissionV03 setBaseline(Baseline3 baseline) {
		this.baseline = Objects.requireNonNull(baseline);
		return this;
	}

	public List<ContactIdentification1> getBuyerContactPerson() {
		return buyerContactPerson == null ? buyerContactPerson = new ArrayList<>() : buyerContactPerson;
	}

	public BaselineReSubmissionV03 setBuyerContactPerson(List<ContactIdentification1> buyerContactPerson) {
		this.buyerContactPerson = Objects.requireNonNull(buyerContactPerson);
		return this;
	}

	public List<ContactIdentification1> getSellerContactPerson() {
		return sellerContactPerson == null ? sellerContactPerson = new ArrayList<>() : sellerContactPerson;
	}

	public BaselineReSubmissionV03 setSellerContactPerson(List<ContactIdentification1> sellerContactPerson) {
		this.sellerContactPerson = Objects.requireNonNull(sellerContactPerson);
		return this;
	}

	public List<ContactIdentification1> getBuyerBankContactPerson() {
		return buyerBankContactPerson == null ? buyerBankContactPerson = new ArrayList<>() : buyerBankContactPerson;
	}

	public BaselineReSubmissionV03 setBuyerBankContactPerson(List<ContactIdentification1> buyerBankContactPerson) {
		this.buyerBankContactPerson = Objects.requireNonNull(buyerBankContactPerson);
		return this;
	}

	public List<ContactIdentification1> getSellerBankContactPerson() {
		return sellerBankContactPerson == null ? sellerBankContactPerson = new ArrayList<>() : sellerBankContactPerson;
	}

	public BaselineReSubmissionV03 setSellerBankContactPerson(List<ContactIdentification1> sellerBankContactPerson) {
		this.sellerBankContactPerson = Objects.requireNonNull(sellerBankContactPerson);
		return this;
	}

	public List<ContactIdentification3> getOtherBankContactPerson() {
		return otherBankContactPerson == null ? otherBankContactPerson = new ArrayList<>() : otherBankContactPerson;
	}

	public BaselineReSubmissionV03 setOtherBankContactPerson(List<ContactIdentification3> otherBankContactPerson) {
		this.otherBankContactPerson = Objects.requireNonNull(otherBankContactPerson);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.03")
	static public class Document {
		@XmlElement(name = "BaselnReSubmissn", required = true)
		public BaselineReSubmissionV03 messageBody;
	}
}